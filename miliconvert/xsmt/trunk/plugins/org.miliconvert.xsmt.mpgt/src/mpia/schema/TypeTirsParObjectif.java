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
 * A representation of the model object '<em><b>Type Tirs Par Objectif</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeTirsParObjectif#getNatureObjectif <em>Nature Objectif</em>}</li>
 *   <li>{@link mpia.schema.TypeTirsParObjectif#getNombreTirsAssocies <em>Nombre Tirs Associes</em>}</li>
 *   <li>{@link mpia.schema.TypeTirsParObjectif#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeTirsParObjectif#getCE <em>CE</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeTirsParObjectif()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_TirsParObjectif' kind='elementOnly'"
 * @generated
 */
public interface TypeTirsParObjectif extends EObject {
	/**
	 * Returns the value of the '<em><b>Nature Objectif</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoTypeObjectifASS}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nature Objectif</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nature Objectif</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoTypeObjectifASS
	 * @see #isSetNatureObjectif()
	 * @see #unsetNatureObjectif()
	 * @see #setNatureObjectif(TypeDictionaryDicoTypeObjectifASS)
	 * @see mpia.schema.SchemaPackage#getTypeTirsParObjectif_NatureObjectif()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='NatureObjectif'"
	 * @generated
	 */
	TypeDictionaryDicoTypeObjectifASS getNatureObjectif();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTirsParObjectif#getNatureObjectif <em>Nature Objectif</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nature Objectif</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoTypeObjectifASS
	 * @see #isSetNatureObjectif()
	 * @see #unsetNatureObjectif()
	 * @see #getNatureObjectif()
	 * @generated
	 */
	void setNatureObjectif(TypeDictionaryDicoTypeObjectifASS value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeTirsParObjectif#getNatureObjectif <em>Nature Objectif</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNatureObjectif()
	 * @see #getNatureObjectif()
	 * @see #setNatureObjectif(TypeDictionaryDicoTypeObjectifASS)
	 * @generated
	 */
	void unsetNatureObjectif();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeTirsParObjectif#getNatureObjectif <em>Nature Objectif</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nature Objectif</em>' attribute is set.
	 * @see #unsetNatureObjectif()
	 * @see #getNatureObjectif()
	 * @see #setNatureObjectif(TypeDictionaryDicoTypeObjectifASS)
	 * @generated
	 */
	boolean isSetNatureObjectif();

	/**
	 * Returns the value of the '<em><b>Nombre Tirs Associes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre Tirs Associes</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre Tirs Associes</em>' attribute.
	 * @see #isSetNombreTirsAssocies()
	 * @see #unsetNombreTirsAssocies()
	 * @see #setNombreTirsAssocies(long)
	 * @see mpia.schema.SchemaPackage#getTypeTirsParObjectif_NombreTirsAssocies()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier6" required="true"
	 *        extendedMetaData="kind='element' name='NombreTirsAssocies'"
	 * @generated
	 */
	long getNombreTirsAssocies();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTirsParObjectif#getNombreTirsAssocies <em>Nombre Tirs Associes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre Tirs Associes</em>' attribute.
	 * @see #isSetNombreTirsAssocies()
	 * @see #unsetNombreTirsAssocies()
	 * @see #getNombreTirsAssocies()
	 * @generated
	 */
	void setNombreTirsAssocies(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeTirsParObjectif#getNombreTirsAssocies <em>Nombre Tirs Associes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNombreTirsAssocies()
	 * @see #getNombreTirsAssocies()
	 * @see #setNombreTirsAssocies(long)
	 * @generated
	 */
	void unsetNombreTirsAssocies();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeTirsParObjectif#getNombreTirsAssocies <em>Nombre Tirs Associes</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nombre Tirs Associes</em>' attribute is set.
	 * @see #unsetNombreTirsAssocies()
	 * @see #getNombreTirsAssocies()
	 * @see #setNombreTirsAssocies(long)
	 * @generated
	 */
	boolean isSetNombreTirsAssocies();

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
	 * @see mpia.schema.SchemaPackage#getTypeTirsParObjectif_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTirsParObjectif#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeTirsParObjectif_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTirsParObjectif#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

} // TypeTirsParObjectif
