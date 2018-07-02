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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Overlay</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeOverlay#getNumero <em>Numero</em>}</li>
 *   <li>{@link mpia.schema.TypeOverlay#getNom <em>Nom</em>}</li>
 *   <li>{@link mpia.schema.TypeOverlay#getType <em>Type</em>}</li>
 *   <li>{@link mpia.schema.TypeOverlay#getNiveauSecurite <em>Niveau Securite</em>}</li>
 *   <li>{@link mpia.schema.TypeOverlay#getDescriptif <em>Descriptif</em>}</li>
 *   <li>{@link mpia.schema.TypeOverlay#getSignaturePC <em>Signature PC</em>}</li>
 *   <li>{@link mpia.schema.TypeOverlay#getNumeroRoute <em>Numero Route</em>}</li>
 *   <li>{@link mpia.schema.TypeOverlay#getDateInformation <em>Date Information</em>}</li>
 *   <li>{@link mpia.schema.TypeOverlay#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeOverlay#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypeOverlay#getDecritSymboleTactique <em>Decrit Symbole Tactique</em>}</li>
 *   <li>{@link mpia.schema.TypeOverlay#getEstReferenceMissionAerienne <em>Est Reference Mission Aerienne</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeOverlay()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_Overlay' kind='elementOnly'"
 * @generated
 */
public interface TypeOverlay extends EObject {
	/**
	 * Returns the value of the '<em><b>Numero</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Numero</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Numero</em>' attribute.
	 * @see #isSetNumero()
	 * @see #unsetNumero()
	 * @see #setNumero(long)
	 * @see mpia.schema.SchemaPackage#getTypeOverlay_Numero()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier3" required="true"
	 *        annotation="urn:MPIA-schemaInfo operational_key='true'"
	 *        extendedMetaData="kind='element' name='Numero'"
	 * @generated
	 */
	long getNumero();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeOverlay#getNumero <em>Numero</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Numero</em>' attribute.
	 * @see #isSetNumero()
	 * @see #unsetNumero()
	 * @see #getNumero()
	 * @generated
	 */
	void setNumero(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeOverlay#getNumero <em>Numero</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNumero()
	 * @see #getNumero()
	 * @see #setNumero(long)
	 * @generated
	 */
	void unsetNumero();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeOverlay#getNumero <em>Numero</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Numero</em>' attribute is set.
	 * @see #unsetNumero()
	 * @see #getNumero()
	 * @see #setNumero(long)
	 * @generated
	 */
	boolean isSetNumero();

	/**
	 * Returns the value of the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nom</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom</em>' attribute.
	 * @see #setNom(String)
	 * @see mpia.schema.SchemaPackage#getTypeOverlay_Nom()
	 * @model dataType="mpia.meta.TypeDataTypeChaine08" required="true"
	 *        extendedMetaData="kind='element' name='Nom'"
	 * @generated
	 */
	String getNom();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeOverlay#getNom <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom</em>' attribute.
	 * @see #getNom()
	 * @generated
	 */
	void setNom(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoOverlayType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoOverlayType
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #setType(TypeDictionaryDicoOverlayType)
	 * @see mpia.schema.SchemaPackage#getTypeOverlay_Type()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='Type'"
	 * @generated
	 */
	TypeDictionaryDicoOverlayType getType();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeOverlay#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoOverlayType
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #getType()
	 * @generated
	 */
	void setType(TypeDictionaryDicoOverlayType value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeOverlay#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetType()
	 * @see #getType()
	 * @see #setType(TypeDictionaryDicoOverlayType)
	 * @generated
	 */
	void unsetType();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeOverlay#getType <em>Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type</em>' attribute is set.
	 * @see #unsetType()
	 * @see #getType()
	 * @see #setType(TypeDictionaryDicoOverlayType)
	 * @generated
	 */
	boolean isSetType();

	/**
	 * Returns the value of the '<em><b>Niveau Securite</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoOverlayNiveauSecurite}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Niveau Securite</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Niveau Securite</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoOverlayNiveauSecurite
	 * @see #isSetNiveauSecurite()
	 * @see #unsetNiveauSecurite()
	 * @see #setNiveauSecurite(TypeDictionaryDicoOverlayNiveauSecurite)
	 * @see mpia.schema.SchemaPackage#getTypeOverlay_NiveauSecurite()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='NiveauSecurite'"
	 * @generated
	 */
	TypeDictionaryDicoOverlayNiveauSecurite getNiveauSecurite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeOverlay#getNiveauSecurite <em>Niveau Securite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Niveau Securite</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoOverlayNiveauSecurite
	 * @see #isSetNiveauSecurite()
	 * @see #unsetNiveauSecurite()
	 * @see #getNiveauSecurite()
	 * @generated
	 */
	void setNiveauSecurite(TypeDictionaryDicoOverlayNiveauSecurite value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeOverlay#getNiveauSecurite <em>Niveau Securite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNiveauSecurite()
	 * @see #getNiveauSecurite()
	 * @see #setNiveauSecurite(TypeDictionaryDicoOverlayNiveauSecurite)
	 * @generated
	 */
	void unsetNiveauSecurite();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeOverlay#getNiveauSecurite <em>Niveau Securite</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Niveau Securite</em>' attribute is set.
	 * @see #unsetNiveauSecurite()
	 * @see #getNiveauSecurite()
	 * @see #setNiveauSecurite(TypeDictionaryDicoOverlayNiveauSecurite)
	 * @generated
	 */
	boolean isSetNiveauSecurite();

	/**
	 * Returns the value of the '<em><b>Descriptif</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Descriptif</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Descriptif</em>' attribute.
	 * @see #setDescriptif(String)
	 * @see mpia.schema.SchemaPackage#getTypeOverlay_Descriptif()
	 * @model dataType="mpia.meta.TypeDataTypeChaine02000"
	 *        extendedMetaData="kind='element' name='Descriptif'"
	 * @generated
	 */
	String getDescriptif();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeOverlay#getDescriptif <em>Descriptif</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Descriptif</em>' attribute.
	 * @see #getDescriptif()
	 * @generated
	 */
	void setDescriptif(String value);

	/**
	 * Returns the value of the '<em><b>Signature PC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Signature PC</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signature PC</em>' attribute.
	 * @see #setSignaturePC(String)
	 * @see mpia.schema.SchemaPackage#getTypeOverlay_SignaturePC()
	 * @model dataType="mpia.meta.TypeDataTypeChaine08"
	 *        extendedMetaData="kind='element' name='SignaturePC'"
	 * @generated
	 */
	String getSignaturePC();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeOverlay#getSignaturePC <em>Signature PC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signature PC</em>' attribute.
	 * @see #getSignaturePC()
	 * @generated
	 */
	void setSignaturePC(String value);

	/**
	 * Returns the value of the '<em><b>Numero Route</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Numero Route</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Numero Route</em>' attribute.
	 * @see #isSetNumeroRoute()
	 * @see #unsetNumeroRoute()
	 * @see #setNumeroRoute(long)
	 * @see mpia.schema.SchemaPackage#getTypeOverlay_NumeroRoute()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier3"
	 *        extendedMetaData="kind='element' name='NumeroRoute'"
	 * @generated
	 */
	long getNumeroRoute();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeOverlay#getNumeroRoute <em>Numero Route</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Numero Route</em>' attribute.
	 * @see #isSetNumeroRoute()
	 * @see #unsetNumeroRoute()
	 * @see #getNumeroRoute()
	 * @generated
	 */
	void setNumeroRoute(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeOverlay#getNumeroRoute <em>Numero Route</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNumeroRoute()
	 * @see #getNumeroRoute()
	 * @see #setNumeroRoute(long)
	 * @generated
	 */
	void unsetNumeroRoute();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeOverlay#getNumeroRoute <em>Numero Route</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Numero Route</em>' attribute is set.
	 * @see #unsetNumeroRoute()
	 * @see #getNumeroRoute()
	 * @see #setNumeroRoute(long)
	 * @generated
	 */
	boolean isSetNumeroRoute();

	/**
	 * Returns the value of the '<em><b>Date Information</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Information</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Information</em>' attribute.
	 * @see #setDateInformation(XMLGregorianCalendar)
	 * @see mpia.schema.SchemaPackage#getTypeOverlay_DateInformation()
	 * @model dataType="mpia.meta.TypeDataTypeGDH"
	 *        extendedMetaData="kind='element' name='DateInformation'"
	 * @generated
	 */
	XMLGregorianCalendar getDateInformation();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeOverlay#getDateInformation <em>Date Information</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Information</em>' attribute.
	 * @see #getDateInformation()
	 * @generated
	 */
	void setDateInformation(XMLGregorianCalendar value);

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
	 * @see mpia.schema.SchemaPackage#getTypeOverlay_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeOverlay#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeOverlay_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeOverlay#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

	/**
	 * Returns the value of the '<em><b>Decrit Symbole Tactique</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Decrit Symbole Tactique</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decrit Symbole Tactique</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeOverlay_DecritSymboleTactique()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_SymboleTactique'"
	 *        extendedMetaData="kind='element' name='Decrit_SymboleTactique'"
	 * @generated
	 */
	EList<TypeAssociation> getDecritSymboleTactique();

	/**
	 * Returns the value of the '<em><b>Est Reference Mission Aerienne</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Reference Mission Aerienne</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Reference Mission Aerienne</em>' containment reference.
	 * @see #setEstReferenceMissionAerienne(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeOverlay_EstReferenceMissionAerienne()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='EstAssocie_Overlay' target_entity='type_MissionAerienne'"
	 *        extendedMetaData="kind='element' name='EstReference_MissionAerienne'"
	 * @generated
	 */
	TypeAssociation getEstReferenceMissionAerienne();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeOverlay#getEstReferenceMissionAerienne <em>Est Reference Mission Aerienne</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Est Reference Mission Aerienne</em>' containment reference.
	 * @see #getEstReferenceMissionAerienne()
	 * @generated
	 */
	void setEstReferenceMissionAerienne(TypeAssociation value);

} // TypeOverlay
