/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import javax.xml.datatype.XMLGregorianCalendar;

import mpia.meta.TypeAssociation;
import mpia.meta.TypeDataTypeDuree;
import mpia.meta.TypeDataTypeVolume;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDictionaryDicoPointTrajectoireCategorie;
import mpia.schema.TypeDictionaryDicoPointTrajectoireTypeAttente;
import mpia.schema.TypePointTrajectoire;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Point Trajectoire</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypePointTrajectoireImpl#getNumeroOrdre <em>Numero Ordre</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePointTrajectoireImpl#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePointTrajectoireImpl#getDateDesiree <em>Date Desiree</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePointTrajectoireImpl#getDateCalculee <em>Date Calculee</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePointTrajectoireImpl#getDureeSurPoint <em>Duree Sur Point</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePointTrajectoireImpl#getTypeAttente <em>Type Attente</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePointTrajectoireImpl#getCarburantRestant <em>Carburant Restant</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePointTrajectoireImpl#getCarburantPourRavitaillement <em>Carburant Pour Ravitaillement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePointTrajectoireImpl#getDureeRetourDirect <em>Duree Retour Direct</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePointTrajectoireImpl#getConsommationRetour <em>Consommation Retour</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePointTrajectoireImpl#getCarburantConsommeTotal <em>Carburant Consomme Total</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePointTrajectoireImpl#getEstConsigneGeographiqueConsigne <em>Est Consigne Geographique Consigne</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypePointTrajectoireImpl extends TypeElementControleImpl implements TypePointTrajectoire {
	/**
	 * The default value of the '{@link #getNumeroOrdre() <em>Numero Ordre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumeroOrdre()
	 * @generated
	 * @ordered
	 */
	protected static final long NUMERO_ORDRE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNumeroOrdre() <em>Numero Ordre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumeroOrdre()
	 * @generated
	 * @ordered
	 */
	protected long numeroOrdre = NUMERO_ORDRE_EDEFAULT;

	/**
	 * This is true if the Numero Ordre attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean numeroOrdreESet;

	/**
	 * The default value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoPointTrajectoireCategorie CATEGORIE_EDEFAULT = TypeDictionaryDicoPointTrajectoireCategorie.POINT_DE_NAVIGATION;

	/**
	 * The cached value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoPointTrajectoireCategorie categorie = CATEGORIE_EDEFAULT;

	/**
	 * This is true if the Categorie attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean categorieESet;

	/**
	 * The default value of the '{@link #getDateDesiree() <em>Date Desiree</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateDesiree()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar DATE_DESIREE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateDesiree() <em>Date Desiree</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateDesiree()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar dateDesiree = DATE_DESIREE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDateCalculee() <em>Date Calculee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateCalculee()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar DATE_CALCULEE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateCalculee() <em>Date Calculee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateCalculee()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar dateCalculee = DATE_CALCULEE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDureeSurPoint() <em>Duree Sur Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDureeSurPoint()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeDuree dureeSurPoint;

	/**
	 * The default value of the '{@link #getTypeAttente() <em>Type Attente</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeAttente()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoPointTrajectoireTypeAttente TYPE_ATTENTE_EDEFAULT = TypeDictionaryDicoPointTrajectoireTypeAttente.NOM;

	/**
	 * The cached value of the '{@link #getTypeAttente() <em>Type Attente</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeAttente()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoPointTrajectoireTypeAttente typeAttente = TYPE_ATTENTE_EDEFAULT;

	/**
	 * This is true if the Type Attente attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeAttenteESet;

	/**
	 * The cached value of the '{@link #getCarburantRestant() <em>Carburant Restant</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCarburantRestant()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeVolume carburantRestant;

	/**
	 * The cached value of the '{@link #getCarburantPourRavitaillement() <em>Carburant Pour Ravitaillement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCarburantPourRavitaillement()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeVolume carburantPourRavitaillement;

	/**
	 * The cached value of the '{@link #getDureeRetourDirect() <em>Duree Retour Direct</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDureeRetourDirect()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeDuree dureeRetourDirect;

	/**
	 * The cached value of the '{@link #getConsommationRetour() <em>Consommation Retour</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsommationRetour()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeVolume consommationRetour;

	/**
	 * The cached value of the '{@link #getCarburantConsommeTotal() <em>Carburant Consomme Total</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCarburantConsommeTotal()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeVolume carburantConsommeTotal;

	/**
	 * The cached value of the '{@link #getEstConsigneGeographiqueConsigne() <em>Est Consigne Geographique Consigne</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstConsigneGeographiqueConsigne()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation estConsigneGeographiqueConsigne;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypePointTrajectoireImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypePointTrajectoire();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNumeroOrdre() {
		return numeroOrdre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumeroOrdre(long newNumeroOrdre) {
		long oldNumeroOrdre = numeroOrdre;
		numeroOrdre = newNumeroOrdre;
		boolean oldNumeroOrdreESet = numeroOrdreESet;
		numeroOrdreESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_POINT_TRAJECTOIRE__NUMERO_ORDRE, oldNumeroOrdre, numeroOrdre, !oldNumeroOrdreESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNumeroOrdre() {
		long oldNumeroOrdre = numeroOrdre;
		boolean oldNumeroOrdreESet = numeroOrdreESet;
		numeroOrdre = NUMERO_ORDRE_EDEFAULT;
		numeroOrdreESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_POINT_TRAJECTOIRE__NUMERO_ORDRE, oldNumeroOrdre, NUMERO_ORDRE_EDEFAULT, oldNumeroOrdreESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNumeroOrdre() {
		return numeroOrdreESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoPointTrajectoireCategorie getCategorie() {
		return categorie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategorie(TypeDictionaryDicoPointTrajectoireCategorie newCategorie) {
		TypeDictionaryDicoPointTrajectoireCategorie oldCategorie = categorie;
		categorie = newCategorie == null ? CATEGORIE_EDEFAULT : newCategorie;
		boolean oldCategorieESet = categorieESet;
		categorieESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_POINT_TRAJECTOIRE__CATEGORIE, oldCategorie, categorie, !oldCategorieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCategorie() {
		TypeDictionaryDicoPointTrajectoireCategorie oldCategorie = categorie;
		boolean oldCategorieESet = categorieESet;
		categorie = CATEGORIE_EDEFAULT;
		categorieESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_POINT_TRAJECTOIRE__CATEGORIE, oldCategorie, CATEGORIE_EDEFAULT, oldCategorieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCategorie() {
		return categorieESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getDateDesiree() {
		return dateDesiree;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateDesiree(XMLGregorianCalendar newDateDesiree) {
		XMLGregorianCalendar oldDateDesiree = dateDesiree;
		dateDesiree = newDateDesiree;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_POINT_TRAJECTOIRE__DATE_DESIREE, oldDateDesiree, dateDesiree));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getDateCalculee() {
		return dateCalculee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateCalculee(XMLGregorianCalendar newDateCalculee) {
		XMLGregorianCalendar oldDateCalculee = dateCalculee;
		dateCalculee = newDateCalculee;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_POINT_TRAJECTOIRE__DATE_CALCULEE, oldDateCalculee, dateCalculee));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeDuree getDureeSurPoint() {
		return dureeSurPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDureeSurPoint(TypeDataTypeDuree newDureeSurPoint, NotificationChain msgs) {
		TypeDataTypeDuree oldDureeSurPoint = dureeSurPoint;
		dureeSurPoint = newDureeSurPoint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_POINT_TRAJECTOIRE__DUREE_SUR_POINT, oldDureeSurPoint, newDureeSurPoint);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDureeSurPoint(TypeDataTypeDuree newDureeSurPoint) {
		if (newDureeSurPoint != dureeSurPoint) {
			NotificationChain msgs = null;
			if (dureeSurPoint != null)
				msgs = ((InternalEObject)dureeSurPoint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_POINT_TRAJECTOIRE__DUREE_SUR_POINT, null, msgs);
			if (newDureeSurPoint != null)
				msgs = ((InternalEObject)newDureeSurPoint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_POINT_TRAJECTOIRE__DUREE_SUR_POINT, null, msgs);
			msgs = basicSetDureeSurPoint(newDureeSurPoint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_POINT_TRAJECTOIRE__DUREE_SUR_POINT, newDureeSurPoint, newDureeSurPoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoPointTrajectoireTypeAttente getTypeAttente() {
		return typeAttente;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeAttente(TypeDictionaryDicoPointTrajectoireTypeAttente newTypeAttente) {
		TypeDictionaryDicoPointTrajectoireTypeAttente oldTypeAttente = typeAttente;
		typeAttente = newTypeAttente == null ? TYPE_ATTENTE_EDEFAULT : newTypeAttente;
		boolean oldTypeAttenteESet = typeAttenteESet;
		typeAttenteESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_POINT_TRAJECTOIRE__TYPE_ATTENTE, oldTypeAttente, typeAttente, !oldTypeAttenteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTypeAttente() {
		TypeDictionaryDicoPointTrajectoireTypeAttente oldTypeAttente = typeAttente;
		boolean oldTypeAttenteESet = typeAttenteESet;
		typeAttente = TYPE_ATTENTE_EDEFAULT;
		typeAttenteESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_POINT_TRAJECTOIRE__TYPE_ATTENTE, oldTypeAttente, TYPE_ATTENTE_EDEFAULT, oldTypeAttenteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTypeAttente() {
		return typeAttenteESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeVolume getCarburantRestant() {
		return carburantRestant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCarburantRestant(TypeDataTypeVolume newCarburantRestant, NotificationChain msgs) {
		TypeDataTypeVolume oldCarburantRestant = carburantRestant;
		carburantRestant = newCarburantRestant;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_POINT_TRAJECTOIRE__CARBURANT_RESTANT, oldCarburantRestant, newCarburantRestant);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCarburantRestant(TypeDataTypeVolume newCarburantRestant) {
		if (newCarburantRestant != carburantRestant) {
			NotificationChain msgs = null;
			if (carburantRestant != null)
				msgs = ((InternalEObject)carburantRestant).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_POINT_TRAJECTOIRE__CARBURANT_RESTANT, null, msgs);
			if (newCarburantRestant != null)
				msgs = ((InternalEObject)newCarburantRestant).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_POINT_TRAJECTOIRE__CARBURANT_RESTANT, null, msgs);
			msgs = basicSetCarburantRestant(newCarburantRestant, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_POINT_TRAJECTOIRE__CARBURANT_RESTANT, newCarburantRestant, newCarburantRestant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeVolume getCarburantPourRavitaillement() {
		return carburantPourRavitaillement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCarburantPourRavitaillement(TypeDataTypeVolume newCarburantPourRavitaillement, NotificationChain msgs) {
		TypeDataTypeVolume oldCarburantPourRavitaillement = carburantPourRavitaillement;
		carburantPourRavitaillement = newCarburantPourRavitaillement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_POINT_TRAJECTOIRE__CARBURANT_POUR_RAVITAILLEMENT, oldCarburantPourRavitaillement, newCarburantPourRavitaillement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCarburantPourRavitaillement(TypeDataTypeVolume newCarburantPourRavitaillement) {
		if (newCarburantPourRavitaillement != carburantPourRavitaillement) {
			NotificationChain msgs = null;
			if (carburantPourRavitaillement != null)
				msgs = ((InternalEObject)carburantPourRavitaillement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_POINT_TRAJECTOIRE__CARBURANT_POUR_RAVITAILLEMENT, null, msgs);
			if (newCarburantPourRavitaillement != null)
				msgs = ((InternalEObject)newCarburantPourRavitaillement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_POINT_TRAJECTOIRE__CARBURANT_POUR_RAVITAILLEMENT, null, msgs);
			msgs = basicSetCarburantPourRavitaillement(newCarburantPourRavitaillement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_POINT_TRAJECTOIRE__CARBURANT_POUR_RAVITAILLEMENT, newCarburantPourRavitaillement, newCarburantPourRavitaillement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeDuree getDureeRetourDirect() {
		return dureeRetourDirect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDureeRetourDirect(TypeDataTypeDuree newDureeRetourDirect, NotificationChain msgs) {
		TypeDataTypeDuree oldDureeRetourDirect = dureeRetourDirect;
		dureeRetourDirect = newDureeRetourDirect;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_POINT_TRAJECTOIRE__DUREE_RETOUR_DIRECT, oldDureeRetourDirect, newDureeRetourDirect);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDureeRetourDirect(TypeDataTypeDuree newDureeRetourDirect) {
		if (newDureeRetourDirect != dureeRetourDirect) {
			NotificationChain msgs = null;
			if (dureeRetourDirect != null)
				msgs = ((InternalEObject)dureeRetourDirect).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_POINT_TRAJECTOIRE__DUREE_RETOUR_DIRECT, null, msgs);
			if (newDureeRetourDirect != null)
				msgs = ((InternalEObject)newDureeRetourDirect).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_POINT_TRAJECTOIRE__DUREE_RETOUR_DIRECT, null, msgs);
			msgs = basicSetDureeRetourDirect(newDureeRetourDirect, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_POINT_TRAJECTOIRE__DUREE_RETOUR_DIRECT, newDureeRetourDirect, newDureeRetourDirect));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeVolume getConsommationRetour() {
		return consommationRetour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConsommationRetour(TypeDataTypeVolume newConsommationRetour, NotificationChain msgs) {
		TypeDataTypeVolume oldConsommationRetour = consommationRetour;
		consommationRetour = newConsommationRetour;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_POINT_TRAJECTOIRE__CONSOMMATION_RETOUR, oldConsommationRetour, newConsommationRetour);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConsommationRetour(TypeDataTypeVolume newConsommationRetour) {
		if (newConsommationRetour != consommationRetour) {
			NotificationChain msgs = null;
			if (consommationRetour != null)
				msgs = ((InternalEObject)consommationRetour).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_POINT_TRAJECTOIRE__CONSOMMATION_RETOUR, null, msgs);
			if (newConsommationRetour != null)
				msgs = ((InternalEObject)newConsommationRetour).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_POINT_TRAJECTOIRE__CONSOMMATION_RETOUR, null, msgs);
			msgs = basicSetConsommationRetour(newConsommationRetour, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_POINT_TRAJECTOIRE__CONSOMMATION_RETOUR, newConsommationRetour, newConsommationRetour));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeVolume getCarburantConsommeTotal() {
		return carburantConsommeTotal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCarburantConsommeTotal(TypeDataTypeVolume newCarburantConsommeTotal, NotificationChain msgs) {
		TypeDataTypeVolume oldCarburantConsommeTotal = carburantConsommeTotal;
		carburantConsommeTotal = newCarburantConsommeTotal;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_POINT_TRAJECTOIRE__CARBURANT_CONSOMME_TOTAL, oldCarburantConsommeTotal, newCarburantConsommeTotal);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCarburantConsommeTotal(TypeDataTypeVolume newCarburantConsommeTotal) {
		if (newCarburantConsommeTotal != carburantConsommeTotal) {
			NotificationChain msgs = null;
			if (carburantConsommeTotal != null)
				msgs = ((InternalEObject)carburantConsommeTotal).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_POINT_TRAJECTOIRE__CARBURANT_CONSOMME_TOTAL, null, msgs);
			if (newCarburantConsommeTotal != null)
				msgs = ((InternalEObject)newCarburantConsommeTotal).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_POINT_TRAJECTOIRE__CARBURANT_CONSOMME_TOTAL, null, msgs);
			msgs = basicSetCarburantConsommeTotal(newCarburantConsommeTotal, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_POINT_TRAJECTOIRE__CARBURANT_CONSOMME_TOTAL, newCarburantConsommeTotal, newCarburantConsommeTotal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getEstConsigneGeographiqueConsigne() {
		return estConsigneGeographiqueConsigne;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEstConsigneGeographiqueConsigne(TypeAssociation newEstConsigneGeographiqueConsigne, NotificationChain msgs) {
		TypeAssociation oldEstConsigneGeographiqueConsigne = estConsigneGeographiqueConsigne;
		estConsigneGeographiqueConsigne = newEstConsigneGeographiqueConsigne;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_POINT_TRAJECTOIRE__EST_CONSIGNE_GEOGRAPHIQUE_CONSIGNE, oldEstConsigneGeographiqueConsigne, newEstConsigneGeographiqueConsigne);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEstConsigneGeographiqueConsigne(TypeAssociation newEstConsigneGeographiqueConsigne) {
		if (newEstConsigneGeographiqueConsigne != estConsigneGeographiqueConsigne) {
			NotificationChain msgs = null;
			if (estConsigneGeographiqueConsigne != null)
				msgs = ((InternalEObject)estConsigneGeographiqueConsigne).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_POINT_TRAJECTOIRE__EST_CONSIGNE_GEOGRAPHIQUE_CONSIGNE, null, msgs);
			if (newEstConsigneGeographiqueConsigne != null)
				msgs = ((InternalEObject)newEstConsigneGeographiqueConsigne).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_POINT_TRAJECTOIRE__EST_CONSIGNE_GEOGRAPHIQUE_CONSIGNE, null, msgs);
			msgs = basicSetEstConsigneGeographiqueConsigne(newEstConsigneGeographiqueConsigne, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_POINT_TRAJECTOIRE__EST_CONSIGNE_GEOGRAPHIQUE_CONSIGNE, newEstConsigneGeographiqueConsigne, newEstConsigneGeographiqueConsigne));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_POINT_TRAJECTOIRE__DUREE_SUR_POINT:
				return basicSetDureeSurPoint(null, msgs);
			case SchemaPackage.TYPE_POINT_TRAJECTOIRE__CARBURANT_RESTANT:
				return basicSetCarburantRestant(null, msgs);
			case SchemaPackage.TYPE_POINT_TRAJECTOIRE__CARBURANT_POUR_RAVITAILLEMENT:
				return basicSetCarburantPourRavitaillement(null, msgs);
			case SchemaPackage.TYPE_POINT_TRAJECTOIRE__DUREE_RETOUR_DIRECT:
				return basicSetDureeRetourDirect(null, msgs);
			case SchemaPackage.TYPE_POINT_TRAJECTOIRE__CONSOMMATION_RETOUR:
				return basicSetConsommationRetour(null, msgs);
			case SchemaPackage.TYPE_POINT_TRAJECTOIRE__CARBURANT_CONSOMME_TOTAL:
				return basicSetCarburantConsommeTotal(null, msgs);
			case SchemaPackage.TYPE_POINT_TRAJECTOIRE__EST_CONSIGNE_GEOGRAPHIQUE_CONSIGNE:
				return basicSetEstConsigneGeographiqueConsigne(null, msgs);
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
			case SchemaPackage.TYPE_POINT_TRAJECTOIRE__NUMERO_ORDRE:
				return new Long(getNumeroOrdre());
			case SchemaPackage.TYPE_POINT_TRAJECTOIRE__CATEGORIE:
				return getCategorie();
			case SchemaPackage.TYPE_POINT_TRAJECTOIRE__DATE_DESIREE:
				return getDateDesiree();
			case SchemaPackage.TYPE_POINT_TRAJECTOIRE__DATE_CALCULEE:
				return getDateCalculee();
			case SchemaPackage.TYPE_POINT_TRAJECTOIRE__DUREE_SUR_POINT:
				return getDureeSurPoint();
			case SchemaPackage.TYPE_POINT_TRAJECTOIRE__TYPE_ATTENTE:
				return getTypeAttente();
			case SchemaPackage.TYPE_POINT_TRAJECTOIRE__CARBURANT_RESTANT:
				return getCarburantRestant();
			case SchemaPackage.TYPE_POINT_TRAJECTOIRE__CARBURANT_POUR_RAVITAILLEMENT:
				return getCarburantPourRavitaillement();
			case SchemaPackage.TYPE_POINT_TRAJECTOIRE__DUREE_RETOUR_DIRECT:
				return getDureeRetourDirect();
			case SchemaPackage.TYPE_POINT_TRAJECTOIRE__CONSOMMATION_RETOUR:
				return getConsommationRetour();
			case SchemaPackage.TYPE_POINT_TRAJECTOIRE__CARBURANT_CONSOMME_TOTAL:
				return getCarburantConsommeTotal();
			case SchemaPackage.TYPE_POINT_TRAJECTOIRE__EST_CONSIGNE_GEOGRAPHIQUE_CONSIGNE:
				return getEstConsigneGeographiqueConsigne();
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
			case SchemaPackage.TYPE_POINT_TRAJECTOIRE__NUMERO_ORDRE:
				setNumeroOrdre(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_POINT_TRAJECTOIRE__CATEGORIE:
				setCategorie((TypeDictionaryDicoPointTrajectoireCategorie)newValue);
				return;
			case SchemaPackage.TYPE_POINT_TRAJECTOIRE__DATE_DESIREE:
				setDateDesiree((XMLGregorianCalendar)newValue);
				return;
			case SchemaPackage.TYPE_POINT_TRAJECTOIRE__DATE_CALCULEE:
				setDateCalculee((XMLGregorianCalendar)newValue);
				return;
			case SchemaPackage.TYPE_POINT_TRAJECTOIRE__DUREE_SUR_POINT:
				setDureeSurPoint((TypeDataTypeDuree)newValue);
				return;
			case SchemaPackage.TYPE_POINT_TRAJECTOIRE__TYPE_ATTENTE:
				setTypeAttente((TypeDictionaryDicoPointTrajectoireTypeAttente)newValue);
				return;
			case SchemaPackage.TYPE_POINT_TRAJECTOIRE__CARBURANT_RESTANT:
				setCarburantRestant((TypeDataTypeVolume)newValue);
				return;
			case SchemaPackage.TYPE_POINT_TRAJECTOIRE__CARBURANT_POUR_RAVITAILLEMENT:
				setCarburantPourRavitaillement((TypeDataTypeVolume)newValue);
				return;
			case SchemaPackage.TYPE_POINT_TRAJECTOIRE__DUREE_RETOUR_DIRECT:
				setDureeRetourDirect((TypeDataTypeDuree)newValue);
				return;
			case SchemaPackage.TYPE_POINT_TRAJECTOIRE__CONSOMMATION_RETOUR:
				setConsommationRetour((TypeDataTypeVolume)newValue);
				return;
			case SchemaPackage.TYPE_POINT_TRAJECTOIRE__CARBURANT_CONSOMME_TOTAL:
				setCarburantConsommeTotal((TypeDataTypeVolume)newValue);
				return;
			case SchemaPackage.TYPE_POINT_TRAJECTOIRE__EST_CONSIGNE_GEOGRAPHIQUE_CONSIGNE:
				setEstConsigneGeographiqueConsigne((TypeAssociation)newValue);
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
			case SchemaPackage.TYPE_POINT_TRAJECTOIRE__NUMERO_ORDRE:
				unsetNumeroOrdre();
				return;
			case SchemaPackage.TYPE_POINT_TRAJECTOIRE__CATEGORIE:
				unsetCategorie();
				return;
			case SchemaPackage.TYPE_POINT_TRAJECTOIRE__DATE_DESIREE:
				setDateDesiree(DATE_DESIREE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_POINT_TRAJECTOIRE__DATE_CALCULEE:
				setDateCalculee(DATE_CALCULEE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_POINT_TRAJECTOIRE__DUREE_SUR_POINT:
				setDureeSurPoint((TypeDataTypeDuree)null);
				return;
			case SchemaPackage.TYPE_POINT_TRAJECTOIRE__TYPE_ATTENTE:
				unsetTypeAttente();
				return;
			case SchemaPackage.TYPE_POINT_TRAJECTOIRE__CARBURANT_RESTANT:
				setCarburantRestant((TypeDataTypeVolume)null);
				return;
			case SchemaPackage.TYPE_POINT_TRAJECTOIRE__CARBURANT_POUR_RAVITAILLEMENT:
				setCarburantPourRavitaillement((TypeDataTypeVolume)null);
				return;
			case SchemaPackage.TYPE_POINT_TRAJECTOIRE__DUREE_RETOUR_DIRECT:
				setDureeRetourDirect((TypeDataTypeDuree)null);
				return;
			case SchemaPackage.TYPE_POINT_TRAJECTOIRE__CONSOMMATION_RETOUR:
				setConsommationRetour((TypeDataTypeVolume)null);
				return;
			case SchemaPackage.TYPE_POINT_TRAJECTOIRE__CARBURANT_CONSOMME_TOTAL:
				setCarburantConsommeTotal((TypeDataTypeVolume)null);
				return;
			case SchemaPackage.TYPE_POINT_TRAJECTOIRE__EST_CONSIGNE_GEOGRAPHIQUE_CONSIGNE:
				setEstConsigneGeographiqueConsigne((TypeAssociation)null);
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
			case SchemaPackage.TYPE_POINT_TRAJECTOIRE__NUMERO_ORDRE:
				return isSetNumeroOrdre();
			case SchemaPackage.TYPE_POINT_TRAJECTOIRE__CATEGORIE:
				return isSetCategorie();
			case SchemaPackage.TYPE_POINT_TRAJECTOIRE__DATE_DESIREE:
				return DATE_DESIREE_EDEFAULT == null ? dateDesiree != null : !DATE_DESIREE_EDEFAULT.equals(dateDesiree);
			case SchemaPackage.TYPE_POINT_TRAJECTOIRE__DATE_CALCULEE:
				return DATE_CALCULEE_EDEFAULT == null ? dateCalculee != null : !DATE_CALCULEE_EDEFAULT.equals(dateCalculee);
			case SchemaPackage.TYPE_POINT_TRAJECTOIRE__DUREE_SUR_POINT:
				return dureeSurPoint != null;
			case SchemaPackage.TYPE_POINT_TRAJECTOIRE__TYPE_ATTENTE:
				return isSetTypeAttente();
			case SchemaPackage.TYPE_POINT_TRAJECTOIRE__CARBURANT_RESTANT:
				return carburantRestant != null;
			case SchemaPackage.TYPE_POINT_TRAJECTOIRE__CARBURANT_POUR_RAVITAILLEMENT:
				return carburantPourRavitaillement != null;
			case SchemaPackage.TYPE_POINT_TRAJECTOIRE__DUREE_RETOUR_DIRECT:
				return dureeRetourDirect != null;
			case SchemaPackage.TYPE_POINT_TRAJECTOIRE__CONSOMMATION_RETOUR:
				return consommationRetour != null;
			case SchemaPackage.TYPE_POINT_TRAJECTOIRE__CARBURANT_CONSOMME_TOTAL:
				return carburantConsommeTotal != null;
			case SchemaPackage.TYPE_POINT_TRAJECTOIRE__EST_CONSIGNE_GEOGRAPHIQUE_CONSIGNE:
				return estConsigneGeographiqueConsigne != null;
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
		result.append(" (numeroOrdre: ");
		if (numeroOrdreESet) result.append(numeroOrdre); else result.append("<unset>");
		result.append(", categorie: ");
		if (categorieESet) result.append(categorie); else result.append("<unset>");
		result.append(", dateDesiree: ");
		result.append(dateDesiree);
		result.append(", dateCalculee: ");
		result.append(dateCalculee);
		result.append(", typeAttente: ");
		if (typeAttenteESet) result.append(typeAttente); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TypePointTrajectoireImpl
