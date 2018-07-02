/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeDataTypeAngle;
import mpia.meta.TypeDataTypeLongueur;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDictionaryDicoMesureNuageSection;
import mpia.schema.TypeMesureNuage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Mesure Nuage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeMesureNuageImpl#getHauteur <em>Hauteur</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMesureNuageImpl#getSection <em>Section</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMesureNuageImpl#getAngle <em>Angle</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMesureNuageImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMesureNuageImpl#getCE <em>CE</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeMesureNuageImpl extends EObjectImpl implements TypeMesureNuage {
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
	 * The default value of the '{@link #getSection() <em>Section</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSection()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoMesureNuageSection SECTION_EDEFAULT = TypeDictionaryDicoMesureNuageSection.TOP;

	/**
	 * The cached value of the '{@link #getSection() <em>Section</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSection()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoMesureNuageSection section = SECTION_EDEFAULT;

	/**
	 * This is true if the Section attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean sectionESet;

	/**
	 * The cached value of the '{@link #getAngle() <em>Angle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAngle()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeAngle angle;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeMesureNuageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeMesureNuage();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MESURE_NUAGE__HAUTEUR, oldHauteur, newHauteur);
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
				msgs = ((InternalEObject)hauteur).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MESURE_NUAGE__HAUTEUR, null, msgs);
			if (newHauteur != null)
				msgs = ((InternalEObject)newHauteur).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MESURE_NUAGE__HAUTEUR, null, msgs);
			msgs = basicSetHauteur(newHauteur, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MESURE_NUAGE__HAUTEUR, newHauteur, newHauteur));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoMesureNuageSection getSection() {
		return section;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSection(TypeDictionaryDicoMesureNuageSection newSection) {
		TypeDictionaryDicoMesureNuageSection oldSection = section;
		section = newSection == null ? SECTION_EDEFAULT : newSection;
		boolean oldSectionESet = sectionESet;
		sectionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MESURE_NUAGE__SECTION, oldSection, section, !oldSectionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSection() {
		TypeDictionaryDicoMesureNuageSection oldSection = section;
		boolean oldSectionESet = sectionESet;
		section = SECTION_EDEFAULT;
		sectionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_MESURE_NUAGE__SECTION, oldSection, SECTION_EDEFAULT, oldSectionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSection() {
		return sectionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeAngle getAngle() {
		return angle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAngle(TypeDataTypeAngle newAngle, NotificationChain msgs) {
		TypeDataTypeAngle oldAngle = angle;
		angle = newAngle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MESURE_NUAGE__ANGLE, oldAngle, newAngle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAngle(TypeDataTypeAngle newAngle) {
		if (newAngle != angle) {
			NotificationChain msgs = null;
			if (angle != null)
				msgs = ((InternalEObject)angle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MESURE_NUAGE__ANGLE, null, msgs);
			if (newAngle != null)
				msgs = ((InternalEObject)newAngle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MESURE_NUAGE__ANGLE, null, msgs);
			msgs = basicSetAngle(newAngle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MESURE_NUAGE__ANGLE, newAngle, newAngle));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MESURE_NUAGE__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MESURE_NUAGE__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_MESURE_NUAGE__HAUTEUR:
				return basicSetHauteur(null, msgs);
			case SchemaPackage.TYPE_MESURE_NUAGE__ANGLE:
				return basicSetAngle(null, msgs);
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
			case SchemaPackage.TYPE_MESURE_NUAGE__HAUTEUR:
				return getHauteur();
			case SchemaPackage.TYPE_MESURE_NUAGE__SECTION:
				return getSection();
			case SchemaPackage.TYPE_MESURE_NUAGE__ANGLE:
				return getAngle();
			case SchemaPackage.TYPE_MESURE_NUAGE__CTE:
				return getCTE();
			case SchemaPackage.TYPE_MESURE_NUAGE__CE:
				return getCE();
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
			case SchemaPackage.TYPE_MESURE_NUAGE__HAUTEUR:
				setHauteur((TypeDataTypeLongueur)newValue);
				return;
			case SchemaPackage.TYPE_MESURE_NUAGE__SECTION:
				setSection((TypeDictionaryDicoMesureNuageSection)newValue);
				return;
			case SchemaPackage.TYPE_MESURE_NUAGE__ANGLE:
				setAngle((TypeDataTypeAngle)newValue);
				return;
			case SchemaPackage.TYPE_MESURE_NUAGE__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_MESURE_NUAGE__CE:
				setCE((String)newValue);
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
			case SchemaPackage.TYPE_MESURE_NUAGE__HAUTEUR:
				setHauteur((TypeDataTypeLongueur)null);
				return;
			case SchemaPackage.TYPE_MESURE_NUAGE__SECTION:
				unsetSection();
				return;
			case SchemaPackage.TYPE_MESURE_NUAGE__ANGLE:
				setAngle((TypeDataTypeAngle)null);
				return;
			case SchemaPackage.TYPE_MESURE_NUAGE__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_MESURE_NUAGE__CE:
				setCE(CE_EDEFAULT);
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
			case SchemaPackage.TYPE_MESURE_NUAGE__HAUTEUR:
				return hauteur != null;
			case SchemaPackage.TYPE_MESURE_NUAGE__SECTION:
				return isSetSection();
			case SchemaPackage.TYPE_MESURE_NUAGE__ANGLE:
				return angle != null;
			case SchemaPackage.TYPE_MESURE_NUAGE__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_MESURE_NUAGE__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
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
		result.append(" (section: ");
		if (sectionESet) result.append(section); else result.append("<unset>");
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypeMesureNuageImpl
