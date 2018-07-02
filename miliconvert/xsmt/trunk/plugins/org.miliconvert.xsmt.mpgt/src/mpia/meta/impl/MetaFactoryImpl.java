/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.meta.impl;

import java.math.BigDecimal;

import javax.xml.datatype.XMLGregorianCalendar;

import mpia.meta.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MetaFactoryImpl extends EFactoryImpl implements MetaFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MetaFactory init() {
		try {
			MetaFactory theMetaFactory = (MetaFactory)EPackage.Registry.INSTANCE.getEFactory("urn:XST-meta"); 
			if (theMetaFactory != null) {
				return theMetaFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MetaFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetaFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case MetaPackage.TYPE_ASSOCIATION: return createTypeAssociation();
			case MetaPackage.TYPE_ASSOCIATION_EXT: return createTypeAssociationEXT();
			case MetaPackage.TYPE_DATA_TYPE_ACCELERATION_ANGULAIRE: return createTypeDataTypeAccelerationAngulaire();
			case MetaPackage.TYPE_DATA_TYPE_ACCELERATION_ANGULAIRE_ORIENTEE: return createTypeDataTypeAccelerationAngulaireOrientee();
			case MetaPackage.TYPE_DATA_TYPE_ACCELERATION_LINEAIRE: return createTypeDataTypeAccelerationLineaire();
			case MetaPackage.TYPE_DATA_TYPE_AIRE: return createTypeDataTypeAire();
			case MetaPackage.TYPE_DATA_TYPE_ALTITUDE_PRESSION: return createTypeDataTypeAltitudePression();
			case MetaPackage.TYPE_DATA_TYPE_ANGLE: return createTypeDataTypeAngle();
			case MetaPackage.TYPE_DATA_TYPE_ANGLE_SIGNE: return createTypeDataTypeAngleSigne();
			case MetaPackage.TYPE_DATA_TYPE_CHAMP_MAGNETIQUE: return createTypeDataTypeChampMagnetique();
			case MetaPackage.TYPE_DATA_TYPE_COORDONNEE_ACCELERATION_LINEAIRE: return createTypeDataTypeCoordonneeAccelerationLineaire();
			case MetaPackage.TYPE_DATA_TYPE_COORDONNEE_FORCE: return createTypeDataTypeCoordonneeForce();
			case MetaPackage.TYPE_DATA_TYPE_COORDONNEE_LINEAIRE: return createTypeDataTypeCoordonneeLineaire();
			case MetaPackage.TYPE_DATA_TYPE_COORDONNEE_VITESSE_LINEAIRE: return createTypeDataTypeCoordonneeVitesseLineaire();
			case MetaPackage.TYPE_DATA_TYPE_DATE_HEURE: return createTypeDataTypeDateHeure();
			case MetaPackage.TYPE_DATA_TYPE_DEBIT_MASSIQUE: return createTypeDataTypeDebitMassique();
			case MetaPackage.TYPE_DATA_TYPE_DEBIT_TRANSMISSION: return createTypeDataTypeDebitTransmission();
			case MetaPackage.TYPE_DATA_TYPE_DEBIT_VOLUMIQUE: return createTypeDataTypeDebitVolumique();
			case MetaPackage.TYPE_DATA_TYPE_DOSE_ABSORBEE: return createTypeDataTypeDoseAbsorbee();
			case MetaPackage.TYPE_DATA_TYPE_DUREE: return createTypeDataTypeDuree();
			case MetaPackage.TYPE_DATA_TYPE_FORCE: return createTypeDataTypeForce();
			case MetaPackage.TYPE_DATA_TYPE_FREQUENCE: return createTypeDataTypeFrequence();
			case MetaPackage.TYPE_DATA_TYPE_LATITUDE: return createTypeDataTypeLatitude();
			case MetaPackage.TYPE_DATA_TYPE_LONGITUDE: return createTypeDataTypeLongitude();
			case MetaPackage.TYPE_DATA_TYPE_LONGUEUR: return createTypeDataTypeLongueur();
			case MetaPackage.TYPE_DATA_TYPE_MASSE: return createTypeDataTypeMasse();
			case MetaPackage.TYPE_DATA_TYPE_PRESSION: return createTypeDataTypePression();
			case MetaPackage.TYPE_DATA_TYPE_TAUX_PRECIPITATION: return createTypeDataTypeTauxPrecipitation();
			case MetaPackage.TYPE_DATA_TYPE_TEMPERATURE: return createTypeDataTypeTemperature();
			case MetaPackage.TYPE_DATA_TYPE_VITESSE_ANGULAIRE: return createTypeDataTypeVitesseAngulaire();
			case MetaPackage.TYPE_DATA_TYPE_VITESSE_ANGULAIRE_ORIENTEE: return createTypeDataTypeVitesseAngulaireOrientee();
			case MetaPackage.TYPE_DATA_TYPE_VITESSE_LINEAIRE: return createTypeDataTypeVitesseLineaire();
			case MetaPackage.TYPE_DATA_TYPE_VOLUME: return createTypeDataTypeVolume();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case MetaPackage.TYPE_DICTIONNARY_UNITE_CODE:
				return createTypeDictionnaryUniteCodeFromString(eDataType, initialValue);
			case MetaPackage.TYPE_ANNEE:
				return createTypeAnneeFromString(eDataType, initialValue);
			case MetaPackage.TYPE_ANNEE_MOIS:
				return createTypeAnneeMoisFromString(eDataType, initialValue);
			case MetaPackage.TYPE_ANY_URI:
				return createTypeAnyURIFromString(eDataType, initialValue);
			case MetaPackage.TYPE_BOOLEAN:
				return createTypeBooleanFromString(eDataType, initialValue);
			case MetaPackage.TYPE_BOOLEAN_OBJECT:
				return createTypeBooleanObjectFromString(eDataType, initialValue);
			case MetaPackage.TYPE_DATA_TYPE_CHAINE0100:
				return createTypeDataTypeChaine0100FromString(eDataType, initialValue);
			case MetaPackage.TYPE_DATA_TYPE_CHAINE012:
				return createTypeDataTypeChaine012FromString(eDataType, initialValue);
			case MetaPackage.TYPE_DATA_TYPE_CHAINE015:
				return createTypeDataTypeChaine015FromString(eDataType, initialValue);
			case MetaPackage.TYPE_DATA_TYPE_CHAINE020:
				return createTypeDataTypeChaine020FromString(eDataType, initialValue);
			case MetaPackage.TYPE_DATA_TYPE_CHAINE02000:
				return createTypeDataTypeChaine02000FromString(eDataType, initialValue);
			case MetaPackage.TYPE_DATA_TYPE_CHAINE0255:
				return createTypeDataTypeChaine0255FromString(eDataType, initialValue);
			case MetaPackage.TYPE_DATA_TYPE_CHAINE03:
				return createTypeDataTypeChaine03FromString(eDataType, initialValue);
			case MetaPackage.TYPE_DATA_TYPE_CHAINE030:
				return createTypeDataTypeChaine030FromString(eDataType, initialValue);
			case MetaPackage.TYPE_DATA_TYPE_CHAINE050:
				return createTypeDataTypeChaine050FromString(eDataType, initialValue);
			case MetaPackage.TYPE_DATA_TYPE_CHAINE06:
				return createTypeDataTypeChaine06FromString(eDataType, initialValue);
			case MetaPackage.TYPE_DATA_TYPE_CHAINE08:
				return createTypeDataTypeChaine08FromString(eDataType, initialValue);
			case MetaPackage.TYPE_DATA_TYPE_CHAINE080:
				return createTypeDataTypeChaine080FromString(eDataType, initialValue);
			case MetaPackage.TYPE_DATA_TYPE_CHAINE09:
				return createTypeDataTypeChaine09FromString(eDataType, initialValue);
			case MetaPackage.TYPE_DATA_TYPE_ENTIER15:
				return createTypeDataTypeEntier15FromString(eDataType, initialValue);
			case MetaPackage.TYPE_DATA_TYPE_ENTIER15_OBJECT:
				return createTypeDataTypeEntier15ObjectFromString(eDataType, initialValue);
			case MetaPackage.TYPE_DATA_TYPE_ENTIER3:
				return createTypeDataTypeEntier3FromString(eDataType, initialValue);
			case MetaPackage.TYPE_DATA_TYPE_ENTIER3_OBJECT:
				return createTypeDataTypeEntier3ObjectFromString(eDataType, initialValue);
			case MetaPackage.TYPE_DATA_TYPE_ENTIER6:
				return createTypeDataTypeEntier6FromString(eDataType, initialValue);
			case MetaPackage.TYPE_DATA_TYPE_ENTIER6_OBJECT:
				return createTypeDataTypeEntier6ObjectFromString(eDataType, initialValue);
			case MetaPackage.TYPE_DATA_TYPE_ENTIER9:
				return createTypeDataTypeEntier9FromString(eDataType, initialValue);
			case MetaPackage.TYPE_DATA_TYPE_ENTIER9_OBJECT:
				return createTypeDataTypeEntier9ObjectFromString(eDataType, initialValue);
			case MetaPackage.TYPE_DATA_TYPE_FRACTION:
				return createTypeDataTypeFractionFromString(eDataType, initialValue);
			case MetaPackage.TYPE_DATA_TYPE_FRACTION_OBJECT:
				return createTypeDataTypeFractionObjectFromString(eDataType, initialValue);
			case MetaPackage.TYPE_DATA_TYPE_GDH:
				return createTypeDataTypeGDHFromString(eDataType, initialValue);
			case MetaPackage.TYPE_DATA_TYPE_RATIO:
				return createTypeDataTypeRatioFromString(eDataType, initialValue);
			case MetaPackage.TYPE_DATA_TYPE_RATIO_OBJECT:
				return createTypeDataTypeRatioObjectFromString(eDataType, initialValue);
			case MetaPackage.TYPE_DATE:
				return createTypeDateFromString(eDataType, initialValue);
			case MetaPackage.TYPE_DECIMAL:
				return createTypeDecimalFromString(eDataType, initialValue);
			case MetaPackage.TYPE_DICTIONNARY_UNITE_CODE_OBJECT:
				return createTypeDictionnaryUniteCodeObjectFromString(eDataType, initialValue);
			case MetaPackage.TYPE_DTG:
				return createTypeDTGFromString(eDataType, initialValue);
			case MetaPackage.TYPE_HEURE:
				return createTypeHeureFromString(eDataType, initialValue);
			case MetaPackage.TYPE_INTEGER:
				return createTypeIntegerFromString(eDataType, initialValue);
			case MetaPackage.TYPE_INTEGER_OBJECT:
				return createTypeIntegerObjectFromString(eDataType, initialValue);
			case MetaPackage.TYPE_REAL:
				return createTypeRealFromString(eDataType, initialValue);
			case MetaPackage.TYPE_REAL_OBJECT:
				return createTypeRealObjectFromString(eDataType, initialValue);
			case MetaPackage.TYPE_REEL_POSITIF:
				return createTypeReelPositifFromString(eDataType, initialValue);
			case MetaPackage.TYPE_REEL_POSITIF_OBJECT:
				return createTypeReelPositifObjectFromString(eDataType, initialValue);
			case MetaPackage.TYPE_RESTRICTION_ANGLE:
				return createTypeRestrictionAngleFromString(eDataType, initialValue);
			case MetaPackage.TYPE_RESTRICTION_ANGLE_OBJECT:
				return createTypeRestrictionAngleObjectFromString(eDataType, initialValue);
			case MetaPackage.TYPE_RESTRICTION_ANGLE_SIGNE:
				return createTypeRestrictionAngleSigneFromString(eDataType, initialValue);
			case MetaPackage.TYPE_RESTRICTION_ANGLE_SIGNE_OBJECT:
				return createTypeRestrictionAngleSigneObjectFromString(eDataType, initialValue);
			case MetaPackage.TYPE_RESTRICTION_LATITUDE:
				return createTypeRestrictionLatitudeFromString(eDataType, initialValue);
			case MetaPackage.TYPE_RESTRICTION_LONGITUDE:
				return createTypeRestrictionLongitudeFromString(eDataType, initialValue);
			case MetaPackage.TYPE_RESTRICTION_TEMPERATURE:
				return createTypeRestrictionTemperatureFromString(eDataType, initialValue);
			case MetaPackage.TYPE_RESTRICTION_TEMPERATURE_OBJECT:
				return createTypeRestrictionTemperatureObjectFromString(eDataType, initialValue);
			case MetaPackage.TYPE_STRING:
				return createTypeStringFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case MetaPackage.TYPE_DICTIONNARY_UNITE_CODE:
				return convertTypeDictionnaryUniteCodeToString(eDataType, instanceValue);
			case MetaPackage.TYPE_ANNEE:
				return convertTypeAnneeToString(eDataType, instanceValue);
			case MetaPackage.TYPE_ANNEE_MOIS:
				return convertTypeAnneeMoisToString(eDataType, instanceValue);
			case MetaPackage.TYPE_ANY_URI:
				return convertTypeAnyURIToString(eDataType, instanceValue);
			case MetaPackage.TYPE_BOOLEAN:
				return convertTypeBooleanToString(eDataType, instanceValue);
			case MetaPackage.TYPE_BOOLEAN_OBJECT:
				return convertTypeBooleanObjectToString(eDataType, instanceValue);
			case MetaPackage.TYPE_DATA_TYPE_CHAINE0100:
				return convertTypeDataTypeChaine0100ToString(eDataType, instanceValue);
			case MetaPackage.TYPE_DATA_TYPE_CHAINE012:
				return convertTypeDataTypeChaine012ToString(eDataType, instanceValue);
			case MetaPackage.TYPE_DATA_TYPE_CHAINE015:
				return convertTypeDataTypeChaine015ToString(eDataType, instanceValue);
			case MetaPackage.TYPE_DATA_TYPE_CHAINE020:
				return convertTypeDataTypeChaine020ToString(eDataType, instanceValue);
			case MetaPackage.TYPE_DATA_TYPE_CHAINE02000:
				return convertTypeDataTypeChaine02000ToString(eDataType, instanceValue);
			case MetaPackage.TYPE_DATA_TYPE_CHAINE0255:
				return convertTypeDataTypeChaine0255ToString(eDataType, instanceValue);
			case MetaPackage.TYPE_DATA_TYPE_CHAINE03:
				return convertTypeDataTypeChaine03ToString(eDataType, instanceValue);
			case MetaPackage.TYPE_DATA_TYPE_CHAINE030:
				return convertTypeDataTypeChaine030ToString(eDataType, instanceValue);
			case MetaPackage.TYPE_DATA_TYPE_CHAINE050:
				return convertTypeDataTypeChaine050ToString(eDataType, instanceValue);
			case MetaPackage.TYPE_DATA_TYPE_CHAINE06:
				return convertTypeDataTypeChaine06ToString(eDataType, instanceValue);
			case MetaPackage.TYPE_DATA_TYPE_CHAINE08:
				return convertTypeDataTypeChaine08ToString(eDataType, instanceValue);
			case MetaPackage.TYPE_DATA_TYPE_CHAINE080:
				return convertTypeDataTypeChaine080ToString(eDataType, instanceValue);
			case MetaPackage.TYPE_DATA_TYPE_CHAINE09:
				return convertTypeDataTypeChaine09ToString(eDataType, instanceValue);
			case MetaPackage.TYPE_DATA_TYPE_ENTIER15:
				return convertTypeDataTypeEntier15ToString(eDataType, instanceValue);
			case MetaPackage.TYPE_DATA_TYPE_ENTIER15_OBJECT:
				return convertTypeDataTypeEntier15ObjectToString(eDataType, instanceValue);
			case MetaPackage.TYPE_DATA_TYPE_ENTIER3:
				return convertTypeDataTypeEntier3ToString(eDataType, instanceValue);
			case MetaPackage.TYPE_DATA_TYPE_ENTIER3_OBJECT:
				return convertTypeDataTypeEntier3ObjectToString(eDataType, instanceValue);
			case MetaPackage.TYPE_DATA_TYPE_ENTIER6:
				return convertTypeDataTypeEntier6ToString(eDataType, instanceValue);
			case MetaPackage.TYPE_DATA_TYPE_ENTIER6_OBJECT:
				return convertTypeDataTypeEntier6ObjectToString(eDataType, instanceValue);
			case MetaPackage.TYPE_DATA_TYPE_ENTIER9:
				return convertTypeDataTypeEntier9ToString(eDataType, instanceValue);
			case MetaPackage.TYPE_DATA_TYPE_ENTIER9_OBJECT:
				return convertTypeDataTypeEntier9ObjectToString(eDataType, instanceValue);
			case MetaPackage.TYPE_DATA_TYPE_FRACTION:
				return convertTypeDataTypeFractionToString(eDataType, instanceValue);
			case MetaPackage.TYPE_DATA_TYPE_FRACTION_OBJECT:
				return convertTypeDataTypeFractionObjectToString(eDataType, instanceValue);
			case MetaPackage.TYPE_DATA_TYPE_GDH:
				return convertTypeDataTypeGDHToString(eDataType, instanceValue);
			case MetaPackage.TYPE_DATA_TYPE_RATIO:
				return convertTypeDataTypeRatioToString(eDataType, instanceValue);
			case MetaPackage.TYPE_DATA_TYPE_RATIO_OBJECT:
				return convertTypeDataTypeRatioObjectToString(eDataType, instanceValue);
			case MetaPackage.TYPE_DATE:
				return convertTypeDateToString(eDataType, instanceValue);
			case MetaPackage.TYPE_DECIMAL:
				return convertTypeDecimalToString(eDataType, instanceValue);
			case MetaPackage.TYPE_DICTIONNARY_UNITE_CODE_OBJECT:
				return convertTypeDictionnaryUniteCodeObjectToString(eDataType, instanceValue);
			case MetaPackage.TYPE_DTG:
				return convertTypeDTGToString(eDataType, instanceValue);
			case MetaPackage.TYPE_HEURE:
				return convertTypeHeureToString(eDataType, instanceValue);
			case MetaPackage.TYPE_INTEGER:
				return convertTypeIntegerToString(eDataType, instanceValue);
			case MetaPackage.TYPE_INTEGER_OBJECT:
				return convertTypeIntegerObjectToString(eDataType, instanceValue);
			case MetaPackage.TYPE_REAL:
				return convertTypeRealToString(eDataType, instanceValue);
			case MetaPackage.TYPE_REAL_OBJECT:
				return convertTypeRealObjectToString(eDataType, instanceValue);
			case MetaPackage.TYPE_REEL_POSITIF:
				return convertTypeReelPositifToString(eDataType, instanceValue);
			case MetaPackage.TYPE_REEL_POSITIF_OBJECT:
				return convertTypeReelPositifObjectToString(eDataType, instanceValue);
			case MetaPackage.TYPE_RESTRICTION_ANGLE:
				return convertTypeRestrictionAngleToString(eDataType, instanceValue);
			case MetaPackage.TYPE_RESTRICTION_ANGLE_OBJECT:
				return convertTypeRestrictionAngleObjectToString(eDataType, instanceValue);
			case MetaPackage.TYPE_RESTRICTION_ANGLE_SIGNE:
				return convertTypeRestrictionAngleSigneToString(eDataType, instanceValue);
			case MetaPackage.TYPE_RESTRICTION_ANGLE_SIGNE_OBJECT:
				return convertTypeRestrictionAngleSigneObjectToString(eDataType, instanceValue);
			case MetaPackage.TYPE_RESTRICTION_LATITUDE:
				return convertTypeRestrictionLatitudeToString(eDataType, instanceValue);
			case MetaPackage.TYPE_RESTRICTION_LONGITUDE:
				return convertTypeRestrictionLongitudeToString(eDataType, instanceValue);
			case MetaPackage.TYPE_RESTRICTION_TEMPERATURE:
				return convertTypeRestrictionTemperatureToString(eDataType, instanceValue);
			case MetaPackage.TYPE_RESTRICTION_TEMPERATURE_OBJECT:
				return convertTypeRestrictionTemperatureObjectToString(eDataType, instanceValue);
			case MetaPackage.TYPE_STRING:
				return convertTypeStringToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation createTypeAssociation() {
		TypeAssociationImpl typeAssociation = new TypeAssociationImpl();
		return typeAssociation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociationEXT createTypeAssociationEXT() {
		TypeAssociationEXTImpl typeAssociationEXT = new TypeAssociationEXTImpl();
		return typeAssociationEXT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeAccelerationAngulaire createTypeDataTypeAccelerationAngulaire() {
		TypeDataTypeAccelerationAngulaireImpl typeDataTypeAccelerationAngulaire = new TypeDataTypeAccelerationAngulaireImpl();
		return typeDataTypeAccelerationAngulaire;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeAccelerationAngulaireOrientee createTypeDataTypeAccelerationAngulaireOrientee() {
		TypeDataTypeAccelerationAngulaireOrienteeImpl typeDataTypeAccelerationAngulaireOrientee = new TypeDataTypeAccelerationAngulaireOrienteeImpl();
		return typeDataTypeAccelerationAngulaireOrientee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeAccelerationLineaire createTypeDataTypeAccelerationLineaire() {
		TypeDataTypeAccelerationLineaireImpl typeDataTypeAccelerationLineaire = new TypeDataTypeAccelerationLineaireImpl();
		return typeDataTypeAccelerationLineaire;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeAire createTypeDataTypeAire() {
		TypeDataTypeAireImpl typeDataTypeAire = new TypeDataTypeAireImpl();
		return typeDataTypeAire;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeAltitudePression createTypeDataTypeAltitudePression() {
		TypeDataTypeAltitudePressionImpl typeDataTypeAltitudePression = new TypeDataTypeAltitudePressionImpl();
		return typeDataTypeAltitudePression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeAngle createTypeDataTypeAngle() {
		TypeDataTypeAngleImpl typeDataTypeAngle = new TypeDataTypeAngleImpl();
		return typeDataTypeAngle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeAngleSigne createTypeDataTypeAngleSigne() {
		TypeDataTypeAngleSigneImpl typeDataTypeAngleSigne = new TypeDataTypeAngleSigneImpl();
		return typeDataTypeAngleSigne;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeChampMagnetique createTypeDataTypeChampMagnetique() {
		TypeDataTypeChampMagnetiqueImpl typeDataTypeChampMagnetique = new TypeDataTypeChampMagnetiqueImpl();
		return typeDataTypeChampMagnetique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeCoordonneeAccelerationLineaire createTypeDataTypeCoordonneeAccelerationLineaire() {
		TypeDataTypeCoordonneeAccelerationLineaireImpl typeDataTypeCoordonneeAccelerationLineaire = new TypeDataTypeCoordonneeAccelerationLineaireImpl();
		return typeDataTypeCoordonneeAccelerationLineaire;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeCoordonneeForce createTypeDataTypeCoordonneeForce() {
		TypeDataTypeCoordonneeForceImpl typeDataTypeCoordonneeForce = new TypeDataTypeCoordonneeForceImpl();
		return typeDataTypeCoordonneeForce;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeCoordonneeLineaire createTypeDataTypeCoordonneeLineaire() {
		TypeDataTypeCoordonneeLineaireImpl typeDataTypeCoordonneeLineaire = new TypeDataTypeCoordonneeLineaireImpl();
		return typeDataTypeCoordonneeLineaire;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeCoordonneeVitesseLineaire createTypeDataTypeCoordonneeVitesseLineaire() {
		TypeDataTypeCoordonneeVitesseLineaireImpl typeDataTypeCoordonneeVitesseLineaire = new TypeDataTypeCoordonneeVitesseLineaireImpl();
		return typeDataTypeCoordonneeVitesseLineaire;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeDateHeure createTypeDataTypeDateHeure() {
		TypeDataTypeDateHeureImpl typeDataTypeDateHeure = new TypeDataTypeDateHeureImpl();
		return typeDataTypeDateHeure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeDebitMassique createTypeDataTypeDebitMassique() {
		TypeDataTypeDebitMassiqueImpl typeDataTypeDebitMassique = new TypeDataTypeDebitMassiqueImpl();
		return typeDataTypeDebitMassique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeDebitTransmission createTypeDataTypeDebitTransmission() {
		TypeDataTypeDebitTransmissionImpl typeDataTypeDebitTransmission = new TypeDataTypeDebitTransmissionImpl();
		return typeDataTypeDebitTransmission;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeDebitVolumique createTypeDataTypeDebitVolumique() {
		TypeDataTypeDebitVolumiqueImpl typeDataTypeDebitVolumique = new TypeDataTypeDebitVolumiqueImpl();
		return typeDataTypeDebitVolumique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeDoseAbsorbee createTypeDataTypeDoseAbsorbee() {
		TypeDataTypeDoseAbsorbeeImpl typeDataTypeDoseAbsorbee = new TypeDataTypeDoseAbsorbeeImpl();
		return typeDataTypeDoseAbsorbee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeDuree createTypeDataTypeDuree() {
		TypeDataTypeDureeImpl typeDataTypeDuree = new TypeDataTypeDureeImpl();
		return typeDataTypeDuree;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeForce createTypeDataTypeForce() {
		TypeDataTypeForceImpl typeDataTypeForce = new TypeDataTypeForceImpl();
		return typeDataTypeForce;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeFrequence createTypeDataTypeFrequence() {
		TypeDataTypeFrequenceImpl typeDataTypeFrequence = new TypeDataTypeFrequenceImpl();
		return typeDataTypeFrequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeLatitude createTypeDataTypeLatitude() {
		TypeDataTypeLatitudeImpl typeDataTypeLatitude = new TypeDataTypeLatitudeImpl();
		return typeDataTypeLatitude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeLongitude createTypeDataTypeLongitude() {
		TypeDataTypeLongitudeImpl typeDataTypeLongitude = new TypeDataTypeLongitudeImpl();
		return typeDataTypeLongitude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeLongueur createTypeDataTypeLongueur() {
		TypeDataTypeLongueurImpl typeDataTypeLongueur = new TypeDataTypeLongueurImpl();
		return typeDataTypeLongueur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeMasse createTypeDataTypeMasse() {
		TypeDataTypeMasseImpl typeDataTypeMasse = new TypeDataTypeMasseImpl();
		return typeDataTypeMasse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypePression createTypeDataTypePression() {
		TypeDataTypePressionImpl typeDataTypePression = new TypeDataTypePressionImpl();
		return typeDataTypePression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeTauxPrecipitation createTypeDataTypeTauxPrecipitation() {
		TypeDataTypeTauxPrecipitationImpl typeDataTypeTauxPrecipitation = new TypeDataTypeTauxPrecipitationImpl();
		return typeDataTypeTauxPrecipitation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeTemperature createTypeDataTypeTemperature() {
		TypeDataTypeTemperatureImpl typeDataTypeTemperature = new TypeDataTypeTemperatureImpl();
		return typeDataTypeTemperature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeVitesseAngulaire createTypeDataTypeVitesseAngulaire() {
		TypeDataTypeVitesseAngulaireImpl typeDataTypeVitesseAngulaire = new TypeDataTypeVitesseAngulaireImpl();
		return typeDataTypeVitesseAngulaire;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeVitesseAngulaireOrientee createTypeDataTypeVitesseAngulaireOrientee() {
		TypeDataTypeVitesseAngulaireOrienteeImpl typeDataTypeVitesseAngulaireOrientee = new TypeDataTypeVitesseAngulaireOrienteeImpl();
		return typeDataTypeVitesseAngulaireOrientee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeVitesseLineaire createTypeDataTypeVitesseLineaire() {
		TypeDataTypeVitesseLineaireImpl typeDataTypeVitesseLineaire = new TypeDataTypeVitesseLineaireImpl();
		return typeDataTypeVitesseLineaire;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeVolume createTypeDataTypeVolume() {
		TypeDataTypeVolumeImpl typeDataTypeVolume = new TypeDataTypeVolumeImpl();
		return typeDataTypeVolume;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionnaryUniteCode createTypeDictionnaryUniteCodeFromString(EDataType eDataType, String initialValue) {
		TypeDictionnaryUniteCode result = TypeDictionnaryUniteCode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeDictionnaryUniteCodeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar createTypeAnneeFromString(EDataType eDataType, String initialValue) {
		return (XMLGregorianCalendar)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.GYEAR, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeAnneeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.GYEAR, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar createTypeAnneeMoisFromString(EDataType eDataType, String initialValue) {
		return (XMLGregorianCalendar)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.GYEAR_MONTH, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeAnneeMoisToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.GYEAR_MONTH, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createTypeAnyURIFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.ANY_URI, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeAnyURIToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.ANY_URI, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean createTypeBooleanFromString(EDataType eDataType, String initialValue) {
		return (Boolean)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.BOOLEAN, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeBooleanToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.BOOLEAN, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean createTypeBooleanObjectFromString(EDataType eDataType, String initialValue) {
		return createTypeBooleanFromString(MetaPackage.Literals.TYPE_BOOLEAN, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeBooleanObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTypeBooleanToString(MetaPackage.Literals.TYPE_BOOLEAN, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createTypeDataTypeChaine0100FromString(EDataType eDataType, String initialValue) {
		return createTypeStringFromString(MetaPackage.Literals.TYPE_STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeDataTypeChaine0100ToString(EDataType eDataType, Object instanceValue) {
		return convertTypeStringToString(MetaPackage.Literals.TYPE_STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createTypeDataTypeChaine012FromString(EDataType eDataType, String initialValue) {
		return createTypeStringFromString(MetaPackage.Literals.TYPE_STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeDataTypeChaine012ToString(EDataType eDataType, Object instanceValue) {
		return convertTypeStringToString(MetaPackage.Literals.TYPE_STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createTypeDataTypeChaine015FromString(EDataType eDataType, String initialValue) {
		return createTypeStringFromString(MetaPackage.Literals.TYPE_STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeDataTypeChaine015ToString(EDataType eDataType, Object instanceValue) {
		return convertTypeStringToString(MetaPackage.Literals.TYPE_STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createTypeDataTypeChaine020FromString(EDataType eDataType, String initialValue) {
		return createTypeStringFromString(MetaPackage.Literals.TYPE_STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeDataTypeChaine020ToString(EDataType eDataType, Object instanceValue) {
		return convertTypeStringToString(MetaPackage.Literals.TYPE_STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createTypeDataTypeChaine02000FromString(EDataType eDataType, String initialValue) {
		return createTypeStringFromString(MetaPackage.Literals.TYPE_STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeDataTypeChaine02000ToString(EDataType eDataType, Object instanceValue) {
		return convertTypeStringToString(MetaPackage.Literals.TYPE_STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createTypeDataTypeChaine0255FromString(EDataType eDataType, String initialValue) {
		return createTypeStringFromString(MetaPackage.Literals.TYPE_STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeDataTypeChaine0255ToString(EDataType eDataType, Object instanceValue) {
		return convertTypeStringToString(MetaPackage.Literals.TYPE_STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createTypeDataTypeChaine03FromString(EDataType eDataType, String initialValue) {
		return createTypeStringFromString(MetaPackage.Literals.TYPE_STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeDataTypeChaine03ToString(EDataType eDataType, Object instanceValue) {
		return convertTypeStringToString(MetaPackage.Literals.TYPE_STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createTypeDataTypeChaine030FromString(EDataType eDataType, String initialValue) {
		return createTypeStringFromString(MetaPackage.Literals.TYPE_STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeDataTypeChaine030ToString(EDataType eDataType, Object instanceValue) {
		return convertTypeStringToString(MetaPackage.Literals.TYPE_STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createTypeDataTypeChaine050FromString(EDataType eDataType, String initialValue) {
		return createTypeStringFromString(MetaPackage.Literals.TYPE_STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeDataTypeChaine050ToString(EDataType eDataType, Object instanceValue) {
		return convertTypeStringToString(MetaPackage.Literals.TYPE_STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createTypeDataTypeChaine06FromString(EDataType eDataType, String initialValue) {
		return createTypeStringFromString(MetaPackage.Literals.TYPE_STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeDataTypeChaine06ToString(EDataType eDataType, Object instanceValue) {
		return convertTypeStringToString(MetaPackage.Literals.TYPE_STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createTypeDataTypeChaine08FromString(EDataType eDataType, String initialValue) {
		return createTypeStringFromString(MetaPackage.Literals.TYPE_STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeDataTypeChaine08ToString(EDataType eDataType, Object instanceValue) {
		return convertTypeStringToString(MetaPackage.Literals.TYPE_STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createTypeDataTypeChaine080FromString(EDataType eDataType, String initialValue) {
		return createTypeStringFromString(MetaPackage.Literals.TYPE_STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeDataTypeChaine080ToString(EDataType eDataType, Object instanceValue) {
		return convertTypeStringToString(MetaPackage.Literals.TYPE_STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createTypeDataTypeChaine09FromString(EDataType eDataType, String initialValue) {
		return createTypeStringFromString(MetaPackage.Literals.TYPE_STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeDataTypeChaine09ToString(EDataType eDataType, Object instanceValue) {
		return convertTypeStringToString(MetaPackage.Literals.TYPE_STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long createTypeDataTypeEntier15FromString(EDataType eDataType, String initialValue) {
		return createTypeIntegerFromString(MetaPackage.Literals.TYPE_INTEGER, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeDataTypeEntier15ToString(EDataType eDataType, Object instanceValue) {
		return convertTypeIntegerToString(MetaPackage.Literals.TYPE_INTEGER, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long createTypeDataTypeEntier15ObjectFromString(EDataType eDataType, String initialValue) {
		return createTypeDataTypeEntier15FromString(MetaPackage.Literals.TYPE_DATA_TYPE_ENTIER15, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeDataTypeEntier15ObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTypeDataTypeEntier15ToString(MetaPackage.Literals.TYPE_DATA_TYPE_ENTIER15, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long createTypeDataTypeEntier3FromString(EDataType eDataType, String initialValue) {
		return createTypeIntegerFromString(MetaPackage.Literals.TYPE_INTEGER, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeDataTypeEntier3ToString(EDataType eDataType, Object instanceValue) {
		return convertTypeIntegerToString(MetaPackage.Literals.TYPE_INTEGER, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long createTypeDataTypeEntier3ObjectFromString(EDataType eDataType, String initialValue) {
		return createTypeDataTypeEntier3FromString(MetaPackage.Literals.TYPE_DATA_TYPE_ENTIER3, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeDataTypeEntier3ObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTypeDataTypeEntier3ToString(MetaPackage.Literals.TYPE_DATA_TYPE_ENTIER3, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long createTypeDataTypeEntier6FromString(EDataType eDataType, String initialValue) {
		return createTypeIntegerFromString(MetaPackage.Literals.TYPE_INTEGER, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeDataTypeEntier6ToString(EDataType eDataType, Object instanceValue) {
		return convertTypeIntegerToString(MetaPackage.Literals.TYPE_INTEGER, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long createTypeDataTypeEntier6ObjectFromString(EDataType eDataType, String initialValue) {
		return createTypeDataTypeEntier6FromString(MetaPackage.Literals.TYPE_DATA_TYPE_ENTIER6, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeDataTypeEntier6ObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTypeDataTypeEntier6ToString(MetaPackage.Literals.TYPE_DATA_TYPE_ENTIER6, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long createTypeDataTypeEntier9FromString(EDataType eDataType, String initialValue) {
		return createTypeIntegerFromString(MetaPackage.Literals.TYPE_INTEGER, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeDataTypeEntier9ToString(EDataType eDataType, Object instanceValue) {
		return convertTypeIntegerToString(MetaPackage.Literals.TYPE_INTEGER, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long createTypeDataTypeEntier9ObjectFromString(EDataType eDataType, String initialValue) {
		return createTypeDataTypeEntier9FromString(MetaPackage.Literals.TYPE_DATA_TYPE_ENTIER9, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeDataTypeEntier9ObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTypeDataTypeEntier9ToString(MetaPackage.Literals.TYPE_DATA_TYPE_ENTIER9, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createTypeDataTypeFractionFromString(EDataType eDataType, String initialValue) {
		return createTypeRealFromString(MetaPackage.Literals.TYPE_REAL, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeDataTypeFractionToString(EDataType eDataType, Object instanceValue) {
		return convertTypeRealToString(MetaPackage.Literals.TYPE_REAL, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createTypeDataTypeFractionObjectFromString(EDataType eDataType, String initialValue) {
		return createTypeDataTypeFractionFromString(MetaPackage.Literals.TYPE_DATA_TYPE_FRACTION, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeDataTypeFractionObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTypeDataTypeFractionToString(MetaPackage.Literals.TYPE_DATA_TYPE_FRACTION, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar createTypeDataTypeGDHFromString(EDataType eDataType, String initialValue) {
		return createTypeDTGFromString(MetaPackage.Literals.TYPE_DTG, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeDataTypeGDHToString(EDataType eDataType, Object instanceValue) {
		return convertTypeDTGToString(MetaPackage.Literals.TYPE_DTG, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createTypeDataTypeRatioFromString(EDataType eDataType, String initialValue) {
		return createTypeRealFromString(MetaPackage.Literals.TYPE_REAL, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeDataTypeRatioToString(EDataType eDataType, Object instanceValue) {
		return convertTypeRealToString(MetaPackage.Literals.TYPE_REAL, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createTypeDataTypeRatioObjectFromString(EDataType eDataType, String initialValue) {
		return createTypeDataTypeRatioFromString(MetaPackage.Literals.TYPE_DATA_TYPE_RATIO, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeDataTypeRatioObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTypeDataTypeRatioToString(MetaPackage.Literals.TYPE_DATA_TYPE_RATIO, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar createTypeDateFromString(EDataType eDataType, String initialValue) {
		return (XMLGregorianCalendar)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DATE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeDateToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DATE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createTypeDecimalFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DECIMAL, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeDecimalToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DECIMAL, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionnaryUniteCode createTypeDictionnaryUniteCodeObjectFromString(EDataType eDataType, String initialValue) {
		return createTypeDictionnaryUniteCodeFromString(MetaPackage.Literals.TYPE_DICTIONNARY_UNITE_CODE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeDictionnaryUniteCodeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTypeDictionnaryUniteCodeToString(MetaPackage.Literals.TYPE_DICTIONNARY_UNITE_CODE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar createTypeDTGFromString(EDataType eDataType, String initialValue) {
		return (XMLGregorianCalendar)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DATE_TIME, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeDTGToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DATE_TIME, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar createTypeHeureFromString(EDataType eDataType, String initialValue) {
		return (XMLGregorianCalendar)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.TIME, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeHeureToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.TIME, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long createTypeIntegerFromString(EDataType eDataType, String initialValue) {
		return (Long)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.LONG, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeIntegerToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.LONG, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long createTypeIntegerObjectFromString(EDataType eDataType, String initialValue) {
		return createTypeIntegerFromString(MetaPackage.Literals.TYPE_INTEGER, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeIntegerObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTypeIntegerToString(MetaPackage.Literals.TYPE_INTEGER, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createTypeRealFromString(EDataType eDataType, String initialValue) {
		return (Double)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DOUBLE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeRealToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DOUBLE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createTypeRealObjectFromString(EDataType eDataType, String initialValue) {
		return createTypeRealFromString(MetaPackage.Literals.TYPE_REAL, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeRealObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTypeRealToString(MetaPackage.Literals.TYPE_REAL, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createTypeReelPositifFromString(EDataType eDataType, String initialValue) {
		return createTypeRealFromString(MetaPackage.Literals.TYPE_REAL, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeReelPositifToString(EDataType eDataType, Object instanceValue) {
		return convertTypeRealToString(MetaPackage.Literals.TYPE_REAL, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createTypeReelPositifObjectFromString(EDataType eDataType, String initialValue) {
		return createTypeReelPositifFromString(MetaPackage.Literals.TYPE_REEL_POSITIF, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeReelPositifObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTypeReelPositifToString(MetaPackage.Literals.TYPE_REEL_POSITIF, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createTypeRestrictionAngleFromString(EDataType eDataType, String initialValue) {
		return createTypeReelPositifFromString(MetaPackage.Literals.TYPE_REEL_POSITIF, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeRestrictionAngleToString(EDataType eDataType, Object instanceValue) {
		return convertTypeReelPositifToString(MetaPackage.Literals.TYPE_REEL_POSITIF, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createTypeRestrictionAngleObjectFromString(EDataType eDataType, String initialValue) {
		return createTypeRestrictionAngleFromString(MetaPackage.Literals.TYPE_RESTRICTION_ANGLE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeRestrictionAngleObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTypeRestrictionAngleToString(MetaPackage.Literals.TYPE_RESTRICTION_ANGLE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createTypeRestrictionAngleSigneFromString(EDataType eDataType, String initialValue) {
		return createTypeRealFromString(MetaPackage.Literals.TYPE_REAL, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeRestrictionAngleSigneToString(EDataType eDataType, Object instanceValue) {
		return convertTypeRealToString(MetaPackage.Literals.TYPE_REAL, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createTypeRestrictionAngleSigneObjectFromString(EDataType eDataType, String initialValue) {
		return createTypeRestrictionAngleSigneFromString(MetaPackage.Literals.TYPE_RESTRICTION_ANGLE_SIGNE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeRestrictionAngleSigneObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTypeRestrictionAngleSigneToString(MetaPackage.Literals.TYPE_RESTRICTION_ANGLE_SIGNE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createTypeRestrictionLatitudeFromString(EDataType eDataType, String initialValue) {
		return createTypeDecimalFromString(MetaPackage.Literals.TYPE_DECIMAL, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeRestrictionLatitudeToString(EDataType eDataType, Object instanceValue) {
		return convertTypeDecimalToString(MetaPackage.Literals.TYPE_DECIMAL, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createTypeRestrictionLongitudeFromString(EDataType eDataType, String initialValue) {
		return createTypeDecimalFromString(MetaPackage.Literals.TYPE_DECIMAL, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeRestrictionLongitudeToString(EDataType eDataType, Object instanceValue) {
		return convertTypeDecimalToString(MetaPackage.Literals.TYPE_DECIMAL, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createTypeRestrictionTemperatureFromString(EDataType eDataType, String initialValue) {
		return createTypeRealFromString(MetaPackage.Literals.TYPE_REAL, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeRestrictionTemperatureToString(EDataType eDataType, Object instanceValue) {
		return convertTypeRealToString(MetaPackage.Literals.TYPE_REAL, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createTypeRestrictionTemperatureObjectFromString(EDataType eDataType, String initialValue) {
		return createTypeRestrictionTemperatureFromString(MetaPackage.Literals.TYPE_RESTRICTION_TEMPERATURE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeRestrictionTemperatureObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTypeRestrictionTemperatureToString(MetaPackage.Literals.TYPE_RESTRICTION_TEMPERATURE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createTypeStringFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeStringToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetaPackage getMetaPackage() {
		return (MetaPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MetaPackage getPackage() {
		return MetaPackage.eINSTANCE;
	}

} //MetaFactoryImpl
