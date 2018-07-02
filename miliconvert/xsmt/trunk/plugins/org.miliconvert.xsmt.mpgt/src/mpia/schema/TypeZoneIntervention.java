/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Zone Intervention</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeZoneIntervention#getAptitudeJourNuit <em>Aptitude Jour Nuit</em>}</li>
 *   <li>{@link mpia.schema.TypeZoneIntervention#getDateDeReconnaiss <em>Date De Reconnaiss</em>}</li>
 *   <li>{@link mpia.schema.TypeZoneIntervention#getAxesApproche <em>Axes Approche</em>}</li>
 *   <li>{@link mpia.schema.TypeZoneIntervention#getFrequences <em>Frequences</em>}</li>
 *   <li>{@link mpia.schema.TypeZoneIntervention#getNombreMaxiHelico <em>Nombre Maxi Helico</em>}</li>
 *   <li>{@link mpia.schema.TypeZoneIntervention#getPraticabilite <em>Praticabilite</em>}</li>
 *   <li>{@link mpia.schema.TypeZoneIntervention#getType <em>Type</em>}</li>
 *   <li>{@link mpia.schema.TypeZoneIntervention#getNatureSol <em>Nature Sol</em>}</li>
 *   <li>{@link mpia.schema.TypeZoneIntervention#getOrientation <em>Orientation</em>}</li>
 *   <li>{@link mpia.schema.TypeZoneIntervention#getTailleMaximum <em>Taille Maximum</em>}</li>
 *   <li>{@link mpia.schema.TypeZoneIntervention#getZoneReconnue <em>Zone Reconnue</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeZoneIntervention()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_ZoneIntervention' kind='elementOnly'"
 * @generated
 */
public interface TypeZoneIntervention extends EObject {
	/**
	 * Returns the value of the '<em><b>Aptitude Jour Nuit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aptitude Jour Nuit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aptitude Jour Nuit</em>' attribute.
	 * @see #setAptitudeJourNuit(String)
	 * @see mpia.schema.SchemaPackage#getTypeZoneIntervention_AptitudeJourNuit()
	 * @model dataType="mpia.meta.TypeDataTypeChaine012"
	 *        extendedMetaData="kind='element' name='AptitudeJourNuit'"
	 * @generated
	 */
	String getAptitudeJourNuit();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeZoneIntervention#getAptitudeJourNuit <em>Aptitude Jour Nuit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aptitude Jour Nuit</em>' attribute.
	 * @see #getAptitudeJourNuit()
	 * @generated
	 */
	void setAptitudeJourNuit(String value);

	/**
	 * Returns the value of the '<em><b>Date De Reconnaiss</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date De Reconnaiss</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date De Reconnaiss</em>' attribute.
	 * @see #setDateDeReconnaiss(XMLGregorianCalendar)
	 * @see mpia.schema.SchemaPackage#getTypeZoneIntervention_DateDeReconnaiss()
	 * @model dataType="mpia.meta.TypeDataTypeGDH"
	 *        extendedMetaData="kind='element' name='DateDeReconnaiss'"
	 * @generated
	 */
	XMLGregorianCalendar getDateDeReconnaiss();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeZoneIntervention#getDateDeReconnaiss <em>Date De Reconnaiss</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date De Reconnaiss</em>' attribute.
	 * @see #getDateDeReconnaiss()
	 * @generated
	 */
	void setDateDeReconnaiss(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Axes Approche</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Axes Approche</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Axes Approche</em>' attribute.
	 * @see #setAxesApproche(String)
	 * @see mpia.schema.SchemaPackage#getTypeZoneIntervention_AxesApproche()
	 * @model dataType="mpia.meta.TypeDataTypeChaine050"
	 *        extendedMetaData="kind='element' name='AxesApproche'"
	 * @generated
	 */
	String getAxesApproche();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeZoneIntervention#getAxesApproche <em>Axes Approche</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Axes Approche</em>' attribute.
	 * @see #getAxesApproche()
	 * @generated
	 */
	void setAxesApproche(String value);

	/**
	 * Returns the value of the '<em><b>Frequences</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Frequences</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Frequences</em>' attribute.
	 * @see #setFrequences(String)
	 * @see mpia.schema.SchemaPackage#getTypeZoneIntervention_Frequences()
	 * @model dataType="mpia.meta.TypeDataTypeChaine020"
	 *        extendedMetaData="kind='element' name='Frequences'"
	 * @generated
	 */
	String getFrequences();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeZoneIntervention#getFrequences <em>Frequences</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Frequences</em>' attribute.
	 * @see #getFrequences()
	 * @generated
	 */
	void setFrequences(String value);

	/**
	 * Returns the value of the '<em><b>Nombre Maxi Helico</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre Maxi Helico</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre Maxi Helico</em>' attribute.
	 * @see #isSetNombreMaxiHelico()
	 * @see #unsetNombreMaxiHelico()
	 * @see #setNombreMaxiHelico(long)
	 * @see mpia.schema.SchemaPackage#getTypeZoneIntervention_NombreMaxiHelico()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier6"
	 *        extendedMetaData="kind='element' name='NombreMaxiHelico'"
	 * @generated
	 */
	long getNombreMaxiHelico();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeZoneIntervention#getNombreMaxiHelico <em>Nombre Maxi Helico</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre Maxi Helico</em>' attribute.
	 * @see #isSetNombreMaxiHelico()
	 * @see #unsetNombreMaxiHelico()
	 * @see #getNombreMaxiHelico()
	 * @generated
	 */
	void setNombreMaxiHelico(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeZoneIntervention#getNombreMaxiHelico <em>Nombre Maxi Helico</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNombreMaxiHelico()
	 * @see #getNombreMaxiHelico()
	 * @see #setNombreMaxiHelico(long)
	 * @generated
	 */
	void unsetNombreMaxiHelico();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeZoneIntervention#getNombreMaxiHelico <em>Nombre Maxi Helico</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nombre Maxi Helico</em>' attribute is set.
	 * @see #unsetNombreMaxiHelico()
	 * @see #getNombreMaxiHelico()
	 * @see #setNombreMaxiHelico(long)
	 * @generated
	 */
	boolean isSetNombreMaxiHelico();

	/**
	 * Returns the value of the '<em><b>Praticabilite</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoZoneInterventionPraticabilite}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Praticabilite</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Praticabilite</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoZoneInterventionPraticabilite
	 * @see #isSetPraticabilite()
	 * @see #unsetPraticabilite()
	 * @see #setPraticabilite(TypeDictionaryDicoZoneInterventionPraticabilite)
	 * @see mpia.schema.SchemaPackage#getTypeZoneIntervention_Praticabilite()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='Praticabilite'"
	 * @generated
	 */
	TypeDictionaryDicoZoneInterventionPraticabilite getPraticabilite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeZoneIntervention#getPraticabilite <em>Praticabilite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Praticabilite</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoZoneInterventionPraticabilite
	 * @see #isSetPraticabilite()
	 * @see #unsetPraticabilite()
	 * @see #getPraticabilite()
	 * @generated
	 */
	void setPraticabilite(TypeDictionaryDicoZoneInterventionPraticabilite value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeZoneIntervention#getPraticabilite <em>Praticabilite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPraticabilite()
	 * @see #getPraticabilite()
	 * @see #setPraticabilite(TypeDictionaryDicoZoneInterventionPraticabilite)
	 * @generated
	 */
	void unsetPraticabilite();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeZoneIntervention#getPraticabilite <em>Praticabilite</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Praticabilite</em>' attribute is set.
	 * @see #unsetPraticabilite()
	 * @see #getPraticabilite()
	 * @see #setPraticabilite(TypeDictionaryDicoZoneInterventionPraticabilite)
	 * @generated
	 */
	boolean isSetPraticabilite();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoZoneInterventionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoZoneInterventionType
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #setType(TypeDictionaryDicoZoneInterventionType)
	 * @see mpia.schema.SchemaPackage#getTypeZoneIntervention_Type()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='Type'"
	 * @generated
	 */
	TypeDictionaryDicoZoneInterventionType getType();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeZoneIntervention#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoZoneInterventionType
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #getType()
	 * @generated
	 */
	void setType(TypeDictionaryDicoZoneInterventionType value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeZoneIntervention#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetType()
	 * @see #getType()
	 * @see #setType(TypeDictionaryDicoZoneInterventionType)
	 * @generated
	 */
	void unsetType();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeZoneIntervention#getType <em>Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type</em>' attribute is set.
	 * @see #unsetType()
	 * @see #getType()
	 * @see #setType(TypeDictionaryDicoZoneInterventionType)
	 * @generated
	 */
	boolean isSetType();

	/**
	 * Returns the value of the '<em><b>Nature Sol</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoZoneInterventionNatureSol}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nature Sol</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nature Sol</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoZoneInterventionNatureSol
	 * @see #isSetNatureSol()
	 * @see #unsetNatureSol()
	 * @see #setNatureSol(TypeDictionaryDicoZoneInterventionNatureSol)
	 * @see mpia.schema.SchemaPackage#getTypeZoneIntervention_NatureSol()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='NatureSol'"
	 * @generated
	 */
	TypeDictionaryDicoZoneInterventionNatureSol getNatureSol();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeZoneIntervention#getNatureSol <em>Nature Sol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nature Sol</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoZoneInterventionNatureSol
	 * @see #isSetNatureSol()
	 * @see #unsetNatureSol()
	 * @see #getNatureSol()
	 * @generated
	 */
	void setNatureSol(TypeDictionaryDicoZoneInterventionNatureSol value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeZoneIntervention#getNatureSol <em>Nature Sol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNatureSol()
	 * @see #getNatureSol()
	 * @see #setNatureSol(TypeDictionaryDicoZoneInterventionNatureSol)
	 * @generated
	 */
	void unsetNatureSol();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeZoneIntervention#getNatureSol <em>Nature Sol</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nature Sol</em>' attribute is set.
	 * @see #unsetNatureSol()
	 * @see #getNatureSol()
	 * @see #setNatureSol(TypeDictionaryDicoZoneInterventionNatureSol)
	 * @generated
	 */
	boolean isSetNatureSol();

	/**
	 * Returns the value of the '<em><b>Orientation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Orientation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orientation</em>' attribute.
	 * @see #isSetOrientation()
	 * @see #unsetOrientation()
	 * @see #setOrientation(double)
	 * @see mpia.schema.SchemaPackage#getTypeZoneIntervention_Orientation()
	 * @model unsettable="true" dataType="mpia.meta.TypeReal"
	 *        extendedMetaData="kind='element' name='Orientation'"
	 * @generated
	 */
	double getOrientation();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeZoneIntervention#getOrientation <em>Orientation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Orientation</em>' attribute.
	 * @see #isSetOrientation()
	 * @see #unsetOrientation()
	 * @see #getOrientation()
	 * @generated
	 */
	void setOrientation(double value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeZoneIntervention#getOrientation <em>Orientation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetOrientation()
	 * @see #getOrientation()
	 * @see #setOrientation(double)
	 * @generated
	 */
	void unsetOrientation();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeZoneIntervention#getOrientation <em>Orientation</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Orientation</em>' attribute is set.
	 * @see #unsetOrientation()
	 * @see #getOrientation()
	 * @see #setOrientation(double)
	 * @generated
	 */
	boolean isSetOrientation();

	/**
	 * Returns the value of the '<em><b>Taille Maximum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Taille Maximum</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Taille Maximum</em>' attribute.
	 * @see #isSetTailleMaximum()
	 * @see #unsetTailleMaximum()
	 * @see #setTailleMaximum(double)
	 * @see mpia.schema.SchemaPackage#getTypeZoneIntervention_TailleMaximum()
	 * @model unsettable="true" dataType="mpia.meta.TypeReal"
	 *        extendedMetaData="kind='element' name='TailleMaximum'"
	 * @generated
	 */
	double getTailleMaximum();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeZoneIntervention#getTailleMaximum <em>Taille Maximum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Taille Maximum</em>' attribute.
	 * @see #isSetTailleMaximum()
	 * @see #unsetTailleMaximum()
	 * @see #getTailleMaximum()
	 * @generated
	 */
	void setTailleMaximum(double value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeZoneIntervention#getTailleMaximum <em>Taille Maximum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTailleMaximum()
	 * @see #getTailleMaximum()
	 * @see #setTailleMaximum(double)
	 * @generated
	 */
	void unsetTailleMaximum();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeZoneIntervention#getTailleMaximum <em>Taille Maximum</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Taille Maximum</em>' attribute is set.
	 * @see #unsetTailleMaximum()
	 * @see #getTailleMaximum()
	 * @see #setTailleMaximum(double)
	 * @generated
	 */
	boolean isSetTailleMaximum();

	/**
	 * Returns the value of the '<em><b>Zone Reconnue</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoZoneInterventionZoneReconnue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Zone Reconnue</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Zone Reconnue</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoZoneInterventionZoneReconnue
	 * @see #isSetZoneReconnue()
	 * @see #unsetZoneReconnue()
	 * @see #setZoneReconnue(TypeDictionaryDicoZoneInterventionZoneReconnue)
	 * @see mpia.schema.SchemaPackage#getTypeZoneIntervention_ZoneReconnue()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='ZoneReconnue'"
	 * @generated
	 */
	TypeDictionaryDicoZoneInterventionZoneReconnue getZoneReconnue();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeZoneIntervention#getZoneReconnue <em>Zone Reconnue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zone Reconnue</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoZoneInterventionZoneReconnue
	 * @see #isSetZoneReconnue()
	 * @see #unsetZoneReconnue()
	 * @see #getZoneReconnue()
	 * @generated
	 */
	void setZoneReconnue(TypeDictionaryDicoZoneInterventionZoneReconnue value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeZoneIntervention#getZoneReconnue <em>Zone Reconnue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetZoneReconnue()
	 * @see #getZoneReconnue()
	 * @see #setZoneReconnue(TypeDictionaryDicoZoneInterventionZoneReconnue)
	 * @generated
	 */
	void unsetZoneReconnue();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeZoneIntervention#getZoneReconnue <em>Zone Reconnue</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Zone Reconnue</em>' attribute is set.
	 * @see #unsetZoneReconnue()
	 * @see #getZoneReconnue()
	 * @see #setZoneReconnue(TypeDictionaryDicoZoneInterventionZoneReconnue)
	 * @generated
	 */
	boolean isSetZoneReconnue();

} // TypeZoneIntervention
