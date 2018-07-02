/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeAssociation;
import mpia.meta.TypeAssociationEXT;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Articulation Terre</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeArticulationTerre#getTypeODB <em>Type ODB</em>}</li>
 *   <li>{@link mpia.schema.TypeArticulationTerre#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.TypeArticulationTerre#getEstDefinieParUnite <em>Est Definie Par Unite</em>}</li>
 *   <li>{@link mpia.schema.TypeArticulationTerre#getEstConstitueModule <em>Est Constitue Module</em>}</li>
 *   <li>{@link mpia.schema.TypeArticulationTerre#getACommePrelevementPrelevementDetachement <em>AComme Prelevement Prelevement Detachement</em>}</li>
 *   <li>{@link mpia.schema.TypeArticulationTerre#getAPourCoordonneesRadioAdresseRadio <em>APour Coordonnees Radio Adresse Radio</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeArticulationTerre()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_ArticulationTerre' kind='elementOnly'"
 * @generated
 */
public interface TypeArticulationTerre extends TypeArticulation {
	/**
	 * Returns the value of the '<em><b>Type ODB</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoArticulationTerreTypeODB}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type ODB</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type ODB</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoArticulationTerreTypeODB
	 * @see #isSetTypeODB()
	 * @see #unsetTypeODB()
	 * @see #setTypeODB(TypeDictionaryDicoArticulationTerreTypeODB)
	 * @see mpia.schema.SchemaPackage#getTypeArticulationTerre_TypeODB()
	 * @model unsettable="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo operational_key='true'"
	 *        extendedMetaData="kind='element' name='TypeODB'"
	 * @generated
	 */
	TypeDictionaryDicoArticulationTerreTypeODB getTypeODB();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeArticulationTerre#getTypeODB <em>Type ODB</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type ODB</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoArticulationTerreTypeODB
	 * @see #isSetTypeODB()
	 * @see #unsetTypeODB()
	 * @see #getTypeODB()
	 * @generated
	 */
	void setTypeODB(TypeDictionaryDicoArticulationTerreTypeODB value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeArticulationTerre#getTypeODB <em>Type ODB</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTypeODB()
	 * @see #getTypeODB()
	 * @see #setTypeODB(TypeDictionaryDicoArticulationTerreTypeODB)
	 * @generated
	 */
	void unsetTypeODB();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeArticulationTerre#getTypeODB <em>Type ODB</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type ODB</em>' attribute is set.
	 * @see #unsetTypeODB()
	 * @see #getTypeODB()
	 * @see #setTypeODB(TypeDictionaryDicoArticulationTerreTypeODB)
	 * @generated
	 */
	boolean isSetTypeODB();

	/**
	 * Returns the value of the '<em><b>Categorie</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoArticulationTerreCategorie}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categorie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoArticulationTerreCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #setCategorie(TypeDictionaryDicoArticulationTerreCategorie)
	 * @see mpia.schema.SchemaPackage#getTypeArticulationTerre_Categorie()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='Categorie'"
	 * @generated
	 */
	TypeDictionaryDicoArticulationTerreCategorie getCategorie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeArticulationTerre#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoArticulationTerreCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @generated
	 */
	void setCategorie(TypeDictionaryDicoArticulationTerreCategorie value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeArticulationTerre#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoArticulationTerreCategorie)
	 * @generated
	 */
	void unsetCategorie();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeArticulationTerre#getCategorie <em>Categorie</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Categorie</em>' attribute is set.
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoArticulationTerreCategorie)
	 * @generated
	 */
	boolean isSetCategorie();

	/**
	 * Returns the value of the '<em><b>Est Definie Par Unite</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Definie Par Unite</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Definie Par Unite</em>' containment reference.
	 * @see #setEstDefinieParUnite(TypeAssociationEXT)
	 * @see mpia.schema.SchemaPackage#getTypeArticulationTerre_EstDefinieParUnite()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_Unite'"
	 *        extendedMetaData="kind='element' name='EstDefiniePar_Unite'"
	 * @generated
	 */
	TypeAssociationEXT getEstDefinieParUnite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeArticulationTerre#getEstDefinieParUnite <em>Est Definie Par Unite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Est Definie Par Unite</em>' containment reference.
	 * @see #getEstDefinieParUnite()
	 * @generated
	 */
	void setEstDefinieParUnite(TypeAssociationEXT value);

	/**
	 * Returns the value of the '<em><b>Est Constitue Module</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Constitue Module</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Constitue Module</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeArticulationTerre_EstConstitueModule()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_Module'"
	 *        extendedMetaData="kind='element' name='EstConstitue_Module'"
	 * @generated
	 */
	EList<TypeAssociation> getEstConstitueModule();

	/**
	 * Returns the value of the '<em><b>AComme Prelevement Prelevement Detachement</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AComme Prelevement Prelevement Detachement</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AComme Prelevement Prelevement Detachement</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeArticulationTerre_ACommePrelevementPrelevementDetachement()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='PorteSur_ArticulationTerre' target_entity='type_PrelevementDetachement'"
	 *        extendedMetaData="kind='element' name='ACommePrelevement_PrelevementDetachement'"
	 * @generated
	 */
	EList<TypeAssociation> getACommePrelevementPrelevementDetachement();

	/**
	 * Returns the value of the '<em><b>APour Coordonnees Radio Adresse Radio</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Coordonnees Radio Adresse Radio</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Coordonnees Radio Adresse Radio</em>' containment reference.
	 * @see #setAPourCoordonneesRadioAdresseRadio(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeArticulationTerre_APourCoordonneesRadioAdresseRadio()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_AdresseRadio'"
	 *        extendedMetaData="kind='element' name='APourCoordonneesRadio_AdresseRadio'"
	 * @generated
	 */
	TypeAssociation getAPourCoordonneesRadioAdresseRadio();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeArticulationTerre#getAPourCoordonneesRadioAdresseRadio <em>APour Coordonnees Radio Adresse Radio</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Coordonnees Radio Adresse Radio</em>' containment reference.
	 * @see #getAPourCoordonneesRadioAdresseRadio()
	 * @generated
	 */
	void setAPourCoordonneesRadioAdresseRadio(TypeAssociation value);

} // TypeArticulationTerre
