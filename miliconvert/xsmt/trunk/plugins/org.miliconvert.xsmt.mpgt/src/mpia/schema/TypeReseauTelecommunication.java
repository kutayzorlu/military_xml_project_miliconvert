/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeAssociation;
import mpia.meta.TypeDataTypeFrequence;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Reseau Telecommunication</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeReseauTelecommunication#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.TypeReseauTelecommunication#getSousCategorie <em>Sous Categorie</em>}</li>
 *   <li>{@link mpia.schema.TypeReseauTelecommunication#getArchitecture <em>Architecture</em>}</li>
 *   <li>{@link mpia.schema.TypeReseauTelecommunication#getType <em>Type</em>}</li>
 *   <li>{@link mpia.schema.TypeReseauTelecommunication#getDebitMinimum <em>Debit Minimum</em>}</li>
 *   <li>{@link mpia.schema.TypeReseauTelecommunication#getDebitMaximum <em>Debit Maximum</em>}</li>
 *   <li>{@link mpia.schema.TypeReseauTelecommunication#getMedia <em>Media</em>}</li>
 *   <li>{@link mpia.schema.TypeReseauTelecommunication#getNombreCanaux <em>Nombre Canaux</em>}</li>
 *   <li>{@link mpia.schema.TypeReseauTelecommunication#getNiveauQualite <em>Niveau Qualite</em>}</li>
 *   <li>{@link mpia.schema.TypeReseauTelecommunication#getSautFrequence <em>Saut Frequence</em>}</li>
 *   <li>{@link mpia.schema.TypeReseauTelecommunication#getAPourServiceReseauServiceReseau <em>APour Service Reseau Service Reseau</em>}</li>
 *   <li>{@link mpia.schema.TypeReseauTelecommunication#getACommeCapaciteReseauCapaciteReseau <em>AComme Capacite Reseau Capacite Reseau</em>}</li>
 *   <li>{@link mpia.schema.TypeReseauTelecommunication#getAPourFrequenceFrequence <em>APour Frequence Frequence</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeReseauTelecommunication()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_ReseauTelecommunication' kind='elementOnly'"
 * @generated
 */
public interface TypeReseauTelecommunication extends TypeSite {
	/**
	 * Returns the value of the '<em><b>Categorie</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoReseauTelecommunicationCategorie}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categorie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoReseauTelecommunicationCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #setCategorie(TypeDictionaryDicoReseauTelecommunicationCategorie)
	 * @see mpia.schema.SchemaPackage#getTypeReseauTelecommunication_Categorie()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='Categorie'"
	 * @generated
	 */
	TypeDictionaryDicoReseauTelecommunicationCategorie getCategorie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeReseauTelecommunication#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoReseauTelecommunicationCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @generated
	 */
	void setCategorie(TypeDictionaryDicoReseauTelecommunicationCategorie value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeReseauTelecommunication#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoReseauTelecommunicationCategorie)
	 * @generated
	 */
	void unsetCategorie();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeReseauTelecommunication#getCategorie <em>Categorie</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Categorie</em>' attribute is set.
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoReseauTelecommunicationCategorie)
	 * @generated
	 */
	boolean isSetCategorie();

	/**
	 * Returns the value of the '<em><b>Sous Categorie</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoReseauTelecommunicationSousCategorie}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sous Categorie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sous Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoReseauTelecommunicationSousCategorie
	 * @see #isSetSousCategorie()
	 * @see #unsetSousCategorie()
	 * @see #setSousCategorie(TypeDictionaryDicoReseauTelecommunicationSousCategorie)
	 * @see mpia.schema.SchemaPackage#getTypeReseauTelecommunication_SousCategorie()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='SousCategorie'"
	 * @generated
	 */
	TypeDictionaryDicoReseauTelecommunicationSousCategorie getSousCategorie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeReseauTelecommunication#getSousCategorie <em>Sous Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sous Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoReseauTelecommunicationSousCategorie
	 * @see #isSetSousCategorie()
	 * @see #unsetSousCategorie()
	 * @see #getSousCategorie()
	 * @generated
	 */
	void setSousCategorie(TypeDictionaryDicoReseauTelecommunicationSousCategorie value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeReseauTelecommunication#getSousCategorie <em>Sous Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSousCategorie()
	 * @see #getSousCategorie()
	 * @see #setSousCategorie(TypeDictionaryDicoReseauTelecommunicationSousCategorie)
	 * @generated
	 */
	void unsetSousCategorie();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeReseauTelecommunication#getSousCategorie <em>Sous Categorie</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Sous Categorie</em>' attribute is set.
	 * @see #unsetSousCategorie()
	 * @see #getSousCategorie()
	 * @see #setSousCategorie(TypeDictionaryDicoReseauTelecommunicationSousCategorie)
	 * @generated
	 */
	boolean isSetSousCategorie();

	/**
	 * Returns the value of the '<em><b>Architecture</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoReseauTelecommunicationArchitecture}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Architecture</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Architecture</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoReseauTelecommunicationArchitecture
	 * @see #isSetArchitecture()
	 * @see #unsetArchitecture()
	 * @see #setArchitecture(TypeDictionaryDicoReseauTelecommunicationArchitecture)
	 * @see mpia.schema.SchemaPackage#getTypeReseauTelecommunication_Architecture()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='Architecture'"
	 * @generated
	 */
	TypeDictionaryDicoReseauTelecommunicationArchitecture getArchitecture();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeReseauTelecommunication#getArchitecture <em>Architecture</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Architecture</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoReseauTelecommunicationArchitecture
	 * @see #isSetArchitecture()
	 * @see #unsetArchitecture()
	 * @see #getArchitecture()
	 * @generated
	 */
	void setArchitecture(TypeDictionaryDicoReseauTelecommunicationArchitecture value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeReseauTelecommunication#getArchitecture <em>Architecture</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetArchitecture()
	 * @see #getArchitecture()
	 * @see #setArchitecture(TypeDictionaryDicoReseauTelecommunicationArchitecture)
	 * @generated
	 */
	void unsetArchitecture();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeReseauTelecommunication#getArchitecture <em>Architecture</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Architecture</em>' attribute is set.
	 * @see #unsetArchitecture()
	 * @see #getArchitecture()
	 * @see #setArchitecture(TypeDictionaryDicoReseauTelecommunicationArchitecture)
	 * @generated
	 */
	boolean isSetArchitecture();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoReseauTelecommunicationType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoReseauTelecommunicationType
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #setType(TypeDictionaryDicoReseauTelecommunicationType)
	 * @see mpia.schema.SchemaPackage#getTypeReseauTelecommunication_Type()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='Type'"
	 * @generated
	 */
	TypeDictionaryDicoReseauTelecommunicationType getType();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeReseauTelecommunication#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoReseauTelecommunicationType
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #getType()
	 * @generated
	 */
	void setType(TypeDictionaryDicoReseauTelecommunicationType value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeReseauTelecommunication#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetType()
	 * @see #getType()
	 * @see #setType(TypeDictionaryDicoReseauTelecommunicationType)
	 * @generated
	 */
	void unsetType();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeReseauTelecommunication#getType <em>Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type</em>' attribute is set.
	 * @see #unsetType()
	 * @see #getType()
	 * @see #setType(TypeDictionaryDicoReseauTelecommunicationType)
	 * @generated
	 */
	boolean isSetType();

	/**
	 * Returns the value of the '<em><b>Debit Minimum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Debit Minimum</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Debit Minimum</em>' attribute.
	 * @see #isSetDebitMinimum()
	 * @see #unsetDebitMinimum()
	 * @see #setDebitMinimum(double)
	 * @see mpia.schema.SchemaPackage#getTypeReseauTelecommunication_DebitMinimum()
	 * @model unsettable="true" dataType="mpia.meta.TypeReal"
	 *        extendedMetaData="kind='element' name='DebitMinimum'"
	 * @generated
	 */
	double getDebitMinimum();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeReseauTelecommunication#getDebitMinimum <em>Debit Minimum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Debit Minimum</em>' attribute.
	 * @see #isSetDebitMinimum()
	 * @see #unsetDebitMinimum()
	 * @see #getDebitMinimum()
	 * @generated
	 */
	void setDebitMinimum(double value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeReseauTelecommunication#getDebitMinimum <em>Debit Minimum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDebitMinimum()
	 * @see #getDebitMinimum()
	 * @see #setDebitMinimum(double)
	 * @generated
	 */
	void unsetDebitMinimum();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeReseauTelecommunication#getDebitMinimum <em>Debit Minimum</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Debit Minimum</em>' attribute is set.
	 * @see #unsetDebitMinimum()
	 * @see #getDebitMinimum()
	 * @see #setDebitMinimum(double)
	 * @generated
	 */
	boolean isSetDebitMinimum();

	/**
	 * Returns the value of the '<em><b>Debit Maximum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Debit Maximum</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Debit Maximum</em>' attribute.
	 * @see #isSetDebitMaximum()
	 * @see #unsetDebitMaximum()
	 * @see #setDebitMaximum(double)
	 * @see mpia.schema.SchemaPackage#getTypeReseauTelecommunication_DebitMaximum()
	 * @model unsettable="true" dataType="mpia.meta.TypeReal"
	 *        extendedMetaData="kind='element' name='DebitMaximum'"
	 * @generated
	 */
	double getDebitMaximum();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeReseauTelecommunication#getDebitMaximum <em>Debit Maximum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Debit Maximum</em>' attribute.
	 * @see #isSetDebitMaximum()
	 * @see #unsetDebitMaximum()
	 * @see #getDebitMaximum()
	 * @generated
	 */
	void setDebitMaximum(double value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeReseauTelecommunication#getDebitMaximum <em>Debit Maximum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDebitMaximum()
	 * @see #getDebitMaximum()
	 * @see #setDebitMaximum(double)
	 * @generated
	 */
	void unsetDebitMaximum();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeReseauTelecommunication#getDebitMaximum <em>Debit Maximum</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Debit Maximum</em>' attribute is set.
	 * @see #unsetDebitMaximum()
	 * @see #getDebitMaximum()
	 * @see #setDebitMaximum(double)
	 * @generated
	 */
	boolean isSetDebitMaximum();

	/**
	 * Returns the value of the '<em><b>Media</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoReseauTelecommunicationMedia}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Media</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Media</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoReseauTelecommunicationMedia
	 * @see #isSetMedia()
	 * @see #unsetMedia()
	 * @see #setMedia(TypeDictionaryDicoReseauTelecommunicationMedia)
	 * @see mpia.schema.SchemaPackage#getTypeReseauTelecommunication_Media()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='Media'"
	 * @generated
	 */
	TypeDictionaryDicoReseauTelecommunicationMedia getMedia();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeReseauTelecommunication#getMedia <em>Media</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Media</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoReseauTelecommunicationMedia
	 * @see #isSetMedia()
	 * @see #unsetMedia()
	 * @see #getMedia()
	 * @generated
	 */
	void setMedia(TypeDictionaryDicoReseauTelecommunicationMedia value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeReseauTelecommunication#getMedia <em>Media</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMedia()
	 * @see #getMedia()
	 * @see #setMedia(TypeDictionaryDicoReseauTelecommunicationMedia)
	 * @generated
	 */
	void unsetMedia();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeReseauTelecommunication#getMedia <em>Media</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Media</em>' attribute is set.
	 * @see #unsetMedia()
	 * @see #getMedia()
	 * @see #setMedia(TypeDictionaryDicoReseauTelecommunicationMedia)
	 * @generated
	 */
	boolean isSetMedia();

	/**
	 * Returns the value of the '<em><b>Nombre Canaux</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre Canaux</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre Canaux</em>' attribute.
	 * @see #isSetNombreCanaux()
	 * @see #unsetNombreCanaux()
	 * @see #setNombreCanaux(long)
	 * @see mpia.schema.SchemaPackage#getTypeReseauTelecommunication_NombreCanaux()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier9"
	 *        extendedMetaData="kind='element' name='NombreCanaux'"
	 * @generated
	 */
	long getNombreCanaux();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeReseauTelecommunication#getNombreCanaux <em>Nombre Canaux</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre Canaux</em>' attribute.
	 * @see #isSetNombreCanaux()
	 * @see #unsetNombreCanaux()
	 * @see #getNombreCanaux()
	 * @generated
	 */
	void setNombreCanaux(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeReseauTelecommunication#getNombreCanaux <em>Nombre Canaux</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNombreCanaux()
	 * @see #getNombreCanaux()
	 * @see #setNombreCanaux(long)
	 * @generated
	 */
	void unsetNombreCanaux();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeReseauTelecommunication#getNombreCanaux <em>Nombre Canaux</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nombre Canaux</em>' attribute is set.
	 * @see #unsetNombreCanaux()
	 * @see #getNombreCanaux()
	 * @see #setNombreCanaux(long)
	 * @generated
	 */
	boolean isSetNombreCanaux();

	/**
	 * Returns the value of the '<em><b>Niveau Qualite</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoReseauTelecommunicationNiveauQualite}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Niveau Qualite</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Niveau Qualite</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoReseauTelecommunicationNiveauQualite
	 * @see #isSetNiveauQualite()
	 * @see #unsetNiveauQualite()
	 * @see #setNiveauQualite(TypeDictionaryDicoReseauTelecommunicationNiveauQualite)
	 * @see mpia.schema.SchemaPackage#getTypeReseauTelecommunication_NiveauQualite()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='NiveauQualite'"
	 * @generated
	 */
	TypeDictionaryDicoReseauTelecommunicationNiveauQualite getNiveauQualite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeReseauTelecommunication#getNiveauQualite <em>Niveau Qualite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Niveau Qualite</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoReseauTelecommunicationNiveauQualite
	 * @see #isSetNiveauQualite()
	 * @see #unsetNiveauQualite()
	 * @see #getNiveauQualite()
	 * @generated
	 */
	void setNiveauQualite(TypeDictionaryDicoReseauTelecommunicationNiveauQualite value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeReseauTelecommunication#getNiveauQualite <em>Niveau Qualite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNiveauQualite()
	 * @see #getNiveauQualite()
	 * @see #setNiveauQualite(TypeDictionaryDicoReseauTelecommunicationNiveauQualite)
	 * @generated
	 */
	void unsetNiveauQualite();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeReseauTelecommunication#getNiveauQualite <em>Niveau Qualite</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Niveau Qualite</em>' attribute is set.
	 * @see #unsetNiveauQualite()
	 * @see #getNiveauQualite()
	 * @see #setNiveauQualite(TypeDictionaryDicoReseauTelecommunicationNiveauQualite)
	 * @generated
	 */
	boolean isSetNiveauQualite();

	/**
	 * Returns the value of the '<em><b>Saut Frequence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Saut Frequence</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Saut Frequence</em>' containment reference.
	 * @see #setSautFrequence(TypeDataTypeFrequence)
	 * @see mpia.schema.SchemaPackage#getTypeReseauTelecommunication_SautFrequence()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SautFrequence'"
	 * @generated
	 */
	TypeDataTypeFrequence getSautFrequence();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeReseauTelecommunication#getSautFrequence <em>Saut Frequence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Saut Frequence</em>' containment reference.
	 * @see #getSautFrequence()
	 * @generated
	 */
	void setSautFrequence(TypeDataTypeFrequence value);

	/**
	 * Returns the value of the '<em><b>APour Service Reseau Service Reseau</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Service Reseau Service Reseau</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Service Reseau Service Reseau</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeReseauTelecommunication_APourServiceReseauServiceReseau()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='EstAssocieAuReseau_ReseauTelecommunication' target_entity='type_ServiceReseau'"
	 *        extendedMetaData="kind='element' name='APourServiceReseau_ServiceReseau'"
	 * @generated
	 */
	EList<TypeAssociation> getAPourServiceReseauServiceReseau();

	/**
	 * Returns the value of the '<em><b>AComme Capacite Reseau Capacite Reseau</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeCapaciteReseau}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AComme Capacite Reseau Capacite Reseau</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AComme Capacite Reseau Capacite Reseau</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeReseauTelecommunication_ACommeCapaciteReseauCapaciteReseau()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_CapaciteReseau'"
	 *        extendedMetaData="kind='element' name='ACommeCapaciteReseau_CapaciteReseau'"
	 * @generated
	 */
	EList<TypeCapaciteReseau> getACommeCapaciteReseauCapaciteReseau();

	/**
	 * Returns the value of the '<em><b>APour Frequence Frequence</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeFrequence}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Frequence Frequence</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Frequence Frequence</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeReseauTelecommunication_APourFrequenceFrequence()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_Frequence'"
	 *        extendedMetaData="kind='element' name='APourFrequence_Frequence'"
	 * @generated
	 */
	EList<TypeFrequence> getAPourFrequenceFrequence();

} // TypeReseauTelecommunication
