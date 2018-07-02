/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Tache Appui Aerien</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeTacheAppuiAerien#getTypeTache <em>Type Tache</em>}</li>
 *   <li>{@link mpia.schema.TypeTacheAppuiAerien#getCodeTache <em>Code Tache</em>}</li>
 *   <li>{@link mpia.schema.TypeTacheAppuiAerien#getNombreObjectifs <em>Nombre Objectifs</em>}</li>
 *   <li>{@link mpia.schema.TypeTacheAppuiAerien#getDescriptionObjectif <em>Description Objectif</em>}</li>
 *   <li>{@link mpia.schema.TypeTacheAppuiAerien#getCategorieObjectif <em>Categorie Objectif</em>}</li>
 *   <li>{@link mpia.schema.TypeTacheAppuiAerien#getPrioriteTache <em>Priorite Tache</em>}</li>
 *   <li>{@link mpia.schema.TypeTacheAppuiAerien#getPourcentagePertesSouhaitees <em>Pourcentage Pertes Souhaitees</em>}</li>
 *   <li>{@link mpia.schema.TypeTacheAppuiAerien#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeTacheAppuiAerien#getCE <em>CE</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeTacheAppuiAerien()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_TacheAppuiAerien' kind='elementOnly'"
 * @generated
 */
public interface TypeTacheAppuiAerien extends EObject {
	/**
	 * Returns the value of the '<em><b>Type Tache</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Tache</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Tache</em>' attribute.
	 * @see #setTypeTache(String)
	 * @see mpia.schema.SchemaPackage#getTypeTacheAppuiAerien_TypeTache()
	 * @model dataType="mpia.meta.TypeDataTypeChaine020"
	 *        extendedMetaData="kind='element' name='TypeTache'"
	 * @generated
	 */
	String getTypeTache();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTacheAppuiAerien#getTypeTache <em>Type Tache</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Tache</em>' attribute.
	 * @see #getTypeTache()
	 * @generated
	 */
	void setTypeTache(String value);

	/**
	 * Returns the value of the '<em><b>Code Tache</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoTacheAppuiAerienCodeTache}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code Tache</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code Tache</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoTacheAppuiAerienCodeTache
	 * @see #isSetCodeTache()
	 * @see #unsetCodeTache()
	 * @see #setCodeTache(TypeDictionaryDicoTacheAppuiAerienCodeTache)
	 * @see mpia.schema.SchemaPackage#getTypeTacheAppuiAerien_CodeTache()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='CodeTache'"
	 * @generated
	 */
	TypeDictionaryDicoTacheAppuiAerienCodeTache getCodeTache();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTacheAppuiAerien#getCodeTache <em>Code Tache</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code Tache</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoTacheAppuiAerienCodeTache
	 * @see #isSetCodeTache()
	 * @see #unsetCodeTache()
	 * @see #getCodeTache()
	 * @generated
	 */
	void setCodeTache(TypeDictionaryDicoTacheAppuiAerienCodeTache value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeTacheAppuiAerien#getCodeTache <em>Code Tache</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCodeTache()
	 * @see #getCodeTache()
	 * @see #setCodeTache(TypeDictionaryDicoTacheAppuiAerienCodeTache)
	 * @generated
	 */
	void unsetCodeTache();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeTacheAppuiAerien#getCodeTache <em>Code Tache</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Code Tache</em>' attribute is set.
	 * @see #unsetCodeTache()
	 * @see #getCodeTache()
	 * @see #setCodeTache(TypeDictionaryDicoTacheAppuiAerienCodeTache)
	 * @generated
	 */
	boolean isSetCodeTache();

	/**
	 * Returns the value of the '<em><b>Nombre Objectifs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre Objectifs</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre Objectifs</em>' attribute.
	 * @see #isSetNombreObjectifs()
	 * @see #unsetNombreObjectifs()
	 * @see #setNombreObjectifs(long)
	 * @see mpia.schema.SchemaPackage#getTypeTacheAppuiAerien_NombreObjectifs()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier3"
	 *        extendedMetaData="kind='element' name='NombreObjectifs'"
	 * @generated
	 */
	long getNombreObjectifs();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTacheAppuiAerien#getNombreObjectifs <em>Nombre Objectifs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre Objectifs</em>' attribute.
	 * @see #isSetNombreObjectifs()
	 * @see #unsetNombreObjectifs()
	 * @see #getNombreObjectifs()
	 * @generated
	 */
	void setNombreObjectifs(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeTacheAppuiAerien#getNombreObjectifs <em>Nombre Objectifs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNombreObjectifs()
	 * @see #getNombreObjectifs()
	 * @see #setNombreObjectifs(long)
	 * @generated
	 */
	void unsetNombreObjectifs();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeTacheAppuiAerien#getNombreObjectifs <em>Nombre Objectifs</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nombre Objectifs</em>' attribute is set.
	 * @see #unsetNombreObjectifs()
	 * @see #getNombreObjectifs()
	 * @see #setNombreObjectifs(long)
	 * @generated
	 */
	boolean isSetNombreObjectifs();

	/**
	 * Returns the value of the '<em><b>Description Objectif</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description Objectif</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description Objectif</em>' attribute.
	 * @see #setDescriptionObjectif(String)
	 * @see mpia.schema.SchemaPackage#getTypeTacheAppuiAerien_DescriptionObjectif()
	 * @model dataType="mpia.meta.TypeDataTypeChaine020"
	 *        extendedMetaData="kind='element' name='DescriptionObjectif'"
	 * @generated
	 */
	String getDescriptionObjectif();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTacheAppuiAerien#getDescriptionObjectif <em>Description Objectif</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description Objectif</em>' attribute.
	 * @see #getDescriptionObjectif()
	 * @generated
	 */
	void setDescriptionObjectif(String value);

	/**
	 * Returns the value of the '<em><b>Categorie Objectif</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoTacheAppuiAerienCategorieObjectif}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categorie Objectif</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categorie Objectif</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoTacheAppuiAerienCategorieObjectif
	 * @see #isSetCategorieObjectif()
	 * @see #unsetCategorieObjectif()
	 * @see #setCategorieObjectif(TypeDictionaryDicoTacheAppuiAerienCategorieObjectif)
	 * @see mpia.schema.SchemaPackage#getTypeTacheAppuiAerien_CategorieObjectif()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='CategorieObjectif'"
	 * @generated
	 */
	TypeDictionaryDicoTacheAppuiAerienCategorieObjectif getCategorieObjectif();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTacheAppuiAerien#getCategorieObjectif <em>Categorie Objectif</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Categorie Objectif</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoTacheAppuiAerienCategorieObjectif
	 * @see #isSetCategorieObjectif()
	 * @see #unsetCategorieObjectif()
	 * @see #getCategorieObjectif()
	 * @generated
	 */
	void setCategorieObjectif(TypeDictionaryDicoTacheAppuiAerienCategorieObjectif value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeTacheAppuiAerien#getCategorieObjectif <em>Categorie Objectif</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCategorieObjectif()
	 * @see #getCategorieObjectif()
	 * @see #setCategorieObjectif(TypeDictionaryDicoTacheAppuiAerienCategorieObjectif)
	 * @generated
	 */
	void unsetCategorieObjectif();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeTacheAppuiAerien#getCategorieObjectif <em>Categorie Objectif</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Categorie Objectif</em>' attribute is set.
	 * @see #unsetCategorieObjectif()
	 * @see #getCategorieObjectif()
	 * @see #setCategorieObjectif(TypeDictionaryDicoTacheAppuiAerienCategorieObjectif)
	 * @generated
	 */
	boolean isSetCategorieObjectif();

	/**
	 * Returns the value of the '<em><b>Priorite Tache</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoPriorite}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Priorite Tache</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Priorite Tache</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoPriorite
	 * @see #isSetPrioriteTache()
	 * @see #unsetPrioriteTache()
	 * @see #setPrioriteTache(TypeDictionaryDicoPriorite)
	 * @see mpia.schema.SchemaPackage#getTypeTacheAppuiAerien_PrioriteTache()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='PrioriteTache'"
	 * @generated
	 */
	TypeDictionaryDicoPriorite getPrioriteTache();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTacheAppuiAerien#getPrioriteTache <em>Priorite Tache</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priorite Tache</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoPriorite
	 * @see #isSetPrioriteTache()
	 * @see #unsetPrioriteTache()
	 * @see #getPrioriteTache()
	 * @generated
	 */
	void setPrioriteTache(TypeDictionaryDicoPriorite value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeTacheAppuiAerien#getPrioriteTache <em>Priorite Tache</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPrioriteTache()
	 * @see #getPrioriteTache()
	 * @see #setPrioriteTache(TypeDictionaryDicoPriorite)
	 * @generated
	 */
	void unsetPrioriteTache();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeTacheAppuiAerien#getPrioriteTache <em>Priorite Tache</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Priorite Tache</em>' attribute is set.
	 * @see #unsetPrioriteTache()
	 * @see #getPrioriteTache()
	 * @see #setPrioriteTache(TypeDictionaryDicoPriorite)
	 * @generated
	 */
	boolean isSetPrioriteTache();

	/**
	 * Returns the value of the '<em><b>Pourcentage Pertes Souhaitees</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pourcentage Pertes Souhaitees</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pourcentage Pertes Souhaitees</em>' attribute.
	 * @see #isSetPourcentagePertesSouhaitees()
	 * @see #unsetPourcentagePertesSouhaitees()
	 * @see #setPourcentagePertesSouhaitees(long)
	 * @see mpia.schema.SchemaPackage#getTypeTacheAppuiAerien_PourcentagePertesSouhaitees()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier3"
	 *        extendedMetaData="kind='element' name='PourcentagePertesSouhaitees'"
	 * @generated
	 */
	long getPourcentagePertesSouhaitees();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTacheAppuiAerien#getPourcentagePertesSouhaitees <em>Pourcentage Pertes Souhaitees</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pourcentage Pertes Souhaitees</em>' attribute.
	 * @see #isSetPourcentagePertesSouhaitees()
	 * @see #unsetPourcentagePertesSouhaitees()
	 * @see #getPourcentagePertesSouhaitees()
	 * @generated
	 */
	void setPourcentagePertesSouhaitees(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeTacheAppuiAerien#getPourcentagePertesSouhaitees <em>Pourcentage Pertes Souhaitees</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPourcentagePertesSouhaitees()
	 * @see #getPourcentagePertesSouhaitees()
	 * @see #setPourcentagePertesSouhaitees(long)
	 * @generated
	 */
	void unsetPourcentagePertesSouhaitees();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeTacheAppuiAerien#getPourcentagePertesSouhaitees <em>Pourcentage Pertes Souhaitees</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Pourcentage Pertes Souhaitees</em>' attribute is set.
	 * @see #unsetPourcentagePertesSouhaitees()
	 * @see #getPourcentagePertesSouhaitees()
	 * @see #setPourcentagePertesSouhaitees(long)
	 * @generated
	 */
	boolean isSetPourcentagePertesSouhaitees();

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
	 * @see mpia.schema.SchemaPackage#getTypeTacheAppuiAerien_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTacheAppuiAerien#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeTacheAppuiAerien_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTacheAppuiAerien#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

} // TypeTacheAppuiAerien
