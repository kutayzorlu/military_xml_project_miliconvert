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
 * A representation of the model object '<em><b>Type Competence Linguistique</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeCompetenceLinguistique#getLangue <em>Langue</em>}</li>
 *   <li>{@link mpia.schema.TypeCompetenceLinguistique#getNiveauGeneral <em>Niveau General</em>}</li>
 *   <li>{@link mpia.schema.TypeCompetenceLinguistique#getNiveauCompris <em>Niveau Compris</em>}</li>
 *   <li>{@link mpia.schema.TypeCompetenceLinguistique#getNiveauParle <em>Niveau Parle</em>}</li>
 *   <li>{@link mpia.schema.TypeCompetenceLinguistique#getNiveauLu <em>Niveau Lu</em>}</li>
 *   <li>{@link mpia.schema.TypeCompetenceLinguistique#getNiveauEcrit <em>Niveau Ecrit</em>}</li>
 *   <li>{@link mpia.schema.TypeCompetenceLinguistique#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeCompetenceLinguistique#getCE <em>CE</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeCompetenceLinguistique()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_CompetenceLinguistique' kind='elementOnly'"
 * @generated
 */
public interface TypeCompetenceLinguistique extends EObject {
	/**
	 * Returns the value of the '<em><b>Langue</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoLangue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Langue</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Langue</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoLangue
	 * @see #isSetLangue()
	 * @see #unsetLangue()
	 * @see #setLangue(TypeDictionaryDicoLangue)
	 * @see mpia.schema.SchemaPackage#getTypeCompetenceLinguistique_Langue()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='Langue'"
	 * @generated
	 */
	TypeDictionaryDicoLangue getLangue();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCompetenceLinguistique#getLangue <em>Langue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Langue</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoLangue
	 * @see #isSetLangue()
	 * @see #unsetLangue()
	 * @see #getLangue()
	 * @generated
	 */
	void setLangue(TypeDictionaryDicoLangue value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeCompetenceLinguistique#getLangue <em>Langue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLangue()
	 * @see #getLangue()
	 * @see #setLangue(TypeDictionaryDicoLangue)
	 * @generated
	 */
	void unsetLangue();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeCompetenceLinguistique#getLangue <em>Langue</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Langue</em>' attribute is set.
	 * @see #unsetLangue()
	 * @see #getLangue()
	 * @see #setLangue(TypeDictionaryDicoLangue)
	 * @generated
	 */
	boolean isSetLangue();

	/**
	 * Returns the value of the '<em><b>Niveau General</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoCompetenceLinguistiqueNiveau}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Niveau General</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Niveau General</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoCompetenceLinguistiqueNiveau
	 * @see #isSetNiveauGeneral()
	 * @see #unsetNiveauGeneral()
	 * @see #setNiveauGeneral(TypeDictionaryDicoCompetenceLinguistiqueNiveau)
	 * @see mpia.schema.SchemaPackage#getTypeCompetenceLinguistique_NiveauGeneral()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='NiveauGeneral'"
	 * @generated
	 */
	TypeDictionaryDicoCompetenceLinguistiqueNiveau getNiveauGeneral();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCompetenceLinguistique#getNiveauGeneral <em>Niveau General</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Niveau General</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoCompetenceLinguistiqueNiveau
	 * @see #isSetNiveauGeneral()
	 * @see #unsetNiveauGeneral()
	 * @see #getNiveauGeneral()
	 * @generated
	 */
	void setNiveauGeneral(TypeDictionaryDicoCompetenceLinguistiqueNiveau value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeCompetenceLinguistique#getNiveauGeneral <em>Niveau General</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNiveauGeneral()
	 * @see #getNiveauGeneral()
	 * @see #setNiveauGeneral(TypeDictionaryDicoCompetenceLinguistiqueNiveau)
	 * @generated
	 */
	void unsetNiveauGeneral();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeCompetenceLinguistique#getNiveauGeneral <em>Niveau General</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Niveau General</em>' attribute is set.
	 * @see #unsetNiveauGeneral()
	 * @see #getNiveauGeneral()
	 * @see #setNiveauGeneral(TypeDictionaryDicoCompetenceLinguistiqueNiveau)
	 * @generated
	 */
	boolean isSetNiveauGeneral();

	/**
	 * Returns the value of the '<em><b>Niveau Compris</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoCompetenceLinguistiqueNiveauPrecis}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Niveau Compris</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Niveau Compris</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoCompetenceLinguistiqueNiveauPrecis
	 * @see #isSetNiveauCompris()
	 * @see #unsetNiveauCompris()
	 * @see #setNiveauCompris(TypeDictionaryDicoCompetenceLinguistiqueNiveauPrecis)
	 * @see mpia.schema.SchemaPackage#getTypeCompetenceLinguistique_NiveauCompris()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='NiveauCompris'"
	 * @generated
	 */
	TypeDictionaryDicoCompetenceLinguistiqueNiveauPrecis getNiveauCompris();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCompetenceLinguistique#getNiveauCompris <em>Niveau Compris</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Niveau Compris</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoCompetenceLinguistiqueNiveauPrecis
	 * @see #isSetNiveauCompris()
	 * @see #unsetNiveauCompris()
	 * @see #getNiveauCompris()
	 * @generated
	 */
	void setNiveauCompris(TypeDictionaryDicoCompetenceLinguistiqueNiveauPrecis value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeCompetenceLinguistique#getNiveauCompris <em>Niveau Compris</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNiveauCompris()
	 * @see #getNiveauCompris()
	 * @see #setNiveauCompris(TypeDictionaryDicoCompetenceLinguistiqueNiveauPrecis)
	 * @generated
	 */
	void unsetNiveauCompris();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeCompetenceLinguistique#getNiveauCompris <em>Niveau Compris</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Niveau Compris</em>' attribute is set.
	 * @see #unsetNiveauCompris()
	 * @see #getNiveauCompris()
	 * @see #setNiveauCompris(TypeDictionaryDicoCompetenceLinguistiqueNiveauPrecis)
	 * @generated
	 */
	boolean isSetNiveauCompris();

	/**
	 * Returns the value of the '<em><b>Niveau Parle</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoCompetenceLinguistiqueNiveauPrecis}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Niveau Parle</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Niveau Parle</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoCompetenceLinguistiqueNiveauPrecis
	 * @see #isSetNiveauParle()
	 * @see #unsetNiveauParle()
	 * @see #setNiveauParle(TypeDictionaryDicoCompetenceLinguistiqueNiveauPrecis)
	 * @see mpia.schema.SchemaPackage#getTypeCompetenceLinguistique_NiveauParle()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='NiveauParle'"
	 * @generated
	 */
	TypeDictionaryDicoCompetenceLinguistiqueNiveauPrecis getNiveauParle();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCompetenceLinguistique#getNiveauParle <em>Niveau Parle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Niveau Parle</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoCompetenceLinguistiqueNiveauPrecis
	 * @see #isSetNiveauParle()
	 * @see #unsetNiveauParle()
	 * @see #getNiveauParle()
	 * @generated
	 */
	void setNiveauParle(TypeDictionaryDicoCompetenceLinguistiqueNiveauPrecis value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeCompetenceLinguistique#getNiveauParle <em>Niveau Parle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNiveauParle()
	 * @see #getNiveauParle()
	 * @see #setNiveauParle(TypeDictionaryDicoCompetenceLinguistiqueNiveauPrecis)
	 * @generated
	 */
	void unsetNiveauParle();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeCompetenceLinguistique#getNiveauParle <em>Niveau Parle</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Niveau Parle</em>' attribute is set.
	 * @see #unsetNiveauParle()
	 * @see #getNiveauParle()
	 * @see #setNiveauParle(TypeDictionaryDicoCompetenceLinguistiqueNiveauPrecis)
	 * @generated
	 */
	boolean isSetNiveauParle();

	/**
	 * Returns the value of the '<em><b>Niveau Lu</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoCompetenceLinguistiqueNiveauPrecis}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Niveau Lu</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Niveau Lu</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoCompetenceLinguistiqueNiveauPrecis
	 * @see #isSetNiveauLu()
	 * @see #unsetNiveauLu()
	 * @see #setNiveauLu(TypeDictionaryDicoCompetenceLinguistiqueNiveauPrecis)
	 * @see mpia.schema.SchemaPackage#getTypeCompetenceLinguistique_NiveauLu()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='NiveauLu'"
	 * @generated
	 */
	TypeDictionaryDicoCompetenceLinguistiqueNiveauPrecis getNiveauLu();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCompetenceLinguistique#getNiveauLu <em>Niveau Lu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Niveau Lu</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoCompetenceLinguistiqueNiveauPrecis
	 * @see #isSetNiveauLu()
	 * @see #unsetNiveauLu()
	 * @see #getNiveauLu()
	 * @generated
	 */
	void setNiveauLu(TypeDictionaryDicoCompetenceLinguistiqueNiveauPrecis value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeCompetenceLinguistique#getNiveauLu <em>Niveau Lu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNiveauLu()
	 * @see #getNiveauLu()
	 * @see #setNiveauLu(TypeDictionaryDicoCompetenceLinguistiqueNiveauPrecis)
	 * @generated
	 */
	void unsetNiveauLu();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeCompetenceLinguistique#getNiveauLu <em>Niveau Lu</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Niveau Lu</em>' attribute is set.
	 * @see #unsetNiveauLu()
	 * @see #getNiveauLu()
	 * @see #setNiveauLu(TypeDictionaryDicoCompetenceLinguistiqueNiveauPrecis)
	 * @generated
	 */
	boolean isSetNiveauLu();

	/**
	 * Returns the value of the '<em><b>Niveau Ecrit</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoCompetenceLinguistiqueNiveauPrecis}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Niveau Ecrit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Niveau Ecrit</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoCompetenceLinguistiqueNiveauPrecis
	 * @see #isSetNiveauEcrit()
	 * @see #unsetNiveauEcrit()
	 * @see #setNiveauEcrit(TypeDictionaryDicoCompetenceLinguistiqueNiveauPrecis)
	 * @see mpia.schema.SchemaPackage#getTypeCompetenceLinguistique_NiveauEcrit()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='NiveauEcrit'"
	 * @generated
	 */
	TypeDictionaryDicoCompetenceLinguistiqueNiveauPrecis getNiveauEcrit();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCompetenceLinguistique#getNiveauEcrit <em>Niveau Ecrit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Niveau Ecrit</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoCompetenceLinguistiqueNiveauPrecis
	 * @see #isSetNiveauEcrit()
	 * @see #unsetNiveauEcrit()
	 * @see #getNiveauEcrit()
	 * @generated
	 */
	void setNiveauEcrit(TypeDictionaryDicoCompetenceLinguistiqueNiveauPrecis value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeCompetenceLinguistique#getNiveauEcrit <em>Niveau Ecrit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNiveauEcrit()
	 * @see #getNiveauEcrit()
	 * @see #setNiveauEcrit(TypeDictionaryDicoCompetenceLinguistiqueNiveauPrecis)
	 * @generated
	 */
	void unsetNiveauEcrit();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeCompetenceLinguistique#getNiveauEcrit <em>Niveau Ecrit</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Niveau Ecrit</em>' attribute is set.
	 * @see #unsetNiveauEcrit()
	 * @see #getNiveauEcrit()
	 * @see #setNiveauEcrit(TypeDictionaryDicoCompetenceLinguistiqueNiveauPrecis)
	 * @generated
	 */
	boolean isSetNiveauEcrit();

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
	 * @see mpia.schema.SchemaPackage#getTypeCompetenceLinguistique_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCompetenceLinguistique#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeCompetenceLinguistique_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCompetenceLinguistique#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

} // TypeCompetenceLinguistique
