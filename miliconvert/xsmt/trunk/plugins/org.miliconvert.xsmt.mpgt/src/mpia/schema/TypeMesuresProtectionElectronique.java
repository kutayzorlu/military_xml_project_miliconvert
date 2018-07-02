/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import javax.xml.datatype.XMLGregorianCalendar;

import mpia.meta.TypeAssociationEXT;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Mesures Protection Electronique</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeMesuresProtectionElectronique#getTypeMoyenRayonnant <em>Type Moyen Rayonnant</em>}</li>
 *   <li>{@link mpia.schema.TypeMesuresProtectionElectronique#getTypeMoyenRayonnantNonRep <em>Type Moyen Rayonnant Non Rep</em>}</li>
 *   <li>{@link mpia.schema.TypeMesuresProtectionElectronique#getPourcentageMoyensUtilises <em>Pourcentage Moyens Utilises</em>}</li>
 *   <li>{@link mpia.schema.TypeMesuresProtectionElectronique#getDateDebutEmploi <em>Date Debut Emploi</em>}</li>
 *   <li>{@link mpia.schema.TypeMesuresProtectionElectronique#getDateFinEmploi <em>Date Fin Emploi</em>}</li>
 *   <li>{@link mpia.schema.TypeMesuresProtectionElectronique#getComplementAuRegimeEmploi <em>Complement Au Regime Emploi</em>}</li>
 *   <li>{@link mpia.schema.TypeMesuresProtectionElectronique#getAutresMesuresPropresAASA <em>Autres Mesures Propres AASA</em>}</li>
 *   <li>{@link mpia.schema.TypeMesuresProtectionElectronique#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeMesuresProtectionElectronique#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypeMesuresProtectionElectronique#getAPourUniteConcerneeUnite <em>APour Unite Concernee Unite</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeMesuresProtectionElectronique()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_MesuresProtectionElectronique' kind='elementOnly'"
 * @generated
 */
public interface TypeMesuresProtectionElectronique extends EObject {
	/**
	 * Returns the value of the '<em><b>Type Moyen Rayonnant</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoMesuresProtectionElectroniqueTypeMoyenRayonnant}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Moyen Rayonnant</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Moyen Rayonnant</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoMesuresProtectionElectroniqueTypeMoyenRayonnant
	 * @see #isSetTypeMoyenRayonnant()
	 * @see #unsetTypeMoyenRayonnant()
	 * @see #setTypeMoyenRayonnant(TypeDictionaryDicoMesuresProtectionElectroniqueTypeMoyenRayonnant)
	 * @see mpia.schema.SchemaPackage#getTypeMesuresProtectionElectronique_TypeMoyenRayonnant()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='TypeMoyenRayonnant'"
	 * @generated
	 */
	TypeDictionaryDicoMesuresProtectionElectroniqueTypeMoyenRayonnant getTypeMoyenRayonnant();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMesuresProtectionElectronique#getTypeMoyenRayonnant <em>Type Moyen Rayonnant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Moyen Rayonnant</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoMesuresProtectionElectroniqueTypeMoyenRayonnant
	 * @see #isSetTypeMoyenRayonnant()
	 * @see #unsetTypeMoyenRayonnant()
	 * @see #getTypeMoyenRayonnant()
	 * @generated
	 */
	void setTypeMoyenRayonnant(TypeDictionaryDicoMesuresProtectionElectroniqueTypeMoyenRayonnant value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeMesuresProtectionElectronique#getTypeMoyenRayonnant <em>Type Moyen Rayonnant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTypeMoyenRayonnant()
	 * @see #getTypeMoyenRayonnant()
	 * @see #setTypeMoyenRayonnant(TypeDictionaryDicoMesuresProtectionElectroniqueTypeMoyenRayonnant)
	 * @generated
	 */
	void unsetTypeMoyenRayonnant();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeMesuresProtectionElectronique#getTypeMoyenRayonnant <em>Type Moyen Rayonnant</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type Moyen Rayonnant</em>' attribute is set.
	 * @see #unsetTypeMoyenRayonnant()
	 * @see #getTypeMoyenRayonnant()
	 * @see #setTypeMoyenRayonnant(TypeDictionaryDicoMesuresProtectionElectroniqueTypeMoyenRayonnant)
	 * @generated
	 */
	boolean isSetTypeMoyenRayonnant();

	/**
	 * Returns the value of the '<em><b>Type Moyen Rayonnant Non Rep</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Moyen Rayonnant Non Rep</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Moyen Rayonnant Non Rep</em>' attribute.
	 * @see #setTypeMoyenRayonnantNonRep(String)
	 * @see mpia.schema.SchemaPackage#getTypeMesuresProtectionElectronique_TypeMoyenRayonnantNonRep()
	 * @model dataType="mpia.meta.TypeDataTypeChaine080"
	 *        extendedMetaData="kind='element' name='TypeMoyenRayonnantNonRep'"
	 * @generated
	 */
	String getTypeMoyenRayonnantNonRep();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMesuresProtectionElectronique#getTypeMoyenRayonnantNonRep <em>Type Moyen Rayonnant Non Rep</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Moyen Rayonnant Non Rep</em>' attribute.
	 * @see #getTypeMoyenRayonnantNonRep()
	 * @generated
	 */
	void setTypeMoyenRayonnantNonRep(String value);

	/**
	 * Returns the value of the '<em><b>Pourcentage Moyens Utilises</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pourcentage Moyens Utilises</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pourcentage Moyens Utilises</em>' attribute.
	 * @see #isSetPourcentageMoyensUtilises()
	 * @see #unsetPourcentageMoyensUtilises()
	 * @see #setPourcentageMoyensUtilises(double)
	 * @see mpia.schema.SchemaPackage#getTypeMesuresProtectionElectronique_PourcentageMoyensUtilises()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeRatio" required="true"
	 *        extendedMetaData="kind='element' name='PourcentageMoyensUtilises'"
	 * @generated
	 */
	double getPourcentageMoyensUtilises();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMesuresProtectionElectronique#getPourcentageMoyensUtilises <em>Pourcentage Moyens Utilises</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pourcentage Moyens Utilises</em>' attribute.
	 * @see #isSetPourcentageMoyensUtilises()
	 * @see #unsetPourcentageMoyensUtilises()
	 * @see #getPourcentageMoyensUtilises()
	 * @generated
	 */
	void setPourcentageMoyensUtilises(double value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeMesuresProtectionElectronique#getPourcentageMoyensUtilises <em>Pourcentage Moyens Utilises</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPourcentageMoyensUtilises()
	 * @see #getPourcentageMoyensUtilises()
	 * @see #setPourcentageMoyensUtilises(double)
	 * @generated
	 */
	void unsetPourcentageMoyensUtilises();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeMesuresProtectionElectronique#getPourcentageMoyensUtilises <em>Pourcentage Moyens Utilises</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Pourcentage Moyens Utilises</em>' attribute is set.
	 * @see #unsetPourcentageMoyensUtilises()
	 * @see #getPourcentageMoyensUtilises()
	 * @see #setPourcentageMoyensUtilises(double)
	 * @generated
	 */
	boolean isSetPourcentageMoyensUtilises();

	/**
	 * Returns the value of the '<em><b>Date Debut Emploi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Debut Emploi</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Debut Emploi</em>' attribute.
	 * @see #setDateDebutEmploi(XMLGregorianCalendar)
	 * @see mpia.schema.SchemaPackage#getTypeMesuresProtectionElectronique_DateDebutEmploi()
	 * @model dataType="mpia.meta.TypeDataTypeGDH"
	 *        extendedMetaData="kind='element' name='DateDebutEmploi'"
	 * @generated
	 */
	XMLGregorianCalendar getDateDebutEmploi();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMesuresProtectionElectronique#getDateDebutEmploi <em>Date Debut Emploi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Debut Emploi</em>' attribute.
	 * @see #getDateDebutEmploi()
	 * @generated
	 */
	void setDateDebutEmploi(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Date Fin Emploi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Fin Emploi</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Fin Emploi</em>' attribute.
	 * @see #setDateFinEmploi(XMLGregorianCalendar)
	 * @see mpia.schema.SchemaPackage#getTypeMesuresProtectionElectronique_DateFinEmploi()
	 * @model dataType="mpia.meta.TypeDataTypeGDH"
	 *        extendedMetaData="kind='element' name='DateFinEmploi'"
	 * @generated
	 */
	XMLGregorianCalendar getDateFinEmploi();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMesuresProtectionElectronique#getDateFinEmploi <em>Date Fin Emploi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Fin Emploi</em>' attribute.
	 * @see #getDateFinEmploi()
	 * @generated
	 */
	void setDateFinEmploi(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Complement Au Regime Emploi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Complement Au Regime Emploi</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Complement Au Regime Emploi</em>' attribute.
	 * @see #setComplementAuRegimeEmploi(String)
	 * @see mpia.schema.SchemaPackage#getTypeMesuresProtectionElectronique_ComplementAuRegimeEmploi()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0255"
	 *        extendedMetaData="kind='element' name='ComplementAuRegimeEmploi'"
	 * @generated
	 */
	String getComplementAuRegimeEmploi();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMesuresProtectionElectronique#getComplementAuRegimeEmploi <em>Complement Au Regime Emploi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Complement Au Regime Emploi</em>' attribute.
	 * @see #getComplementAuRegimeEmploi()
	 * @generated
	 */
	void setComplementAuRegimeEmploi(String value);

	/**
	 * Returns the value of the '<em><b>Autres Mesures Propres AASA</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Autres Mesures Propres AASA</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Autres Mesures Propres AASA</em>' attribute.
	 * @see #setAutresMesuresPropresAASA(String)
	 * @see mpia.schema.SchemaPackage#getTypeMesuresProtectionElectronique_AutresMesuresPropresAASA()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0255"
	 *        extendedMetaData="kind='element' name='AutresMesuresPropresAASA'"
	 * @generated
	 */
	String getAutresMesuresPropresAASA();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMesuresProtectionElectronique#getAutresMesuresPropresAASA <em>Autres Mesures Propres AASA</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Autres Mesures Propres AASA</em>' attribute.
	 * @see #getAutresMesuresPropresAASA()
	 * @generated
	 */
	void setAutresMesuresPropresAASA(String value);

	/**
	 * Returns the value of the '<em><b>CTE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CTE</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CTE</em>' attribute.
	 * @see #setCTE(String)
	 * @see mpia.schema.SchemaPackage#getTypeMesuresProtectionElectronique_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMesuresProtectionElectronique#getCTE <em>CTE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CTE</em>' attribute.
	 * @see #getCTE()
	 * @generated
	 */
	void setCTE(String value);

	/**
	 * Returns the value of the '<em><b>CE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CE</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CE</em>' attribute.
	 * @see #setCE(String)
	 * @see mpia.schema.SchemaPackage#getTypeMesuresProtectionElectronique_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMesuresProtectionElectronique#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

	/**
	 * Returns the value of the '<em><b>APour Unite Concernee Unite</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociationEXT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Unite Concernee Unite</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Unite Concernee Unite</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMesuresProtectionElectronique_APourUniteConcerneeUnite()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='APourMesuresProtectionElectronique_MesuresProtectionElectronique' target_entity='type_Unite'"
	 *        extendedMetaData="kind='element' name='APourUniteConcernee_Unite'"
	 * @generated
	 */
	EList<TypeAssociationEXT> getAPourUniteConcerneeUnite();

} // TypeMesuresProtectionElectronique
