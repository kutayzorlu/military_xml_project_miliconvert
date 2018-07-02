/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeAssociation;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Consigne</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeConsigne#getCode <em>Code</em>}</li>
 *   <li>{@link mpia.schema.TypeConsigne#getEtatDemandeVolume <em>Etat Demande Volume</em>}</li>
 *   <li>{@link mpia.schema.TypeConsigne#getNumeroDansPhase <em>Numero Dans Phase</em>}</li>
 *   <li>{@link mpia.schema.TypeConsigne#getACommeConsigneGeographiqueConsigneGeographique <em>AComme Consigne Geographique Consigne Geographique</em>}</li>
 *   <li>{@link mpia.schema.TypeConsigne#getEstLocaliseParAssocConsigneLocalisation <em>Est Localise Par Assoc Consigne Localisation</em>}</li>
 *   <li>{@link mpia.schema.TypeConsigne#getACommeChargementChargement <em>AComme Chargement Chargement</em>}</li>
 *   <li>{@link mpia.schema.TypeConsigne#getACommePeriodeActivationPeriode <em>AComme Periode Activation Periode</em>}</li>
 *   <li>{@link mpia.schema.TypeConsigne#getACommeModaliteApplicationModalite <em>AComme Modalite Application Modalite</em>}</li>
 *   <li>{@link mpia.schema.TypeConsigne#getACommeMesureCoordination3DMesureCoordination <em>AComme Mesure Coordination3 DMesure Coordination</em>}</li>
 *   <li>{@link mpia.schema.TypeConsigne#getACommePointEntreePointControle3D <em>AComme Point Entree Point Controle3 D</em>}</li>
 *   <li>{@link mpia.schema.TypeConsigne#getACommePointSortiePointControle3D <em>AComme Point Sortie Point Controle3 D</em>}</li>
 *   <li>{@link mpia.schema.TypeConsigne#getACommePointParticulierDeConsignePointControle3D <em>AComme Point Particulier De Consigne Point Controle3 D</em>}</li>
 *   <li>{@link mpia.schema.TypeConsigne#getAPourDebutDatation <em>APour Debut Datation</em>}</li>
 *   <li>{@link mpia.schema.TypeConsigne#getAPourFinDatation <em>APour Fin Datation</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeConsigne()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_Consigne' kind='elementOnly'"
 * @generated
 */
public interface TypeConsigne extends TypeRacineOperationnelle {
	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(String)
	 * @see mpia.schema.SchemaPackage#getTypeConsigne_Code()
	 * @model dataType="mpia.meta.TypeDataTypeChaine06"
	 *        extendedMetaData="kind='element' name='Code'"
	 * @generated
	 */
	String getCode();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeConsigne#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(String value);

	/**
	 * Returns the value of the '<em><b>Etat Demande Volume</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoConsigneEtatDemandeVolume}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Etat Demande Volume</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Etat Demande Volume</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoConsigneEtatDemandeVolume
	 * @see #isSetEtatDemandeVolume()
	 * @see #unsetEtatDemandeVolume()
	 * @see #setEtatDemandeVolume(TypeDictionaryDicoConsigneEtatDemandeVolume)
	 * @see mpia.schema.SchemaPackage#getTypeConsigne_EtatDemandeVolume()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='EtatDemandeVolume'"
	 * @generated
	 */
	TypeDictionaryDicoConsigneEtatDemandeVolume getEtatDemandeVolume();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeConsigne#getEtatDemandeVolume <em>Etat Demande Volume</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Etat Demande Volume</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoConsigneEtatDemandeVolume
	 * @see #isSetEtatDemandeVolume()
	 * @see #unsetEtatDemandeVolume()
	 * @see #getEtatDemandeVolume()
	 * @generated
	 */
	void setEtatDemandeVolume(TypeDictionaryDicoConsigneEtatDemandeVolume value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeConsigne#getEtatDemandeVolume <em>Etat Demande Volume</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEtatDemandeVolume()
	 * @see #getEtatDemandeVolume()
	 * @see #setEtatDemandeVolume(TypeDictionaryDicoConsigneEtatDemandeVolume)
	 * @generated
	 */
	void unsetEtatDemandeVolume();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeConsigne#getEtatDemandeVolume <em>Etat Demande Volume</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Etat Demande Volume</em>' attribute is set.
	 * @see #unsetEtatDemandeVolume()
	 * @see #getEtatDemandeVolume()
	 * @see #setEtatDemandeVolume(TypeDictionaryDicoConsigneEtatDemandeVolume)
	 * @generated
	 */
	boolean isSetEtatDemandeVolume();

	/**
	 * Returns the value of the '<em><b>Numero Dans Phase</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Numero Dans Phase</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Numero Dans Phase</em>' attribute.
	 * @see #isSetNumeroDansPhase()
	 * @see #unsetNumeroDansPhase()
	 * @see #setNumeroDansPhase(long)
	 * @see mpia.schema.SchemaPackage#getTypeConsigne_NumeroDansPhase()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier6"
	 *        extendedMetaData="kind='element' name='NumeroDansPhase'"
	 * @generated
	 */
	long getNumeroDansPhase();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeConsigne#getNumeroDansPhase <em>Numero Dans Phase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Numero Dans Phase</em>' attribute.
	 * @see #isSetNumeroDansPhase()
	 * @see #unsetNumeroDansPhase()
	 * @see #getNumeroDansPhase()
	 * @generated
	 */
	void setNumeroDansPhase(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeConsigne#getNumeroDansPhase <em>Numero Dans Phase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNumeroDansPhase()
	 * @see #getNumeroDansPhase()
	 * @see #setNumeroDansPhase(long)
	 * @generated
	 */
	void unsetNumeroDansPhase();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeConsigne#getNumeroDansPhase <em>Numero Dans Phase</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Numero Dans Phase</em>' attribute is set.
	 * @see #unsetNumeroDansPhase()
	 * @see #getNumeroDansPhase()
	 * @see #setNumeroDansPhase(long)
	 * @generated
	 */
	boolean isSetNumeroDansPhase();

	/**
	 * Returns the value of the '<em><b>AComme Consigne Geographique Consigne Geographique</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AComme Consigne Geographique Consigne Geographique</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AComme Consigne Geographique Consigne Geographique</em>' containment reference.
	 * @see #setACommeConsigneGeographiqueConsigneGeographique(TypeConsigneGeographique)
	 * @see mpia.schema.SchemaPackage#getTypeConsigne_ACommeConsigneGeographiqueConsigneGeographique()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_ConsigneGeographique'"
	 *        extendedMetaData="kind='element' name='ACommeConsigneGeographique_ConsigneGeographique'"
	 * @generated
	 */
	TypeConsigneGeographique getACommeConsigneGeographiqueConsigneGeographique();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeConsigne#getACommeConsigneGeographiqueConsigneGeographique <em>AComme Consigne Geographique Consigne Geographique</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AComme Consigne Geographique Consigne Geographique</em>' containment reference.
	 * @see #getACommeConsigneGeographiqueConsigneGeographique()
	 * @generated
	 */
	void setACommeConsigneGeographiqueConsigneGeographique(TypeConsigneGeographique value);

	/**
	 * Returns the value of the '<em><b>Est Localise Par Assoc Consigne Localisation</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeAssocConsigneLocalisation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Localise Par Assoc Consigne Localisation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Localise Par Assoc Consigne Localisation</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeConsigne_EstLocaliseParAssocConsigneLocalisation()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_AssocConsigneLocalisation'"
	 *        extendedMetaData="kind='element' name='EstLocalisePar_AssocConsigneLocalisation'"
	 * @generated
	 */
	EList<TypeAssocConsigneLocalisation> getEstLocaliseParAssocConsigneLocalisation();

	/**
	 * Returns the value of the '<em><b>AComme Chargement Chargement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AComme Chargement Chargement</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AComme Chargement Chargement</em>' containment reference.
	 * @see #setACommeChargementChargement(TypeChargement)
	 * @see mpia.schema.SchemaPackage#getTypeConsigne_ACommeChargementChargement()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_Chargement'"
	 *        extendedMetaData="kind='element' name='ACommeChargement_Chargement'"
	 * @generated
	 */
	TypeChargement getACommeChargementChargement();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeConsigne#getACommeChargementChargement <em>AComme Chargement Chargement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AComme Chargement Chargement</em>' containment reference.
	 * @see #getACommeChargementChargement()
	 * @generated
	 */
	void setACommeChargementChargement(TypeChargement value);

	/**
	 * Returns the value of the '<em><b>AComme Periode Activation Periode</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypePeriode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AComme Periode Activation Periode</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AComme Periode Activation Periode</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeConsigne_ACommePeriodeActivationPeriode()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_Periode'"
	 *        extendedMetaData="kind='element' name='ACommePeriodeActivation_Periode'"
	 * @generated
	 */
	EList<TypePeriode> getACommePeriodeActivationPeriode();

	/**
	 * Returns the value of the '<em><b>AComme Modalite Application Modalite</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AComme Modalite Application Modalite</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AComme Modalite Application Modalite</em>' containment reference.
	 * @see #setACommeModaliteApplicationModalite(TypeModalite)
	 * @see mpia.schema.SchemaPackage#getTypeConsigne_ACommeModaliteApplicationModalite()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_Modalite'"
	 *        extendedMetaData="kind='element' name='ACommeModaliteApplication_Modalite'"
	 * @generated
	 */
	TypeModalite getACommeModaliteApplicationModalite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeConsigne#getACommeModaliteApplicationModalite <em>AComme Modalite Application Modalite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AComme Modalite Application Modalite</em>' containment reference.
	 * @see #getACommeModaliteApplicationModalite()
	 * @generated
	 */
	void setACommeModaliteApplicationModalite(TypeModalite value);

	/**
	 * Returns the value of the '<em><b>AComme Mesure Coordination3 DMesure Coordination</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AComme Mesure Coordination3 DMesure Coordination</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AComme Mesure Coordination3 DMesure Coordination</em>' containment reference.
	 * @see #setACommeMesureCoordination3DMesureCoordination(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeConsigne_ACommeMesureCoordination3DMesureCoordination()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_MesureCoordination'"
	 *        extendedMetaData="kind='element' name='ACommeMesureCoordination3D_MesureCoordination'"
	 * @generated
	 */
	TypeAssociation getACommeMesureCoordination3DMesureCoordination();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeConsigne#getACommeMesureCoordination3DMesureCoordination <em>AComme Mesure Coordination3 DMesure Coordination</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AComme Mesure Coordination3 DMesure Coordination</em>' containment reference.
	 * @see #getACommeMesureCoordination3DMesureCoordination()
	 * @generated
	 */
	void setACommeMesureCoordination3DMesureCoordination(TypeAssociation value);

	/**
	 * Returns the value of the '<em><b>AComme Point Entree Point Controle3 D</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AComme Point Entree Point Controle3 D</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AComme Point Entree Point Controle3 D</em>' containment reference.
	 * @see #setACommePointEntreePointControle3D(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeConsigne_ACommePointEntreePointControle3D()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_PointControle3D'"
	 *        extendedMetaData="kind='element' name='ACommePointEntree_PointControle3D'"
	 * @generated
	 */
	TypeAssociation getACommePointEntreePointControle3D();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeConsigne#getACommePointEntreePointControle3D <em>AComme Point Entree Point Controle3 D</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AComme Point Entree Point Controle3 D</em>' containment reference.
	 * @see #getACommePointEntreePointControle3D()
	 * @generated
	 */
	void setACommePointEntreePointControle3D(TypeAssociation value);

	/**
	 * Returns the value of the '<em><b>AComme Point Sortie Point Controle3 D</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AComme Point Sortie Point Controle3 D</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AComme Point Sortie Point Controle3 D</em>' containment reference.
	 * @see #setACommePointSortiePointControle3D(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeConsigne_ACommePointSortiePointControle3D()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_PointControle3D'"
	 *        extendedMetaData="kind='element' name='ACommePointSortie_PointControle3D'"
	 * @generated
	 */
	TypeAssociation getACommePointSortiePointControle3D();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeConsigne#getACommePointSortiePointControle3D <em>AComme Point Sortie Point Controle3 D</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AComme Point Sortie Point Controle3 D</em>' containment reference.
	 * @see #getACommePointSortiePointControle3D()
	 * @generated
	 */
	void setACommePointSortiePointControle3D(TypeAssociation value);

	/**
	 * Returns the value of the '<em><b>AComme Point Particulier De Consigne Point Controle3 D</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AComme Point Particulier De Consigne Point Controle3 D</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AComme Point Particulier De Consigne Point Controle3 D</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeConsigne_ACommePointParticulierDeConsignePointControle3D()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_PointControle3D'"
	 *        extendedMetaData="kind='element' name='ACommePointParticulierDeConsigne_PointControle3D'"
	 * @generated
	 */
	EList<TypeAssociation> getACommePointParticulierDeConsignePointControle3D();

	/**
	 * Returns the value of the '<em><b>APour Debut Datation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Debut Datation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Debut Datation</em>' containment reference.
	 * @see #setAPourDebutDatation(TypeDatation)
	 * @see mpia.schema.SchemaPackage#getTypeConsigne_APourDebutDatation()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_Datation'"
	 *        extendedMetaData="kind='element' name='APourDebut_Datation'"
	 * @generated
	 */
	TypeDatation getAPourDebutDatation();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeConsigne#getAPourDebutDatation <em>APour Debut Datation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Debut Datation</em>' containment reference.
	 * @see #getAPourDebutDatation()
	 * @generated
	 */
	void setAPourDebutDatation(TypeDatation value);

	/**
	 * Returns the value of the '<em><b>APour Fin Datation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Fin Datation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Fin Datation</em>' containment reference.
	 * @see #setAPourFinDatation(TypeDatation)
	 * @see mpia.schema.SchemaPackage#getTypeConsigne_APourFinDatation()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_Datation'"
	 *        extendedMetaData="kind='element' name='APourFin_Datation'"
	 * @generated
	 */
	TypeDatation getAPourFinDatation();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeConsigne#getAPourFinDatation <em>APour Fin Datation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Fin Datation</em>' containment reference.
	 * @see #getAPourFinDatation()
	 * @generated
	 */
	void setAPourFinDatation(TypeDatation value);

} // TypeConsigne
