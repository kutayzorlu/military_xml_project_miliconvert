/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.meta.util;

import java.math.BigDecimal;

import java.util.Map;

import javax.xml.datatype.XMLGregorianCalendar;

import mpia.meta.*;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.emf.ecore.xml.type.util.XMLTypeUtil;
import org.eclipse.emf.ecore.xml.type.util.XMLTypeValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see mpia.meta.MetaPackage
 * @generated
 */
public class MetaValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final MetaValidator INSTANCE = new MetaValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "mpia.meta";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XMLTypeValidator xmlTypeValidator;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetaValidator() {
		super();
		xmlTypeValidator = XMLTypeValidator.INSTANCE;
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return MetaPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case MetaPackage.TYPE_ASSOCIATION:
				return validateTypeAssociation((TypeAssociation)value, diagnostics, context);
			case MetaPackage.TYPE_ASSOCIATION_EXT:
				return validateTypeAssociationEXT((TypeAssociationEXT)value, diagnostics, context);
			case MetaPackage.TYPE_DATA_TYPE_ACCELERATION_ANGULAIRE:
				return validateTypeDataTypeAccelerationAngulaire((TypeDataTypeAccelerationAngulaire)value, diagnostics, context);
			case MetaPackage.TYPE_DATA_TYPE_ACCELERATION_ANGULAIRE_ORIENTEE:
				return validateTypeDataTypeAccelerationAngulaireOrientee((TypeDataTypeAccelerationAngulaireOrientee)value, diagnostics, context);
			case MetaPackage.TYPE_DATA_TYPE_ACCELERATION_LINEAIRE:
				return validateTypeDataTypeAccelerationLineaire((TypeDataTypeAccelerationLineaire)value, diagnostics, context);
			case MetaPackage.TYPE_DATA_TYPE_AIRE:
				return validateTypeDataTypeAire((TypeDataTypeAire)value, diagnostics, context);
			case MetaPackage.TYPE_DATA_TYPE_ALTITUDE_PRESSION:
				return validateTypeDataTypeAltitudePression((TypeDataTypeAltitudePression)value, diagnostics, context);
			case MetaPackage.TYPE_DATA_TYPE_ANGLE:
				return validateTypeDataTypeAngle((TypeDataTypeAngle)value, diagnostics, context);
			case MetaPackage.TYPE_DATA_TYPE_ANGLE_SIGNE:
				return validateTypeDataTypeAngleSigne((TypeDataTypeAngleSigne)value, diagnostics, context);
			case MetaPackage.TYPE_DATA_TYPE_CHAMP_MAGNETIQUE:
				return validateTypeDataTypeChampMagnetique((TypeDataTypeChampMagnetique)value, diagnostics, context);
			case MetaPackage.TYPE_DATA_TYPE_COORDONNEE_ACCELERATION_LINEAIRE:
				return validateTypeDataTypeCoordonneeAccelerationLineaire((TypeDataTypeCoordonneeAccelerationLineaire)value, diagnostics, context);
			case MetaPackage.TYPE_DATA_TYPE_COORDONNEE_FORCE:
				return validateTypeDataTypeCoordonneeForce((TypeDataTypeCoordonneeForce)value, diagnostics, context);
			case MetaPackage.TYPE_DATA_TYPE_COORDONNEE_LINEAIRE:
				return validateTypeDataTypeCoordonneeLineaire((TypeDataTypeCoordonneeLineaire)value, diagnostics, context);
			case MetaPackage.TYPE_DATA_TYPE_COORDONNEE_VITESSE_LINEAIRE:
				return validateTypeDataTypeCoordonneeVitesseLineaire((TypeDataTypeCoordonneeVitesseLineaire)value, diagnostics, context);
			case MetaPackage.TYPE_DATA_TYPE_DATE_HEURE:
				return validateTypeDataTypeDateHeure((TypeDataTypeDateHeure)value, diagnostics, context);
			case MetaPackage.TYPE_DATA_TYPE_DEBIT_MASSIQUE:
				return validateTypeDataTypeDebitMassique((TypeDataTypeDebitMassique)value, diagnostics, context);
			case MetaPackage.TYPE_DATA_TYPE_DEBIT_TRANSMISSION:
				return validateTypeDataTypeDebitTransmission((TypeDataTypeDebitTransmission)value, diagnostics, context);
			case MetaPackage.TYPE_DATA_TYPE_DEBIT_VOLUMIQUE:
				return validateTypeDataTypeDebitVolumique((TypeDataTypeDebitVolumique)value, diagnostics, context);
			case MetaPackage.TYPE_DATA_TYPE_DOSE_ABSORBEE:
				return validateTypeDataTypeDoseAbsorbee((TypeDataTypeDoseAbsorbee)value, diagnostics, context);
			case MetaPackage.TYPE_DATA_TYPE_DUREE:
				return validateTypeDataTypeDuree((TypeDataTypeDuree)value, diagnostics, context);
			case MetaPackage.TYPE_DATA_TYPE_FORCE:
				return validateTypeDataTypeForce((TypeDataTypeForce)value, diagnostics, context);
			case MetaPackage.TYPE_DATA_TYPE_FREQUENCE:
				return validateTypeDataTypeFrequence((TypeDataTypeFrequence)value, diagnostics, context);
			case MetaPackage.TYPE_DATA_TYPE_LATITUDE:
				return validateTypeDataTypeLatitude((TypeDataTypeLatitude)value, diagnostics, context);
			case MetaPackage.TYPE_DATA_TYPE_LONGITUDE:
				return validateTypeDataTypeLongitude((TypeDataTypeLongitude)value, diagnostics, context);
			case MetaPackage.TYPE_DATA_TYPE_LONGUEUR:
				return validateTypeDataTypeLongueur((TypeDataTypeLongueur)value, diagnostics, context);
			case MetaPackage.TYPE_DATA_TYPE_MASSE:
				return validateTypeDataTypeMasse((TypeDataTypeMasse)value, diagnostics, context);
			case MetaPackage.TYPE_DATA_TYPE_PRESSION:
				return validateTypeDataTypePression((TypeDataTypePression)value, diagnostics, context);
			case MetaPackage.TYPE_DATA_TYPE_TAUX_PRECIPITATION:
				return validateTypeDataTypeTauxPrecipitation((TypeDataTypeTauxPrecipitation)value, diagnostics, context);
			case MetaPackage.TYPE_DATA_TYPE_TEMPERATURE:
				return validateTypeDataTypeTemperature((TypeDataTypeTemperature)value, diagnostics, context);
			case MetaPackage.TYPE_DATA_TYPE_VITESSE_ANGULAIRE:
				return validateTypeDataTypeVitesseAngulaire((TypeDataTypeVitesseAngulaire)value, diagnostics, context);
			case MetaPackage.TYPE_DATA_TYPE_VITESSE_ANGULAIRE_ORIENTEE:
				return validateTypeDataTypeVitesseAngulaireOrientee((TypeDataTypeVitesseAngulaireOrientee)value, diagnostics, context);
			case MetaPackage.TYPE_DATA_TYPE_VITESSE_LINEAIRE:
				return validateTypeDataTypeVitesseLineaire((TypeDataTypeVitesseLineaire)value, diagnostics, context);
			case MetaPackage.TYPE_DATA_TYPE_VOLUME:
				return validateTypeDataTypeVolume((TypeDataTypeVolume)value, diagnostics, context);
			case MetaPackage.TYPE_DICTIONNARY_UNITE_CODE:
				return validateTypeDictionnaryUniteCode((TypeDictionnaryUniteCode)value, diagnostics, context);
			case MetaPackage.TYPE_ANNEE:
				return validateTypeAnnee((XMLGregorianCalendar)value, diagnostics, context);
			case MetaPackage.TYPE_ANNEE_MOIS:
				return validateTypeAnneeMois((XMLGregorianCalendar)value, diagnostics, context);
			case MetaPackage.TYPE_ANY_URI:
				return validateTypeAnyURI((String)value, diagnostics, context);
			case MetaPackage.TYPE_BOOLEAN:
				return validateTypeBoolean(((Boolean)value).booleanValue(), diagnostics, context);
			case MetaPackage.TYPE_BOOLEAN_OBJECT:
				return validateTypeBooleanObject((Boolean)value, diagnostics, context);
			case MetaPackage.TYPE_DATA_TYPE_CHAINE0100:
				return validateTypeDataTypeChaine0100((String)value, diagnostics, context);
			case MetaPackage.TYPE_DATA_TYPE_CHAINE012:
				return validateTypeDataTypeChaine012((String)value, diagnostics, context);
			case MetaPackage.TYPE_DATA_TYPE_CHAINE015:
				return validateTypeDataTypeChaine015((String)value, diagnostics, context);
			case MetaPackage.TYPE_DATA_TYPE_CHAINE020:
				return validateTypeDataTypeChaine020((String)value, diagnostics, context);
			case MetaPackage.TYPE_DATA_TYPE_CHAINE02000:
				return validateTypeDataTypeChaine02000((String)value, diagnostics, context);
			case MetaPackage.TYPE_DATA_TYPE_CHAINE0255:
				return validateTypeDataTypeChaine0255((String)value, diagnostics, context);
			case MetaPackage.TYPE_DATA_TYPE_CHAINE03:
				return validateTypeDataTypeChaine03((String)value, diagnostics, context);
			case MetaPackage.TYPE_DATA_TYPE_CHAINE030:
				return validateTypeDataTypeChaine030((String)value, diagnostics, context);
			case MetaPackage.TYPE_DATA_TYPE_CHAINE050:
				return validateTypeDataTypeChaine050((String)value, diagnostics, context);
			case MetaPackage.TYPE_DATA_TYPE_CHAINE06:
				return validateTypeDataTypeChaine06((String)value, diagnostics, context);
			case MetaPackage.TYPE_DATA_TYPE_CHAINE08:
				return validateTypeDataTypeChaine08((String)value, diagnostics, context);
			case MetaPackage.TYPE_DATA_TYPE_CHAINE080:
				return validateTypeDataTypeChaine080((String)value, diagnostics, context);
			case MetaPackage.TYPE_DATA_TYPE_CHAINE09:
				return validateTypeDataTypeChaine09((String)value, diagnostics, context);
			case MetaPackage.TYPE_DATA_TYPE_ENTIER15:
				return validateTypeDataTypeEntier15(((Long)value).longValue(), diagnostics, context);
			case MetaPackage.TYPE_DATA_TYPE_ENTIER15_OBJECT:
				return validateTypeDataTypeEntier15Object((Long)value, diagnostics, context);
			case MetaPackage.TYPE_DATA_TYPE_ENTIER3:
				return validateTypeDataTypeEntier3(((Long)value).longValue(), diagnostics, context);
			case MetaPackage.TYPE_DATA_TYPE_ENTIER3_OBJECT:
				return validateTypeDataTypeEntier3Object((Long)value, diagnostics, context);
			case MetaPackage.TYPE_DATA_TYPE_ENTIER6:
				return validateTypeDataTypeEntier6(((Long)value).longValue(), diagnostics, context);
			case MetaPackage.TYPE_DATA_TYPE_ENTIER6_OBJECT:
				return validateTypeDataTypeEntier6Object((Long)value, diagnostics, context);
			case MetaPackage.TYPE_DATA_TYPE_ENTIER9:
				return validateTypeDataTypeEntier9(((Long)value).longValue(), diagnostics, context);
			case MetaPackage.TYPE_DATA_TYPE_ENTIER9_OBJECT:
				return validateTypeDataTypeEntier9Object((Long)value, diagnostics, context);
			case MetaPackage.TYPE_DATA_TYPE_FRACTION:
				return validateTypeDataTypeFraction(((Double)value).doubleValue(), diagnostics, context);
			case MetaPackage.TYPE_DATA_TYPE_FRACTION_OBJECT:
				return validateTypeDataTypeFractionObject((Double)value, diagnostics, context);
			case MetaPackage.TYPE_DATA_TYPE_GDH:
				return validateTypeDataTypeGDH((XMLGregorianCalendar)value, diagnostics, context);
			case MetaPackage.TYPE_DATA_TYPE_RATIO:
				return validateTypeDataTypeRatio(((Double)value).doubleValue(), diagnostics, context);
			case MetaPackage.TYPE_DATA_TYPE_RATIO_OBJECT:
				return validateTypeDataTypeRatioObject((Double)value, diagnostics, context);
			case MetaPackage.TYPE_DATE:
				return validateTypeDate((XMLGregorianCalendar)value, diagnostics, context);
			case MetaPackage.TYPE_DECIMAL:
				return validateTypeDecimal((BigDecimal)value, diagnostics, context);
			case MetaPackage.TYPE_DICTIONNARY_UNITE_CODE_OBJECT:
				return validateTypeDictionnaryUniteCodeObject((TypeDictionnaryUniteCode)value, diagnostics, context);
			case MetaPackage.TYPE_DTG:
				return validateTypeDTG((XMLGregorianCalendar)value, diagnostics, context);
			case MetaPackage.TYPE_HEURE:
				return validateTypeHeure((XMLGregorianCalendar)value, diagnostics, context);
			case MetaPackage.TYPE_INTEGER:
				return validateTypeInteger(((Long)value).longValue(), diagnostics, context);
			case MetaPackage.TYPE_INTEGER_OBJECT:
				return validateTypeIntegerObject((Long)value, diagnostics, context);
			case MetaPackage.TYPE_REAL:
				return validateTypeReal(((Double)value).doubleValue(), diagnostics, context);
			case MetaPackage.TYPE_REAL_OBJECT:
				return validateTypeRealObject((Double)value, diagnostics, context);
			case MetaPackage.TYPE_REEL_POSITIF:
				return validateTypeReelPositif(((Double)value).doubleValue(), diagnostics, context);
			case MetaPackage.TYPE_REEL_POSITIF_OBJECT:
				return validateTypeReelPositifObject((Double)value, diagnostics, context);
			case MetaPackage.TYPE_RESTRICTION_ANGLE:
				return validateTypeRestrictionAngle(((Double)value).doubleValue(), diagnostics, context);
			case MetaPackage.TYPE_RESTRICTION_ANGLE_OBJECT:
				return validateTypeRestrictionAngleObject((Double)value, diagnostics, context);
			case MetaPackage.TYPE_RESTRICTION_ANGLE_SIGNE:
				return validateTypeRestrictionAngleSigne(((Double)value).doubleValue(), diagnostics, context);
			case MetaPackage.TYPE_RESTRICTION_ANGLE_SIGNE_OBJECT:
				return validateTypeRestrictionAngleSigneObject((Double)value, diagnostics, context);
			case MetaPackage.TYPE_RESTRICTION_LATITUDE:
				return validateTypeRestrictionLatitude((BigDecimal)value, diagnostics, context);
			case MetaPackage.TYPE_RESTRICTION_LONGITUDE:
				return validateTypeRestrictionLongitude((BigDecimal)value, diagnostics, context);
			case MetaPackage.TYPE_RESTRICTION_TEMPERATURE:
				return validateTypeRestrictionTemperature(((Double)value).doubleValue(), diagnostics, context);
			case MetaPackage.TYPE_RESTRICTION_TEMPERATURE_OBJECT:
				return validateTypeRestrictionTemperatureObject((Double)value, diagnostics, context);
			case MetaPackage.TYPE_STRING:
				return validateTypeString((String)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeAssociation(TypeAssociation typeAssociation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(typeAssociation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeAssociationEXT(TypeAssociationEXT typeAssociationEXT, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(typeAssociationEXT, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeDataTypeAccelerationAngulaire(TypeDataTypeAccelerationAngulaire typeDataTypeAccelerationAngulaire, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(typeDataTypeAccelerationAngulaire, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeDataTypeAccelerationAngulaireOrientee(TypeDataTypeAccelerationAngulaireOrientee typeDataTypeAccelerationAngulaireOrientee, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(typeDataTypeAccelerationAngulaireOrientee, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeDataTypeAccelerationLineaire(TypeDataTypeAccelerationLineaire typeDataTypeAccelerationLineaire, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(typeDataTypeAccelerationLineaire, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeDataTypeAire(TypeDataTypeAire typeDataTypeAire, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(typeDataTypeAire, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeDataTypeAltitudePression(TypeDataTypeAltitudePression typeDataTypeAltitudePression, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(typeDataTypeAltitudePression, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeDataTypeAngle(TypeDataTypeAngle typeDataTypeAngle, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(typeDataTypeAngle, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeDataTypeAngleSigne(TypeDataTypeAngleSigne typeDataTypeAngleSigne, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(typeDataTypeAngleSigne, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeDataTypeChampMagnetique(TypeDataTypeChampMagnetique typeDataTypeChampMagnetique, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(typeDataTypeChampMagnetique, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeDataTypeCoordonneeAccelerationLineaire(TypeDataTypeCoordonneeAccelerationLineaire typeDataTypeCoordonneeAccelerationLineaire, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(typeDataTypeCoordonneeAccelerationLineaire, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeDataTypeCoordonneeForce(TypeDataTypeCoordonneeForce typeDataTypeCoordonneeForce, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(typeDataTypeCoordonneeForce, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeDataTypeCoordonneeLineaire(TypeDataTypeCoordonneeLineaire typeDataTypeCoordonneeLineaire, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(typeDataTypeCoordonneeLineaire, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeDataTypeCoordonneeVitesseLineaire(TypeDataTypeCoordonneeVitesseLineaire typeDataTypeCoordonneeVitesseLineaire, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(typeDataTypeCoordonneeVitesseLineaire, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeDataTypeDateHeure(TypeDataTypeDateHeure typeDataTypeDateHeure, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(typeDataTypeDateHeure, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeDataTypeDebitMassique(TypeDataTypeDebitMassique typeDataTypeDebitMassique, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(typeDataTypeDebitMassique, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeDataTypeDebitTransmission(TypeDataTypeDebitTransmission typeDataTypeDebitTransmission, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(typeDataTypeDebitTransmission, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeDataTypeDebitVolumique(TypeDataTypeDebitVolumique typeDataTypeDebitVolumique, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(typeDataTypeDebitVolumique, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeDataTypeDoseAbsorbee(TypeDataTypeDoseAbsorbee typeDataTypeDoseAbsorbee, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(typeDataTypeDoseAbsorbee, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeDataTypeDuree(TypeDataTypeDuree typeDataTypeDuree, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(typeDataTypeDuree, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeDataTypeForce(TypeDataTypeForce typeDataTypeForce, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(typeDataTypeForce, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeDataTypeFrequence(TypeDataTypeFrequence typeDataTypeFrequence, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(typeDataTypeFrequence, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeDataTypeLatitude(TypeDataTypeLatitude typeDataTypeLatitude, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(typeDataTypeLatitude, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeDataTypeLongitude(TypeDataTypeLongitude typeDataTypeLongitude, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(typeDataTypeLongitude, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeDataTypeLongueur(TypeDataTypeLongueur typeDataTypeLongueur, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(typeDataTypeLongueur, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeDataTypeMasse(TypeDataTypeMasse typeDataTypeMasse, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(typeDataTypeMasse, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeDataTypePression(TypeDataTypePression typeDataTypePression, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(typeDataTypePression, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeDataTypeTauxPrecipitation(TypeDataTypeTauxPrecipitation typeDataTypeTauxPrecipitation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(typeDataTypeTauxPrecipitation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeDataTypeTemperature(TypeDataTypeTemperature typeDataTypeTemperature, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(typeDataTypeTemperature, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeDataTypeVitesseAngulaire(TypeDataTypeVitesseAngulaire typeDataTypeVitesseAngulaire, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(typeDataTypeVitesseAngulaire, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeDataTypeVitesseAngulaireOrientee(TypeDataTypeVitesseAngulaireOrientee typeDataTypeVitesseAngulaireOrientee, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(typeDataTypeVitesseAngulaireOrientee, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeDataTypeVitesseLineaire(TypeDataTypeVitesseLineaire typeDataTypeVitesseLineaire, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(typeDataTypeVitesseLineaire, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeDataTypeVolume(TypeDataTypeVolume typeDataTypeVolume, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(typeDataTypeVolume, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeDictionnaryUniteCode(TypeDictionnaryUniteCode typeDictionnaryUniteCode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeAnnee(XMLGregorianCalendar typeAnnee, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeAnneeMois(XMLGregorianCalendar typeAnneeMois, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeAnyURI(String typeAnyURI, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeBoolean(boolean typeBoolean, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeBooleanObject(Boolean typeBooleanObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeDataTypeChaine0100(String typeDataTypeChaine0100, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateTypeDataTypeChaine0100_MinLength(typeDataTypeChaine0100, diagnostics, context);
		if (result || diagnostics != null) result &= validateTypeDataTypeChaine0100_MaxLength(typeDataTypeChaine0100, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>Type Data Type Chaine0100</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeDataTypeChaine0100_MinLength(String typeDataTypeChaine0100, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = typeDataTypeChaine0100.length();
		boolean result = length >= 1;
		if (!result && diagnostics != null)
			reportMinLengthViolation(MetaPackage.Literals.TYPE_DATA_TYPE_CHAINE0100, typeDataTypeChaine0100, length, 1, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Type Data Type Chaine0100</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeDataTypeChaine0100_MaxLength(String typeDataTypeChaine0100, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = typeDataTypeChaine0100.length();
		boolean result = length <= 100;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(MetaPackage.Literals.TYPE_DATA_TYPE_CHAINE0100, typeDataTypeChaine0100, length, 100, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeDataTypeChaine012(String typeDataTypeChaine012, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateTypeDataTypeChaine012_MinLength(typeDataTypeChaine012, diagnostics, context);
		if (result || diagnostics != null) result &= validateTypeDataTypeChaine012_MaxLength(typeDataTypeChaine012, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>Type Data Type Chaine012</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeDataTypeChaine012_MinLength(String typeDataTypeChaine012, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = typeDataTypeChaine012.length();
		boolean result = length >= 1;
		if (!result && diagnostics != null)
			reportMinLengthViolation(MetaPackage.Literals.TYPE_DATA_TYPE_CHAINE012, typeDataTypeChaine012, length, 1, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Type Data Type Chaine012</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeDataTypeChaine012_MaxLength(String typeDataTypeChaine012, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = typeDataTypeChaine012.length();
		boolean result = length <= 12;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(MetaPackage.Literals.TYPE_DATA_TYPE_CHAINE012, typeDataTypeChaine012, length, 12, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeDataTypeChaine015(String typeDataTypeChaine015, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateTypeDataTypeChaine015_MinLength(typeDataTypeChaine015, diagnostics, context);
		if (result || diagnostics != null) result &= validateTypeDataTypeChaine015_MaxLength(typeDataTypeChaine015, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>Type Data Type Chaine015</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeDataTypeChaine015_MinLength(String typeDataTypeChaine015, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = typeDataTypeChaine015.length();
		boolean result = length >= 1;
		if (!result && diagnostics != null)
			reportMinLengthViolation(MetaPackage.Literals.TYPE_DATA_TYPE_CHAINE015, typeDataTypeChaine015, length, 1, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Type Data Type Chaine015</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeDataTypeChaine015_MaxLength(String typeDataTypeChaine015, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = typeDataTypeChaine015.length();
		boolean result = length <= 15;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(MetaPackage.Literals.TYPE_DATA_TYPE_CHAINE015, typeDataTypeChaine015, length, 15, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeDataTypeChaine020(String typeDataTypeChaine020, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateTypeDataTypeChaine020_MinLength(typeDataTypeChaine020, diagnostics, context);
		if (result || diagnostics != null) result &= validateTypeDataTypeChaine020_MaxLength(typeDataTypeChaine020, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>Type Data Type Chaine020</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeDataTypeChaine020_MinLength(String typeDataTypeChaine020, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = typeDataTypeChaine020.length();
		boolean result = length >= 1;
		if (!result && diagnostics != null)
			reportMinLengthViolation(MetaPackage.Literals.TYPE_DATA_TYPE_CHAINE020, typeDataTypeChaine020, length, 1, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Type Data Type Chaine020</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeDataTypeChaine020_MaxLength(String typeDataTypeChaine020, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = typeDataTypeChaine020.length();
		boolean result = length <= 20;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(MetaPackage.Literals.TYPE_DATA_TYPE_CHAINE020, typeDataTypeChaine020, length, 20, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeDataTypeChaine02000(String typeDataTypeChaine02000, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateTypeDataTypeChaine02000_MinLength(typeDataTypeChaine02000, diagnostics, context);
		if (result || diagnostics != null) result &= validateTypeDataTypeChaine02000_MaxLength(typeDataTypeChaine02000, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>Type Data Type Chaine02000</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeDataTypeChaine02000_MinLength(String typeDataTypeChaine02000, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = typeDataTypeChaine02000.length();
		boolean result = length >= 1;
		if (!result && diagnostics != null)
			reportMinLengthViolation(MetaPackage.Literals.TYPE_DATA_TYPE_CHAINE02000, typeDataTypeChaine02000, length, 1, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Type Data Type Chaine02000</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeDataTypeChaine02000_MaxLength(String typeDataTypeChaine02000, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = typeDataTypeChaine02000.length();
		boolean result = length <= 2000;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(MetaPackage.Literals.TYPE_DATA_TYPE_CHAINE02000, typeDataTypeChaine02000, length, 2000, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeDataTypeChaine0255(String typeDataTypeChaine0255, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateTypeDataTypeChaine0255_MinLength(typeDataTypeChaine0255, diagnostics, context);
		if (result || diagnostics != null) result &= validateTypeDataTypeChaine0255_MaxLength(typeDataTypeChaine0255, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>Type Data Type Chaine0255</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeDataTypeChaine0255_MinLength(String typeDataTypeChaine0255, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = typeDataTypeChaine0255.length();
		boolean result = length >= 1;
		if (!result && diagnostics != null)
			reportMinLengthViolation(MetaPackage.Literals.TYPE_DATA_TYPE_CHAINE0255, typeDataTypeChaine0255, length, 1, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Type Data Type Chaine0255</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeDataTypeChaine0255_MaxLength(String typeDataTypeChaine0255, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = typeDataTypeChaine0255.length();
		boolean result = length <= 255;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(MetaPackage.Literals.TYPE_DATA_TYPE_CHAINE0255, typeDataTypeChaine0255, length, 255, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeDataTypeChaine03(String typeDataTypeChaine03, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateTypeDataTypeChaine03_MinLength(typeDataTypeChaine03, diagnostics, context);
		if (result || diagnostics != null) result &= validateTypeDataTypeChaine03_MaxLength(typeDataTypeChaine03, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>Type Data Type Chaine03</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeDataTypeChaine03_MinLength(String typeDataTypeChaine03, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = typeDataTypeChaine03.length();
		boolean result = length >= 1;
		if (!result && diagnostics != null)
			reportMinLengthViolation(MetaPackage.Literals.TYPE_DATA_TYPE_CHAINE03, typeDataTypeChaine03, length, 1, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Type Data Type Chaine03</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeDataTypeChaine03_MaxLength(String typeDataTypeChaine03, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = typeDataTypeChaine03.length();
		boolean result = length <= 3;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(MetaPackage.Literals.TYPE_DATA_TYPE_CHAINE03, typeDataTypeChaine03, length, 3, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeDataTypeChaine030(String typeDataTypeChaine030, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateTypeDataTypeChaine030_MinLength(typeDataTypeChaine030, diagnostics, context);
		if (result || diagnostics != null) result &= validateTypeDataTypeChaine030_MaxLength(typeDataTypeChaine030, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>Type Data Type Chaine030</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeDataTypeChaine030_MinLength(String typeDataTypeChaine030, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = typeDataTypeChaine030.length();
		boolean result = length >= 1;
		if (!result && diagnostics != null)
			reportMinLengthViolation(MetaPackage.Literals.TYPE_DATA_TYPE_CHAINE030, typeDataTypeChaine030, length, 1, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Type Data Type Chaine030</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeDataTypeChaine030_MaxLength(String typeDataTypeChaine030, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = typeDataTypeChaine030.length();
		boolean result = length <= 30;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(MetaPackage.Literals.TYPE_DATA_TYPE_CHAINE030, typeDataTypeChaine030, length, 30, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeDataTypeChaine050(String typeDataTypeChaine050, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateTypeDataTypeChaine050_MinLength(typeDataTypeChaine050, diagnostics, context);
		if (result || diagnostics != null) result &= validateTypeDataTypeChaine050_MaxLength(typeDataTypeChaine050, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>Type Data Type Chaine050</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeDataTypeChaine050_MinLength(String typeDataTypeChaine050, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = typeDataTypeChaine050.length();
		boolean result = length >= 1;
		if (!result && diagnostics != null)
			reportMinLengthViolation(MetaPackage.Literals.TYPE_DATA_TYPE_CHAINE050, typeDataTypeChaine050, length, 1, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Type Data Type Chaine050</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeDataTypeChaine050_MaxLength(String typeDataTypeChaine050, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = typeDataTypeChaine050.length();
		boolean result = length <= 50;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(MetaPackage.Literals.TYPE_DATA_TYPE_CHAINE050, typeDataTypeChaine050, length, 50, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeDataTypeChaine06(String typeDataTypeChaine06, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateTypeDataTypeChaine06_MinLength(typeDataTypeChaine06, diagnostics, context);
		if (result || diagnostics != null) result &= validateTypeDataTypeChaine06_MaxLength(typeDataTypeChaine06, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>Type Data Type Chaine06</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeDataTypeChaine06_MinLength(String typeDataTypeChaine06, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = typeDataTypeChaine06.length();
		boolean result = length >= 1;
		if (!result && diagnostics != null)
			reportMinLengthViolation(MetaPackage.Literals.TYPE_DATA_TYPE_CHAINE06, typeDataTypeChaine06, length, 1, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Type Data Type Chaine06</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeDataTypeChaine06_MaxLength(String typeDataTypeChaine06, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = typeDataTypeChaine06.length();
		boolean result = length <= 6;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(MetaPackage.Literals.TYPE_DATA_TYPE_CHAINE06, typeDataTypeChaine06, length, 6, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeDataTypeChaine08(String typeDataTypeChaine08, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateTypeDataTypeChaine08_MinLength(typeDataTypeChaine08, diagnostics, context);
		if (result || diagnostics != null) result &= validateTypeDataTypeChaine08_MaxLength(typeDataTypeChaine08, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>Type Data Type Chaine08</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeDataTypeChaine08_MinLength(String typeDataTypeChaine08, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = typeDataTypeChaine08.length();
		boolean result = length >= 1;
		if (!result && diagnostics != null)
			reportMinLengthViolation(MetaPackage.Literals.TYPE_DATA_TYPE_CHAINE08, typeDataTypeChaine08, length, 1, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Type Data Type Chaine08</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeDataTypeChaine08_MaxLength(String typeDataTypeChaine08, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = typeDataTypeChaine08.length();
		boolean result = length <= 8;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(MetaPackage.Literals.TYPE_DATA_TYPE_CHAINE08, typeDataTypeChaine08, length, 8, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeDataTypeChaine080(String typeDataTypeChaine080, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateTypeDataTypeChaine080_MinLength(typeDataTypeChaine080, diagnostics, context);
		if (result || diagnostics != null) result &= validateTypeDataTypeChaine080_MaxLength(typeDataTypeChaine080, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>Type Data Type Chaine080</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeDataTypeChaine080_MinLength(String typeDataTypeChaine080, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = typeDataTypeChaine080.length();
		boolean result = length >= 1;
		if (!result && diagnostics != null)
			reportMinLengthViolation(MetaPackage.Literals.TYPE_DATA_TYPE_CHAINE080, typeDataTypeChaine080, length, 1, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Type Data Type Chaine080</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeDataTypeChaine080_MaxLength(String typeDataTypeChaine080, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = typeDataTypeChaine080.length();
		boolean result = length <= 80;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(MetaPackage.Literals.TYPE_DATA_TYPE_CHAINE080, typeDataTypeChaine080, length, 80, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeDataTypeChaine09(String typeDataTypeChaine09, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateTypeDataTypeChaine09_MinLength(typeDataTypeChaine09, diagnostics, context);
		if (result || diagnostics != null) result &= validateTypeDataTypeChaine09_MaxLength(typeDataTypeChaine09, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>Type Data Type Chaine09</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeDataTypeChaine09_MinLength(String typeDataTypeChaine09, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = typeDataTypeChaine09.length();
		boolean result = length >= 1;
		if (!result && diagnostics != null)
			reportMinLengthViolation(MetaPackage.Literals.TYPE_DATA_TYPE_CHAINE09, typeDataTypeChaine09, length, 1, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Type Data Type Chaine09</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeDataTypeChaine09_MaxLength(String typeDataTypeChaine09, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = typeDataTypeChaine09.length();
		boolean result = length <= 9;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(MetaPackage.Literals.TYPE_DATA_TYPE_CHAINE09, typeDataTypeChaine09, length, 9, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeDataTypeEntier15(long typeDataTypeEntier15, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateTypeDataTypeEntier15_TotalDigits(typeDataTypeEntier15, diagnostics, context);
		if (result || diagnostics != null) result &= validateTypeDataTypeEntier15_Min(typeDataTypeEntier15, diagnostics, context);
		if (result || diagnostics != null) result &= validateTypeDataTypeEntier15_Max(typeDataTypeEntier15, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateTypeDataTypeEntier15_TotalDigits
	 */
	public static final long TYPE_DATA_TYPE_ENTIER15__TOTAL_DIGITS__UPPER_BOUND = 1000000000000000L;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateTypeDataTypeEntier15_TotalDigits
	 */
	public static final long TYPE_DATA_TYPE_ENTIER15__TOTAL_DIGITS__LOWER_BOUND = -1000000000000000L;

	/**
	 * Validates the TotalDigits constraint of '<em>Type Data Type Entier15</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeDataTypeEntier15_TotalDigits(long typeDataTypeEntier15, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = typeDataTypeEntier15 > TYPE_DATA_TYPE_ENTIER15__TOTAL_DIGITS__LOWER_BOUND && typeDataTypeEntier15 < TYPE_DATA_TYPE_ENTIER15__TOTAL_DIGITS__UPPER_BOUND;
		if (!result && diagnostics != null)
			reportTotalDigitsViolation(MetaPackage.Literals.TYPE_DATA_TYPE_ENTIER15, new Long(typeDataTypeEntier15), 15, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateTypeDataTypeEntier15_Min
	 */
	public static final long TYPE_DATA_TYPE_ENTIER15__MIN__VALUE = 0L;

	/**
	 * Validates the Min constraint of '<em>Type Data Type Entier15</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeDataTypeEntier15_Min(long typeDataTypeEntier15, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = typeDataTypeEntier15 >= TYPE_DATA_TYPE_ENTIER15__MIN__VALUE;
		if (!result && diagnostics != null)
			reportMinViolation(MetaPackage.Literals.TYPE_DATA_TYPE_ENTIER15, new Long(typeDataTypeEntier15), new Long(TYPE_DATA_TYPE_ENTIER15__MIN__VALUE), true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateTypeDataTypeEntier15_Max
	 */
	public static final long TYPE_DATA_TYPE_ENTIER15__MAX__VALUE = 999999999999999L;

	/**
	 * Validates the Max constraint of '<em>Type Data Type Entier15</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeDataTypeEntier15_Max(long typeDataTypeEntier15, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = typeDataTypeEntier15 <= TYPE_DATA_TYPE_ENTIER15__MAX__VALUE;
		if (!result && diagnostics != null)
			reportMaxViolation(MetaPackage.Literals.TYPE_DATA_TYPE_ENTIER15, new Long(typeDataTypeEntier15), new Long(TYPE_DATA_TYPE_ENTIER15__MAX__VALUE), true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeDataTypeEntier15Object(Long typeDataTypeEntier15Object, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateTypeDataTypeEntier15_TotalDigits(typeDataTypeEntier15Object.longValue(), diagnostics, context);
		if (result || diagnostics != null) result &= validateTypeDataTypeEntier15_Min(typeDataTypeEntier15Object.longValue(), diagnostics, context);
		if (result || diagnostics != null) result &= validateTypeDataTypeEntier15_Max(typeDataTypeEntier15Object.longValue(), diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeDataTypeEntier3(long typeDataTypeEntier3, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateTypeDataTypeEntier3_TotalDigits(typeDataTypeEntier3, diagnostics, context);
		if (result || diagnostics != null) result &= validateTypeDataTypeEntier3_Min(typeDataTypeEntier3, diagnostics, context);
		if (result || diagnostics != null) result &= validateTypeDataTypeEntier3_Max(typeDataTypeEntier3, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateTypeDataTypeEntier3_TotalDigits
	 */
	public static final long TYPE_DATA_TYPE_ENTIER3__TOTAL_DIGITS__UPPER_BOUND = 1000L;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateTypeDataTypeEntier3_TotalDigits
	 */
	public static final long TYPE_DATA_TYPE_ENTIER3__TOTAL_DIGITS__LOWER_BOUND = -1000L;

	/**
	 * Validates the TotalDigits constraint of '<em>Type Data Type Entier3</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeDataTypeEntier3_TotalDigits(long typeDataTypeEntier3, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = typeDataTypeEntier3 > TYPE_DATA_TYPE_ENTIER3__TOTAL_DIGITS__LOWER_BOUND && typeDataTypeEntier3 < TYPE_DATA_TYPE_ENTIER3__TOTAL_DIGITS__UPPER_BOUND;
		if (!result && diagnostics != null)
			reportTotalDigitsViolation(MetaPackage.Literals.TYPE_DATA_TYPE_ENTIER3, new Long(typeDataTypeEntier3), 3, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateTypeDataTypeEntier3_Min
	 */
	public static final long TYPE_DATA_TYPE_ENTIER3__MIN__VALUE = 0L;

	/**
	 * Validates the Min constraint of '<em>Type Data Type Entier3</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeDataTypeEntier3_Min(long typeDataTypeEntier3, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = typeDataTypeEntier3 >= TYPE_DATA_TYPE_ENTIER3__MIN__VALUE;
		if (!result && diagnostics != null)
			reportMinViolation(MetaPackage.Literals.TYPE_DATA_TYPE_ENTIER3, new Long(typeDataTypeEntier3), new Long(TYPE_DATA_TYPE_ENTIER3__MIN__VALUE), true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateTypeDataTypeEntier3_Max
	 */
	public static final long TYPE_DATA_TYPE_ENTIER3__MAX__VALUE = 999L;

	/**
	 * Validates the Max constraint of '<em>Type Data Type Entier3</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeDataTypeEntier3_Max(long typeDataTypeEntier3, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = typeDataTypeEntier3 <= TYPE_DATA_TYPE_ENTIER3__MAX__VALUE;
		if (!result && diagnostics != null)
			reportMaxViolation(MetaPackage.Literals.TYPE_DATA_TYPE_ENTIER3, new Long(typeDataTypeEntier3), new Long(TYPE_DATA_TYPE_ENTIER3__MAX__VALUE), true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeDataTypeEntier3Object(Long typeDataTypeEntier3Object, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateTypeDataTypeEntier3_TotalDigits(typeDataTypeEntier3Object.longValue(), diagnostics, context);
		if (result || diagnostics != null) result &= validateTypeDataTypeEntier3_Min(typeDataTypeEntier3Object.longValue(), diagnostics, context);
		if (result || diagnostics != null) result &= validateTypeDataTypeEntier3_Max(typeDataTypeEntier3Object.longValue(), diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeDataTypeEntier6(long typeDataTypeEntier6, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateTypeDataTypeEntier6_TotalDigits(typeDataTypeEntier6, diagnostics, context);
		if (result || diagnostics != null) result &= validateTypeDataTypeEntier6_Min(typeDataTypeEntier6, diagnostics, context);
		if (result || diagnostics != null) result &= validateTypeDataTypeEntier6_Max(typeDataTypeEntier6, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateTypeDataTypeEntier6_TotalDigits
	 */
	public static final long TYPE_DATA_TYPE_ENTIER6__TOTAL_DIGITS__UPPER_BOUND = 1000000L;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateTypeDataTypeEntier6_TotalDigits
	 */
	public static final long TYPE_DATA_TYPE_ENTIER6__TOTAL_DIGITS__LOWER_BOUND = -1000000L;

	/**
	 * Validates the TotalDigits constraint of '<em>Type Data Type Entier6</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeDataTypeEntier6_TotalDigits(long typeDataTypeEntier6, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = typeDataTypeEntier6 > TYPE_DATA_TYPE_ENTIER6__TOTAL_DIGITS__LOWER_BOUND && typeDataTypeEntier6 < TYPE_DATA_TYPE_ENTIER6__TOTAL_DIGITS__UPPER_BOUND;
		if (!result && diagnostics != null)
			reportTotalDigitsViolation(MetaPackage.Literals.TYPE_DATA_TYPE_ENTIER6, new Long(typeDataTypeEntier6), 6, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateTypeDataTypeEntier6_Min
	 */
	public static final long TYPE_DATA_TYPE_ENTIER6__MIN__VALUE = 0L;

	/**
	 * Validates the Min constraint of '<em>Type Data Type Entier6</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeDataTypeEntier6_Min(long typeDataTypeEntier6, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = typeDataTypeEntier6 >= TYPE_DATA_TYPE_ENTIER6__MIN__VALUE;
		if (!result && diagnostics != null)
			reportMinViolation(MetaPackage.Literals.TYPE_DATA_TYPE_ENTIER6, new Long(typeDataTypeEntier6), new Long(TYPE_DATA_TYPE_ENTIER6__MIN__VALUE), true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateTypeDataTypeEntier6_Max
	 */
	public static final long TYPE_DATA_TYPE_ENTIER6__MAX__VALUE = 999999L;

	/**
	 * Validates the Max constraint of '<em>Type Data Type Entier6</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeDataTypeEntier6_Max(long typeDataTypeEntier6, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = typeDataTypeEntier6 <= TYPE_DATA_TYPE_ENTIER6__MAX__VALUE;
		if (!result && diagnostics != null)
			reportMaxViolation(MetaPackage.Literals.TYPE_DATA_TYPE_ENTIER6, new Long(typeDataTypeEntier6), new Long(TYPE_DATA_TYPE_ENTIER6__MAX__VALUE), true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeDataTypeEntier6Object(Long typeDataTypeEntier6Object, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateTypeDataTypeEntier6_TotalDigits(typeDataTypeEntier6Object.longValue(), diagnostics, context);
		if (result || diagnostics != null) result &= validateTypeDataTypeEntier6_Min(typeDataTypeEntier6Object.longValue(), diagnostics, context);
		if (result || diagnostics != null) result &= validateTypeDataTypeEntier6_Max(typeDataTypeEntier6Object.longValue(), diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeDataTypeEntier9(long typeDataTypeEntier9, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateTypeDataTypeEntier9_TotalDigits(typeDataTypeEntier9, diagnostics, context);
		if (result || diagnostics != null) result &= validateTypeDataTypeEntier9_Min(typeDataTypeEntier9, diagnostics, context);
		if (result || diagnostics != null) result &= validateTypeDataTypeEntier9_Max(typeDataTypeEntier9, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateTypeDataTypeEntier9_TotalDigits
	 */
	public static final long TYPE_DATA_TYPE_ENTIER9__TOTAL_DIGITS__UPPER_BOUND = 1000000000L;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateTypeDataTypeEntier9_TotalDigits
	 */
	public static final long TYPE_DATA_TYPE_ENTIER9__TOTAL_DIGITS__LOWER_BOUND = -1000000000L;

	/**
	 * Validates the TotalDigits constraint of '<em>Type Data Type Entier9</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeDataTypeEntier9_TotalDigits(long typeDataTypeEntier9, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = typeDataTypeEntier9 > TYPE_DATA_TYPE_ENTIER9__TOTAL_DIGITS__LOWER_BOUND && typeDataTypeEntier9 < TYPE_DATA_TYPE_ENTIER9__TOTAL_DIGITS__UPPER_BOUND;
		if (!result && diagnostics != null)
			reportTotalDigitsViolation(MetaPackage.Literals.TYPE_DATA_TYPE_ENTIER9, new Long(typeDataTypeEntier9), 9, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateTypeDataTypeEntier9_Min
	 */
	public static final long TYPE_DATA_TYPE_ENTIER9__MIN__VALUE = 0L;

	/**
	 * Validates the Min constraint of '<em>Type Data Type Entier9</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeDataTypeEntier9_Min(long typeDataTypeEntier9, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = typeDataTypeEntier9 >= TYPE_DATA_TYPE_ENTIER9__MIN__VALUE;
		if (!result && diagnostics != null)
			reportMinViolation(MetaPackage.Literals.TYPE_DATA_TYPE_ENTIER9, new Long(typeDataTypeEntier9), new Long(TYPE_DATA_TYPE_ENTIER9__MIN__VALUE), true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateTypeDataTypeEntier9_Max
	 */
	public static final long TYPE_DATA_TYPE_ENTIER9__MAX__VALUE = 999999999L;

	/**
	 * Validates the Max constraint of '<em>Type Data Type Entier9</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeDataTypeEntier9_Max(long typeDataTypeEntier9, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = typeDataTypeEntier9 <= TYPE_DATA_TYPE_ENTIER9__MAX__VALUE;
		if (!result && diagnostics != null)
			reportMaxViolation(MetaPackage.Literals.TYPE_DATA_TYPE_ENTIER9, new Long(typeDataTypeEntier9), new Long(TYPE_DATA_TYPE_ENTIER9__MAX__VALUE), true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeDataTypeEntier9Object(Long typeDataTypeEntier9Object, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateTypeDataTypeEntier9_TotalDigits(typeDataTypeEntier9Object.longValue(), diagnostics, context);
		if (result || diagnostics != null) result &= validateTypeDataTypeEntier9_Min(typeDataTypeEntier9Object.longValue(), diagnostics, context);
		if (result || diagnostics != null) result &= validateTypeDataTypeEntier9_Max(typeDataTypeEntier9Object.longValue(), diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeDataTypeFraction(double typeDataTypeFraction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateTypeDataTypeFraction_Min(typeDataTypeFraction, diagnostics, context);
		if (result || diagnostics != null) result &= validateTypeDataTypeFraction_Max(typeDataTypeFraction, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateTypeDataTypeFraction_Min
	 */
	public static final double TYPE_DATA_TYPE_FRACTION__MIN__VALUE = 0.0;

	/**
	 * Validates the Min constraint of '<em>Type Data Type Fraction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeDataTypeFraction_Min(double typeDataTypeFraction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = typeDataTypeFraction >= TYPE_DATA_TYPE_FRACTION__MIN__VALUE;
		if (!result && diagnostics != null)
			reportMinViolation(MetaPackage.Literals.TYPE_DATA_TYPE_FRACTION, new Double(typeDataTypeFraction), new Double(TYPE_DATA_TYPE_FRACTION__MIN__VALUE), true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateTypeDataTypeFraction_Max
	 */
	public static final double TYPE_DATA_TYPE_FRACTION__MAX__VALUE = 1.0;

	/**
	 * Validates the Max constraint of '<em>Type Data Type Fraction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeDataTypeFraction_Max(double typeDataTypeFraction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = typeDataTypeFraction <= TYPE_DATA_TYPE_FRACTION__MAX__VALUE;
		if (!result && diagnostics != null)
			reportMaxViolation(MetaPackage.Literals.TYPE_DATA_TYPE_FRACTION, new Double(typeDataTypeFraction), new Double(TYPE_DATA_TYPE_FRACTION__MAX__VALUE), true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeDataTypeFractionObject(Double typeDataTypeFractionObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateTypeDataTypeFraction_Min(typeDataTypeFractionObject.doubleValue(), diagnostics, context);
		if (result || diagnostics != null) result &= validateTypeDataTypeFraction_Max(typeDataTypeFractionObject.doubleValue(), diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeDataTypeGDH(XMLGregorianCalendar typeDataTypeGDH, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateTypeDataTypeGDH_Min(typeDataTypeGDH, diagnostics, context);
		if (result || diagnostics != null) result &= validateTypeDataTypeGDH_Max(typeDataTypeGDH, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateTypeDataTypeGDH_Min
	 */
	public static final XMLGregorianCalendar TYPE_DATA_TYPE_GDH__MIN__VALUE = (XMLGregorianCalendar)MetaFactory.eINSTANCE.createFromString(MetaPackage.eINSTANCE.getTypeDataTypeGDH(), "1901-01-01T00:00:00");

	/**
	 * Validates the Min constraint of '<em>Type Data Type GDH</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeDataTypeGDH_Min(XMLGregorianCalendar typeDataTypeGDH, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int comparison = XMLTypeUtil.compareCalendar(typeDataTypeGDH, TYPE_DATA_TYPE_GDH__MIN__VALUE);
		boolean result = comparison == 0 || comparison == 1;
		if (!result && diagnostics != null)
			reportMinViolation(MetaPackage.Literals.TYPE_DATA_TYPE_GDH, typeDataTypeGDH, TYPE_DATA_TYPE_GDH__MIN__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateTypeDataTypeGDH_Max
	 */
	public static final XMLGregorianCalendar TYPE_DATA_TYPE_GDH__MAX__VALUE = (XMLGregorianCalendar)MetaFactory.eINSTANCE.createFromString(MetaPackage.eINSTANCE.getTypeDataTypeGDH(), "2036-12-31T23:59:59");

	/**
	 * Validates the Max constraint of '<em>Type Data Type GDH</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeDataTypeGDH_Max(XMLGregorianCalendar typeDataTypeGDH, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int comparison = XMLTypeUtil.compareCalendar(typeDataTypeGDH, TYPE_DATA_TYPE_GDH__MAX__VALUE);
		boolean result = comparison == 0 || comparison == -1;
		if (!result && diagnostics != null)
			reportMaxViolation(MetaPackage.Literals.TYPE_DATA_TYPE_GDH, typeDataTypeGDH, TYPE_DATA_TYPE_GDH__MAX__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeDataTypeRatio(double typeDataTypeRatio, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateTypeDataTypeRatio_Min(typeDataTypeRatio, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateTypeDataTypeRatio_Min
	 */
	public static final double TYPE_DATA_TYPE_RATIO__MIN__VALUE = 0.0;

	/**
	 * Validates the Min constraint of '<em>Type Data Type Ratio</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeDataTypeRatio_Min(double typeDataTypeRatio, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = typeDataTypeRatio >= TYPE_DATA_TYPE_RATIO__MIN__VALUE;
		if (!result && diagnostics != null)
			reportMinViolation(MetaPackage.Literals.TYPE_DATA_TYPE_RATIO, new Double(typeDataTypeRatio), new Double(TYPE_DATA_TYPE_RATIO__MIN__VALUE), true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeDataTypeRatioObject(Double typeDataTypeRatioObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateTypeDataTypeRatio_Min(typeDataTypeRatioObject.doubleValue(), diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeDate(XMLGregorianCalendar typeDate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeDecimal(BigDecimal typeDecimal, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeDictionnaryUniteCodeObject(TypeDictionnaryUniteCode typeDictionnaryUniteCodeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeDTG(XMLGregorianCalendar typeDTG, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeHeure(XMLGregorianCalendar typeHeure, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeInteger(long typeInteger, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeIntegerObject(Long typeIntegerObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeReal(double typeReal, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeRealObject(Double typeRealObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeReelPositif(double typeReelPositif, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateTypeReelPositif_Min(typeReelPositif, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateTypeReelPositif_Min
	 */
	public static final double TYPE_REEL_POSITIF__MIN__VALUE = 0.0;

	/**
	 * Validates the Min constraint of '<em>Type Reel Positif</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeReelPositif_Min(double typeReelPositif, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = typeReelPositif >= TYPE_REEL_POSITIF__MIN__VALUE;
		if (!result && diagnostics != null)
			reportMinViolation(MetaPackage.Literals.TYPE_REEL_POSITIF, new Double(typeReelPositif), new Double(TYPE_REEL_POSITIF__MIN__VALUE), true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeReelPositifObject(Double typeReelPositifObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateTypeReelPositif_Min(typeReelPositifObject.doubleValue(), diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeRestrictionAngle(double typeRestrictionAngle, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateTypeReelPositif_Min(typeRestrictionAngle, diagnostics, context);
		if (result || diagnostics != null) result &= validateTypeRestrictionAngle_Max(typeRestrictionAngle, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateTypeRestrictionAngle_Max
	 */
	public static final double TYPE_RESTRICTION_ANGLE__MAX__VALUE = 360.0;

	/**
	 * Validates the Max constraint of '<em>Type Restriction Angle</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeRestrictionAngle_Max(double typeRestrictionAngle, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = typeRestrictionAngle < TYPE_RESTRICTION_ANGLE__MAX__VALUE;
		if (!result && diagnostics != null)
			reportMaxViolation(MetaPackage.Literals.TYPE_RESTRICTION_ANGLE, new Double(typeRestrictionAngle), new Double(TYPE_RESTRICTION_ANGLE__MAX__VALUE), false, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeRestrictionAngleObject(Double typeRestrictionAngleObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateTypeRestrictionAngle_Max(typeRestrictionAngleObject.doubleValue(), diagnostics, context);
		if (result || diagnostics != null) result &= validateTypeReelPositif_Min(typeRestrictionAngleObject.doubleValue(), diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeRestrictionAngleSigne(double typeRestrictionAngleSigne, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateTypeRestrictionAngleSigne_Min(typeRestrictionAngleSigne, diagnostics, context);
		if (result || diagnostics != null) result &= validateTypeRestrictionAngleSigne_Max(typeRestrictionAngleSigne, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateTypeRestrictionAngleSigne_Min
	 */
	public static final double TYPE_RESTRICTION_ANGLE_SIGNE__MIN__VALUE = -180.0;

	/**
	 * Validates the Min constraint of '<em>Type Restriction Angle Signe</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeRestrictionAngleSigne_Min(double typeRestrictionAngleSigne, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = typeRestrictionAngleSigne > TYPE_RESTRICTION_ANGLE_SIGNE__MIN__VALUE;
		if (!result && diagnostics != null)
			reportMinViolation(MetaPackage.Literals.TYPE_RESTRICTION_ANGLE_SIGNE, new Double(typeRestrictionAngleSigne), new Double(TYPE_RESTRICTION_ANGLE_SIGNE__MIN__VALUE), false, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateTypeRestrictionAngleSigne_Max
	 */
	public static final double TYPE_RESTRICTION_ANGLE_SIGNE__MAX__VALUE = 180.0;

	/**
	 * Validates the Max constraint of '<em>Type Restriction Angle Signe</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeRestrictionAngleSigne_Max(double typeRestrictionAngleSigne, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = typeRestrictionAngleSigne <= TYPE_RESTRICTION_ANGLE_SIGNE__MAX__VALUE;
		if (!result && diagnostics != null)
			reportMaxViolation(MetaPackage.Literals.TYPE_RESTRICTION_ANGLE_SIGNE, new Double(typeRestrictionAngleSigne), new Double(TYPE_RESTRICTION_ANGLE_SIGNE__MAX__VALUE), true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeRestrictionAngleSigneObject(Double typeRestrictionAngleSigneObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateTypeRestrictionAngleSigne_Min(typeRestrictionAngleSigneObject.doubleValue(), diagnostics, context);
		if (result || diagnostics != null) result &= validateTypeRestrictionAngleSigne_Max(typeRestrictionAngleSigneObject.doubleValue(), diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeRestrictionLatitude(BigDecimal typeRestrictionLatitude, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateTypeRestrictionLatitude_Min(typeRestrictionLatitude, diagnostics, context);
		if (result || diagnostics != null) result &= validateTypeRestrictionLatitude_Max(typeRestrictionLatitude, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateTypeRestrictionLatitude_Min
	 */
	public static final BigDecimal TYPE_RESTRICTION_LATITUDE__MIN__VALUE = new BigDecimal("-90");

	/**
	 * Validates the Min constraint of '<em>Type Restriction Latitude</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeRestrictionLatitude_Min(BigDecimal typeRestrictionLatitude, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = typeRestrictionLatitude.compareTo(TYPE_RESTRICTION_LATITUDE__MIN__VALUE) >= 0;
		if (!result && diagnostics != null)
			reportMinViolation(MetaPackage.Literals.TYPE_RESTRICTION_LATITUDE, typeRestrictionLatitude, TYPE_RESTRICTION_LATITUDE__MIN__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateTypeRestrictionLatitude_Max
	 */
	public static final BigDecimal TYPE_RESTRICTION_LATITUDE__MAX__VALUE = new BigDecimal("90");

	/**
	 * Validates the Max constraint of '<em>Type Restriction Latitude</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeRestrictionLatitude_Max(BigDecimal typeRestrictionLatitude, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = typeRestrictionLatitude.compareTo(TYPE_RESTRICTION_LATITUDE__MAX__VALUE) <= 0;
		if (!result && diagnostics != null)
			reportMaxViolation(MetaPackage.Literals.TYPE_RESTRICTION_LATITUDE, typeRestrictionLatitude, TYPE_RESTRICTION_LATITUDE__MAX__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeRestrictionLongitude(BigDecimal typeRestrictionLongitude, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateTypeRestrictionLongitude_Min(typeRestrictionLongitude, diagnostics, context);
		if (result || diagnostics != null) result &= validateTypeRestrictionLongitude_Max(typeRestrictionLongitude, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateTypeRestrictionLongitude_Min
	 */
	public static final BigDecimal TYPE_RESTRICTION_LONGITUDE__MIN__VALUE = new BigDecimal("-180");

	/**
	 * Validates the Min constraint of '<em>Type Restriction Longitude</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeRestrictionLongitude_Min(BigDecimal typeRestrictionLongitude, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = typeRestrictionLongitude.compareTo(TYPE_RESTRICTION_LONGITUDE__MIN__VALUE) > 0;
		if (!result && diagnostics != null)
			reportMinViolation(MetaPackage.Literals.TYPE_RESTRICTION_LONGITUDE, typeRestrictionLongitude, TYPE_RESTRICTION_LONGITUDE__MIN__VALUE, false, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateTypeRestrictionLongitude_Max
	 */
	public static final BigDecimal TYPE_RESTRICTION_LONGITUDE__MAX__VALUE = new BigDecimal("180");

	/**
	 * Validates the Max constraint of '<em>Type Restriction Longitude</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeRestrictionLongitude_Max(BigDecimal typeRestrictionLongitude, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = typeRestrictionLongitude.compareTo(TYPE_RESTRICTION_LONGITUDE__MAX__VALUE) <= 0;
		if (!result && diagnostics != null)
			reportMaxViolation(MetaPackage.Literals.TYPE_RESTRICTION_LONGITUDE, typeRestrictionLongitude, TYPE_RESTRICTION_LONGITUDE__MAX__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeRestrictionTemperature(double typeRestrictionTemperature, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateTypeRestrictionTemperature_Min(typeRestrictionTemperature, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateTypeRestrictionTemperature_Min
	 */
	public static final double TYPE_RESTRICTION_TEMPERATURE__MIN__VALUE = -273.15;

	/**
	 * Validates the Min constraint of '<em>Type Restriction Temperature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeRestrictionTemperature_Min(double typeRestrictionTemperature, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = typeRestrictionTemperature >= TYPE_RESTRICTION_TEMPERATURE__MIN__VALUE;
		if (!result && diagnostics != null)
			reportMinViolation(MetaPackage.Literals.TYPE_RESTRICTION_TEMPERATURE, new Double(typeRestrictionTemperature), new Double(TYPE_RESTRICTION_TEMPERATURE__MIN__VALUE), true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeRestrictionTemperatureObject(Double typeRestrictionTemperatureObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateTypeRestrictionTemperature_Min(typeRestrictionTemperatureObject.doubleValue(), diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeString(String typeString, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	

} //MetaValidator
