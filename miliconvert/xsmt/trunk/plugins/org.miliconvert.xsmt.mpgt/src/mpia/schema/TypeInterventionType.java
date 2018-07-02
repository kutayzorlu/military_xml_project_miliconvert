/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeAssociation;
import mpia.meta.TypeDataTypeDuree;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Intervention Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeInterventionType#getEffetRecherche <em>Effet Recherche</em>}</li>
 *   <li>{@link mpia.schema.TypeInterventionType#getPourcentageDommagesRecherches <em>Pourcentage Dommages Recherches</em>}</li>
 *   <li>{@link mpia.schema.TypeInterventionType#getDureeTraitement <em>Duree Traitement</em>}</li>
 *   <li>{@link mpia.schema.TypeInterventionType#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeInterventionType#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypeInterventionType#getSAppliqueAuTypeObjectifTypeObjectifASS <em>SApplique Au Type Objectif Type Objectif ASS</em>}</li>
 *   <li>{@link mpia.schema.TypeInterventionType#getImposeVolumeMunitionsASS <em>Impose Volume Munitions ASS</em>}</li>
 *   <li>{@link mpia.schema.TypeInterventionType#getEstDefinieParPolitiqueTir <em>Est Definie Par Politique Tir</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeInterventionType()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_InterventionType' kind='elementOnly'"
 * @generated
 */
public interface TypeInterventionType extends EObject {
	/**
	 * Returns the value of the '<em><b>Effet Recherche</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoEffetTactiqueASS}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Effet Recherche</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Effet Recherche</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEffetTactiqueASS
	 * @see #isSetEffetRecherche()
	 * @see #unsetEffetRecherche()
	 * @see #setEffetRecherche(TypeDictionaryDicoEffetTactiqueASS)
	 * @see mpia.schema.SchemaPackage#getTypeInterventionType_EffetRecherche()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='EffetRecherche'"
	 * @generated
	 */
	TypeDictionaryDicoEffetTactiqueASS getEffetRecherche();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeInterventionType#getEffetRecherche <em>Effet Recherche</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Effet Recherche</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEffetTactiqueASS
	 * @see #isSetEffetRecherche()
	 * @see #unsetEffetRecherche()
	 * @see #getEffetRecherche()
	 * @generated
	 */
	void setEffetRecherche(TypeDictionaryDicoEffetTactiqueASS value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeInterventionType#getEffetRecherche <em>Effet Recherche</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEffetRecherche()
	 * @see #getEffetRecherche()
	 * @see #setEffetRecherche(TypeDictionaryDicoEffetTactiqueASS)
	 * @generated
	 */
	void unsetEffetRecherche();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeInterventionType#getEffetRecherche <em>Effet Recherche</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Effet Recherche</em>' attribute is set.
	 * @see #unsetEffetRecherche()
	 * @see #getEffetRecherche()
	 * @see #setEffetRecherche(TypeDictionaryDicoEffetTactiqueASS)
	 * @generated
	 */
	boolean isSetEffetRecherche();

	/**
	 * Returns the value of the '<em><b>Pourcentage Dommages Recherches</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pourcentage Dommages Recherches</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pourcentage Dommages Recherches</em>' attribute.
	 * @see #isSetPourcentageDommagesRecherches()
	 * @see #unsetPourcentageDommagesRecherches()
	 * @see #setPourcentageDommagesRecherches(double)
	 * @see mpia.schema.SchemaPackage#getTypeInterventionType_PourcentageDommagesRecherches()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeRatio"
	 *        extendedMetaData="kind='element' name='PourcentageDommagesRecherches'"
	 * @generated
	 */
	double getPourcentageDommagesRecherches();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeInterventionType#getPourcentageDommagesRecherches <em>Pourcentage Dommages Recherches</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pourcentage Dommages Recherches</em>' attribute.
	 * @see #isSetPourcentageDommagesRecherches()
	 * @see #unsetPourcentageDommagesRecherches()
	 * @see #getPourcentageDommagesRecherches()
	 * @generated
	 */
	void setPourcentageDommagesRecherches(double value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeInterventionType#getPourcentageDommagesRecherches <em>Pourcentage Dommages Recherches</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPourcentageDommagesRecherches()
	 * @see #getPourcentageDommagesRecherches()
	 * @see #setPourcentageDommagesRecherches(double)
	 * @generated
	 */
	void unsetPourcentageDommagesRecherches();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeInterventionType#getPourcentageDommagesRecherches <em>Pourcentage Dommages Recherches</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Pourcentage Dommages Recherches</em>' attribute is set.
	 * @see #unsetPourcentageDommagesRecherches()
	 * @see #getPourcentageDommagesRecherches()
	 * @see #setPourcentageDommagesRecherches(double)
	 * @generated
	 */
	boolean isSetPourcentageDommagesRecherches();

	/**
	 * Returns the value of the '<em><b>Duree Traitement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Duree Traitement</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duree Traitement</em>' containment reference.
	 * @see #setDureeTraitement(TypeDataTypeDuree)
	 * @see mpia.schema.SchemaPackage#getTypeInterventionType_DureeTraitement()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DureeTraitement'"
	 * @generated
	 */
	TypeDataTypeDuree getDureeTraitement();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeInterventionType#getDureeTraitement <em>Duree Traitement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duree Traitement</em>' containment reference.
	 * @see #getDureeTraitement()
	 * @generated
	 */
	void setDureeTraitement(TypeDataTypeDuree value);

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
	 * @see mpia.schema.SchemaPackage#getTypeInterventionType_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeInterventionType#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeInterventionType_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeInterventionType#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

	/**
	 * Returns the value of the '<em><b>SApplique Au Type Objectif Type Objectif ASS</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SApplique Au Type Objectif Type Objectif ASS</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SApplique Au Type Objectif Type Objectif ASS</em>' containment reference.
	 * @see #setSAppliqueAuTypeObjectifTypeObjectifASS(TypeTypeObjectifASS)
	 * @see mpia.schema.SchemaPackage#getTypeInterventionType_SAppliqueAuTypeObjectifTypeObjectifASS()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_TypeObjectifASS'"
	 *        extendedMetaData="kind='element' name='SAppliqueAuTypeObjectif_TypeObjectifASS'"
	 * @generated
	 */
	TypeTypeObjectifASS getSAppliqueAuTypeObjectifTypeObjectifASS();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeInterventionType#getSAppliqueAuTypeObjectifTypeObjectifASS <em>SApplique Au Type Objectif Type Objectif ASS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SApplique Au Type Objectif Type Objectif ASS</em>' containment reference.
	 * @see #getSAppliqueAuTypeObjectifTypeObjectifASS()
	 * @generated
	 */
	void setSAppliqueAuTypeObjectifTypeObjectifASS(TypeTypeObjectifASS value);

	/**
	 * Returns the value of the '<em><b>Impose Volume Munitions ASS</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Impose Volume Munitions ASS</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Impose Volume Munitions ASS</em>' containment reference.
	 * @see #setImposeVolumeMunitionsASS(TypeVolumeMunitionsASS)
	 * @see mpia.schema.SchemaPackage#getTypeInterventionType_ImposeVolumeMunitionsASS()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_VolumeMunitionsASS'"
	 *        extendedMetaData="kind='element' name='Impose_VolumeMunitionsASS'"
	 * @generated
	 */
	TypeVolumeMunitionsASS getImposeVolumeMunitionsASS();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeInterventionType#getImposeVolumeMunitionsASS <em>Impose Volume Munitions ASS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Impose Volume Munitions ASS</em>' containment reference.
	 * @see #getImposeVolumeMunitionsASS()
	 * @generated
	 */
	void setImposeVolumeMunitionsASS(TypeVolumeMunitionsASS value);

	/**
	 * Returns the value of the '<em><b>Est Definie Par Politique Tir</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Definie Par Politique Tir</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Definie Par Politique Tir</em>' containment reference.
	 * @see #setEstDefinieParPolitiqueTir(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeInterventionType_EstDefinieParPolitiqueTir()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='Definit_InterventionType' target_entity='type_PolitiqueTir'"
	 *        extendedMetaData="kind='element' name='EstDefiniePar_PolitiqueTir'"
	 * @generated
	 */
	TypeAssociation getEstDefinieParPolitiqueTir();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeInterventionType#getEstDefinieParPolitiqueTir <em>Est Definie Par Politique Tir</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Est Definie Par Politique Tir</em>' containment reference.
	 * @see #getEstDefinieParPolitiqueTir()
	 * @generated
	 */
	void setEstDefinieParPolitiqueTir(TypeAssociation value);

} // TypeInterventionType
