/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import javax.xml.datatype.XMLGregorianCalendar;

import mpia.meta.TypeAssociation;
import mpia.meta.TypeDataTypeAltitudePression;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Conflit3 D</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeConflit3D#getAltitudeConflit <em>Altitude Conflit</em>}</li>
 *   <li>{@link mpia.schema.TypeConflit3D#getNatureConflit <em>Nature Conflit</em>}</li>
 *   <li>{@link mpia.schema.TypeConflit3D#getTypeConflit <em>Type Conflit</em>}</li>
 *   <li>{@link mpia.schema.TypeConflit3D#getHeureApparitionConflit <em>Heure Apparition Conflit</em>}</li>
 *   <li>{@link mpia.schema.TypeConflit3D#getProbabiliteConflit <em>Probabilite Conflit</em>}</li>
 *   <li>{@link mpia.schema.TypeConflit3D#getEstSujetAssociationConflit3DMissionAerienne <em>Est Sujet Association Conflit3 DMission Aerienne</em>}</li>
 *   <li>{@link mpia.schema.TypeConflit3D#getAPourVolumeEnConflitConsigne <em>APour Volume En Conflit Consigne</em>}</li>
 *   <li>{@link mpia.schema.TypeConflit3D#getAPourModuleEnConflitModule <em>APour Module En Conflit Module</em>}</li>
 *   <li>{@link mpia.schema.TypeConflit3D#getAPourACMenConflitMesureCoordination <em>APour AC Men Conflit Mesure Coordination</em>}</li>
 *   <li>{@link mpia.schema.TypeConflit3D#getAPourACMEnResolutionMesureCoordination <em>APour ACM En Resolution Mesure Coordination</em>}</li>
 *   <li>{@link mpia.schema.TypeConflit3D#getACommePeriodeValiditeConsignePeriode3D <em>AComme Periode Validite Consigne Periode3 D</em>}</li>
 *   <li>{@link mpia.schema.TypeConflit3D#getACommeConsigneTirAppliquerConsigneTir <em>AComme Consigne Tir Appliquer Consigne Tir</em>}</li>
 *   <li>{@link mpia.schema.TypeConflit3D#getAPourVolumeEnResolutionConsigne <em>APour Volume En Resolution Consigne</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeConflit3D()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_Conflit3D' kind='elementOnly'"
 * @generated
 */
public interface TypeConflit3D extends TypeEvenement {
	/**
	 * Returns the value of the '<em><b>Altitude Conflit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Altitude Conflit</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Altitude Conflit</em>' containment reference.
	 * @see #setAltitudeConflit(TypeDataTypeAltitudePression)
	 * @see mpia.schema.SchemaPackage#getTypeConflit3D_AltitudeConflit()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AltitudeConflit'"
	 * @generated
	 */
	TypeDataTypeAltitudePression getAltitudeConflit();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeConflit3D#getAltitudeConflit <em>Altitude Conflit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Altitude Conflit</em>' containment reference.
	 * @see #getAltitudeConflit()
	 * @generated
	 */
	void setAltitudeConflit(TypeDataTypeAltitudePression value);

	/**
	 * Returns the value of the '<em><b>Nature Conflit</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoConflit3DnatureConflit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nature Conflit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nature Conflit</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoConflit3DnatureConflit
	 * @see #isSetNatureConflit()
	 * @see #unsetNatureConflit()
	 * @see #setNatureConflit(TypeDictionaryDicoConflit3DnatureConflit)
	 * @see mpia.schema.SchemaPackage#getTypeConflit3D_NatureConflit()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='NatureConflit'"
	 * @generated
	 */
	TypeDictionaryDicoConflit3DnatureConflit getNatureConflit();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeConflit3D#getNatureConflit <em>Nature Conflit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nature Conflit</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoConflit3DnatureConflit
	 * @see #isSetNatureConflit()
	 * @see #unsetNatureConflit()
	 * @see #getNatureConflit()
	 * @generated
	 */
	void setNatureConflit(TypeDictionaryDicoConflit3DnatureConflit value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeConflit3D#getNatureConflit <em>Nature Conflit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNatureConflit()
	 * @see #getNatureConflit()
	 * @see #setNatureConflit(TypeDictionaryDicoConflit3DnatureConflit)
	 * @generated
	 */
	void unsetNatureConflit();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeConflit3D#getNatureConflit <em>Nature Conflit</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nature Conflit</em>' attribute is set.
	 * @see #unsetNatureConflit()
	 * @see #getNatureConflit()
	 * @see #setNatureConflit(TypeDictionaryDicoConflit3DnatureConflit)
	 * @generated
	 */
	boolean isSetNatureConflit();

	/**
	 * Returns the value of the '<em><b>Type Conflit</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoConflit3DTypeConflit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Conflit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Conflit</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoConflit3DTypeConflit
	 * @see #isSetTypeConflit()
	 * @see #unsetTypeConflit()
	 * @see #setTypeConflit(TypeDictionaryDicoConflit3DTypeConflit)
	 * @see mpia.schema.SchemaPackage#getTypeConflit3D_TypeConflit()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='TypeConflit'"
	 * @generated
	 */
	TypeDictionaryDicoConflit3DTypeConflit getTypeConflit();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeConflit3D#getTypeConflit <em>Type Conflit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Conflit</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoConflit3DTypeConflit
	 * @see #isSetTypeConflit()
	 * @see #unsetTypeConflit()
	 * @see #getTypeConflit()
	 * @generated
	 */
	void setTypeConflit(TypeDictionaryDicoConflit3DTypeConflit value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeConflit3D#getTypeConflit <em>Type Conflit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTypeConflit()
	 * @see #getTypeConflit()
	 * @see #setTypeConflit(TypeDictionaryDicoConflit3DTypeConflit)
	 * @generated
	 */
	void unsetTypeConflit();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeConflit3D#getTypeConflit <em>Type Conflit</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type Conflit</em>' attribute is set.
	 * @see #unsetTypeConflit()
	 * @see #getTypeConflit()
	 * @see #setTypeConflit(TypeDictionaryDicoConflit3DTypeConflit)
	 * @generated
	 */
	boolean isSetTypeConflit();

	/**
	 * Returns the value of the '<em><b>Heure Apparition Conflit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Heure Apparition Conflit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Heure Apparition Conflit</em>' attribute.
	 * @see #setHeureApparitionConflit(XMLGregorianCalendar)
	 * @see mpia.schema.SchemaPackage#getTypeConflit3D_HeureApparitionConflit()
	 * @model dataType="mpia.meta.TypeDataTypeGDH"
	 *        extendedMetaData="kind='element' name='HeureApparitionConflit'"
	 * @generated
	 */
	XMLGregorianCalendar getHeureApparitionConflit();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeConflit3D#getHeureApparitionConflit <em>Heure Apparition Conflit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Heure Apparition Conflit</em>' attribute.
	 * @see #getHeureApparitionConflit()
	 * @generated
	 */
	void setHeureApparitionConflit(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Probabilite Conflit</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoProbabiliteEvenement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Probabilite Conflit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Probabilite Conflit</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoProbabiliteEvenement
	 * @see #isSetProbabiliteConflit()
	 * @see #unsetProbabiliteConflit()
	 * @see #setProbabiliteConflit(TypeDictionaryDicoProbabiliteEvenement)
	 * @see mpia.schema.SchemaPackage#getTypeConflit3D_ProbabiliteConflit()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='ProbabiliteConflit'"
	 * @generated
	 */
	TypeDictionaryDicoProbabiliteEvenement getProbabiliteConflit();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeConflit3D#getProbabiliteConflit <em>Probabilite Conflit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Probabilite Conflit</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoProbabiliteEvenement
	 * @see #isSetProbabiliteConflit()
	 * @see #unsetProbabiliteConflit()
	 * @see #getProbabiliteConflit()
	 * @generated
	 */
	void setProbabiliteConflit(TypeDictionaryDicoProbabiliteEvenement value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeConflit3D#getProbabiliteConflit <em>Probabilite Conflit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetProbabiliteConflit()
	 * @see #getProbabiliteConflit()
	 * @see #setProbabiliteConflit(TypeDictionaryDicoProbabiliteEvenement)
	 * @generated
	 */
	void unsetProbabiliteConflit();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeConflit3D#getProbabiliteConflit <em>Probabilite Conflit</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Probabilite Conflit</em>' attribute is set.
	 * @see #unsetProbabiliteConflit()
	 * @see #getProbabiliteConflit()
	 * @see #setProbabiliteConflit(TypeDictionaryDicoProbabiliteEvenement)
	 * @generated
	 */
	boolean isSetProbabiliteConflit();

	/**
	 * Returns the value of the '<em><b>Est Sujet Association Conflit3 DMission Aerienne</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Sujet Association Conflit3 DMission Aerienne</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Sujet Association Conflit3 DMission Aerienne</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeConflit3D_EstSujetAssociationConflit3DMissionAerienne()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='AssocieCommeSujet_Conflit3D' target_entity='type_AssociationConflit3DMissionAerienne'"
	 *        extendedMetaData="kind='element' name='EstSujet_AssociationConflit3DMissionAerienne'"
	 * @generated
	 */
	EList<TypeAssociation> getEstSujetAssociationConflit3DMissionAerienne();

	/**
	 * Returns the value of the '<em><b>APour Volume En Conflit Consigne</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Volume En Conflit Consigne</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Volume En Conflit Consigne</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeConflit3D_APourVolumeEnConflitConsigne()
	 * @model containment="true" upper="2"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_Consigne'"
	 *        extendedMetaData="kind='element' name='APourVolumeEnConflit_Consigne'"
	 * @generated
	 */
	EList<TypeAssociation> getAPourVolumeEnConflitConsigne();

	/**
	 * Returns the value of the '<em><b>APour Module En Conflit Module</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Module En Conflit Module</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Module En Conflit Module</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeConflit3D_APourModuleEnConflitModule()
	 * @model containment="true" upper="2"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_Module'"
	 *        extendedMetaData="kind='element' name='APourModuleEnConflit_Module'"
	 * @generated
	 */
	EList<TypeAssociation> getAPourModuleEnConflitModule();

	/**
	 * Returns the value of the '<em><b>APour AC Men Conflit Mesure Coordination</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour AC Men Conflit Mesure Coordination</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour AC Men Conflit Mesure Coordination</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeConflit3D_APourACMenConflitMesureCoordination()
	 * @model containment="true" upper="2"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='ReferenceAlerte_Conflit3D' target_entity='type_MesureCoordination'"
	 *        extendedMetaData="kind='element' name='APourACMenConflit_MesureCoordination'"
	 * @generated
	 */
	EList<TypeAssociation> getAPourACMenConflitMesureCoordination();

	/**
	 * Returns the value of the '<em><b>APour ACM En Resolution Mesure Coordination</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour ACM En Resolution Mesure Coordination</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour ACM En Resolution Mesure Coordination</em>' containment reference.
	 * @see #setAPourACMEnResolutionMesureCoordination(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeConflit3D_APourACMEnResolutionMesureCoordination()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_MesureCoordination'"
	 *        extendedMetaData="kind='element' name='APourACMEnResolution_MesureCoordination'"
	 * @generated
	 */
	TypeAssociation getAPourACMEnResolutionMesureCoordination();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeConflit3D#getAPourACMEnResolutionMesureCoordination <em>APour ACM En Resolution Mesure Coordination</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour ACM En Resolution Mesure Coordination</em>' containment reference.
	 * @see #getAPourACMEnResolutionMesureCoordination()
	 * @generated
	 */
	void setAPourACMEnResolutionMesureCoordination(TypeAssociation value);

	/**
	 * Returns the value of the '<em><b>AComme Periode Validite Consigne Periode3 D</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AComme Periode Validite Consigne Periode3 D</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AComme Periode Validite Consigne Periode3 D</em>' containment reference.
	 * @see #setACommePeriodeValiditeConsignePeriode3D(TypePeriode3D)
	 * @see mpia.schema.SchemaPackage#getTypeConflit3D_ACommePeriodeValiditeConsignePeriode3D()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_Periode3D'"
	 *        extendedMetaData="kind='element' name='ACommePeriodeValiditeConsigne_Periode3D'"
	 * @generated
	 */
	TypePeriode3D getACommePeriodeValiditeConsignePeriode3D();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeConflit3D#getACommePeriodeValiditeConsignePeriode3D <em>AComme Periode Validite Consigne Periode3 D</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AComme Periode Validite Consigne Periode3 D</em>' containment reference.
	 * @see #getACommePeriodeValiditeConsignePeriode3D()
	 * @generated
	 */
	void setACommePeriodeValiditeConsignePeriode3D(TypePeriode3D value);

	/**
	 * Returns the value of the '<em><b>AComme Consigne Tir Appliquer Consigne Tir</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AComme Consigne Tir Appliquer Consigne Tir</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AComme Consigne Tir Appliquer Consigne Tir</em>' containment reference.
	 * @see #setACommeConsigneTirAppliquerConsigneTir(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeConflit3D_ACommeConsigneTirAppliquerConsigneTir()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_ConsigneTir'"
	 *        extendedMetaData="kind='element' name='ACommeConsigneTirAppliquer_ConsigneTir'"
	 * @generated
	 */
	TypeAssociation getACommeConsigneTirAppliquerConsigneTir();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeConflit3D#getACommeConsigneTirAppliquerConsigneTir <em>AComme Consigne Tir Appliquer Consigne Tir</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AComme Consigne Tir Appliquer Consigne Tir</em>' containment reference.
	 * @see #getACommeConsigneTirAppliquerConsigneTir()
	 * @generated
	 */
	void setACommeConsigneTirAppliquerConsigneTir(TypeAssociation value);

	/**
	 * Returns the value of the '<em><b>APour Volume En Resolution Consigne</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Volume En Resolution Consigne</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Volume En Resolution Consigne</em>' containment reference.
	 * @see #setAPourVolumeEnResolutionConsigne(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeConflit3D_APourVolumeEnResolutionConsigne()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_Consigne'"
	 *        extendedMetaData="kind='element' name='APourVolumeEnResolution_Consigne'"
	 * @generated
	 */
	TypeAssociation getAPourVolumeEnResolutionConsigne();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeConflit3D#getAPourVolumeEnResolutionConsigne <em>APour Volume En Resolution Consigne</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Volume En Resolution Consigne</em>' containment reference.
	 * @see #getAPourVolumeEnResolutionConsigne()
	 * @generated
	 */
	void setAPourVolumeEnResolutionConsigne(TypeAssociation value);

} // TypeConflit3D
