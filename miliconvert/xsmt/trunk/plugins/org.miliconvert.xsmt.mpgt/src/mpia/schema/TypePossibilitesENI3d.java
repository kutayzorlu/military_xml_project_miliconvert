/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import javax.xml.datatype.XMLGregorianCalendar;

import mpia.meta.TypeAssociation;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Possibilites ENI 3d</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypePossibilitesENI3d#getDateDebut <em>Date Debut</em>}</li>
 *   <li>{@link mpia.schema.TypePossibilitesENI3d#getDateFin <em>Date Fin</em>}</li>
 *   <li>{@link mpia.schema.TypePossibilitesENI3d#getDegreSuperioriteAerienneENI <em>Degre Superiorite Aerienne ENI</em>}</li>
 *   <li>{@link mpia.schema.TypePossibilitesENI3d#getDegreSuperioriteAerienneENInonRepertorie <em>Degre Superiorite Aerienne EN Inon Repertorie</em>}</li>
 *   <li>{@link mpia.schema.TypePossibilitesENI3d#getAutresInformationsRelativesAMenace3D <em>Autres Informations Relatives AMenace3 D</em>}</li>
 *   <li>{@link mpia.schema.TypePossibilitesENI3d#getEstARealiserPourHoraireManoeuvre <em>Est ARealiser Pour Horaire Manoeuvre</em>}</li>
 *   <li>{@link mpia.schema.TypePossibilitesENI3d#getAPourAction3DeniAction <em>APour Action3 Deni Action</em>}</li>
 *   <li>{@link mpia.schema.TypePossibilitesENI3d#getAPourMoyensENIMoyensENI <em>APour Moyens ENI Moyens ENI</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypePossibilitesENI3d()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_PossibilitesENI3d' kind='elementOnly'"
 * @generated
 */
public interface TypePossibilitesENI3d extends TypeMenace {
	/**
	 * Returns the value of the '<em><b>Date Debut</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Debut</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Debut</em>' attribute.
	 * @see #setDateDebut(XMLGregorianCalendar)
	 * @see mpia.schema.SchemaPackage#getTypePossibilitesENI3d_DateDebut()
	 * @model dataType="mpia.meta.TypeDataTypeGDH"
	 *        extendedMetaData="kind='element' name='DateDebut'"
	 * @generated
	 */
	XMLGregorianCalendar getDateDebut();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePossibilitesENI3d#getDateDebut <em>Date Debut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Debut</em>' attribute.
	 * @see #getDateDebut()
	 * @generated
	 */
	void setDateDebut(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Date Fin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Fin</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Fin</em>' attribute.
	 * @see #setDateFin(XMLGregorianCalendar)
	 * @see mpia.schema.SchemaPackage#getTypePossibilitesENI3d_DateFin()
	 * @model dataType="mpia.meta.TypeDataTypeGDH"
	 *        extendedMetaData="kind='element' name='DateFin'"
	 * @generated
	 */
	XMLGregorianCalendar getDateFin();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePossibilitesENI3d#getDateFin <em>Date Fin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Fin</em>' attribute.
	 * @see #getDateFin()
	 * @generated
	 */
	void setDateFin(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Degre Superiorite Aerienne ENI</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoSuperioriteAerienne}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Degre Superiorite Aerienne ENI</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Degre Superiorite Aerienne ENI</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoSuperioriteAerienne
	 * @see #isSetDegreSuperioriteAerienneENI()
	 * @see #unsetDegreSuperioriteAerienneENI()
	 * @see #setDegreSuperioriteAerienneENI(TypeDictionaryDicoSuperioriteAerienne)
	 * @see mpia.schema.SchemaPackage#getTypePossibilitesENI3d_DegreSuperioriteAerienneENI()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='DegreSuperioriteAerienneENI'"
	 * @generated
	 */
	TypeDictionaryDicoSuperioriteAerienne getDegreSuperioriteAerienneENI();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePossibilitesENI3d#getDegreSuperioriteAerienneENI <em>Degre Superiorite Aerienne ENI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Degre Superiorite Aerienne ENI</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoSuperioriteAerienne
	 * @see #isSetDegreSuperioriteAerienneENI()
	 * @see #unsetDegreSuperioriteAerienneENI()
	 * @see #getDegreSuperioriteAerienneENI()
	 * @generated
	 */
	void setDegreSuperioriteAerienneENI(TypeDictionaryDicoSuperioriteAerienne value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypePossibilitesENI3d#getDegreSuperioriteAerienneENI <em>Degre Superiorite Aerienne ENI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDegreSuperioriteAerienneENI()
	 * @see #getDegreSuperioriteAerienneENI()
	 * @see #setDegreSuperioriteAerienneENI(TypeDictionaryDicoSuperioriteAerienne)
	 * @generated
	 */
	void unsetDegreSuperioriteAerienneENI();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypePossibilitesENI3d#getDegreSuperioriteAerienneENI <em>Degre Superiorite Aerienne ENI</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Degre Superiorite Aerienne ENI</em>' attribute is set.
	 * @see #unsetDegreSuperioriteAerienneENI()
	 * @see #getDegreSuperioriteAerienneENI()
	 * @see #setDegreSuperioriteAerienneENI(TypeDictionaryDicoSuperioriteAerienne)
	 * @generated
	 */
	boolean isSetDegreSuperioriteAerienneENI();

	/**
	 * Returns the value of the '<em><b>Degre Superiorite Aerienne EN Inon Repertorie</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Degre Superiorite Aerienne EN Inon Repertorie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Degre Superiorite Aerienne EN Inon Repertorie</em>' attribute.
	 * @see #setDegreSuperioriteAerienneENInonRepertorie(String)
	 * @see mpia.schema.SchemaPackage#getTypePossibilitesENI3d_DegreSuperioriteAerienneENInonRepertorie()
	 * @model dataType="mpia.meta.TypeDataTypeChaine080"
	 *        extendedMetaData="kind='element' name='DegreSuperioriteAerienneENInonRepertorie'"
	 * @generated
	 */
	String getDegreSuperioriteAerienneENInonRepertorie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePossibilitesENI3d#getDegreSuperioriteAerienneENInonRepertorie <em>Degre Superiorite Aerienne EN Inon Repertorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Degre Superiorite Aerienne EN Inon Repertorie</em>' attribute.
	 * @see #getDegreSuperioriteAerienneENInonRepertorie()
	 * @generated
	 */
	void setDegreSuperioriteAerienneENInonRepertorie(String value);

	/**
	 * Returns the value of the '<em><b>Autres Informations Relatives AMenace3 D</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Autres Informations Relatives AMenace3 D</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Autres Informations Relatives AMenace3 D</em>' attribute.
	 * @see #setAutresInformationsRelativesAMenace3D(String)
	 * @see mpia.schema.SchemaPackage#getTypePossibilitesENI3d_AutresInformationsRelativesAMenace3D()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0255"
	 *        extendedMetaData="kind='element' name='AutresInformationsRelativesAMenace3D'"
	 * @generated
	 */
	String getAutresInformationsRelativesAMenace3D();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePossibilitesENI3d#getAutresInformationsRelativesAMenace3D <em>Autres Informations Relatives AMenace3 D</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Autres Informations Relatives AMenace3 D</em>' attribute.
	 * @see #getAutresInformationsRelativesAMenace3D()
	 * @generated
	 */
	void setAutresInformationsRelativesAMenace3D(String value);

	/**
	 * Returns the value of the '<em><b>Est ARealiser Pour Horaire Manoeuvre</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est ARealiser Pour Horaire Manoeuvre</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est ARealiser Pour Horaire Manoeuvre</em>' containment reference.
	 * @see #setEstARealiserPourHoraireManoeuvre(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypePossibilitesENI3d_EstARealiserPourHoraireManoeuvre()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_HoraireManoeuvre'"
	 *        extendedMetaData="kind='element' name='EstARealiserPour_HoraireManoeuvre'"
	 * @generated
	 */
	TypeAssociation getEstARealiserPourHoraireManoeuvre();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePossibilitesENI3d#getEstARealiserPourHoraireManoeuvre <em>Est ARealiser Pour Horaire Manoeuvre</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Est ARealiser Pour Horaire Manoeuvre</em>' containment reference.
	 * @see #getEstARealiserPourHoraireManoeuvre()
	 * @generated
	 */
	void setEstARealiserPourHoraireManoeuvre(TypeAssociation value);

	/**
	 * Returns the value of the '<em><b>APour Action3 Deni Action</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Action3 Deni Action</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Action3 Deni Action</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypePossibilitesENI3d_APourAction3DeniAction()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_Action'"
	 *        extendedMetaData="kind='element' name='APourAction3Deni_Action'"
	 * @generated
	 */
	EList<TypeAssociation> getAPourAction3DeniAction();

	/**
	 * Returns the value of the '<em><b>APour Moyens ENI Moyens ENI</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeMoyensENI}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Moyens ENI Moyens ENI</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Moyens ENI Moyens ENI</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypePossibilitesENI3d_APourMoyensENIMoyensENI()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_MoyensENI'"
	 *        extendedMetaData="kind='element' name='APourMoyensENI_MoyensENI'"
	 * @generated
	 */
	EList<TypeMoyensENI> getAPourMoyensENIMoyensENI();

} // TypePossibilitesENI3d
