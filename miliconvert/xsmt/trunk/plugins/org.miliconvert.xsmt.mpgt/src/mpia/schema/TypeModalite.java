/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import javax.xml.datatype.XMLGregorianCalendar;

import mpia.meta.TypeDataTypeDuree;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Modalite</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeModalite#getSens <em>Sens</em>}</li>
 *   <li>{@link mpia.schema.TypeModalite#getTypeVol <em>Type Vol</em>}</li>
 *   <li>{@link mpia.schema.TypeModalite#getVitesseMoyenne <em>Vitesse Moyenne</em>}</li>
 *   <li>{@link mpia.schema.TypeModalite#getDateDebutCalculee <em>Date Debut Calculee</em>}</li>
 *   <li>{@link mpia.schema.TypeModalite#getDateFinCalculee <em>Date Fin Calculee</em>}</li>
 *   <li>{@link mpia.schema.TypeModalite#getDureeOccupation <em>Duree Occupation</em>}</li>
 *   <li>{@link mpia.schema.TypeModalite#getCommentaire <em>Commentaire</em>}</li>
 *   <li>{@link mpia.schema.TypeModalite#getAPourDebutDatation <em>APour Debut Datation</em>}</li>
 *   <li>{@link mpia.schema.TypeModalite#getAPourFinDatation <em>APour Fin Datation</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeModalite()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_Modalite' kind='elementOnly'"
 * @generated
 */
public interface TypeModalite extends EObject {
	/**
	 * Returns the value of the '<em><b>Sens</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoModaliteSens}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sens</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sens</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoModaliteSens
	 * @see #isSetSens()
	 * @see #unsetSens()
	 * @see #setSens(TypeDictionaryDicoModaliteSens)
	 * @see mpia.schema.SchemaPackage#getTypeModalite_Sens()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='Sens'"
	 * @generated
	 */
	TypeDictionaryDicoModaliteSens getSens();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeModalite#getSens <em>Sens</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sens</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoModaliteSens
	 * @see #isSetSens()
	 * @see #unsetSens()
	 * @see #getSens()
	 * @generated
	 */
	void setSens(TypeDictionaryDicoModaliteSens value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeModalite#getSens <em>Sens</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSens()
	 * @see #getSens()
	 * @see #setSens(TypeDictionaryDicoModaliteSens)
	 * @generated
	 */
	void unsetSens();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeModalite#getSens <em>Sens</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Sens</em>' attribute is set.
	 * @see #unsetSens()
	 * @see #getSens()
	 * @see #setSens(TypeDictionaryDicoModaliteSens)
	 * @generated
	 */
	boolean isSetSens();

	/**
	 * Returns the value of the '<em><b>Type Vol</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoTypeVol}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Vol</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Vol</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoTypeVol
	 * @see #isSetTypeVol()
	 * @see #unsetTypeVol()
	 * @see #setTypeVol(TypeDictionaryDicoTypeVol)
	 * @see mpia.schema.SchemaPackage#getTypeModalite_TypeVol()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='TypeVol'"
	 * @generated
	 */
	TypeDictionaryDicoTypeVol getTypeVol();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeModalite#getTypeVol <em>Type Vol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Vol</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoTypeVol
	 * @see #isSetTypeVol()
	 * @see #unsetTypeVol()
	 * @see #getTypeVol()
	 * @generated
	 */
	void setTypeVol(TypeDictionaryDicoTypeVol value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeModalite#getTypeVol <em>Type Vol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTypeVol()
	 * @see #getTypeVol()
	 * @see #setTypeVol(TypeDictionaryDicoTypeVol)
	 * @generated
	 */
	void unsetTypeVol();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeModalite#getTypeVol <em>Type Vol</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type Vol</em>' attribute is set.
	 * @see #unsetTypeVol()
	 * @see #getTypeVol()
	 * @see #setTypeVol(TypeDictionaryDicoTypeVol)
	 * @generated
	 */
	boolean isSetTypeVol();

	/**
	 * Returns the value of the '<em><b>Vitesse Moyenne</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vitesse Moyenne</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vitesse Moyenne</em>' attribute.
	 * @see #isSetVitesseMoyenne()
	 * @see #unsetVitesseMoyenne()
	 * @see #setVitesseMoyenne(double)
	 * @see mpia.schema.SchemaPackage#getTypeModalite_VitesseMoyenne()
	 * @model unsettable="true" dataType="mpia.meta.TypeReal"
	 *        extendedMetaData="kind='element' name='VitesseMoyenne'"
	 * @generated
	 */
	double getVitesseMoyenne();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeModalite#getVitesseMoyenne <em>Vitesse Moyenne</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vitesse Moyenne</em>' attribute.
	 * @see #isSetVitesseMoyenne()
	 * @see #unsetVitesseMoyenne()
	 * @see #getVitesseMoyenne()
	 * @generated
	 */
	void setVitesseMoyenne(double value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeModalite#getVitesseMoyenne <em>Vitesse Moyenne</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVitesseMoyenne()
	 * @see #getVitesseMoyenne()
	 * @see #setVitesseMoyenne(double)
	 * @generated
	 */
	void unsetVitesseMoyenne();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeModalite#getVitesseMoyenne <em>Vitesse Moyenne</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Vitesse Moyenne</em>' attribute is set.
	 * @see #unsetVitesseMoyenne()
	 * @see #getVitesseMoyenne()
	 * @see #setVitesseMoyenne(double)
	 * @generated
	 */
	boolean isSetVitesseMoyenne();

	/**
	 * Returns the value of the '<em><b>Date Debut Calculee</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Debut Calculee</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Debut Calculee</em>' attribute.
	 * @see #setDateDebutCalculee(XMLGregorianCalendar)
	 * @see mpia.schema.SchemaPackage#getTypeModalite_DateDebutCalculee()
	 * @model dataType="mpia.meta.TypeDataTypeGDH"
	 *        extendedMetaData="kind='element' name='DateDebutCalculee'"
	 * @generated
	 */
	XMLGregorianCalendar getDateDebutCalculee();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeModalite#getDateDebutCalculee <em>Date Debut Calculee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Debut Calculee</em>' attribute.
	 * @see #getDateDebutCalculee()
	 * @generated
	 */
	void setDateDebutCalculee(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Date Fin Calculee</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Fin Calculee</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Fin Calculee</em>' attribute.
	 * @see #setDateFinCalculee(XMLGregorianCalendar)
	 * @see mpia.schema.SchemaPackage#getTypeModalite_DateFinCalculee()
	 * @model dataType="mpia.meta.TypeDataTypeGDH"
	 *        extendedMetaData="kind='element' name='DateFinCalculee'"
	 * @generated
	 */
	XMLGregorianCalendar getDateFinCalculee();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeModalite#getDateFinCalculee <em>Date Fin Calculee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Fin Calculee</em>' attribute.
	 * @see #getDateFinCalculee()
	 * @generated
	 */
	void setDateFinCalculee(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Duree Occupation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Duree Occupation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duree Occupation</em>' containment reference.
	 * @see #setDureeOccupation(TypeDataTypeDuree)
	 * @see mpia.schema.SchemaPackage#getTypeModalite_DureeOccupation()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='DureeOccupation'"
	 * @generated
	 */
	TypeDataTypeDuree getDureeOccupation();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeModalite#getDureeOccupation <em>Duree Occupation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duree Occupation</em>' containment reference.
	 * @see #getDureeOccupation()
	 * @generated
	 */
	void setDureeOccupation(TypeDataTypeDuree value);

	/**
	 * Returns the value of the '<em><b>Commentaire</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Commentaire</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Commentaire</em>' attribute.
	 * @see #setCommentaire(String)
	 * @see mpia.schema.SchemaPackage#getTypeModalite_Commentaire()
	 * @model dataType="mpia.meta.TypeDataTypeChaine02000"
	 *        extendedMetaData="kind='element' name='Commentaire'"
	 * @generated
	 */
	String getCommentaire();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeModalite#getCommentaire <em>Commentaire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Commentaire</em>' attribute.
	 * @see #getCommentaire()
	 * @generated
	 */
	void setCommentaire(String value);

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
	 * @see mpia.schema.SchemaPackage#getTypeModalite_APourDebutDatation()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_Datation'"
	 *        extendedMetaData="kind='element' name='APourDebut_Datation'"
	 * @generated
	 */
	TypeDatation getAPourDebutDatation();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeModalite#getAPourDebutDatation <em>APour Debut Datation</em>}' containment reference.
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
	 * @see mpia.schema.SchemaPackage#getTypeModalite_APourFinDatation()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_Datation'"
	 *        extendedMetaData="kind='element' name='APourFin_Datation'"
	 * @generated
	 */
	TypeDatation getAPourFinDatation();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeModalite#getAPourFinDatation <em>APour Fin Datation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Fin Datation</em>' containment reference.
	 * @see #getAPourFinDatation()
	 * @generated
	 */
	void setAPourFinDatation(TypeDatation value);

} // TypeModalite
