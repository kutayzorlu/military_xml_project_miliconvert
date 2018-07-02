/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDictionaryDicoObjectifActiviteTypeProductionImageMediaEtQualiteImage;
import mpia.schema.TypeObjectifActiviteTypeProductionImage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Objectif Activite Type Production Image</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeObjectifActiviteTypeProductionImageImpl#getEchelle <em>Echelle</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeObjectifActiviteTypeProductionImageImpl#getMediaEtQualiteImage <em>Media Et Qualite Image</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeObjectifActiviteTypeProductionImageImpl extends TypeObjectifActiviteTypeImpl implements TypeObjectifActiviteTypeProductionImage {
	/**
	 * The default value of the '{@link #getEchelle() <em>Echelle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEchelle()
	 * @generated
	 * @ordered
	 */
	protected static final double ECHELLE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getEchelle() <em>Echelle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEchelle()
	 * @generated
	 * @ordered
	 */
	protected double echelle = ECHELLE_EDEFAULT;

	/**
	 * This is true if the Echelle attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean echelleESet;

	/**
	 * The default value of the '{@link #getMediaEtQualiteImage() <em>Media Et Qualite Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMediaEtQualiteImage()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoObjectifActiviteTypeProductionImageMediaEtQualiteImage MEDIA_ET_QUALITE_IMAGE_EDEFAULT = TypeDictionaryDicoObjectifActiviteTypeProductionImageMediaEtQualiteImage._10PRNT;

	/**
	 * The cached value of the '{@link #getMediaEtQualiteImage() <em>Media Et Qualite Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMediaEtQualiteImage()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoObjectifActiviteTypeProductionImageMediaEtQualiteImage mediaEtQualiteImage = MEDIA_ET_QUALITE_IMAGE_EDEFAULT;

	/**
	 * This is true if the Media Et Qualite Image attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean mediaEtQualiteImageESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeObjectifActiviteTypeProductionImageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeObjectifActiviteTypeProductionImage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getEchelle() {
		return echelle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEchelle(double newEchelle) {
		double oldEchelle = echelle;
		echelle = newEchelle;
		boolean oldEchelleESet = echelleESet;
		echelleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_OBJECTIF_ACTIVITE_TYPE_PRODUCTION_IMAGE__ECHELLE, oldEchelle, echelle, !oldEchelleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEchelle() {
		double oldEchelle = echelle;
		boolean oldEchelleESet = echelleESet;
		echelle = ECHELLE_EDEFAULT;
		echelleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_OBJECTIF_ACTIVITE_TYPE_PRODUCTION_IMAGE__ECHELLE, oldEchelle, ECHELLE_EDEFAULT, oldEchelleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEchelle() {
		return echelleESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoObjectifActiviteTypeProductionImageMediaEtQualiteImage getMediaEtQualiteImage() {
		return mediaEtQualiteImage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMediaEtQualiteImage(TypeDictionaryDicoObjectifActiviteTypeProductionImageMediaEtQualiteImage newMediaEtQualiteImage) {
		TypeDictionaryDicoObjectifActiviteTypeProductionImageMediaEtQualiteImage oldMediaEtQualiteImage = mediaEtQualiteImage;
		mediaEtQualiteImage = newMediaEtQualiteImage == null ? MEDIA_ET_QUALITE_IMAGE_EDEFAULT : newMediaEtQualiteImage;
		boolean oldMediaEtQualiteImageESet = mediaEtQualiteImageESet;
		mediaEtQualiteImageESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_OBJECTIF_ACTIVITE_TYPE_PRODUCTION_IMAGE__MEDIA_ET_QUALITE_IMAGE, oldMediaEtQualiteImage, mediaEtQualiteImage, !oldMediaEtQualiteImageESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMediaEtQualiteImage() {
		TypeDictionaryDicoObjectifActiviteTypeProductionImageMediaEtQualiteImage oldMediaEtQualiteImage = mediaEtQualiteImage;
		boolean oldMediaEtQualiteImageESet = mediaEtQualiteImageESet;
		mediaEtQualiteImage = MEDIA_ET_QUALITE_IMAGE_EDEFAULT;
		mediaEtQualiteImageESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_OBJECTIF_ACTIVITE_TYPE_PRODUCTION_IMAGE__MEDIA_ET_QUALITE_IMAGE, oldMediaEtQualiteImage, MEDIA_ET_QUALITE_IMAGE_EDEFAULT, oldMediaEtQualiteImageESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMediaEtQualiteImage() {
		return mediaEtQualiteImageESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SchemaPackage.TYPE_OBJECTIF_ACTIVITE_TYPE_PRODUCTION_IMAGE__ECHELLE:
				return new Double(getEchelle());
			case SchemaPackage.TYPE_OBJECTIF_ACTIVITE_TYPE_PRODUCTION_IMAGE__MEDIA_ET_QUALITE_IMAGE:
				return getMediaEtQualiteImage();
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
			case SchemaPackage.TYPE_OBJECTIF_ACTIVITE_TYPE_PRODUCTION_IMAGE__ECHELLE:
				setEchelle(((Double)newValue).doubleValue());
				return;
			case SchemaPackage.TYPE_OBJECTIF_ACTIVITE_TYPE_PRODUCTION_IMAGE__MEDIA_ET_QUALITE_IMAGE:
				setMediaEtQualiteImage((TypeDictionaryDicoObjectifActiviteTypeProductionImageMediaEtQualiteImage)newValue);
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
			case SchemaPackage.TYPE_OBJECTIF_ACTIVITE_TYPE_PRODUCTION_IMAGE__ECHELLE:
				unsetEchelle();
				return;
			case SchemaPackage.TYPE_OBJECTIF_ACTIVITE_TYPE_PRODUCTION_IMAGE__MEDIA_ET_QUALITE_IMAGE:
				unsetMediaEtQualiteImage();
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
			case SchemaPackage.TYPE_OBJECTIF_ACTIVITE_TYPE_PRODUCTION_IMAGE__ECHELLE:
				return isSetEchelle();
			case SchemaPackage.TYPE_OBJECTIF_ACTIVITE_TYPE_PRODUCTION_IMAGE__MEDIA_ET_QUALITE_IMAGE:
				return isSetMediaEtQualiteImage();
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
		result.append(" (echelle: ");
		if (echelleESet) result.append(echelle); else result.append("<unset>");
		result.append(", mediaEtQualiteImage: ");
		if (mediaEtQualiteImageESet) result.append(mediaEtQualiteImage); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TypeObjectifActiviteTypeProductionImageImpl
