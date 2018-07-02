/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDictionaryDicoChoixCouleur;
import mpia.schema.TypeSymbolePostIt;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Symbole Post It</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeSymbolePostItImpl#getLibelle <em>Libelle</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeSymbolePostItImpl#isGras <em>Gras</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeSymbolePostItImpl#isItalique <em>Italique</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeSymbolePostItImpl#getCouleurTexte <em>Couleur Texte</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeSymbolePostItImpl#isSouligne <em>Souligne</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeSymbolePostItImpl#isOmbre <em>Ombre</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeSymbolePostItImpl#getMarge <em>Marge</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeSymbolePostItImpl extends TypeSymboleLibreImpl implements TypeSymbolePostIt {
	/**
	 * The default value of the '{@link #getLibelle() <em>Libelle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLibelle()
	 * @generated
	 * @ordered
	 */
	protected static final String LIBELLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLibelle() <em>Libelle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLibelle()
	 * @generated
	 * @ordered
	 */
	protected String libelle = LIBELLE_EDEFAULT;

	/**
	 * The default value of the '{@link #isGras() <em>Gras</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGras()
	 * @generated
	 * @ordered
	 */
	protected static final boolean GRAS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isGras() <em>Gras</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGras()
	 * @generated
	 * @ordered
	 */
	protected boolean gras = GRAS_EDEFAULT;

	/**
	 * This is true if the Gras attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean grasESet;

	/**
	 * The default value of the '{@link #isItalique() <em>Italique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isItalique()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ITALIQUE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isItalique() <em>Italique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isItalique()
	 * @generated
	 * @ordered
	 */
	protected boolean italique = ITALIQUE_EDEFAULT;

	/**
	 * This is true if the Italique attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean italiqueESet;

	/**
	 * The default value of the '{@link #getCouleurTexte() <em>Couleur Texte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCouleurTexte()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoChoixCouleur COULEUR_TEXTE_EDEFAULT = TypeDictionaryDicoChoixCouleur.AQUAMARINE;

	/**
	 * The cached value of the '{@link #getCouleurTexte() <em>Couleur Texte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCouleurTexte()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoChoixCouleur couleurTexte = COULEUR_TEXTE_EDEFAULT;

	/**
	 * This is true if the Couleur Texte attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean couleurTexteESet;

	/**
	 * The default value of the '{@link #isSouligne() <em>Souligne</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSouligne()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SOULIGNE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSouligne() <em>Souligne</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSouligne()
	 * @generated
	 * @ordered
	 */
	protected boolean souligne = SOULIGNE_EDEFAULT;

	/**
	 * This is true if the Souligne attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean souligneESet;

	/**
	 * The default value of the '{@link #isOmbre() <em>Ombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOmbre()
	 * @generated
	 * @ordered
	 */
	protected static final boolean OMBRE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isOmbre() <em>Ombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOmbre()
	 * @generated
	 * @ordered
	 */
	protected boolean ombre = OMBRE_EDEFAULT;

	/**
	 * This is true if the Ombre attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean ombreESet;

	/**
	 * The default value of the '{@link #getMarge() <em>Marge</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarge()
	 * @generated
	 * @ordered
	 */
	protected static final long MARGE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getMarge() <em>Marge</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarge()
	 * @generated
	 * @ordered
	 */
	protected long marge = MARGE_EDEFAULT;

	/**
	 * This is true if the Marge attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean margeESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeSymbolePostItImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeSymbolePostIt();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLibelle() {
		return libelle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLibelle(String newLibelle) {
		String oldLibelle = libelle;
		libelle = newLibelle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SYMBOLE_POST_IT__LIBELLE, oldLibelle, libelle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isGras() {
		return gras;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGras(boolean newGras) {
		boolean oldGras = gras;
		gras = newGras;
		boolean oldGrasESet = grasESet;
		grasESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SYMBOLE_POST_IT__GRAS, oldGras, gras, !oldGrasESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetGras() {
		boolean oldGras = gras;
		boolean oldGrasESet = grasESet;
		gras = GRAS_EDEFAULT;
		grasESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_SYMBOLE_POST_IT__GRAS, oldGras, GRAS_EDEFAULT, oldGrasESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetGras() {
		return grasESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isItalique() {
		return italique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setItalique(boolean newItalique) {
		boolean oldItalique = italique;
		italique = newItalique;
		boolean oldItaliqueESet = italiqueESet;
		italiqueESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SYMBOLE_POST_IT__ITALIQUE, oldItalique, italique, !oldItaliqueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetItalique() {
		boolean oldItalique = italique;
		boolean oldItaliqueESet = italiqueESet;
		italique = ITALIQUE_EDEFAULT;
		italiqueESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_SYMBOLE_POST_IT__ITALIQUE, oldItalique, ITALIQUE_EDEFAULT, oldItaliqueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetItalique() {
		return italiqueESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoChoixCouleur getCouleurTexte() {
		return couleurTexte;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCouleurTexte(TypeDictionaryDicoChoixCouleur newCouleurTexte) {
		TypeDictionaryDicoChoixCouleur oldCouleurTexte = couleurTexte;
		couleurTexte = newCouleurTexte == null ? COULEUR_TEXTE_EDEFAULT : newCouleurTexte;
		boolean oldCouleurTexteESet = couleurTexteESet;
		couleurTexteESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SYMBOLE_POST_IT__COULEUR_TEXTE, oldCouleurTexte, couleurTexte, !oldCouleurTexteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCouleurTexte() {
		TypeDictionaryDicoChoixCouleur oldCouleurTexte = couleurTexte;
		boolean oldCouleurTexteESet = couleurTexteESet;
		couleurTexte = COULEUR_TEXTE_EDEFAULT;
		couleurTexteESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_SYMBOLE_POST_IT__COULEUR_TEXTE, oldCouleurTexte, COULEUR_TEXTE_EDEFAULT, oldCouleurTexteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCouleurTexte() {
		return couleurTexteESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSouligne() {
		return souligne;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSouligne(boolean newSouligne) {
		boolean oldSouligne = souligne;
		souligne = newSouligne;
		boolean oldSouligneESet = souligneESet;
		souligneESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SYMBOLE_POST_IT__SOULIGNE, oldSouligne, souligne, !oldSouligneESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSouligne() {
		boolean oldSouligne = souligne;
		boolean oldSouligneESet = souligneESet;
		souligne = SOULIGNE_EDEFAULT;
		souligneESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_SYMBOLE_POST_IT__SOULIGNE, oldSouligne, SOULIGNE_EDEFAULT, oldSouligneESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSouligne() {
		return souligneESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isOmbre() {
		return ombre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOmbre(boolean newOmbre) {
		boolean oldOmbre = ombre;
		ombre = newOmbre;
		boolean oldOmbreESet = ombreESet;
		ombreESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SYMBOLE_POST_IT__OMBRE, oldOmbre, ombre, !oldOmbreESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetOmbre() {
		boolean oldOmbre = ombre;
		boolean oldOmbreESet = ombreESet;
		ombre = OMBRE_EDEFAULT;
		ombreESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_SYMBOLE_POST_IT__OMBRE, oldOmbre, OMBRE_EDEFAULT, oldOmbreESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOmbre() {
		return ombreESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getMarge() {
		return marge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMarge(long newMarge) {
		long oldMarge = marge;
		marge = newMarge;
		boolean oldMargeESet = margeESet;
		margeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SYMBOLE_POST_IT__MARGE, oldMarge, marge, !oldMargeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMarge() {
		long oldMarge = marge;
		boolean oldMargeESet = margeESet;
		marge = MARGE_EDEFAULT;
		margeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_SYMBOLE_POST_IT__MARGE, oldMarge, MARGE_EDEFAULT, oldMargeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMarge() {
		return margeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SchemaPackage.TYPE_SYMBOLE_POST_IT__LIBELLE:
				return getLibelle();
			case SchemaPackage.TYPE_SYMBOLE_POST_IT__GRAS:
				return isGras() ? Boolean.TRUE : Boolean.FALSE;
			case SchemaPackage.TYPE_SYMBOLE_POST_IT__ITALIQUE:
				return isItalique() ? Boolean.TRUE : Boolean.FALSE;
			case SchemaPackage.TYPE_SYMBOLE_POST_IT__COULEUR_TEXTE:
				return getCouleurTexte();
			case SchemaPackage.TYPE_SYMBOLE_POST_IT__SOULIGNE:
				return isSouligne() ? Boolean.TRUE : Boolean.FALSE;
			case SchemaPackage.TYPE_SYMBOLE_POST_IT__OMBRE:
				return isOmbre() ? Boolean.TRUE : Boolean.FALSE;
			case SchemaPackage.TYPE_SYMBOLE_POST_IT__MARGE:
				return new Long(getMarge());
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
			case SchemaPackage.TYPE_SYMBOLE_POST_IT__LIBELLE:
				setLibelle((String)newValue);
				return;
			case SchemaPackage.TYPE_SYMBOLE_POST_IT__GRAS:
				setGras(((Boolean)newValue).booleanValue());
				return;
			case SchemaPackage.TYPE_SYMBOLE_POST_IT__ITALIQUE:
				setItalique(((Boolean)newValue).booleanValue());
				return;
			case SchemaPackage.TYPE_SYMBOLE_POST_IT__COULEUR_TEXTE:
				setCouleurTexte((TypeDictionaryDicoChoixCouleur)newValue);
				return;
			case SchemaPackage.TYPE_SYMBOLE_POST_IT__SOULIGNE:
				setSouligne(((Boolean)newValue).booleanValue());
				return;
			case SchemaPackage.TYPE_SYMBOLE_POST_IT__OMBRE:
				setOmbre(((Boolean)newValue).booleanValue());
				return;
			case SchemaPackage.TYPE_SYMBOLE_POST_IT__MARGE:
				setMarge(((Long)newValue).longValue());
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
			case SchemaPackage.TYPE_SYMBOLE_POST_IT__LIBELLE:
				setLibelle(LIBELLE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_SYMBOLE_POST_IT__GRAS:
				unsetGras();
				return;
			case SchemaPackage.TYPE_SYMBOLE_POST_IT__ITALIQUE:
				unsetItalique();
				return;
			case SchemaPackage.TYPE_SYMBOLE_POST_IT__COULEUR_TEXTE:
				unsetCouleurTexte();
				return;
			case SchemaPackage.TYPE_SYMBOLE_POST_IT__SOULIGNE:
				unsetSouligne();
				return;
			case SchemaPackage.TYPE_SYMBOLE_POST_IT__OMBRE:
				unsetOmbre();
				return;
			case SchemaPackage.TYPE_SYMBOLE_POST_IT__MARGE:
				unsetMarge();
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
			case SchemaPackage.TYPE_SYMBOLE_POST_IT__LIBELLE:
				return LIBELLE_EDEFAULT == null ? libelle != null : !LIBELLE_EDEFAULT.equals(libelle);
			case SchemaPackage.TYPE_SYMBOLE_POST_IT__GRAS:
				return isSetGras();
			case SchemaPackage.TYPE_SYMBOLE_POST_IT__ITALIQUE:
				return isSetItalique();
			case SchemaPackage.TYPE_SYMBOLE_POST_IT__COULEUR_TEXTE:
				return isSetCouleurTexte();
			case SchemaPackage.TYPE_SYMBOLE_POST_IT__SOULIGNE:
				return isSetSouligne();
			case SchemaPackage.TYPE_SYMBOLE_POST_IT__OMBRE:
				return isSetOmbre();
			case SchemaPackage.TYPE_SYMBOLE_POST_IT__MARGE:
				return isSetMarge();
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
		result.append(" (libelle: ");
		result.append(libelle);
		result.append(", gras: ");
		if (grasESet) result.append(gras); else result.append("<unset>");
		result.append(", italique: ");
		if (italiqueESet) result.append(italique); else result.append("<unset>");
		result.append(", couleurTexte: ");
		if (couleurTexteESet) result.append(couleurTexte); else result.append("<unset>");
		result.append(", souligne: ");
		if (souligneESet) result.append(souligne); else result.append("<unset>");
		result.append(", ombre: ");
		if (ombreESet) result.append(ombre); else result.append("<unset>");
		result.append(", marge: ");
		if (margeESet) result.append(marge); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TypeSymbolePostItImpl
