/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import javax.xml.datatype.XMLGregorianCalendar;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeLocalisation;
import mpia.schema.TypeSerieGeostatistique;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Serie Geostatistique</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeSerieGeostatistiqueImpl#getNom <em>Nom</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeSerieGeostatistiqueImpl#getGdhDateCreation <em>Gdh Date Creation</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeSerieGeostatistiqueImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeSerieGeostatistiqueImpl#getValeur1 <em>Valeur1</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeSerieGeostatistiqueImpl#getValeur2 <em>Valeur2</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeSerieGeostatistiqueImpl#getValeur3 <em>Valeur3</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeSerieGeostatistiqueImpl#getValeur4 <em>Valeur4</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeSerieGeostatistiqueImpl#getValeur5 <em>Valeur5</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeSerieGeostatistiqueImpl#getValeur6 <em>Valeur6</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeSerieGeostatistiqueImpl#getValeur7 <em>Valeur7</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeSerieGeostatistiqueImpl#getValeur8 <em>Valeur8</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeSerieGeostatistiqueImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeSerieGeostatistiqueImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeSerieGeostatistiqueImpl#getLocalisationLocalisation <em>Localisation Localisation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeSerieGeostatistiqueImpl extends EObjectImpl implements TypeSerieGeostatistique {
	/**
	 * The default value of the '{@link #getNom() <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNom()
	 * @generated
	 * @ordered
	 */
	protected static final String NOM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNom() <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNom()
	 * @generated
	 * @ordered
	 */
	protected String nom = NOM_EDEFAULT;

	/**
	 * The default value of the '{@link #getGdhDateCreation() <em>Gdh Date Creation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGdhDateCreation()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar GDH_DATE_CREATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGdhDateCreation() <em>Gdh Date Creation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGdhDateCreation()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar gdhDateCreation = GDH_DATE_CREATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getValeur1() <em>Valeur1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValeur1()
	 * @generated
	 * @ordered
	 */
	protected static final double VALEUR1_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getValeur1() <em>Valeur1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValeur1()
	 * @generated
	 * @ordered
	 */
	protected double valeur1 = VALEUR1_EDEFAULT;

	/**
	 * This is true if the Valeur1 attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean valeur1ESet;

	/**
	 * The default value of the '{@link #getValeur2() <em>Valeur2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValeur2()
	 * @generated
	 * @ordered
	 */
	protected static final double VALEUR2_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getValeur2() <em>Valeur2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValeur2()
	 * @generated
	 * @ordered
	 */
	protected double valeur2 = VALEUR2_EDEFAULT;

	/**
	 * This is true if the Valeur2 attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean valeur2ESet;

	/**
	 * The default value of the '{@link #getValeur3() <em>Valeur3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValeur3()
	 * @generated
	 * @ordered
	 */
	protected static final double VALEUR3_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getValeur3() <em>Valeur3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValeur3()
	 * @generated
	 * @ordered
	 */
	protected double valeur3 = VALEUR3_EDEFAULT;

	/**
	 * This is true if the Valeur3 attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean valeur3ESet;

	/**
	 * The default value of the '{@link #getValeur4() <em>Valeur4</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValeur4()
	 * @generated
	 * @ordered
	 */
	protected static final double VALEUR4_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getValeur4() <em>Valeur4</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValeur4()
	 * @generated
	 * @ordered
	 */
	protected double valeur4 = VALEUR4_EDEFAULT;

	/**
	 * This is true if the Valeur4 attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean valeur4ESet;

	/**
	 * The default value of the '{@link #getValeur5() <em>Valeur5</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValeur5()
	 * @generated
	 * @ordered
	 */
	protected static final double VALEUR5_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getValeur5() <em>Valeur5</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValeur5()
	 * @generated
	 * @ordered
	 */
	protected double valeur5 = VALEUR5_EDEFAULT;

	/**
	 * This is true if the Valeur5 attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean valeur5ESet;

	/**
	 * The default value of the '{@link #getValeur6() <em>Valeur6</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValeur6()
	 * @generated
	 * @ordered
	 */
	protected static final double VALEUR6_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getValeur6() <em>Valeur6</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValeur6()
	 * @generated
	 * @ordered
	 */
	protected double valeur6 = VALEUR6_EDEFAULT;

	/**
	 * This is true if the Valeur6 attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean valeur6ESet;

	/**
	 * The default value of the '{@link #getValeur7() <em>Valeur7</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValeur7()
	 * @generated
	 * @ordered
	 */
	protected static final double VALEUR7_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getValeur7() <em>Valeur7</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValeur7()
	 * @generated
	 * @ordered
	 */
	protected double valeur7 = VALEUR7_EDEFAULT;

	/**
	 * This is true if the Valeur7 attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean valeur7ESet;

	/**
	 * The default value of the '{@link #getValeur8() <em>Valeur8</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValeur8()
	 * @generated
	 * @ordered
	 */
	protected static final double VALEUR8_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getValeur8() <em>Valeur8</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValeur8()
	 * @generated
	 * @ordered
	 */
	protected double valeur8 = VALEUR8_EDEFAULT;

	/**
	 * This is true if the Valeur8 attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean valeur8ESet;

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
	 * The cached value of the '{@link #getLocalisationLocalisation() <em>Localisation Localisation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalisationLocalisation()
	 * @generated
	 * @ordered
	 */
	protected TypeLocalisation localisationLocalisation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeSerieGeostatistiqueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeSerieGeostatistique();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNom(String newNom) {
		String oldNom = nom;
		nom = newNom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SERIE_GEOSTATISTIQUE__NOM, oldNom, nom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getGdhDateCreation() {
		return gdhDateCreation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGdhDateCreation(XMLGregorianCalendar newGdhDateCreation) {
		XMLGregorianCalendar oldGdhDateCreation = gdhDateCreation;
		gdhDateCreation = newGdhDateCreation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SERIE_GEOSTATISTIQUE__GDH_DATE_CREATION, oldGdhDateCreation, gdhDateCreation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SERIE_GEOSTATISTIQUE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getValeur1() {
		return valeur1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValeur1(double newValeur1) {
		double oldValeur1 = valeur1;
		valeur1 = newValeur1;
		boolean oldValeur1ESet = valeur1ESet;
		valeur1ESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SERIE_GEOSTATISTIQUE__VALEUR1, oldValeur1, valeur1, !oldValeur1ESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetValeur1() {
		double oldValeur1 = valeur1;
		boolean oldValeur1ESet = valeur1ESet;
		valeur1 = VALEUR1_EDEFAULT;
		valeur1ESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_SERIE_GEOSTATISTIQUE__VALEUR1, oldValeur1, VALEUR1_EDEFAULT, oldValeur1ESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetValeur1() {
		return valeur1ESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getValeur2() {
		return valeur2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValeur2(double newValeur2) {
		double oldValeur2 = valeur2;
		valeur2 = newValeur2;
		boolean oldValeur2ESet = valeur2ESet;
		valeur2ESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SERIE_GEOSTATISTIQUE__VALEUR2, oldValeur2, valeur2, !oldValeur2ESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetValeur2() {
		double oldValeur2 = valeur2;
		boolean oldValeur2ESet = valeur2ESet;
		valeur2 = VALEUR2_EDEFAULT;
		valeur2ESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_SERIE_GEOSTATISTIQUE__VALEUR2, oldValeur2, VALEUR2_EDEFAULT, oldValeur2ESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetValeur2() {
		return valeur2ESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getValeur3() {
		return valeur3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValeur3(double newValeur3) {
		double oldValeur3 = valeur3;
		valeur3 = newValeur3;
		boolean oldValeur3ESet = valeur3ESet;
		valeur3ESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SERIE_GEOSTATISTIQUE__VALEUR3, oldValeur3, valeur3, !oldValeur3ESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetValeur3() {
		double oldValeur3 = valeur3;
		boolean oldValeur3ESet = valeur3ESet;
		valeur3 = VALEUR3_EDEFAULT;
		valeur3ESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_SERIE_GEOSTATISTIQUE__VALEUR3, oldValeur3, VALEUR3_EDEFAULT, oldValeur3ESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetValeur3() {
		return valeur3ESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getValeur4() {
		return valeur4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValeur4(double newValeur4) {
		double oldValeur4 = valeur4;
		valeur4 = newValeur4;
		boolean oldValeur4ESet = valeur4ESet;
		valeur4ESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SERIE_GEOSTATISTIQUE__VALEUR4, oldValeur4, valeur4, !oldValeur4ESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetValeur4() {
		double oldValeur4 = valeur4;
		boolean oldValeur4ESet = valeur4ESet;
		valeur4 = VALEUR4_EDEFAULT;
		valeur4ESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_SERIE_GEOSTATISTIQUE__VALEUR4, oldValeur4, VALEUR4_EDEFAULT, oldValeur4ESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetValeur4() {
		return valeur4ESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getValeur5() {
		return valeur5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValeur5(double newValeur5) {
		double oldValeur5 = valeur5;
		valeur5 = newValeur5;
		boolean oldValeur5ESet = valeur5ESet;
		valeur5ESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SERIE_GEOSTATISTIQUE__VALEUR5, oldValeur5, valeur5, !oldValeur5ESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetValeur5() {
		double oldValeur5 = valeur5;
		boolean oldValeur5ESet = valeur5ESet;
		valeur5 = VALEUR5_EDEFAULT;
		valeur5ESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_SERIE_GEOSTATISTIQUE__VALEUR5, oldValeur5, VALEUR5_EDEFAULT, oldValeur5ESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetValeur5() {
		return valeur5ESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getValeur6() {
		return valeur6;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValeur6(double newValeur6) {
		double oldValeur6 = valeur6;
		valeur6 = newValeur6;
		boolean oldValeur6ESet = valeur6ESet;
		valeur6ESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SERIE_GEOSTATISTIQUE__VALEUR6, oldValeur6, valeur6, !oldValeur6ESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetValeur6() {
		double oldValeur6 = valeur6;
		boolean oldValeur6ESet = valeur6ESet;
		valeur6 = VALEUR6_EDEFAULT;
		valeur6ESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_SERIE_GEOSTATISTIQUE__VALEUR6, oldValeur6, VALEUR6_EDEFAULT, oldValeur6ESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetValeur6() {
		return valeur6ESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getValeur7() {
		return valeur7;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValeur7(double newValeur7) {
		double oldValeur7 = valeur7;
		valeur7 = newValeur7;
		boolean oldValeur7ESet = valeur7ESet;
		valeur7ESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SERIE_GEOSTATISTIQUE__VALEUR7, oldValeur7, valeur7, !oldValeur7ESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetValeur7() {
		double oldValeur7 = valeur7;
		boolean oldValeur7ESet = valeur7ESet;
		valeur7 = VALEUR7_EDEFAULT;
		valeur7ESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_SERIE_GEOSTATISTIQUE__VALEUR7, oldValeur7, VALEUR7_EDEFAULT, oldValeur7ESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetValeur7() {
		return valeur7ESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getValeur8() {
		return valeur8;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValeur8(double newValeur8) {
		double oldValeur8 = valeur8;
		valeur8 = newValeur8;
		boolean oldValeur8ESet = valeur8ESet;
		valeur8ESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SERIE_GEOSTATISTIQUE__VALEUR8, oldValeur8, valeur8, !oldValeur8ESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetValeur8() {
		double oldValeur8 = valeur8;
		boolean oldValeur8ESet = valeur8ESet;
		valeur8 = VALEUR8_EDEFAULT;
		valeur8ESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_SERIE_GEOSTATISTIQUE__VALEUR8, oldValeur8, VALEUR8_EDEFAULT, oldValeur8ESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetValeur8() {
		return valeur8ESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SERIE_GEOSTATISTIQUE__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SERIE_GEOSTATISTIQUE__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeLocalisation getLocalisationLocalisation() {
		return localisationLocalisation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocalisationLocalisation(TypeLocalisation newLocalisationLocalisation, NotificationChain msgs) {
		TypeLocalisation oldLocalisationLocalisation = localisationLocalisation;
		localisationLocalisation = newLocalisationLocalisation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SERIE_GEOSTATISTIQUE__LOCALISATION_LOCALISATION, oldLocalisationLocalisation, newLocalisationLocalisation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocalisationLocalisation(TypeLocalisation newLocalisationLocalisation) {
		if (newLocalisationLocalisation != localisationLocalisation) {
			NotificationChain msgs = null;
			if (localisationLocalisation != null)
				msgs = ((InternalEObject)localisationLocalisation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_SERIE_GEOSTATISTIQUE__LOCALISATION_LOCALISATION, null, msgs);
			if (newLocalisationLocalisation != null)
				msgs = ((InternalEObject)newLocalisationLocalisation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_SERIE_GEOSTATISTIQUE__LOCALISATION_LOCALISATION, null, msgs);
			msgs = basicSetLocalisationLocalisation(newLocalisationLocalisation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SERIE_GEOSTATISTIQUE__LOCALISATION_LOCALISATION, newLocalisationLocalisation, newLocalisationLocalisation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_SERIE_GEOSTATISTIQUE__LOCALISATION_LOCALISATION:
				return basicSetLocalisationLocalisation(null, msgs);
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
			case SchemaPackage.TYPE_SERIE_GEOSTATISTIQUE__NOM:
				return getNom();
			case SchemaPackage.TYPE_SERIE_GEOSTATISTIQUE__GDH_DATE_CREATION:
				return getGdhDateCreation();
			case SchemaPackage.TYPE_SERIE_GEOSTATISTIQUE__DESCRIPTION:
				return getDescription();
			case SchemaPackage.TYPE_SERIE_GEOSTATISTIQUE__VALEUR1:
				return new Double(getValeur1());
			case SchemaPackage.TYPE_SERIE_GEOSTATISTIQUE__VALEUR2:
				return new Double(getValeur2());
			case SchemaPackage.TYPE_SERIE_GEOSTATISTIQUE__VALEUR3:
				return new Double(getValeur3());
			case SchemaPackage.TYPE_SERIE_GEOSTATISTIQUE__VALEUR4:
				return new Double(getValeur4());
			case SchemaPackage.TYPE_SERIE_GEOSTATISTIQUE__VALEUR5:
				return new Double(getValeur5());
			case SchemaPackage.TYPE_SERIE_GEOSTATISTIQUE__VALEUR6:
				return new Double(getValeur6());
			case SchemaPackage.TYPE_SERIE_GEOSTATISTIQUE__VALEUR7:
				return new Double(getValeur7());
			case SchemaPackage.TYPE_SERIE_GEOSTATISTIQUE__VALEUR8:
				return new Double(getValeur8());
			case SchemaPackage.TYPE_SERIE_GEOSTATISTIQUE__CTE:
				return getCTE();
			case SchemaPackage.TYPE_SERIE_GEOSTATISTIQUE__CE:
				return getCE();
			case SchemaPackage.TYPE_SERIE_GEOSTATISTIQUE__LOCALISATION_LOCALISATION:
				return getLocalisationLocalisation();
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
			case SchemaPackage.TYPE_SERIE_GEOSTATISTIQUE__NOM:
				setNom((String)newValue);
				return;
			case SchemaPackage.TYPE_SERIE_GEOSTATISTIQUE__GDH_DATE_CREATION:
				setGdhDateCreation((XMLGregorianCalendar)newValue);
				return;
			case SchemaPackage.TYPE_SERIE_GEOSTATISTIQUE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case SchemaPackage.TYPE_SERIE_GEOSTATISTIQUE__VALEUR1:
				setValeur1(((Double)newValue).doubleValue());
				return;
			case SchemaPackage.TYPE_SERIE_GEOSTATISTIQUE__VALEUR2:
				setValeur2(((Double)newValue).doubleValue());
				return;
			case SchemaPackage.TYPE_SERIE_GEOSTATISTIQUE__VALEUR3:
				setValeur3(((Double)newValue).doubleValue());
				return;
			case SchemaPackage.TYPE_SERIE_GEOSTATISTIQUE__VALEUR4:
				setValeur4(((Double)newValue).doubleValue());
				return;
			case SchemaPackage.TYPE_SERIE_GEOSTATISTIQUE__VALEUR5:
				setValeur5(((Double)newValue).doubleValue());
				return;
			case SchemaPackage.TYPE_SERIE_GEOSTATISTIQUE__VALEUR6:
				setValeur6(((Double)newValue).doubleValue());
				return;
			case SchemaPackage.TYPE_SERIE_GEOSTATISTIQUE__VALEUR7:
				setValeur7(((Double)newValue).doubleValue());
				return;
			case SchemaPackage.TYPE_SERIE_GEOSTATISTIQUE__VALEUR8:
				setValeur8(((Double)newValue).doubleValue());
				return;
			case SchemaPackage.TYPE_SERIE_GEOSTATISTIQUE__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_SERIE_GEOSTATISTIQUE__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_SERIE_GEOSTATISTIQUE__LOCALISATION_LOCALISATION:
				setLocalisationLocalisation((TypeLocalisation)newValue);
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
			case SchemaPackage.TYPE_SERIE_GEOSTATISTIQUE__NOM:
				setNom(NOM_EDEFAULT);
				return;
			case SchemaPackage.TYPE_SERIE_GEOSTATISTIQUE__GDH_DATE_CREATION:
				setGdhDateCreation(GDH_DATE_CREATION_EDEFAULT);
				return;
			case SchemaPackage.TYPE_SERIE_GEOSTATISTIQUE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case SchemaPackage.TYPE_SERIE_GEOSTATISTIQUE__VALEUR1:
				unsetValeur1();
				return;
			case SchemaPackage.TYPE_SERIE_GEOSTATISTIQUE__VALEUR2:
				unsetValeur2();
				return;
			case SchemaPackage.TYPE_SERIE_GEOSTATISTIQUE__VALEUR3:
				unsetValeur3();
				return;
			case SchemaPackage.TYPE_SERIE_GEOSTATISTIQUE__VALEUR4:
				unsetValeur4();
				return;
			case SchemaPackage.TYPE_SERIE_GEOSTATISTIQUE__VALEUR5:
				unsetValeur5();
				return;
			case SchemaPackage.TYPE_SERIE_GEOSTATISTIQUE__VALEUR6:
				unsetValeur6();
				return;
			case SchemaPackage.TYPE_SERIE_GEOSTATISTIQUE__VALEUR7:
				unsetValeur7();
				return;
			case SchemaPackage.TYPE_SERIE_GEOSTATISTIQUE__VALEUR8:
				unsetValeur8();
				return;
			case SchemaPackage.TYPE_SERIE_GEOSTATISTIQUE__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_SERIE_GEOSTATISTIQUE__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_SERIE_GEOSTATISTIQUE__LOCALISATION_LOCALISATION:
				setLocalisationLocalisation((TypeLocalisation)null);
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
			case SchemaPackage.TYPE_SERIE_GEOSTATISTIQUE__NOM:
				return NOM_EDEFAULT == null ? nom != null : !NOM_EDEFAULT.equals(nom);
			case SchemaPackage.TYPE_SERIE_GEOSTATISTIQUE__GDH_DATE_CREATION:
				return GDH_DATE_CREATION_EDEFAULT == null ? gdhDateCreation != null : !GDH_DATE_CREATION_EDEFAULT.equals(gdhDateCreation);
			case SchemaPackage.TYPE_SERIE_GEOSTATISTIQUE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case SchemaPackage.TYPE_SERIE_GEOSTATISTIQUE__VALEUR1:
				return isSetValeur1();
			case SchemaPackage.TYPE_SERIE_GEOSTATISTIQUE__VALEUR2:
				return isSetValeur2();
			case SchemaPackage.TYPE_SERIE_GEOSTATISTIQUE__VALEUR3:
				return isSetValeur3();
			case SchemaPackage.TYPE_SERIE_GEOSTATISTIQUE__VALEUR4:
				return isSetValeur4();
			case SchemaPackage.TYPE_SERIE_GEOSTATISTIQUE__VALEUR5:
				return isSetValeur5();
			case SchemaPackage.TYPE_SERIE_GEOSTATISTIQUE__VALEUR6:
				return isSetValeur6();
			case SchemaPackage.TYPE_SERIE_GEOSTATISTIQUE__VALEUR7:
				return isSetValeur7();
			case SchemaPackage.TYPE_SERIE_GEOSTATISTIQUE__VALEUR8:
				return isSetValeur8();
			case SchemaPackage.TYPE_SERIE_GEOSTATISTIQUE__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_SERIE_GEOSTATISTIQUE__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_SERIE_GEOSTATISTIQUE__LOCALISATION_LOCALISATION:
				return localisationLocalisation != null;
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
		result.append(" (nom: ");
		result.append(nom);
		result.append(", gdhDateCreation: ");
		result.append(gdhDateCreation);
		result.append(", description: ");
		result.append(description);
		result.append(", valeur1: ");
		if (valeur1ESet) result.append(valeur1); else result.append("<unset>");
		result.append(", valeur2: ");
		if (valeur2ESet) result.append(valeur2); else result.append("<unset>");
		result.append(", valeur3: ");
		if (valeur3ESet) result.append(valeur3); else result.append("<unset>");
		result.append(", valeur4: ");
		if (valeur4ESet) result.append(valeur4); else result.append("<unset>");
		result.append(", valeur5: ");
		if (valeur5ESet) result.append(valeur5); else result.append("<unset>");
		result.append(", valeur6: ");
		if (valeur6ESet) result.append(valeur6); else result.append("<unset>");
		result.append(", valeur7: ");
		if (valeur7ESet) result.append(valeur7); else result.append("<unset>");
		result.append(", valeur8: ");
		if (valeur8ESet) result.append(valeur8); else result.append("<unset>");
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypeSerieGeostatistiqueImpl
