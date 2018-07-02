/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.meta.impl;

import java.math.BigDecimal;

import javax.xml.datatype.XMLGregorianCalendar;

import mpia.meta.MetaFactory;
import mpia.meta.MetaPackage;
import mpia.meta.TypeAssociation;
import mpia.meta.TypeAssociationEXT;
import mpia.meta.TypeDataTypeAccelerationAngulaire;
import mpia.meta.TypeDataTypeAccelerationAngulaireOrientee;
import mpia.meta.TypeDataTypeAccelerationLineaire;
import mpia.meta.TypeDataTypeAire;
import mpia.meta.TypeDataTypeAltitudePression;
import mpia.meta.TypeDataTypeAngle;
import mpia.meta.TypeDataTypeAngleSigne;
import mpia.meta.TypeDataTypeChampMagnetique;
import mpia.meta.TypeDataTypeCoordonneeAccelerationLineaire;
import mpia.meta.TypeDataTypeCoordonneeForce;
import mpia.meta.TypeDataTypeCoordonneeLineaire;
import mpia.meta.TypeDataTypeCoordonneeVitesseLineaire;
import mpia.meta.TypeDataTypeDateHeure;
import mpia.meta.TypeDataTypeDebitMassique;
import mpia.meta.TypeDataTypeDebitTransmission;
import mpia.meta.TypeDataTypeDebitVolumique;
import mpia.meta.TypeDataTypeDoseAbsorbee;
import mpia.meta.TypeDataTypeDuree;
import mpia.meta.TypeDataTypeForce;
import mpia.meta.TypeDataTypeFrequence;
import mpia.meta.TypeDataTypeLatitude;
import mpia.meta.TypeDataTypeLongitude;
import mpia.meta.TypeDataTypeLongueur;
import mpia.meta.TypeDataTypeMasse;
import mpia.meta.TypeDataTypePression;
import mpia.meta.TypeDataTypeTauxPrecipitation;
import mpia.meta.TypeDataTypeTemperature;
import mpia.meta.TypeDataTypeVitesseAngulaire;
import mpia.meta.TypeDataTypeVitesseAngulaireOrientee;
import mpia.meta.TypeDataTypeVitesseLineaire;
import mpia.meta.TypeDataTypeVolume;
import mpia.meta.TypeDictionnaryUniteCode;

import mpia.meta.util.MetaValidator;

import mpia.schema.SchemaPackage;

import mpia.schema.impl.SchemaPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MetaPackageImpl extends EPackageImpl implements MetaPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeAssociationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeAssociationEXTEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeDataTypeAccelerationAngulaireEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeDataTypeAccelerationAngulaireOrienteeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeDataTypeAccelerationLineaireEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeDataTypeAireEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeDataTypeAltitudePressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeDataTypeAngleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeDataTypeAngleSigneEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeDataTypeChampMagnetiqueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeDataTypeCoordonneeAccelerationLineaireEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeDataTypeCoordonneeForceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeDataTypeCoordonneeLineaireEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeDataTypeCoordonneeVitesseLineaireEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeDataTypeDateHeureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeDataTypeDebitMassiqueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeDataTypeDebitTransmissionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeDataTypeDebitVolumiqueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeDataTypeDoseAbsorbeeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeDataTypeDureeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeDataTypeForceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeDataTypeFrequenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeDataTypeLatitudeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeDataTypeLongitudeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeDataTypeLongueurEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeDataTypeMasseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeDataTypePressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeDataTypeTauxPrecipitationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeDataTypeTemperatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeDataTypeVitesseAngulaireEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeDataTypeVitesseAngulaireOrienteeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeDataTypeVitesseLineaireEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeDataTypeVolumeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum typeDictionnaryUniteCodeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType typeAnneeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType typeAnneeMoisEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType typeAnyURIEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType typeBooleanEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType typeBooleanObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType typeDataTypeChaine0100EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType typeDataTypeChaine012EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType typeDataTypeChaine015EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType typeDataTypeChaine020EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType typeDataTypeChaine02000EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType typeDataTypeChaine0255EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType typeDataTypeChaine03EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType typeDataTypeChaine030EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType typeDataTypeChaine050EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType typeDataTypeChaine06EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType typeDataTypeChaine08EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType typeDataTypeChaine080EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType typeDataTypeChaine09EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType typeDataTypeEntier15EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType typeDataTypeEntier15ObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType typeDataTypeEntier3EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType typeDataTypeEntier3ObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType typeDataTypeEntier6EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType typeDataTypeEntier6ObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType typeDataTypeEntier9EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType typeDataTypeEntier9ObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType typeDataTypeFractionEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType typeDataTypeFractionObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType typeDataTypeGDHEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType typeDataTypeRatioEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType typeDataTypeRatioObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType typeDateEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType typeDecimalEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType typeDictionnaryUniteCodeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType typeDTGEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType typeHeureEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType typeIntegerEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType typeIntegerObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType typeRealEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType typeRealObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType typeReelPositifEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType typeReelPositifObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType typeRestrictionAngleEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType typeRestrictionAngleObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType typeRestrictionAngleSigneEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType typeRestrictionAngleSigneObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType typeRestrictionLatitudeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType typeRestrictionLongitudeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType typeRestrictionTemperatureEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType typeRestrictionTemperatureObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType typeStringEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see mpia.meta.MetaPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MetaPackageImpl() {
		super(eNS_URI, MetaFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this
	 * model, and for any others upon which it depends.  Simple
	 * dependencies are satisfied by calling this method on all
	 * dependent packages before doing anything else.  This method drives
	 * initialization for interdependent packages directly, in parallel
	 * with this package, itself.
	 * <p>Of this package and its interdependencies, all packages which
	 * have not yet been registered by their URI values are first created
	 * and registered.  The packages are then initialized in two steps:
	 * meta-model objects for all of the packages are created before any
	 * are initialized, since one package's meta-model objects may refer to
	 * those of another.
	 * <p>Invocation of this method will not affect any packages that have
	 * already been initialized.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MetaPackage init() {
		if (isInited) return (MetaPackage)EPackage.Registry.INSTANCE.getEPackage(MetaPackage.eNS_URI);

		// Obtain or create and register package
		MetaPackageImpl theMetaPackage = (MetaPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof MetaPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new MetaPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		SchemaPackageImpl theSchemaPackage = (SchemaPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SchemaPackage.eNS_URI) instanceof SchemaPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SchemaPackage.eNS_URI) : SchemaPackage.eINSTANCE);

		// Load packages
		theSchemaPackage.loadPackage();

		// Create package meta-data objects
		theMetaPackage.createPackageContents();

		// Initialize created meta-data
		theMetaPackage.initializePackageContents();

		// Fix loaded packages
		theSchemaPackage.fixPackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theMetaPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return MetaValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theMetaPackage.freeze();

		return theMetaPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeAssociation() {
		return typeAssociationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypeAssociation_RefCTE() {
		return (EAttribute)typeAssociationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeAssociationEXT() {
		return typeAssociationEXTEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypeAssociationEXT_RefCTE() {
		return (EAttribute)typeAssociationEXTEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypeAssociationEXT_RefEXT() {
		return (EAttribute)typeAssociationEXTEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeDataTypeAccelerationAngulaire() {
		return typeDataTypeAccelerationAngulaireEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypeDataTypeAccelerationAngulaire_Value() {
		return (EAttribute)typeDataTypeAccelerationAngulaireEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypeDataTypeAccelerationAngulaire_Unite() {
		return (EAttribute)typeDataTypeAccelerationAngulaireEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeDataTypeAccelerationAngulaireOrientee() {
		return typeDataTypeAccelerationAngulaireOrienteeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypeDataTypeAccelerationAngulaireOrientee_Value() {
		return (EAttribute)typeDataTypeAccelerationAngulaireOrienteeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypeDataTypeAccelerationAngulaireOrientee_Unite() {
		return (EAttribute)typeDataTypeAccelerationAngulaireOrienteeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeDataTypeAccelerationLineaire() {
		return typeDataTypeAccelerationLineaireEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypeDataTypeAccelerationLineaire_Value() {
		return (EAttribute)typeDataTypeAccelerationLineaireEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypeDataTypeAccelerationLineaire_Unite() {
		return (EAttribute)typeDataTypeAccelerationLineaireEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeDataTypeAire() {
		return typeDataTypeAireEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypeDataTypeAire_Value() {
		return (EAttribute)typeDataTypeAireEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypeDataTypeAire_Unite() {
		return (EAttribute)typeDataTypeAireEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeDataTypeAltitudePression() {
		return typeDataTypeAltitudePressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypeDataTypeAltitudePression_Value() {
		return (EAttribute)typeDataTypeAltitudePressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypeDataTypeAltitudePression_Unite() {
		return (EAttribute)typeDataTypeAltitudePressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeDataTypeAngle() {
		return typeDataTypeAngleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypeDataTypeAngle_Value() {
		return (EAttribute)typeDataTypeAngleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypeDataTypeAngle_Unite() {
		return (EAttribute)typeDataTypeAngleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeDataTypeAngleSigne() {
		return typeDataTypeAngleSigneEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypeDataTypeAngleSigne_Value() {
		return (EAttribute)typeDataTypeAngleSigneEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypeDataTypeAngleSigne_Unite() {
		return (EAttribute)typeDataTypeAngleSigneEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeDataTypeChampMagnetique() {
		return typeDataTypeChampMagnetiqueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypeDataTypeChampMagnetique_Value() {
		return (EAttribute)typeDataTypeChampMagnetiqueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypeDataTypeChampMagnetique_Unite() {
		return (EAttribute)typeDataTypeChampMagnetiqueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeDataTypeCoordonneeAccelerationLineaire() {
		return typeDataTypeCoordonneeAccelerationLineaireEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypeDataTypeCoordonneeAccelerationLineaire_Value() {
		return (EAttribute)typeDataTypeCoordonneeAccelerationLineaireEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypeDataTypeCoordonneeAccelerationLineaire_Unite() {
		return (EAttribute)typeDataTypeCoordonneeAccelerationLineaireEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeDataTypeCoordonneeForce() {
		return typeDataTypeCoordonneeForceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypeDataTypeCoordonneeForce_Value() {
		return (EAttribute)typeDataTypeCoordonneeForceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypeDataTypeCoordonneeForce_Unite() {
		return (EAttribute)typeDataTypeCoordonneeForceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeDataTypeCoordonneeLineaire() {
		return typeDataTypeCoordonneeLineaireEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypeDataTypeCoordonneeLineaire_Value() {
		return (EAttribute)typeDataTypeCoordonneeLineaireEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypeDataTypeCoordonneeLineaire_Unite() {
		return (EAttribute)typeDataTypeCoordonneeLineaireEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeDataTypeCoordonneeVitesseLineaire() {
		return typeDataTypeCoordonneeVitesseLineaireEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypeDataTypeCoordonneeVitesseLineaire_Value() {
		return (EAttribute)typeDataTypeCoordonneeVitesseLineaireEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypeDataTypeCoordonneeVitesseLineaire_Unite() {
		return (EAttribute)typeDataTypeCoordonneeVitesseLineaireEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeDataTypeDateHeure() {
		return typeDataTypeDateHeureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypeDataTypeDateHeure_Annee() {
		return (EAttribute)typeDataTypeDateHeureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypeDataTypeDateHeure_AnneeMois() {
		return (EAttribute)typeDataTypeDateHeureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypeDataTypeDateHeure_Date() {
		return (EAttribute)typeDataTypeDateHeureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypeDataTypeDateHeure_Heure() {
		return (EAttribute)typeDataTypeDateHeureEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypeDataTypeDateHeure_DateHeure() {
		return (EAttribute)typeDataTypeDateHeureEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeDataTypeDebitMassique() {
		return typeDataTypeDebitMassiqueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypeDataTypeDebitMassique_Value() {
		return (EAttribute)typeDataTypeDebitMassiqueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypeDataTypeDebitMassique_Unite() {
		return (EAttribute)typeDataTypeDebitMassiqueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeDataTypeDebitTransmission() {
		return typeDataTypeDebitTransmissionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypeDataTypeDebitTransmission_Value() {
		return (EAttribute)typeDataTypeDebitTransmissionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypeDataTypeDebitTransmission_Unite() {
		return (EAttribute)typeDataTypeDebitTransmissionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeDataTypeDebitVolumique() {
		return typeDataTypeDebitVolumiqueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypeDataTypeDebitVolumique_Value() {
		return (EAttribute)typeDataTypeDebitVolumiqueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypeDataTypeDebitVolumique_Unite() {
		return (EAttribute)typeDataTypeDebitVolumiqueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeDataTypeDoseAbsorbee() {
		return typeDataTypeDoseAbsorbeeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypeDataTypeDoseAbsorbee_Value() {
		return (EAttribute)typeDataTypeDoseAbsorbeeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypeDataTypeDoseAbsorbee_Unite() {
		return (EAttribute)typeDataTypeDoseAbsorbeeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeDataTypeDuree() {
		return typeDataTypeDureeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypeDataTypeDuree_Value() {
		return (EAttribute)typeDataTypeDureeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypeDataTypeDuree_Unite() {
		return (EAttribute)typeDataTypeDureeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeDataTypeForce() {
		return typeDataTypeForceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypeDataTypeForce_Value() {
		return (EAttribute)typeDataTypeForceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypeDataTypeForce_Unite() {
		return (EAttribute)typeDataTypeForceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeDataTypeFrequence() {
		return typeDataTypeFrequenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypeDataTypeFrequence_Value() {
		return (EAttribute)typeDataTypeFrequenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypeDataTypeFrequence_Unite() {
		return (EAttribute)typeDataTypeFrequenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeDataTypeLatitude() {
		return typeDataTypeLatitudeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypeDataTypeLatitude_Value() {
		return (EAttribute)typeDataTypeLatitudeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypeDataTypeLatitude_Unite() {
		return (EAttribute)typeDataTypeLatitudeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeDataTypeLongitude() {
		return typeDataTypeLongitudeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypeDataTypeLongitude_Value() {
		return (EAttribute)typeDataTypeLongitudeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypeDataTypeLongitude_Unite() {
		return (EAttribute)typeDataTypeLongitudeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeDataTypeLongueur() {
		return typeDataTypeLongueurEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypeDataTypeLongueur_Value() {
		return (EAttribute)typeDataTypeLongueurEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypeDataTypeLongueur_Unite() {
		return (EAttribute)typeDataTypeLongueurEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeDataTypeMasse() {
		return typeDataTypeMasseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypeDataTypeMasse_Value() {
		return (EAttribute)typeDataTypeMasseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypeDataTypeMasse_Unite() {
		return (EAttribute)typeDataTypeMasseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeDataTypePression() {
		return typeDataTypePressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypeDataTypePression_Value() {
		return (EAttribute)typeDataTypePressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypeDataTypePression_Unite() {
		return (EAttribute)typeDataTypePressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeDataTypeTauxPrecipitation() {
		return typeDataTypeTauxPrecipitationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypeDataTypeTauxPrecipitation_Value() {
		return (EAttribute)typeDataTypeTauxPrecipitationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypeDataTypeTauxPrecipitation_Unite() {
		return (EAttribute)typeDataTypeTauxPrecipitationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeDataTypeTemperature() {
		return typeDataTypeTemperatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypeDataTypeTemperature_Value() {
		return (EAttribute)typeDataTypeTemperatureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypeDataTypeTemperature_Unite() {
		return (EAttribute)typeDataTypeTemperatureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeDataTypeVitesseAngulaire() {
		return typeDataTypeVitesseAngulaireEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypeDataTypeVitesseAngulaire_Value() {
		return (EAttribute)typeDataTypeVitesseAngulaireEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypeDataTypeVitesseAngulaire_Unite() {
		return (EAttribute)typeDataTypeVitesseAngulaireEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeDataTypeVitesseAngulaireOrientee() {
		return typeDataTypeVitesseAngulaireOrienteeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypeDataTypeVitesseAngulaireOrientee_Value() {
		return (EAttribute)typeDataTypeVitesseAngulaireOrienteeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypeDataTypeVitesseAngulaireOrientee_Unite() {
		return (EAttribute)typeDataTypeVitesseAngulaireOrienteeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeDataTypeVitesseLineaire() {
		return typeDataTypeVitesseLineaireEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypeDataTypeVitesseLineaire_Value() {
		return (EAttribute)typeDataTypeVitesseLineaireEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypeDataTypeVitesseLineaire_Unite() {
		return (EAttribute)typeDataTypeVitesseLineaireEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeDataTypeVolume() {
		return typeDataTypeVolumeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypeDataTypeVolume_Value() {
		return (EAttribute)typeDataTypeVolumeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypeDataTypeVolume_Unite() {
		return (EAttribute)typeDataTypeVolumeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTypeDictionnaryUniteCode() {
		return typeDictionnaryUniteCodeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTypeAnnee() {
		return typeAnneeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTypeAnneeMois() {
		return typeAnneeMoisEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTypeAnyURI() {
		return typeAnyURIEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTypeBoolean() {
		return typeBooleanEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTypeBooleanObject() {
		return typeBooleanObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTypeDataTypeChaine0100() {
		return typeDataTypeChaine0100EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTypeDataTypeChaine012() {
		return typeDataTypeChaine012EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTypeDataTypeChaine015() {
		return typeDataTypeChaine015EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTypeDataTypeChaine020() {
		return typeDataTypeChaine020EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTypeDataTypeChaine02000() {
		return typeDataTypeChaine02000EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTypeDataTypeChaine0255() {
		return typeDataTypeChaine0255EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTypeDataTypeChaine03() {
		return typeDataTypeChaine03EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTypeDataTypeChaine030() {
		return typeDataTypeChaine030EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTypeDataTypeChaine050() {
		return typeDataTypeChaine050EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTypeDataTypeChaine06() {
		return typeDataTypeChaine06EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTypeDataTypeChaine08() {
		return typeDataTypeChaine08EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTypeDataTypeChaine080() {
		return typeDataTypeChaine080EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTypeDataTypeChaine09() {
		return typeDataTypeChaine09EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTypeDataTypeEntier15() {
		return typeDataTypeEntier15EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTypeDataTypeEntier15Object() {
		return typeDataTypeEntier15ObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTypeDataTypeEntier3() {
		return typeDataTypeEntier3EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTypeDataTypeEntier3Object() {
		return typeDataTypeEntier3ObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTypeDataTypeEntier6() {
		return typeDataTypeEntier6EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTypeDataTypeEntier6Object() {
		return typeDataTypeEntier6ObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTypeDataTypeEntier9() {
		return typeDataTypeEntier9EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTypeDataTypeEntier9Object() {
		return typeDataTypeEntier9ObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTypeDataTypeFraction() {
		return typeDataTypeFractionEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTypeDataTypeFractionObject() {
		return typeDataTypeFractionObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTypeDataTypeGDH() {
		return typeDataTypeGDHEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTypeDataTypeRatio() {
		return typeDataTypeRatioEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTypeDataTypeRatioObject() {
		return typeDataTypeRatioObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTypeDate() {
		return typeDateEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTypeDecimal() {
		return typeDecimalEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTypeDictionnaryUniteCodeObject() {
		return typeDictionnaryUniteCodeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTypeDTG() {
		return typeDTGEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTypeHeure() {
		return typeHeureEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTypeInteger() {
		return typeIntegerEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTypeIntegerObject() {
		return typeIntegerObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTypeReal() {
		return typeRealEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTypeRealObject() {
		return typeRealObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTypeReelPositif() {
		return typeReelPositifEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTypeReelPositifObject() {
		return typeReelPositifObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTypeRestrictionAngle() {
		return typeRestrictionAngleEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTypeRestrictionAngleObject() {
		return typeRestrictionAngleObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTypeRestrictionAngleSigne() {
		return typeRestrictionAngleSigneEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTypeRestrictionAngleSigneObject() {
		return typeRestrictionAngleSigneObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTypeRestrictionLatitude() {
		return typeRestrictionLatitudeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTypeRestrictionLongitude() {
		return typeRestrictionLongitudeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTypeRestrictionTemperature() {
		return typeRestrictionTemperatureEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTypeRestrictionTemperatureObject() {
		return typeRestrictionTemperatureObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTypeString() {
		return typeStringEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetaFactory getMetaFactory() {
		return (MetaFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		typeAssociationEClass = createEClass(TYPE_ASSOCIATION);
		createEAttribute(typeAssociationEClass, TYPE_ASSOCIATION__REF_CTE);

		typeAssociationEXTEClass = createEClass(TYPE_ASSOCIATION_EXT);
		createEAttribute(typeAssociationEXTEClass, TYPE_ASSOCIATION_EXT__REF_CTE);
		createEAttribute(typeAssociationEXTEClass, TYPE_ASSOCIATION_EXT__REF_EXT);

		typeDataTypeAccelerationAngulaireEClass = createEClass(TYPE_DATA_TYPE_ACCELERATION_ANGULAIRE);
		createEAttribute(typeDataTypeAccelerationAngulaireEClass, TYPE_DATA_TYPE_ACCELERATION_ANGULAIRE__VALUE);
		createEAttribute(typeDataTypeAccelerationAngulaireEClass, TYPE_DATA_TYPE_ACCELERATION_ANGULAIRE__UNITE);

		typeDataTypeAccelerationAngulaireOrienteeEClass = createEClass(TYPE_DATA_TYPE_ACCELERATION_ANGULAIRE_ORIENTEE);
		createEAttribute(typeDataTypeAccelerationAngulaireOrienteeEClass, TYPE_DATA_TYPE_ACCELERATION_ANGULAIRE_ORIENTEE__VALUE);
		createEAttribute(typeDataTypeAccelerationAngulaireOrienteeEClass, TYPE_DATA_TYPE_ACCELERATION_ANGULAIRE_ORIENTEE__UNITE);

		typeDataTypeAccelerationLineaireEClass = createEClass(TYPE_DATA_TYPE_ACCELERATION_LINEAIRE);
		createEAttribute(typeDataTypeAccelerationLineaireEClass, TYPE_DATA_TYPE_ACCELERATION_LINEAIRE__VALUE);
		createEAttribute(typeDataTypeAccelerationLineaireEClass, TYPE_DATA_TYPE_ACCELERATION_LINEAIRE__UNITE);

		typeDataTypeAireEClass = createEClass(TYPE_DATA_TYPE_AIRE);
		createEAttribute(typeDataTypeAireEClass, TYPE_DATA_TYPE_AIRE__VALUE);
		createEAttribute(typeDataTypeAireEClass, TYPE_DATA_TYPE_AIRE__UNITE);

		typeDataTypeAltitudePressionEClass = createEClass(TYPE_DATA_TYPE_ALTITUDE_PRESSION);
		createEAttribute(typeDataTypeAltitudePressionEClass, TYPE_DATA_TYPE_ALTITUDE_PRESSION__VALUE);
		createEAttribute(typeDataTypeAltitudePressionEClass, TYPE_DATA_TYPE_ALTITUDE_PRESSION__UNITE);

		typeDataTypeAngleEClass = createEClass(TYPE_DATA_TYPE_ANGLE);
		createEAttribute(typeDataTypeAngleEClass, TYPE_DATA_TYPE_ANGLE__VALUE);
		createEAttribute(typeDataTypeAngleEClass, TYPE_DATA_TYPE_ANGLE__UNITE);

		typeDataTypeAngleSigneEClass = createEClass(TYPE_DATA_TYPE_ANGLE_SIGNE);
		createEAttribute(typeDataTypeAngleSigneEClass, TYPE_DATA_TYPE_ANGLE_SIGNE__VALUE);
		createEAttribute(typeDataTypeAngleSigneEClass, TYPE_DATA_TYPE_ANGLE_SIGNE__UNITE);

		typeDataTypeChampMagnetiqueEClass = createEClass(TYPE_DATA_TYPE_CHAMP_MAGNETIQUE);
		createEAttribute(typeDataTypeChampMagnetiqueEClass, TYPE_DATA_TYPE_CHAMP_MAGNETIQUE__VALUE);
		createEAttribute(typeDataTypeChampMagnetiqueEClass, TYPE_DATA_TYPE_CHAMP_MAGNETIQUE__UNITE);

		typeDataTypeCoordonneeAccelerationLineaireEClass = createEClass(TYPE_DATA_TYPE_COORDONNEE_ACCELERATION_LINEAIRE);
		createEAttribute(typeDataTypeCoordonneeAccelerationLineaireEClass, TYPE_DATA_TYPE_COORDONNEE_ACCELERATION_LINEAIRE__VALUE);
		createEAttribute(typeDataTypeCoordonneeAccelerationLineaireEClass, TYPE_DATA_TYPE_COORDONNEE_ACCELERATION_LINEAIRE__UNITE);

		typeDataTypeCoordonneeForceEClass = createEClass(TYPE_DATA_TYPE_COORDONNEE_FORCE);
		createEAttribute(typeDataTypeCoordonneeForceEClass, TYPE_DATA_TYPE_COORDONNEE_FORCE__VALUE);
		createEAttribute(typeDataTypeCoordonneeForceEClass, TYPE_DATA_TYPE_COORDONNEE_FORCE__UNITE);

		typeDataTypeCoordonneeLineaireEClass = createEClass(TYPE_DATA_TYPE_COORDONNEE_LINEAIRE);
		createEAttribute(typeDataTypeCoordonneeLineaireEClass, TYPE_DATA_TYPE_COORDONNEE_LINEAIRE__VALUE);
		createEAttribute(typeDataTypeCoordonneeLineaireEClass, TYPE_DATA_TYPE_COORDONNEE_LINEAIRE__UNITE);

		typeDataTypeCoordonneeVitesseLineaireEClass = createEClass(TYPE_DATA_TYPE_COORDONNEE_VITESSE_LINEAIRE);
		createEAttribute(typeDataTypeCoordonneeVitesseLineaireEClass, TYPE_DATA_TYPE_COORDONNEE_VITESSE_LINEAIRE__VALUE);
		createEAttribute(typeDataTypeCoordonneeVitesseLineaireEClass, TYPE_DATA_TYPE_COORDONNEE_VITESSE_LINEAIRE__UNITE);

		typeDataTypeDateHeureEClass = createEClass(TYPE_DATA_TYPE_DATE_HEURE);
		createEAttribute(typeDataTypeDateHeureEClass, TYPE_DATA_TYPE_DATE_HEURE__ANNEE);
		createEAttribute(typeDataTypeDateHeureEClass, TYPE_DATA_TYPE_DATE_HEURE__ANNEE_MOIS);
		createEAttribute(typeDataTypeDateHeureEClass, TYPE_DATA_TYPE_DATE_HEURE__DATE);
		createEAttribute(typeDataTypeDateHeureEClass, TYPE_DATA_TYPE_DATE_HEURE__HEURE);
		createEAttribute(typeDataTypeDateHeureEClass, TYPE_DATA_TYPE_DATE_HEURE__DATE_HEURE);

		typeDataTypeDebitMassiqueEClass = createEClass(TYPE_DATA_TYPE_DEBIT_MASSIQUE);
		createEAttribute(typeDataTypeDebitMassiqueEClass, TYPE_DATA_TYPE_DEBIT_MASSIQUE__VALUE);
		createEAttribute(typeDataTypeDebitMassiqueEClass, TYPE_DATA_TYPE_DEBIT_MASSIQUE__UNITE);

		typeDataTypeDebitTransmissionEClass = createEClass(TYPE_DATA_TYPE_DEBIT_TRANSMISSION);
		createEAttribute(typeDataTypeDebitTransmissionEClass, TYPE_DATA_TYPE_DEBIT_TRANSMISSION__VALUE);
		createEAttribute(typeDataTypeDebitTransmissionEClass, TYPE_DATA_TYPE_DEBIT_TRANSMISSION__UNITE);

		typeDataTypeDebitVolumiqueEClass = createEClass(TYPE_DATA_TYPE_DEBIT_VOLUMIQUE);
		createEAttribute(typeDataTypeDebitVolumiqueEClass, TYPE_DATA_TYPE_DEBIT_VOLUMIQUE__VALUE);
		createEAttribute(typeDataTypeDebitVolumiqueEClass, TYPE_DATA_TYPE_DEBIT_VOLUMIQUE__UNITE);

		typeDataTypeDoseAbsorbeeEClass = createEClass(TYPE_DATA_TYPE_DOSE_ABSORBEE);
		createEAttribute(typeDataTypeDoseAbsorbeeEClass, TYPE_DATA_TYPE_DOSE_ABSORBEE__VALUE);
		createEAttribute(typeDataTypeDoseAbsorbeeEClass, TYPE_DATA_TYPE_DOSE_ABSORBEE__UNITE);

		typeDataTypeDureeEClass = createEClass(TYPE_DATA_TYPE_DUREE);
		createEAttribute(typeDataTypeDureeEClass, TYPE_DATA_TYPE_DUREE__VALUE);
		createEAttribute(typeDataTypeDureeEClass, TYPE_DATA_TYPE_DUREE__UNITE);

		typeDataTypeForceEClass = createEClass(TYPE_DATA_TYPE_FORCE);
		createEAttribute(typeDataTypeForceEClass, TYPE_DATA_TYPE_FORCE__VALUE);
		createEAttribute(typeDataTypeForceEClass, TYPE_DATA_TYPE_FORCE__UNITE);

		typeDataTypeFrequenceEClass = createEClass(TYPE_DATA_TYPE_FREQUENCE);
		createEAttribute(typeDataTypeFrequenceEClass, TYPE_DATA_TYPE_FREQUENCE__VALUE);
		createEAttribute(typeDataTypeFrequenceEClass, TYPE_DATA_TYPE_FREQUENCE__UNITE);

		typeDataTypeLatitudeEClass = createEClass(TYPE_DATA_TYPE_LATITUDE);
		createEAttribute(typeDataTypeLatitudeEClass, TYPE_DATA_TYPE_LATITUDE__VALUE);
		createEAttribute(typeDataTypeLatitudeEClass, TYPE_DATA_TYPE_LATITUDE__UNITE);

		typeDataTypeLongitudeEClass = createEClass(TYPE_DATA_TYPE_LONGITUDE);
		createEAttribute(typeDataTypeLongitudeEClass, TYPE_DATA_TYPE_LONGITUDE__VALUE);
		createEAttribute(typeDataTypeLongitudeEClass, TYPE_DATA_TYPE_LONGITUDE__UNITE);

		typeDataTypeLongueurEClass = createEClass(TYPE_DATA_TYPE_LONGUEUR);
		createEAttribute(typeDataTypeLongueurEClass, TYPE_DATA_TYPE_LONGUEUR__VALUE);
		createEAttribute(typeDataTypeLongueurEClass, TYPE_DATA_TYPE_LONGUEUR__UNITE);

		typeDataTypeMasseEClass = createEClass(TYPE_DATA_TYPE_MASSE);
		createEAttribute(typeDataTypeMasseEClass, TYPE_DATA_TYPE_MASSE__VALUE);
		createEAttribute(typeDataTypeMasseEClass, TYPE_DATA_TYPE_MASSE__UNITE);

		typeDataTypePressionEClass = createEClass(TYPE_DATA_TYPE_PRESSION);
		createEAttribute(typeDataTypePressionEClass, TYPE_DATA_TYPE_PRESSION__VALUE);
		createEAttribute(typeDataTypePressionEClass, TYPE_DATA_TYPE_PRESSION__UNITE);

		typeDataTypeTauxPrecipitationEClass = createEClass(TYPE_DATA_TYPE_TAUX_PRECIPITATION);
		createEAttribute(typeDataTypeTauxPrecipitationEClass, TYPE_DATA_TYPE_TAUX_PRECIPITATION__VALUE);
		createEAttribute(typeDataTypeTauxPrecipitationEClass, TYPE_DATA_TYPE_TAUX_PRECIPITATION__UNITE);

		typeDataTypeTemperatureEClass = createEClass(TYPE_DATA_TYPE_TEMPERATURE);
		createEAttribute(typeDataTypeTemperatureEClass, TYPE_DATA_TYPE_TEMPERATURE__VALUE);
		createEAttribute(typeDataTypeTemperatureEClass, TYPE_DATA_TYPE_TEMPERATURE__UNITE);

		typeDataTypeVitesseAngulaireEClass = createEClass(TYPE_DATA_TYPE_VITESSE_ANGULAIRE);
		createEAttribute(typeDataTypeVitesseAngulaireEClass, TYPE_DATA_TYPE_VITESSE_ANGULAIRE__VALUE);
		createEAttribute(typeDataTypeVitesseAngulaireEClass, TYPE_DATA_TYPE_VITESSE_ANGULAIRE__UNITE);

		typeDataTypeVitesseAngulaireOrienteeEClass = createEClass(TYPE_DATA_TYPE_VITESSE_ANGULAIRE_ORIENTEE);
		createEAttribute(typeDataTypeVitesseAngulaireOrienteeEClass, TYPE_DATA_TYPE_VITESSE_ANGULAIRE_ORIENTEE__VALUE);
		createEAttribute(typeDataTypeVitesseAngulaireOrienteeEClass, TYPE_DATA_TYPE_VITESSE_ANGULAIRE_ORIENTEE__UNITE);

		typeDataTypeVitesseLineaireEClass = createEClass(TYPE_DATA_TYPE_VITESSE_LINEAIRE);
		createEAttribute(typeDataTypeVitesseLineaireEClass, TYPE_DATA_TYPE_VITESSE_LINEAIRE__VALUE);
		createEAttribute(typeDataTypeVitesseLineaireEClass, TYPE_DATA_TYPE_VITESSE_LINEAIRE__UNITE);

		typeDataTypeVolumeEClass = createEClass(TYPE_DATA_TYPE_VOLUME);
		createEAttribute(typeDataTypeVolumeEClass, TYPE_DATA_TYPE_VOLUME__VALUE);
		createEAttribute(typeDataTypeVolumeEClass, TYPE_DATA_TYPE_VOLUME__UNITE);

		// Create enums
		typeDictionnaryUniteCodeEEnum = createEEnum(TYPE_DICTIONNARY_UNITE_CODE);

		// Create data types
		typeAnneeEDataType = createEDataType(TYPE_ANNEE);
		typeAnneeMoisEDataType = createEDataType(TYPE_ANNEE_MOIS);
		typeAnyURIEDataType = createEDataType(TYPE_ANY_URI);
		typeBooleanEDataType = createEDataType(TYPE_BOOLEAN);
		typeBooleanObjectEDataType = createEDataType(TYPE_BOOLEAN_OBJECT);
		typeDataTypeChaine0100EDataType = createEDataType(TYPE_DATA_TYPE_CHAINE0100);
		typeDataTypeChaine012EDataType = createEDataType(TYPE_DATA_TYPE_CHAINE012);
		typeDataTypeChaine015EDataType = createEDataType(TYPE_DATA_TYPE_CHAINE015);
		typeDataTypeChaine020EDataType = createEDataType(TYPE_DATA_TYPE_CHAINE020);
		typeDataTypeChaine02000EDataType = createEDataType(TYPE_DATA_TYPE_CHAINE02000);
		typeDataTypeChaine0255EDataType = createEDataType(TYPE_DATA_TYPE_CHAINE0255);
		typeDataTypeChaine03EDataType = createEDataType(TYPE_DATA_TYPE_CHAINE03);
		typeDataTypeChaine030EDataType = createEDataType(TYPE_DATA_TYPE_CHAINE030);
		typeDataTypeChaine050EDataType = createEDataType(TYPE_DATA_TYPE_CHAINE050);
		typeDataTypeChaine06EDataType = createEDataType(TYPE_DATA_TYPE_CHAINE06);
		typeDataTypeChaine08EDataType = createEDataType(TYPE_DATA_TYPE_CHAINE08);
		typeDataTypeChaine080EDataType = createEDataType(TYPE_DATA_TYPE_CHAINE080);
		typeDataTypeChaine09EDataType = createEDataType(TYPE_DATA_TYPE_CHAINE09);
		typeDataTypeEntier15EDataType = createEDataType(TYPE_DATA_TYPE_ENTIER15);
		typeDataTypeEntier15ObjectEDataType = createEDataType(TYPE_DATA_TYPE_ENTIER15_OBJECT);
		typeDataTypeEntier3EDataType = createEDataType(TYPE_DATA_TYPE_ENTIER3);
		typeDataTypeEntier3ObjectEDataType = createEDataType(TYPE_DATA_TYPE_ENTIER3_OBJECT);
		typeDataTypeEntier6EDataType = createEDataType(TYPE_DATA_TYPE_ENTIER6);
		typeDataTypeEntier6ObjectEDataType = createEDataType(TYPE_DATA_TYPE_ENTIER6_OBJECT);
		typeDataTypeEntier9EDataType = createEDataType(TYPE_DATA_TYPE_ENTIER9);
		typeDataTypeEntier9ObjectEDataType = createEDataType(TYPE_DATA_TYPE_ENTIER9_OBJECT);
		typeDataTypeFractionEDataType = createEDataType(TYPE_DATA_TYPE_FRACTION);
		typeDataTypeFractionObjectEDataType = createEDataType(TYPE_DATA_TYPE_FRACTION_OBJECT);
		typeDataTypeGDHEDataType = createEDataType(TYPE_DATA_TYPE_GDH);
		typeDataTypeRatioEDataType = createEDataType(TYPE_DATA_TYPE_RATIO);
		typeDataTypeRatioObjectEDataType = createEDataType(TYPE_DATA_TYPE_RATIO_OBJECT);
		typeDateEDataType = createEDataType(TYPE_DATE);
		typeDecimalEDataType = createEDataType(TYPE_DECIMAL);
		typeDictionnaryUniteCodeObjectEDataType = createEDataType(TYPE_DICTIONNARY_UNITE_CODE_OBJECT);
		typeDTGEDataType = createEDataType(TYPE_DTG);
		typeHeureEDataType = createEDataType(TYPE_HEURE);
		typeIntegerEDataType = createEDataType(TYPE_INTEGER);
		typeIntegerObjectEDataType = createEDataType(TYPE_INTEGER_OBJECT);
		typeRealEDataType = createEDataType(TYPE_REAL);
		typeRealObjectEDataType = createEDataType(TYPE_REAL_OBJECT);
		typeReelPositifEDataType = createEDataType(TYPE_REEL_POSITIF);
		typeReelPositifObjectEDataType = createEDataType(TYPE_REEL_POSITIF_OBJECT);
		typeRestrictionAngleEDataType = createEDataType(TYPE_RESTRICTION_ANGLE);
		typeRestrictionAngleObjectEDataType = createEDataType(TYPE_RESTRICTION_ANGLE_OBJECT);
		typeRestrictionAngleSigneEDataType = createEDataType(TYPE_RESTRICTION_ANGLE_SIGNE);
		typeRestrictionAngleSigneObjectEDataType = createEDataType(TYPE_RESTRICTION_ANGLE_SIGNE_OBJECT);
		typeRestrictionLatitudeEDataType = createEDataType(TYPE_RESTRICTION_LATITUDE);
		typeRestrictionLongitudeEDataType = createEDataType(TYPE_RESTRICTION_LONGITUDE);
		typeRestrictionTemperatureEDataType = createEDataType(TYPE_RESTRICTION_TEMPERATURE);
		typeRestrictionTemperatureObjectEDataType = createEDataType(TYPE_RESTRICTION_TEMPERATURE_OBJECT);
		typeStringEDataType = createEDataType(TYPE_STRING);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(typeAssociationEClass, TypeAssociation.class, "TypeAssociation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTypeAssociation_RefCTE(), this.getTypeDataTypeChaine030(), "refCTE", null, 1, 1, TypeAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeAssociationEXTEClass, TypeAssociationEXT.class, "TypeAssociationEXT", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTypeAssociationEXT_RefCTE(), this.getTypeDataTypeChaine030(), "refCTE", null, 0, 1, TypeAssociationEXT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTypeAssociationEXT_RefEXT(), this.getTypeDataTypeChaine030(), "refEXT", null, 0, 1, TypeAssociationEXT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeDataTypeAccelerationAngulaireEClass, TypeDataTypeAccelerationAngulaire.class, "TypeDataTypeAccelerationAngulaire", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTypeDataTypeAccelerationAngulaire_Value(), this.getTypeReelPositif(), "value", null, 0, 1, TypeDataTypeAccelerationAngulaire.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTypeDataTypeAccelerationAngulaire_Unite(), this.getTypeDictionnaryUniteCode(), "unite", "DS-2", 0, 1, TypeDataTypeAccelerationAngulaire.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeDataTypeAccelerationAngulaireOrienteeEClass, TypeDataTypeAccelerationAngulaireOrientee.class, "TypeDataTypeAccelerationAngulaireOrientee", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTypeDataTypeAccelerationAngulaireOrientee_Value(), this.getTypeReal(), "value", null, 0, 1, TypeDataTypeAccelerationAngulaireOrientee.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTypeDataTypeAccelerationAngulaireOrientee_Unite(), this.getTypeDictionnaryUniteCode(), "unite", "DS-2", 0, 1, TypeDataTypeAccelerationAngulaireOrientee.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeDataTypeAccelerationLineaireEClass, TypeDataTypeAccelerationLineaire.class, "TypeDataTypeAccelerationLineaire", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTypeDataTypeAccelerationLineaire_Value(), this.getTypeReelPositif(), "value", null, 0, 1, TypeDataTypeAccelerationLineaire.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTypeDataTypeAccelerationLineaire_Unite(), this.getTypeDictionnaryUniteCode(), "unite", "MS-2", 0, 1, TypeDataTypeAccelerationLineaire.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeDataTypeAireEClass, TypeDataTypeAire.class, "TypeDataTypeAire", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTypeDataTypeAire_Value(), this.getTypeReelPositif(), "value", null, 0, 1, TypeDataTypeAire.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTypeDataTypeAire_Unite(), this.getTypeDictionnaryUniteCode(), "unite", "M2", 0, 1, TypeDataTypeAire.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeDataTypeAltitudePressionEClass, TypeDataTypeAltitudePression.class, "TypeDataTypeAltitudePression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTypeDataTypeAltitudePression_Value(), this.getTypeReal(), "value", null, 0, 1, TypeDataTypeAltitudePression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTypeDataTypeAltitudePression_Unite(), this.getTypeDictionnaryUniteCode(), "unite", "M", 0, 1, TypeDataTypeAltitudePression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeDataTypeAngleEClass, TypeDataTypeAngle.class, "TypeDataTypeAngle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTypeDataTypeAngle_Value(), this.getTypeRestrictionAngle(), "value", null, 0, 1, TypeDataTypeAngle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTypeDataTypeAngle_Unite(), this.getTypeDictionnaryUniteCode(), "unite", "D", 0, 1, TypeDataTypeAngle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeDataTypeAngleSigneEClass, TypeDataTypeAngleSigne.class, "TypeDataTypeAngleSigne", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTypeDataTypeAngleSigne_Value(), this.getTypeRestrictionAngleSigne(), "value", null, 0, 1, TypeDataTypeAngleSigne.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTypeDataTypeAngleSigne_Unite(), this.getTypeDictionnaryUniteCode(), "unite", "D", 0, 1, TypeDataTypeAngleSigne.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeDataTypeChampMagnetiqueEClass, TypeDataTypeChampMagnetique.class, "TypeDataTypeChampMagnetique", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTypeDataTypeChampMagnetique_Value(), this.getTypeReal(), "value", null, 0, 1, TypeDataTypeChampMagnetique.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTypeDataTypeChampMagnetique_Unite(), this.getTypeDictionnaryUniteCode(), "unite", "T", 0, 1, TypeDataTypeChampMagnetique.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeDataTypeCoordonneeAccelerationLineaireEClass, TypeDataTypeCoordonneeAccelerationLineaire.class, "TypeDataTypeCoordonneeAccelerationLineaire", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTypeDataTypeCoordonneeAccelerationLineaire_Value(), this.getTypeReal(), "value", null, 0, 1, TypeDataTypeCoordonneeAccelerationLineaire.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTypeDataTypeCoordonneeAccelerationLineaire_Unite(), this.getTypeDictionnaryUniteCode(), "unite", "MS-2", 0, 1, TypeDataTypeCoordonneeAccelerationLineaire.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeDataTypeCoordonneeForceEClass, TypeDataTypeCoordonneeForce.class, "TypeDataTypeCoordonneeForce", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTypeDataTypeCoordonneeForce_Value(), this.getTypeReal(), "value", null, 0, 1, TypeDataTypeCoordonneeForce.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTypeDataTypeCoordonneeForce_Unite(), this.getTypeDictionnaryUniteCode(), "unite", "N", 0, 1, TypeDataTypeCoordonneeForce.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeDataTypeCoordonneeLineaireEClass, TypeDataTypeCoordonneeLineaire.class, "TypeDataTypeCoordonneeLineaire", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTypeDataTypeCoordonneeLineaire_Value(), this.getTypeReal(), "value", null, 0, 1, TypeDataTypeCoordonneeLineaire.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTypeDataTypeCoordonneeLineaire_Unite(), this.getTypeDictionnaryUniteCode(), "unite", "M", 0, 1, TypeDataTypeCoordonneeLineaire.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeDataTypeCoordonneeVitesseLineaireEClass, TypeDataTypeCoordonneeVitesseLineaire.class, "TypeDataTypeCoordonneeVitesseLineaire", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTypeDataTypeCoordonneeVitesseLineaire_Value(), this.getTypeReal(), "value", null, 0, 1, TypeDataTypeCoordonneeVitesseLineaire.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTypeDataTypeCoordonneeVitesseLineaire_Unite(), this.getTypeDictionnaryUniteCode(), "unite", "MS-1", 0, 1, TypeDataTypeCoordonneeVitesseLineaire.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeDataTypeDateHeureEClass, TypeDataTypeDateHeure.class, "TypeDataTypeDateHeure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTypeDataTypeDateHeure_Annee(), this.getTypeAnnee(), "annee", null, 0, 1, TypeDataTypeDateHeure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTypeDataTypeDateHeure_AnneeMois(), this.getTypeAnneeMois(), "anneeMois", null, 0, 1, TypeDataTypeDateHeure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTypeDataTypeDateHeure_Date(), this.getTypeDate(), "date", null, 0, 1, TypeDataTypeDateHeure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTypeDataTypeDateHeure_Heure(), this.getTypeHeure(), "heure", null, 0, 1, TypeDataTypeDateHeure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTypeDataTypeDateHeure_DateHeure(), this.getTypeDTG(), "dateHeure", null, 0, 1, TypeDataTypeDateHeure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeDataTypeDebitMassiqueEClass, TypeDataTypeDebitMassique.class, "TypeDataTypeDebitMassique", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTypeDataTypeDebitMassique_Value(), this.getTypeReelPositif(), "value", null, 0, 1, TypeDataTypeDebitMassique.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTypeDataTypeDebitMassique_Unite(), this.getTypeDictionnaryUniteCode(), "unite", "KS-1", 0, 1, TypeDataTypeDebitMassique.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeDataTypeDebitTransmissionEClass, TypeDataTypeDebitTransmission.class, "TypeDataTypeDebitTransmission", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTypeDataTypeDebitTransmission_Value(), this.getTypeReelPositif(), "value", null, 0, 1, TypeDataTypeDebitTransmission.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTypeDataTypeDebitTransmission_Unite(), this.getTypeDictionnaryUniteCode(), "unite", "BS-1", 0, 1, TypeDataTypeDebitTransmission.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeDataTypeDebitVolumiqueEClass, TypeDataTypeDebitVolumique.class, "TypeDataTypeDebitVolumique", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTypeDataTypeDebitVolumique_Value(), this.getTypeReelPositif(), "value", null, 0, 1, TypeDataTypeDebitVolumique.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTypeDataTypeDebitVolumique_Unite(), this.getTypeDictionnaryUniteCode(), "unite", "M3S-1", 0, 1, TypeDataTypeDebitVolumique.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeDataTypeDoseAbsorbeeEClass, TypeDataTypeDoseAbsorbee.class, "TypeDataTypeDoseAbsorbee", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTypeDataTypeDoseAbsorbee_Value(), this.getTypeReelPositif(), "value", null, 0, 1, TypeDataTypeDoseAbsorbee.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTypeDataTypeDoseAbsorbee_Unite(), this.getTypeDictionnaryUniteCode(), "unite", "G", 0, 1, TypeDataTypeDoseAbsorbee.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeDataTypeDureeEClass, TypeDataTypeDuree.class, "TypeDataTypeDuree", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTypeDataTypeDuree_Value(), this.getTypeReelPositif(), "value", null, 0, 1, TypeDataTypeDuree.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTypeDataTypeDuree_Unite(), this.getTypeDictionnaryUniteCode(), "unite", "S", 0, 1, TypeDataTypeDuree.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeDataTypeForceEClass, TypeDataTypeForce.class, "TypeDataTypeForce", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTypeDataTypeForce_Value(), this.getTypeReelPositif(), "value", null, 0, 1, TypeDataTypeForce.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTypeDataTypeForce_Unite(), this.getTypeDictionnaryUniteCode(), "unite", "N", 0, 1, TypeDataTypeForce.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeDataTypeFrequenceEClass, TypeDataTypeFrequence.class, "TypeDataTypeFrequence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTypeDataTypeFrequence_Value(), this.getTypeReelPositif(), "value", null, 0, 1, TypeDataTypeFrequence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTypeDataTypeFrequence_Unite(), this.getTypeDictionnaryUniteCode(), "unite", "H", 0, 1, TypeDataTypeFrequence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeDataTypeLatitudeEClass, TypeDataTypeLatitude.class, "TypeDataTypeLatitude", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTypeDataTypeLatitude_Value(), this.getTypeRestrictionLatitude(), "value", null, 0, 1, TypeDataTypeLatitude.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTypeDataTypeLatitude_Unite(), this.getTypeDictionnaryUniteCode(), "unite", "D", 0, 1, TypeDataTypeLatitude.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeDataTypeLongitudeEClass, TypeDataTypeLongitude.class, "TypeDataTypeLongitude", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTypeDataTypeLongitude_Value(), this.getTypeRestrictionLongitude(), "value", null, 0, 1, TypeDataTypeLongitude.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTypeDataTypeLongitude_Unite(), this.getTypeDictionnaryUniteCode(), "unite", "D", 0, 1, TypeDataTypeLongitude.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeDataTypeLongueurEClass, TypeDataTypeLongueur.class, "TypeDataTypeLongueur", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTypeDataTypeLongueur_Value(), this.getTypeReelPositif(), "value", null, 0, 1, TypeDataTypeLongueur.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTypeDataTypeLongueur_Unite(), this.getTypeDictionnaryUniteCode(), "unite", "M", 0, 1, TypeDataTypeLongueur.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeDataTypeMasseEClass, TypeDataTypeMasse.class, "TypeDataTypeMasse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTypeDataTypeMasse_Value(), this.getTypeReelPositif(), "value", null, 0, 1, TypeDataTypeMasse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTypeDataTypeMasse_Unite(), this.getTypeDictionnaryUniteCode(), "unite", "K", 0, 1, TypeDataTypeMasse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeDataTypePressionEClass, TypeDataTypePression.class, "TypeDataTypePression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTypeDataTypePression_Value(), this.getTypeReelPositif(), "value", null, 0, 1, TypeDataTypePression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTypeDataTypePression_Unite(), this.getTypeDictionnaryUniteCode(), "unite", "P", 0, 1, TypeDataTypePression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeDataTypeTauxPrecipitationEClass, TypeDataTypeTauxPrecipitation.class, "TypeDataTypeTauxPrecipitation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTypeDataTypeTauxPrecipitation_Value(), this.getTypeReelPositif(), "value", null, 0, 1, TypeDataTypeTauxPrecipitation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTypeDataTypeTauxPrecipitation_Unite(), this.getTypeDictionnaryUniteCode(), "unite", "MIH-1", 0, 1, TypeDataTypeTauxPrecipitation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeDataTypeTemperatureEClass, TypeDataTypeTemperature.class, "TypeDataTypeTemperature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTypeDataTypeTemperature_Value(), this.getTypeRestrictionTemperature(), "value", null, 0, 1, TypeDataTypeTemperature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTypeDataTypeTemperature_Unite(), this.getTypeDictionnaryUniteCode(), "unite", "C", 0, 1, TypeDataTypeTemperature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeDataTypeVitesseAngulaireEClass, TypeDataTypeVitesseAngulaire.class, "TypeDataTypeVitesseAngulaire", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTypeDataTypeVitesseAngulaire_Value(), this.getTypeReelPositif(), "value", null, 0, 1, TypeDataTypeVitesseAngulaire.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTypeDataTypeVitesseAngulaire_Unite(), this.getTypeDictionnaryUniteCode(), "unite", "DS-1", 0, 1, TypeDataTypeVitesseAngulaire.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeDataTypeVitesseAngulaireOrienteeEClass, TypeDataTypeVitesseAngulaireOrientee.class, "TypeDataTypeVitesseAngulaireOrientee", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTypeDataTypeVitesseAngulaireOrientee_Value(), this.getTypeReal(), "value", null, 0, 1, TypeDataTypeVitesseAngulaireOrientee.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTypeDataTypeVitesseAngulaireOrientee_Unite(), this.getTypeDictionnaryUniteCode(), "unite", "DS-1", 0, 1, TypeDataTypeVitesseAngulaireOrientee.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeDataTypeVitesseLineaireEClass, TypeDataTypeVitesseLineaire.class, "TypeDataTypeVitesseLineaire", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTypeDataTypeVitesseLineaire_Value(), this.getTypeReelPositif(), "value", null, 0, 1, TypeDataTypeVitesseLineaire.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTypeDataTypeVitesseLineaire_Unite(), this.getTypeDictionnaryUniteCode(), "unite", "MS-1", 0, 1, TypeDataTypeVitesseLineaire.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeDataTypeVolumeEClass, TypeDataTypeVolume.class, "TypeDataTypeVolume", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTypeDataTypeVolume_Value(), this.getTypeReelPositif(), "value", null, 0, 1, TypeDataTypeVolume.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTypeDataTypeVolume_Unite(), this.getTypeDictionnaryUniteCode(), "unite", "M3", 0, 1, TypeDataTypeVolume.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(typeDictionnaryUniteCodeEEnum, TypeDictionnaryUniteCode.class, "TypeDictionnaryUniteCode");
		addEEnumLiteral(typeDictionnaryUniteCodeEEnum, TypeDictionnaryUniteCode.SU);
		addEEnumLiteral(typeDictionnaryUniteCodeEEnum, TypeDictionnaryUniteCode.M);
		addEEnumLiteral(typeDictionnaryUniteCodeEEnum, TypeDictionnaryUniteCode.M2);
		addEEnumLiteral(typeDictionnaryUniteCodeEEnum, TypeDictionnaryUniteCode.M3);
		addEEnumLiteral(typeDictionnaryUniteCodeEEnum, TypeDictionnaryUniteCode.MS1);
		addEEnumLiteral(typeDictionnaryUniteCodeEEnum, TypeDictionnaryUniteCode.MS2);
		addEEnumLiteral(typeDictionnaryUniteCodeEEnum, TypeDictionnaryUniteCode.M3S1);
		addEEnumLiteral(typeDictionnaryUniteCodeEEnum, TypeDictionnaryUniteCode.K);
		addEEnumLiteral(typeDictionnaryUniteCodeEEnum, TypeDictionnaryUniteCode.KS1);
		addEEnumLiteral(typeDictionnaryUniteCodeEEnum, TypeDictionnaryUniteCode.PI);
		addEEnumLiteral(typeDictionnaryUniteCodeEEnum, TypeDictionnaryUniteCode.S);
		addEEnumLiteral(typeDictionnaryUniteCodeEEnum, TypeDictionnaryUniteCode.C);
		addEEnumLiteral(typeDictionnaryUniteCodeEEnum, TypeDictionnaryUniteCode.D);
		addEEnumLiteral(typeDictionnaryUniteCodeEEnum, TypeDictionnaryUniteCode.DS1);
		addEEnumLiteral(typeDictionnaryUniteCodeEEnum, TypeDictionnaryUniteCode.DS2);
		addEEnumLiteral(typeDictionnaryUniteCodeEEnum, TypeDictionnaryUniteCode.N);
		addEEnumLiteral(typeDictionnaryUniteCodeEEnum, TypeDictionnaryUniteCode.H);
		addEEnumLiteral(typeDictionnaryUniteCodeEEnum, TypeDictionnaryUniteCode.P);
		addEEnumLiteral(typeDictionnaryUniteCodeEEnum, TypeDictionnaryUniteCode.BS1);
		addEEnumLiteral(typeDictionnaryUniteCodeEEnum, TypeDictionnaryUniteCode.MIH1);
		addEEnumLiteral(typeDictionnaryUniteCodeEEnum, TypeDictionnaryUniteCode.T);
		addEEnumLiteral(typeDictionnaryUniteCodeEEnum, TypeDictionnaryUniteCode.G);

		// Initialize data types
		initEDataType(typeAnneeEDataType, XMLGregorianCalendar.class, "TypeAnnee", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(typeAnneeMoisEDataType, XMLGregorianCalendar.class, "TypeAnneeMois", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(typeAnyURIEDataType, String.class, "TypeAnyURI", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(typeBooleanEDataType, boolean.class, "TypeBoolean", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(typeBooleanObjectEDataType, Boolean.class, "TypeBooleanObject", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(typeDataTypeChaine0100EDataType, String.class, "TypeDataTypeChaine0100", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(typeDataTypeChaine012EDataType, String.class, "TypeDataTypeChaine012", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(typeDataTypeChaine015EDataType, String.class, "TypeDataTypeChaine015", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(typeDataTypeChaine020EDataType, String.class, "TypeDataTypeChaine020", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(typeDataTypeChaine02000EDataType, String.class, "TypeDataTypeChaine02000", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(typeDataTypeChaine0255EDataType, String.class, "TypeDataTypeChaine0255", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(typeDataTypeChaine03EDataType, String.class, "TypeDataTypeChaine03", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(typeDataTypeChaine030EDataType, String.class, "TypeDataTypeChaine030", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(typeDataTypeChaine050EDataType, String.class, "TypeDataTypeChaine050", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(typeDataTypeChaine06EDataType, String.class, "TypeDataTypeChaine06", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(typeDataTypeChaine08EDataType, String.class, "TypeDataTypeChaine08", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(typeDataTypeChaine080EDataType, String.class, "TypeDataTypeChaine080", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(typeDataTypeChaine09EDataType, String.class, "TypeDataTypeChaine09", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(typeDataTypeEntier15EDataType, long.class, "TypeDataTypeEntier15", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(typeDataTypeEntier15ObjectEDataType, Long.class, "TypeDataTypeEntier15Object", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(typeDataTypeEntier3EDataType, long.class, "TypeDataTypeEntier3", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(typeDataTypeEntier3ObjectEDataType, Long.class, "TypeDataTypeEntier3Object", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(typeDataTypeEntier6EDataType, long.class, "TypeDataTypeEntier6", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(typeDataTypeEntier6ObjectEDataType, Long.class, "TypeDataTypeEntier6Object", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(typeDataTypeEntier9EDataType, long.class, "TypeDataTypeEntier9", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(typeDataTypeEntier9ObjectEDataType, Long.class, "TypeDataTypeEntier9Object", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(typeDataTypeFractionEDataType, double.class, "TypeDataTypeFraction", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(typeDataTypeFractionObjectEDataType, Double.class, "TypeDataTypeFractionObject", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(typeDataTypeGDHEDataType, XMLGregorianCalendar.class, "TypeDataTypeGDH", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(typeDataTypeRatioEDataType, double.class, "TypeDataTypeRatio", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(typeDataTypeRatioObjectEDataType, Double.class, "TypeDataTypeRatioObject", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(typeDateEDataType, XMLGregorianCalendar.class, "TypeDate", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(typeDecimalEDataType, BigDecimal.class, "TypeDecimal", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(typeDictionnaryUniteCodeObjectEDataType, TypeDictionnaryUniteCode.class, "TypeDictionnaryUniteCodeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(typeDTGEDataType, XMLGregorianCalendar.class, "TypeDTG", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(typeHeureEDataType, XMLGregorianCalendar.class, "TypeHeure", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(typeIntegerEDataType, long.class, "TypeInteger", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(typeIntegerObjectEDataType, Long.class, "TypeIntegerObject", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(typeRealEDataType, double.class, "TypeReal", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(typeRealObjectEDataType, Double.class, "TypeRealObject", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(typeReelPositifEDataType, double.class, "TypeReelPositif", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(typeReelPositifObjectEDataType, Double.class, "TypeReelPositifObject", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(typeRestrictionAngleEDataType, double.class, "TypeRestrictionAngle", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(typeRestrictionAngleObjectEDataType, Double.class, "TypeRestrictionAngleObject", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(typeRestrictionAngleSigneEDataType, double.class, "TypeRestrictionAngleSigne", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(typeRestrictionAngleSigneObjectEDataType, Double.class, "TypeRestrictionAngleSigneObject", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(typeRestrictionLatitudeEDataType, BigDecimal.class, "TypeRestrictionLatitude", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(typeRestrictionLongitudeEDataType, BigDecimal.class, "TypeRestrictionLongitude", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(typeRestrictionTemperatureEDataType, double.class, "TypeRestrictionTemperature", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(typeRestrictionTemperatureObjectEDataType, Double.class, "TypeRestrictionTemperatureObject", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(typeStringEDataType, String.class, "TypeString", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";		
		addAnnotation
		  (typeAnneeEDataType, 
		   source, 
		   new String[] {
			 "name", "typeAnnee",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#gYear"
		   });		
		addAnnotation
		  (typeAnneeMoisEDataType, 
		   source, 
		   new String[] {
			 "name", "typeAnneeMois",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#gYearMonth"
		   });		
		addAnnotation
		  (typeAnyURIEDataType, 
		   source, 
		   new String[] {
			 "name", "typeAnyURI",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#anyURI"
		   });		
		addAnnotation
		  (typeAssociationEClass, 
		   source, 
		   new String[] {
			 "name", "typeAssociation",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getTypeAssociation_RefCTE(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "refCTE"
		   });		
		addAnnotation
		  (typeAssociationEXTEClass, 
		   source, 
		   new String[] {
			 "name", "typeAssociationEXT",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getTypeAssociationEXT_RefCTE(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "refCTE"
		   });		
		addAnnotation
		  (getTypeAssociationEXT_RefEXT(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "refEXT"
		   });		
		addAnnotation
		  (typeBooleanEDataType, 
		   source, 
		   new String[] {
			 "name", "typeBoolean",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#boolean"
		   });		
		addAnnotation
		  (typeBooleanObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "typeBoolean:Object",
			 "baseType", "typeBoolean"
		   });		
		addAnnotation
		  (typeDataTypeAccelerationAngulaireEClass, 
		   source, 
		   new String[] {
			 "name", "typeDataTypeAccelerationAngulaire",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getTypeDataTypeAccelerationAngulaire_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getTypeDataTypeAccelerationAngulaire_Unite(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Unite"
		   });		
		addAnnotation
		  (typeDataTypeAccelerationAngulaireOrienteeEClass, 
		   source, 
		   new String[] {
			 "name", "typeDataTypeAccelerationAngulaireOrientee",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getTypeDataTypeAccelerationAngulaireOrientee_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getTypeDataTypeAccelerationAngulaireOrientee_Unite(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Unite"
		   });		
		addAnnotation
		  (typeDataTypeAccelerationLineaireEClass, 
		   source, 
		   new String[] {
			 "name", "typeDataTypeAccelerationLineaire",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getTypeDataTypeAccelerationLineaire_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getTypeDataTypeAccelerationLineaire_Unite(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Unite"
		   });		
		addAnnotation
		  (typeDataTypeAireEClass, 
		   source, 
		   new String[] {
			 "name", "typeDataTypeAire",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getTypeDataTypeAire_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getTypeDataTypeAire_Unite(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Unite"
		   });		
		addAnnotation
		  (typeDataTypeAltitudePressionEClass, 
		   source, 
		   new String[] {
			 "name", "typeDataTypeAltitudePression",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getTypeDataTypeAltitudePression_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getTypeDataTypeAltitudePression_Unite(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Unite"
		   });		
		addAnnotation
		  (typeDataTypeAngleEClass, 
		   source, 
		   new String[] {
			 "name", "typeDataTypeAngle",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getTypeDataTypeAngle_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getTypeDataTypeAngle_Unite(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Unite"
		   });		
		addAnnotation
		  (typeDataTypeAngleSigneEClass, 
		   source, 
		   new String[] {
			 "name", "typeDataTypeAngleSigne",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getTypeDataTypeAngleSigne_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getTypeDataTypeAngleSigne_Unite(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Unite"
		   });		
		addAnnotation
		  (typeDataTypeChaine0100EDataType, 
		   source, 
		   new String[] {
			 "name", "typeDataTypeChaine0100",
			 "baseType", "typeString",
			 "minLength", "1",
			 "maxLength", "100"
		   });		
		addAnnotation
		  (typeDataTypeChaine012EDataType, 
		   source, 
		   new String[] {
			 "name", "typeDataTypeChaine012",
			 "baseType", "typeString",
			 "minLength", "1",
			 "maxLength", "12"
		   });		
		addAnnotation
		  (typeDataTypeChaine015EDataType, 
		   source, 
		   new String[] {
			 "name", "typeDataTypeChaine015",
			 "baseType", "typeString",
			 "minLength", "1",
			 "maxLength", "15"
		   });		
		addAnnotation
		  (typeDataTypeChaine020EDataType, 
		   source, 
		   new String[] {
			 "name", "typeDataTypeChaine020",
			 "baseType", "typeString",
			 "minLength", "1",
			 "maxLength", "20"
		   });		
		addAnnotation
		  (typeDataTypeChaine02000EDataType, 
		   source, 
		   new String[] {
			 "name", "typeDataTypeChaine02000",
			 "baseType", "typeString",
			 "minLength", "1",
			 "maxLength", "2000"
		   });		
		addAnnotation
		  (typeDataTypeChaine0255EDataType, 
		   source, 
		   new String[] {
			 "name", "typeDataTypeChaine0255",
			 "baseType", "typeString",
			 "minLength", "1",
			 "maxLength", "255"
		   });		
		addAnnotation
		  (typeDataTypeChaine03EDataType, 
		   source, 
		   new String[] {
			 "name", "typeDataTypeChaine03",
			 "baseType", "typeString",
			 "minLength", "1",
			 "maxLength", "3"
		   });		
		addAnnotation
		  (typeDataTypeChaine030EDataType, 
		   source, 
		   new String[] {
			 "name", "typeDataTypeChaine030",
			 "baseType", "typeString",
			 "minLength", "1",
			 "maxLength", "30"
		   });		
		addAnnotation
		  (typeDataTypeChaine050EDataType, 
		   source, 
		   new String[] {
			 "name", "typeDataTypeChaine050",
			 "baseType", "typeString",
			 "minLength", "1",
			 "maxLength", "50"
		   });		
		addAnnotation
		  (typeDataTypeChaine06EDataType, 
		   source, 
		   new String[] {
			 "name", "typeDataTypeChaine06",
			 "baseType", "typeString",
			 "minLength", "1",
			 "maxLength", "6"
		   });		
		addAnnotation
		  (typeDataTypeChaine08EDataType, 
		   source, 
		   new String[] {
			 "name", "typeDataTypeChaine08",
			 "baseType", "typeString",
			 "minLength", "1",
			 "maxLength", "8"
		   });		
		addAnnotation
		  (typeDataTypeChaine080EDataType, 
		   source, 
		   new String[] {
			 "name", "typeDataTypeChaine080",
			 "baseType", "typeString",
			 "minLength", "1",
			 "maxLength", "80"
		   });		
		addAnnotation
		  (typeDataTypeChaine09EDataType, 
		   source, 
		   new String[] {
			 "name", "typeDataTypeChaine09",
			 "baseType", "typeString",
			 "minLength", "1",
			 "maxLength", "9"
		   });		
		addAnnotation
		  (typeDataTypeChampMagnetiqueEClass, 
		   source, 
		   new String[] {
			 "name", "typeDataTypeChampMagnetique",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getTypeDataTypeChampMagnetique_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getTypeDataTypeChampMagnetique_Unite(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Unite"
		   });		
		addAnnotation
		  (typeDataTypeCoordonneeAccelerationLineaireEClass, 
		   source, 
		   new String[] {
			 "name", "typeDataTypeCoordonneeAccelerationLineaire",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getTypeDataTypeCoordonneeAccelerationLineaire_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getTypeDataTypeCoordonneeAccelerationLineaire_Unite(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Unite"
		   });		
		addAnnotation
		  (typeDataTypeCoordonneeForceEClass, 
		   source, 
		   new String[] {
			 "name", "typeDataTypeCoordonneeForce",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getTypeDataTypeCoordonneeForce_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getTypeDataTypeCoordonneeForce_Unite(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Unite"
		   });		
		addAnnotation
		  (typeDataTypeCoordonneeLineaireEClass, 
		   source, 
		   new String[] {
			 "name", "typeDataTypeCoordonneeLineaire",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getTypeDataTypeCoordonneeLineaire_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getTypeDataTypeCoordonneeLineaire_Unite(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Unite"
		   });		
		addAnnotation
		  (typeDataTypeCoordonneeVitesseLineaireEClass, 
		   source, 
		   new String[] {
			 "name", "typeDataTypeCoordonneeVitesseLineaire",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getTypeDataTypeCoordonneeVitesseLineaire_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getTypeDataTypeCoordonneeVitesseLineaire_Unite(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Unite"
		   });		
		addAnnotation
		  (typeDataTypeDateHeureEClass, 
		   source, 
		   new String[] {
			 "name", "typeDataTypeDateHeure",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getTypeDataTypeDateHeure_Annee(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "annee"
		   });		
		addAnnotation
		  (getTypeDataTypeDateHeure_AnneeMois(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "anneeMois"
		   });		
		addAnnotation
		  (getTypeDataTypeDateHeure_Date(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "date"
		   });		
		addAnnotation
		  (getTypeDataTypeDateHeure_Heure(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "heure"
		   });		
		addAnnotation
		  (getTypeDataTypeDateHeure_DateHeure(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "dateHeure"
		   });		
		addAnnotation
		  (typeDataTypeDebitMassiqueEClass, 
		   source, 
		   new String[] {
			 "name", "typeDataTypeDebitMassique",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getTypeDataTypeDebitMassique_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getTypeDataTypeDebitMassique_Unite(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Unite"
		   });		
		addAnnotation
		  (typeDataTypeDebitTransmissionEClass, 
		   source, 
		   new String[] {
			 "name", "typeDataTypeDebitTransmission",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getTypeDataTypeDebitTransmission_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getTypeDataTypeDebitTransmission_Unite(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Unite"
		   });		
		addAnnotation
		  (typeDataTypeDebitVolumiqueEClass, 
		   source, 
		   new String[] {
			 "name", "typeDataTypeDebitVolumique",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getTypeDataTypeDebitVolumique_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getTypeDataTypeDebitVolumique_Unite(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Unite"
		   });		
		addAnnotation
		  (typeDataTypeDoseAbsorbeeEClass, 
		   source, 
		   new String[] {
			 "name", "typeDataTypeDoseAbsorbee",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getTypeDataTypeDoseAbsorbee_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getTypeDataTypeDoseAbsorbee_Unite(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Unite"
		   });		
		addAnnotation
		  (typeDataTypeDureeEClass, 
		   source, 
		   new String[] {
			 "name", "typeDataTypeDuree",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getTypeDataTypeDuree_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getTypeDataTypeDuree_Unite(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Unite"
		   });		
		addAnnotation
		  (typeDataTypeEntier15EDataType, 
		   source, 
		   new String[] {
			 "name", "typeDataTypeEntier15",
			 "baseType", "typeInteger",
			 "totalDigits", "15",
			 "minInclusive", "0",
			 "maxInclusive", "999999999999999"
		   });		
		addAnnotation
		  (typeDataTypeEntier15ObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "typeDataTypeEntier15:Object",
			 "baseType", "typeDataTypeEntier15"
		   });		
		addAnnotation
		  (typeDataTypeEntier3EDataType, 
		   source, 
		   new String[] {
			 "name", "typeDataTypeEntier3",
			 "baseType", "typeInteger",
			 "totalDigits", "3",
			 "minInclusive", "0",
			 "maxInclusive", "999"
		   });		
		addAnnotation
		  (typeDataTypeEntier3ObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "typeDataTypeEntier3:Object",
			 "baseType", "typeDataTypeEntier3"
		   });		
		addAnnotation
		  (typeDataTypeEntier6EDataType, 
		   source, 
		   new String[] {
			 "name", "typeDataTypeEntier6",
			 "baseType", "typeInteger",
			 "totalDigits", "6",
			 "minInclusive", "0",
			 "maxInclusive", "999999"
		   });		
		addAnnotation
		  (typeDataTypeEntier6ObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "typeDataTypeEntier6:Object",
			 "baseType", "typeDataTypeEntier6"
		   });		
		addAnnotation
		  (typeDataTypeEntier9EDataType, 
		   source, 
		   new String[] {
			 "name", "typeDataTypeEntier9",
			 "baseType", "typeInteger",
			 "totalDigits", "9",
			 "minInclusive", "0",
			 "maxInclusive", "999999999"
		   });		
		addAnnotation
		  (typeDataTypeEntier9ObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "typeDataTypeEntier9:Object",
			 "baseType", "typeDataTypeEntier9"
		   });		
		addAnnotation
		  (typeDataTypeForceEClass, 
		   source, 
		   new String[] {
			 "name", "typeDataTypeForce",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getTypeDataTypeForce_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getTypeDataTypeForce_Unite(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Unite"
		   });		
		addAnnotation
		  (typeDataTypeFractionEDataType, 
		   source, 
		   new String[] {
			 "name", "typeDataTypeFraction",
			 "baseType", "typeReal",
			 "minInclusive", "0",
			 "maxInclusive", "1"
		   });		
		addAnnotation
		  (typeDataTypeFractionObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "typeDataTypeFraction:Object",
			 "baseType", "typeDataTypeFraction"
		   });		
		addAnnotation
		  (typeDataTypeFrequenceEClass, 
		   source, 
		   new String[] {
			 "name", "typeDataTypeFrequence",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getTypeDataTypeFrequence_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getTypeDataTypeFrequence_Unite(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Unite"
		   });		
		addAnnotation
		  (typeDataTypeGDHEDataType, 
		   source, 
		   new String[] {
			 "name", "typeDataTypeGDH",
			 "baseType", "typeDTG",
			 "minInclusive", "1901-01-01T00:00:00",
			 "maxInclusive", "2036-12-31T23:59:59"
		   });		
		addAnnotation
		  (typeDataTypeLatitudeEClass, 
		   source, 
		   new String[] {
			 "name", "typeDataTypeLatitude",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getTypeDataTypeLatitude_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getTypeDataTypeLatitude_Unite(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Unite"
		   });		
		addAnnotation
		  (typeDataTypeLongitudeEClass, 
		   source, 
		   new String[] {
			 "name", "typeDataTypeLongitude",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getTypeDataTypeLongitude_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getTypeDataTypeLongitude_Unite(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Unite"
		   });		
		addAnnotation
		  (typeDataTypeLongueurEClass, 
		   source, 
		   new String[] {
			 "name", "typeDataTypeLongueur",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getTypeDataTypeLongueur_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getTypeDataTypeLongueur_Unite(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Unite"
		   });		
		addAnnotation
		  (typeDataTypeMasseEClass, 
		   source, 
		   new String[] {
			 "name", "typeDataTypeMasse",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getTypeDataTypeMasse_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getTypeDataTypeMasse_Unite(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Unite"
		   });		
		addAnnotation
		  (typeDataTypePressionEClass, 
		   source, 
		   new String[] {
			 "name", "typeDataTypePression",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getTypeDataTypePression_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getTypeDataTypePression_Unite(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Unite"
		   });		
		addAnnotation
		  (typeDataTypeRatioEDataType, 
		   source, 
		   new String[] {
			 "name", "typeDataTypeRatio",
			 "baseType", "typeReal",
			 "minInclusive", "0"
		   });		
		addAnnotation
		  (typeDataTypeRatioObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "typeDataTypeRatio:Object",
			 "baseType", "typeDataTypeRatio"
		   });		
		addAnnotation
		  (typeDataTypeTauxPrecipitationEClass, 
		   source, 
		   new String[] {
			 "name", "typeDataTypeTauxPrecipitation",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getTypeDataTypeTauxPrecipitation_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getTypeDataTypeTauxPrecipitation_Unite(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Unite"
		   });		
		addAnnotation
		  (typeDataTypeTemperatureEClass, 
		   source, 
		   new String[] {
			 "name", "typeDataTypeTemperature",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getTypeDataTypeTemperature_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getTypeDataTypeTemperature_Unite(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Unite"
		   });		
		addAnnotation
		  (typeDataTypeVitesseAngulaireEClass, 
		   source, 
		   new String[] {
			 "name", "typeDataTypeVitesseAngulaire",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getTypeDataTypeVitesseAngulaire_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getTypeDataTypeVitesseAngulaire_Unite(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Unite"
		   });		
		addAnnotation
		  (typeDataTypeVitesseAngulaireOrienteeEClass, 
		   source, 
		   new String[] {
			 "name", "typeDataTypeVitesseAngulaireOrientee",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getTypeDataTypeVitesseAngulaireOrientee_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getTypeDataTypeVitesseAngulaireOrientee_Unite(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Unite"
		   });		
		addAnnotation
		  (typeDataTypeVitesseLineaireEClass, 
		   source, 
		   new String[] {
			 "name", "typeDataTypeVitesseLineaire",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getTypeDataTypeVitesseLineaire_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getTypeDataTypeVitesseLineaire_Unite(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Unite"
		   });		
		addAnnotation
		  (typeDataTypeVolumeEClass, 
		   source, 
		   new String[] {
			 "name", "typeDataTypeVolume",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getTypeDataTypeVolume_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getTypeDataTypeVolume_Unite(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Unite"
		   });		
		addAnnotation
		  (typeDateEDataType, 
		   source, 
		   new String[] {
			 "name", "typeDate",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#date"
		   });		
		addAnnotation
		  (typeDecimalEDataType, 
		   source, 
		   new String[] {
			 "name", "typeDecimal",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#decimal"
		   });		
		addAnnotation
		  (typeDictionnaryUniteCodeEEnum, 
		   source, 
		   new String[] {
			 "name", "typeDictionnaryUniteCode"
		   });		
		addAnnotation
		  (typeDictionnaryUniteCodeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "typeDictionnaryUniteCode:Object",
			 "baseType", "typeDictionnaryUniteCode"
		   });		
		addAnnotation
		  (typeDTGEDataType, 
		   source, 
		   new String[] {
			 "name", "typeDTG",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#dateTime"
		   });		
		addAnnotation
		  (typeHeureEDataType, 
		   source, 
		   new String[] {
			 "name", "typeHeure",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#time"
		   });		
		addAnnotation
		  (typeIntegerEDataType, 
		   source, 
		   new String[] {
			 "name", "typeInteger",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#long"
		   });		
		addAnnotation
		  (typeIntegerObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "typeInteger:Object",
			 "baseType", "typeInteger"
		   });		
		addAnnotation
		  (typeRealEDataType, 
		   source, 
		   new String[] {
			 "name", "typeReal",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#double"
		   });		
		addAnnotation
		  (typeRealObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "typeReal:Object",
			 "baseType", "typeReal"
		   });		
		addAnnotation
		  (typeReelPositifEDataType, 
		   source, 
		   new String[] {
			 "name", "typeReelPositif",
			 "baseType", "typeReal",
			 "minInclusive", "0"
		   });		
		addAnnotation
		  (typeReelPositifObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "typeReelPositif:Object",
			 "baseType", "typeReelPositif"
		   });		
		addAnnotation
		  (typeRestrictionAngleEDataType, 
		   source, 
		   new String[] {
			 "name", "typeRestrictionAngle",
			 "baseType", "typeReelPositif",
			 "maxExclusive", "360"
		   });		
		addAnnotation
		  (typeRestrictionAngleObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "typeRestrictionAngle:Object",
			 "baseType", "typeRestrictionAngle"
		   });		
		addAnnotation
		  (typeRestrictionAngleSigneEDataType, 
		   source, 
		   new String[] {
			 "name", "typeRestrictionAngleSigne",
			 "baseType", "typeReal",
			 "minExclusive", "-180",
			 "maxInclusive", "180"
		   });		
		addAnnotation
		  (typeRestrictionAngleSigneObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "typeRestrictionAngleSigne:Object",
			 "baseType", "typeRestrictionAngleSigne"
		   });		
		addAnnotation
		  (typeRestrictionLatitudeEDataType, 
		   source, 
		   new String[] {
			 "name", "typeRestrictionLatitude",
			 "baseType", "typeDecimal",
			 "minInclusive", "-90",
			 "maxInclusive", "90"
		   });		
		addAnnotation
		  (typeRestrictionLongitudeEDataType, 
		   source, 
		   new String[] {
			 "name", "typeRestrictionLongitude",
			 "baseType", "typeDecimal",
			 "minExclusive", "-180",
			 "maxInclusive", "180"
		   });		
		addAnnotation
		  (typeRestrictionTemperatureEDataType, 
		   source, 
		   new String[] {
			 "name", "typeRestrictionTemperature",
			 "baseType", "typeReal",
			 "minInclusive", "-273.15"
		   });		
		addAnnotation
		  (typeRestrictionTemperatureObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "typeRestrictionTemperature:Object",
			 "baseType", "typeRestrictionTemperature"
		   });		
		addAnnotation
		  (typeStringEDataType, 
		   source, 
		   new String[] {
			 "name", "typeString",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#string"
		   });
	}

} //MetaPackageImpl
