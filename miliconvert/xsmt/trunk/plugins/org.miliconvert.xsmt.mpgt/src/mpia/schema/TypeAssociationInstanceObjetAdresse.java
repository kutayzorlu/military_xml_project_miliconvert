/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeAssociation;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Association Instance Objet Adresse</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeAssociationInstanceObjetAdresse#getDesignation <em>Designation</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationInstanceObjetAdresse#getPriorite <em>Priorite</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationInstanceObjetAdresse#getTransmissionEtReception <em>Transmission Et Reception</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationInstanceObjetAdresse#isAutorisationUtilisation <em>Autorisation Utilisation</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationInstanceObjetAdresse#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationInstanceObjetAdresse#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationInstanceObjetAdresse#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationInstanceObjetAdresse#getAssocieCommeObjetAdresse <em>Associe Comme Objet Adresse</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationInstanceObjetAdresse#getAssocieCommeSujetInstanceObjet <em>Associe Comme Sujet Instance Objet</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationInstanceObjetAdresse#getEstRapporteeParRapport <em>Est Rapportee Par Rapport</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeAssociationInstanceObjetAdresse()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_AssociationInstanceObjetAdresse' kind='elementOnly'"
 * @generated
 */
public interface TypeAssociationInstanceObjetAdresse extends EObject {
	/**
	 * Returns the value of the '<em><b>Designation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Designation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Designation</em>' attribute.
	 * @see #setDesignation(String)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationInstanceObjetAdresse_Designation()
	 * @model dataType="mpia.meta.TypeDataTypeChaine050"
	 *        extendedMetaData="kind='element' name='Designation'"
	 * @generated
	 */
	String getDesignation();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationInstanceObjetAdresse#getDesignation <em>Designation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Designation</em>' attribute.
	 * @see #getDesignation()
	 * @generated
	 */
	void setDesignation(String value);

	/**
	 * Returns the value of the '<em><b>Priorite</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoAssociationInstanceObjetAdressePriorite}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Priorite</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Priorite</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoAssociationInstanceObjetAdressePriorite
	 * @see #isSetPriorite()
	 * @see #unsetPriorite()
	 * @see #setPriorite(TypeDictionaryDicoAssociationInstanceObjetAdressePriorite)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationInstanceObjetAdresse_Priorite()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='Priorite'"
	 * @generated
	 */
	TypeDictionaryDicoAssociationInstanceObjetAdressePriorite getPriorite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationInstanceObjetAdresse#getPriorite <em>Priorite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priorite</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoAssociationInstanceObjetAdressePriorite
	 * @see #isSetPriorite()
	 * @see #unsetPriorite()
	 * @see #getPriorite()
	 * @generated
	 */
	void setPriorite(TypeDictionaryDicoAssociationInstanceObjetAdressePriorite value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeAssociationInstanceObjetAdresse#getPriorite <em>Priorite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPriorite()
	 * @see #getPriorite()
	 * @see #setPriorite(TypeDictionaryDicoAssociationInstanceObjetAdressePriorite)
	 * @generated
	 */
	void unsetPriorite();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeAssociationInstanceObjetAdresse#getPriorite <em>Priorite</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Priorite</em>' attribute is set.
	 * @see #unsetPriorite()
	 * @see #getPriorite()
	 * @see #setPriorite(TypeDictionaryDicoAssociationInstanceObjetAdressePriorite)
	 * @generated
	 */
	boolean isSetPriorite();

	/**
	 * Returns the value of the '<em><b>Transmission Et Reception</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoAssociationInstanceObjetAdresseTransmissionEtReception}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transmission Et Reception</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transmission Et Reception</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoAssociationInstanceObjetAdresseTransmissionEtReception
	 * @see #isSetTransmissionEtReception()
	 * @see #unsetTransmissionEtReception()
	 * @see #setTransmissionEtReception(TypeDictionaryDicoAssociationInstanceObjetAdresseTransmissionEtReception)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationInstanceObjetAdresse_TransmissionEtReception()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='TransmissionEtReception'"
	 * @generated
	 */
	TypeDictionaryDicoAssociationInstanceObjetAdresseTransmissionEtReception getTransmissionEtReception();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationInstanceObjetAdresse#getTransmissionEtReception <em>Transmission Et Reception</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transmission Et Reception</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoAssociationInstanceObjetAdresseTransmissionEtReception
	 * @see #isSetTransmissionEtReception()
	 * @see #unsetTransmissionEtReception()
	 * @see #getTransmissionEtReception()
	 * @generated
	 */
	void setTransmissionEtReception(TypeDictionaryDicoAssociationInstanceObjetAdresseTransmissionEtReception value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeAssociationInstanceObjetAdresse#getTransmissionEtReception <em>Transmission Et Reception</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTransmissionEtReception()
	 * @see #getTransmissionEtReception()
	 * @see #setTransmissionEtReception(TypeDictionaryDicoAssociationInstanceObjetAdresseTransmissionEtReception)
	 * @generated
	 */
	void unsetTransmissionEtReception();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeAssociationInstanceObjetAdresse#getTransmissionEtReception <em>Transmission Et Reception</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Transmission Et Reception</em>' attribute is set.
	 * @see #unsetTransmissionEtReception()
	 * @see #getTransmissionEtReception()
	 * @see #setTransmissionEtReception(TypeDictionaryDicoAssociationInstanceObjetAdresseTransmissionEtReception)
	 * @generated
	 */
	boolean isSetTransmissionEtReception();

	/**
	 * Returns the value of the '<em><b>Autorisation Utilisation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Autorisation Utilisation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Autorisation Utilisation</em>' attribute.
	 * @see #isSetAutorisationUtilisation()
	 * @see #unsetAutorisationUtilisation()
	 * @see #setAutorisationUtilisation(boolean)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationInstanceObjetAdresse_AutorisationUtilisation()
	 * @model unsettable="true" dataType="mpia.meta.TypeBoolean"
	 *        extendedMetaData="kind='element' name='AutorisationUtilisation'"
	 * @generated
	 */
	boolean isAutorisationUtilisation();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationInstanceObjetAdresse#isAutorisationUtilisation <em>Autorisation Utilisation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Autorisation Utilisation</em>' attribute.
	 * @see #isSetAutorisationUtilisation()
	 * @see #unsetAutorisationUtilisation()
	 * @see #isAutorisationUtilisation()
	 * @generated
	 */
	void setAutorisationUtilisation(boolean value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeAssociationInstanceObjetAdresse#isAutorisationUtilisation <em>Autorisation Utilisation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAutorisationUtilisation()
	 * @see #isAutorisationUtilisation()
	 * @see #setAutorisationUtilisation(boolean)
	 * @generated
	 */
	void unsetAutorisationUtilisation();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeAssociationInstanceObjetAdresse#isAutorisationUtilisation <em>Autorisation Utilisation</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Autorisation Utilisation</em>' attribute is set.
	 * @see #unsetAutorisationUtilisation()
	 * @see #isAutorisationUtilisation()
	 * @see #setAutorisationUtilisation(boolean)
	 * @generated
	 */
	boolean isSetAutorisationUtilisation();

	/**
	 * Returns the value of the '<em><b>Categorie</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoAssociationInstanceObjetAdresseCategorie}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categorie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoAssociationInstanceObjetAdresseCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAssociationInstanceObjetAdresseCategorie)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationInstanceObjetAdresse_Categorie()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='Categorie'"
	 * @generated
	 */
	TypeDictionaryDicoAssociationInstanceObjetAdresseCategorie getCategorie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationInstanceObjetAdresse#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoAssociationInstanceObjetAdresseCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @generated
	 */
	void setCategorie(TypeDictionaryDicoAssociationInstanceObjetAdresseCategorie value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeAssociationInstanceObjetAdresse#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAssociationInstanceObjetAdresseCategorie)
	 * @generated
	 */
	void unsetCategorie();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeAssociationInstanceObjetAdresse#getCategorie <em>Categorie</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Categorie</em>' attribute is set.
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAssociationInstanceObjetAdresseCategorie)
	 * @generated
	 */
	boolean isSetCategorie();

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
	 * @see mpia.schema.SchemaPackage#getTypeAssociationInstanceObjetAdresse_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationInstanceObjetAdresse#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeAssociationInstanceObjetAdresse_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationInstanceObjetAdresse#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

	/**
	 * Returns the value of the '<em><b>Associe Comme Objet Adresse</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Associe Comme Objet Adresse</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Associe Comme Objet Adresse</em>' containment reference.
	 * @see #setAssocieCommeObjetAdresse(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationInstanceObjetAdresse_AssocieCommeObjetAdresse()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='EstAdresse_AssociationInstanceObjetAdresse' target_entity='type_Adresse'"
	 *        extendedMetaData="kind='element' name='AssocieCommeObjet_Adresse'"
	 * @generated
	 */
	TypeAssociation getAssocieCommeObjetAdresse();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationInstanceObjetAdresse#getAssocieCommeObjetAdresse <em>Associe Comme Objet Adresse</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Associe Comme Objet Adresse</em>' containment reference.
	 * @see #getAssocieCommeObjetAdresse()
	 * @generated
	 */
	void setAssocieCommeObjetAdresse(TypeAssociation value);

	/**
	 * Returns the value of the '<em><b>Associe Comme Sujet Instance Objet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Associe Comme Sujet Instance Objet</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Associe Comme Sujet Instance Objet</em>' containment reference.
	 * @see #setAssocieCommeSujetInstanceObjet(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationInstanceObjetAdresse_AssocieCommeSujetInstanceObjet()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='AssocieCommeAdresse_AssociationInstanceObjetAdresse' target_entity='type_InstanceObjet'"
	 *        extendedMetaData="kind='element' name='AssocieCommeSujet_InstanceObjet'"
	 * @generated
	 */
	TypeAssociation getAssocieCommeSujetInstanceObjet();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationInstanceObjetAdresse#getAssocieCommeSujetInstanceObjet <em>Associe Comme Sujet Instance Objet</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Associe Comme Sujet Instance Objet</em>' containment reference.
	 * @see #getAssocieCommeSujetInstanceObjet()
	 * @generated
	 */
	void setAssocieCommeSujetInstanceObjet(TypeAssociation value);

	/**
	 * Returns the value of the '<em><b>Est Rapportee Par Rapport</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Rapportee Par Rapport</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Rapportee Par Rapport</em>' containment reference.
	 * @see #setEstRapporteeParRapport(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationInstanceObjetAdresse_EstRapporteeParRapport()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_Rapport'"
	 *        extendedMetaData="kind='element' name='EstRapporteePar_Rapport'"
	 * @generated
	 */
	TypeAssociation getEstRapporteeParRapport();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationInstanceObjetAdresse#getEstRapporteeParRapport <em>Est Rapportee Par Rapport</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Est Rapportee Par Rapport</em>' containment reference.
	 * @see #getEstRapporteeParRapport()
	 * @generated
	 */
	void setEstRapporteeParRapport(TypeAssociation value);

} // TypeAssociationInstanceObjetAdresse
