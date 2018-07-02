/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import javax.xml.datatype.XMLGregorianCalendar;

import mpia.meta.TypeAssociation;
import mpia.meta.TypeDataTypeDuree;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Renforcements Feux</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeRenforcementsFeux#getTypeRenforcement <em>Type Renforcement</em>}</li>
 *   <li>{@link mpia.schema.TypeRenforcementsFeux#getAutreTypeRenforcement <em>Autre Type Renforcement</em>}</li>
 *   <li>{@link mpia.schema.TypeRenforcementsFeux#getPreavis <em>Preavis</em>}</li>
 *   <li>{@link mpia.schema.TypeRenforcementsFeux#getDebutValidite <em>Debut Validite</em>}</li>
 *   <li>{@link mpia.schema.TypeRenforcementsFeux#getEstObjetAssociationUniteRenforcementsFeux <em>Est Objet Association Unite Renforcements Feux</em>}</li>
 *   <li>{@link mpia.schema.TypeRenforcementsFeux#getEstLocaliseEnAutreElementControle <em>Est Localise En Autre Element Controle</em>}</li>
 *   <li>{@link mpia.schema.TypeRenforcementsFeux#getAPourConsommationAlloueeVolumeMunitionsASS <em>APour Consommation Allouee Volume Munitions ASS</em>}</li>
 *   <li>{@link mpia.schema.TypeRenforcementsFeux#getAPourMunitionsRestantesVolumeMunitionsASS <em>APour Munitions Restantes Volume Munitions ASS</em>}</li>
 *   <li>{@link mpia.schema.TypeRenforcementsFeux#getAPourTypeRessourceRessourceActiviteType <em>APour Type Ressource Ressource Activite Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeRenforcementsFeux()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_RenforcementsFeux' kind='elementOnly'"
 * @generated
 */
public interface TypeRenforcementsFeux extends TypeMission {
	/**
	 * Returns the value of the '<em><b>Type Renforcement</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoTypeMissionASS}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Renforcement</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Renforcement</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoTypeMissionASS
	 * @see #isSetTypeRenforcement()
	 * @see #unsetTypeRenforcement()
	 * @see #setTypeRenforcement(TypeDictionaryDicoTypeMissionASS)
	 * @see mpia.schema.SchemaPackage#getTypeRenforcementsFeux_TypeRenforcement()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='TypeRenforcement'"
	 * @generated
	 */
	TypeDictionaryDicoTypeMissionASS getTypeRenforcement();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeRenforcementsFeux#getTypeRenforcement <em>Type Renforcement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Renforcement</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoTypeMissionASS
	 * @see #isSetTypeRenforcement()
	 * @see #unsetTypeRenforcement()
	 * @see #getTypeRenforcement()
	 * @generated
	 */
	void setTypeRenforcement(TypeDictionaryDicoTypeMissionASS value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeRenforcementsFeux#getTypeRenforcement <em>Type Renforcement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTypeRenforcement()
	 * @see #getTypeRenforcement()
	 * @see #setTypeRenforcement(TypeDictionaryDicoTypeMissionASS)
	 * @generated
	 */
	void unsetTypeRenforcement();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeRenforcementsFeux#getTypeRenforcement <em>Type Renforcement</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type Renforcement</em>' attribute is set.
	 * @see #unsetTypeRenforcement()
	 * @see #getTypeRenforcement()
	 * @see #setTypeRenforcement(TypeDictionaryDicoTypeMissionASS)
	 * @generated
	 */
	boolean isSetTypeRenforcement();

	/**
	 * Returns the value of the '<em><b>Autre Type Renforcement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Autre Type Renforcement</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Autre Type Renforcement</em>' attribute.
	 * @see #setAutreTypeRenforcement(String)
	 * @see mpia.schema.SchemaPackage#getTypeRenforcementsFeux_AutreTypeRenforcement()
	 * @model dataType="mpia.meta.TypeDataTypeChaine080"
	 *        extendedMetaData="kind='element' name='AutreTypeRenforcement'"
	 * @generated
	 */
	String getAutreTypeRenforcement();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeRenforcementsFeux#getAutreTypeRenforcement <em>Autre Type Renforcement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Autre Type Renforcement</em>' attribute.
	 * @see #getAutreTypeRenforcement()
	 * @generated
	 */
	void setAutreTypeRenforcement(String value);

	/**
	 * Returns the value of the '<em><b>Preavis</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Preavis</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Preavis</em>' containment reference.
	 * @see #setPreavis(TypeDataTypeDuree)
	 * @see mpia.schema.SchemaPackage#getTypeRenforcementsFeux_Preavis()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Preavis'"
	 * @generated
	 */
	TypeDataTypeDuree getPreavis();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeRenforcementsFeux#getPreavis <em>Preavis</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Preavis</em>' containment reference.
	 * @see #getPreavis()
	 * @generated
	 */
	void setPreavis(TypeDataTypeDuree value);

	/**
	 * Returns the value of the '<em><b>Debut Validite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Debut Validite</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Debut Validite</em>' attribute.
	 * @see #setDebutValidite(XMLGregorianCalendar)
	 * @see mpia.schema.SchemaPackage#getTypeRenforcementsFeux_DebutValidite()
	 * @model dataType="mpia.meta.TypeDataTypeGDH"
	 *        extendedMetaData="kind='element' name='DebutValidite'"
	 * @generated
	 */
	XMLGregorianCalendar getDebutValidite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeRenforcementsFeux#getDebutValidite <em>Debut Validite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Debut Validite</em>' attribute.
	 * @see #getDebutValidite()
	 * @generated
	 */
	void setDebutValidite(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Est Objet Association Unite Renforcements Feux</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Objet Association Unite Renforcements Feux</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Objet Association Unite Renforcements Feux</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeRenforcementsFeux_EstObjetAssociationUniteRenforcementsFeux()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='APourObjet_RenforcementsFeux' target_entity='type_AssociationUniteRenforcementsFeux'"
	 *        extendedMetaData="kind='element' name='EstObjet_AssociationUniteRenforcementsFeux'"
	 * @generated
	 */
	EList<TypeAssociation> getEstObjetAssociationUniteRenforcementsFeux();

	/**
	 * Returns the value of the '<em><b>Est Localise En Autre Element Controle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Localise En Autre Element Controle</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Localise En Autre Element Controle</em>' containment reference.
	 * @see #setEstLocaliseEnAutreElementControle(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeRenforcementsFeux_EstLocaliseEnAutreElementControle()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_AutreElementControle'"
	 *        extendedMetaData="kind='element' name='EstLocaliseEn_AutreElementControle'"
	 * @generated
	 */
	TypeAssociation getEstLocaliseEnAutreElementControle();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeRenforcementsFeux#getEstLocaliseEnAutreElementControle <em>Est Localise En Autre Element Controle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Est Localise En Autre Element Controle</em>' containment reference.
	 * @see #getEstLocaliseEnAutreElementControle()
	 * @generated
	 */
	void setEstLocaliseEnAutreElementControle(TypeAssociation value);

	/**
	 * Returns the value of the '<em><b>APour Consommation Allouee Volume Munitions ASS</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Consommation Allouee Volume Munitions ASS</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Consommation Allouee Volume Munitions ASS</em>' containment reference.
	 * @see #setAPourConsommationAlloueeVolumeMunitionsASS(TypeVolumeMunitionsASS)
	 * @see mpia.schema.SchemaPackage#getTypeRenforcementsFeux_APourConsommationAlloueeVolumeMunitionsASS()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_VolumeMunitionsASS'"
	 *        extendedMetaData="kind='element' name='APourConsommationAllouee_VolumeMunitionsASS'"
	 * @generated
	 */
	TypeVolumeMunitionsASS getAPourConsommationAlloueeVolumeMunitionsASS();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeRenforcementsFeux#getAPourConsommationAlloueeVolumeMunitionsASS <em>APour Consommation Allouee Volume Munitions ASS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Consommation Allouee Volume Munitions ASS</em>' containment reference.
	 * @see #getAPourConsommationAlloueeVolumeMunitionsASS()
	 * @generated
	 */
	void setAPourConsommationAlloueeVolumeMunitionsASS(TypeVolumeMunitionsASS value);

	/**
	 * Returns the value of the '<em><b>APour Munitions Restantes Volume Munitions ASS</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Munitions Restantes Volume Munitions ASS</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Munitions Restantes Volume Munitions ASS</em>' containment reference.
	 * @see #setAPourMunitionsRestantesVolumeMunitionsASS(TypeVolumeMunitionsASS)
	 * @see mpia.schema.SchemaPackage#getTypeRenforcementsFeux_APourMunitionsRestantesVolumeMunitionsASS()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_VolumeMunitionsASS'"
	 *        extendedMetaData="kind='element' name='APourMunitionsRestantes_VolumeMunitionsASS'"
	 * @generated
	 */
	TypeVolumeMunitionsASS getAPourMunitionsRestantesVolumeMunitionsASS();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeRenforcementsFeux#getAPourMunitionsRestantesVolumeMunitionsASS <em>APour Munitions Restantes Volume Munitions ASS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Munitions Restantes Volume Munitions ASS</em>' containment reference.
	 * @see #getAPourMunitionsRestantesVolumeMunitionsASS()
	 * @generated
	 */
	void setAPourMunitionsRestantesVolumeMunitionsASS(TypeVolumeMunitionsASS value);

	/**
	 * Returns the value of the '<em><b>APour Type Ressource Ressource Activite Type</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeRessourceActiviteType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Type Ressource Ressource Activite Type</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Type Ressource Ressource Activite Type</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeRenforcementsFeux_APourTypeRessourceRessourceActiviteType()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_RessourceActiviteType'"
	 *        extendedMetaData="kind='element' name='APourTypeRessource_RessourceActiviteType'"
	 * @generated
	 */
	EList<TypeRessourceActiviteType> getAPourTypeRessourceRessourceActiviteType();

} // TypeRenforcementsFeux
