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
 * A representation of the model object '<em><b>Type Type Objectif ASS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeTypeObjectifASS#getTypeObjectif <em>Type Objectif</em>}</li>
 *   <li>{@link mpia.schema.TypeTypeObjectifASS#getSousTypeObjectif <em>Sous Type Objectif</em>}</li>
 *   <li>{@link mpia.schema.TypeTypeObjectifASS#getNiveau <em>Niveau</em>}</li>
 *   <li>{@link mpia.schema.TypeTypeObjectifASS#getNombreElements <em>Nombre Elements</em>}</li>
 *   <li>{@link mpia.schema.TypeTypeObjectifASS#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeTypeObjectifASS#getCE <em>CE</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeTypeObjectifASS()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_TypeObjectifASS' kind='elementOnly'"
 * @generated
 */
public interface TypeTypeObjectifASS extends EObject {
	/**
	 * Returns the value of the '<em><b>Type Objectif</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoTypeObjectifASS}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Objectif</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Objectif</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoTypeObjectifASS
	 * @see #isSetTypeObjectif()
	 * @see #unsetTypeObjectif()
	 * @see #setTypeObjectif(TypeDictionaryDicoTypeObjectifASS)
	 * @see mpia.schema.SchemaPackage#getTypeTypeObjectifASS_TypeObjectif()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='TypeObjectif'"
	 * @generated
	 */
	TypeDictionaryDicoTypeObjectifASS getTypeObjectif();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTypeObjectifASS#getTypeObjectif <em>Type Objectif</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Objectif</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoTypeObjectifASS
	 * @see #isSetTypeObjectif()
	 * @see #unsetTypeObjectif()
	 * @see #getTypeObjectif()
	 * @generated
	 */
	void setTypeObjectif(TypeDictionaryDicoTypeObjectifASS value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeTypeObjectifASS#getTypeObjectif <em>Type Objectif</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTypeObjectif()
	 * @see #getTypeObjectif()
	 * @see #setTypeObjectif(TypeDictionaryDicoTypeObjectifASS)
	 * @generated
	 */
	void unsetTypeObjectif();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeTypeObjectifASS#getTypeObjectif <em>Type Objectif</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type Objectif</em>' attribute is set.
	 * @see #unsetTypeObjectif()
	 * @see #getTypeObjectif()
	 * @see #setTypeObjectif(TypeDictionaryDicoTypeObjectifASS)
	 * @generated
	 */
	boolean isSetTypeObjectif();

	/**
	 * Returns the value of the '<em><b>Sous Type Objectif</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoTypeObjectifASSSousTypeObjectif}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sous Type Objectif</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sous Type Objectif</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoTypeObjectifASSSousTypeObjectif
	 * @see #isSetSousTypeObjectif()
	 * @see #unsetSousTypeObjectif()
	 * @see #setSousTypeObjectif(TypeDictionaryDicoTypeObjectifASSSousTypeObjectif)
	 * @see mpia.schema.SchemaPackage#getTypeTypeObjectifASS_SousTypeObjectif()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='SousTypeObjectif'"
	 * @generated
	 */
	TypeDictionaryDicoTypeObjectifASSSousTypeObjectif getSousTypeObjectif();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTypeObjectifASS#getSousTypeObjectif <em>Sous Type Objectif</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sous Type Objectif</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoTypeObjectifASSSousTypeObjectif
	 * @see #isSetSousTypeObjectif()
	 * @see #unsetSousTypeObjectif()
	 * @see #getSousTypeObjectif()
	 * @generated
	 */
	void setSousTypeObjectif(TypeDictionaryDicoTypeObjectifASSSousTypeObjectif value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeTypeObjectifASS#getSousTypeObjectif <em>Sous Type Objectif</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSousTypeObjectif()
	 * @see #getSousTypeObjectif()
	 * @see #setSousTypeObjectif(TypeDictionaryDicoTypeObjectifASSSousTypeObjectif)
	 * @generated
	 */
	void unsetSousTypeObjectif();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeTypeObjectifASS#getSousTypeObjectif <em>Sous Type Objectif</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Sous Type Objectif</em>' attribute is set.
	 * @see #unsetSousTypeObjectif()
	 * @see #getSousTypeObjectif()
	 * @see #setSousTypeObjectif(TypeDictionaryDicoTypeObjectifASSSousTypeObjectif)
	 * @generated
	 */
	boolean isSetSousTypeObjectif();

	/**
	 * Returns the value of the '<em><b>Niveau</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoEchelonTactiqueObjectif}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Niveau</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Niveau</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEchelonTactiqueObjectif
	 * @see #isSetNiveau()
	 * @see #unsetNiveau()
	 * @see #setNiveau(TypeDictionaryDicoEchelonTactiqueObjectif)
	 * @see mpia.schema.SchemaPackage#getTypeTypeObjectifASS_Niveau()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='Niveau'"
	 * @generated
	 */
	TypeDictionaryDicoEchelonTactiqueObjectif getNiveau();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTypeObjectifASS#getNiveau <em>Niveau</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Niveau</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEchelonTactiqueObjectif
	 * @see #isSetNiveau()
	 * @see #unsetNiveau()
	 * @see #getNiveau()
	 * @generated
	 */
	void setNiveau(TypeDictionaryDicoEchelonTactiqueObjectif value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeTypeObjectifASS#getNiveau <em>Niveau</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNiveau()
	 * @see #getNiveau()
	 * @see #setNiveau(TypeDictionaryDicoEchelonTactiqueObjectif)
	 * @generated
	 */
	void unsetNiveau();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeTypeObjectifASS#getNiveau <em>Niveau</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Niveau</em>' attribute is set.
	 * @see #unsetNiveau()
	 * @see #getNiveau()
	 * @see #setNiveau(TypeDictionaryDicoEchelonTactiqueObjectif)
	 * @generated
	 */
	boolean isSetNiveau();

	/**
	 * Returns the value of the '<em><b>Nombre Elements</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre Elements</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre Elements</em>' attribute.
	 * @see #isSetNombreElements()
	 * @see #unsetNombreElements()
	 * @see #setNombreElements(long)
	 * @see mpia.schema.SchemaPackage#getTypeTypeObjectifASS_NombreElements()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier6"
	 *        extendedMetaData="kind='element' name='NombreElements'"
	 * @generated
	 */
	long getNombreElements();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTypeObjectifASS#getNombreElements <em>Nombre Elements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre Elements</em>' attribute.
	 * @see #isSetNombreElements()
	 * @see #unsetNombreElements()
	 * @see #getNombreElements()
	 * @generated
	 */
	void setNombreElements(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeTypeObjectifASS#getNombreElements <em>Nombre Elements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNombreElements()
	 * @see #getNombreElements()
	 * @see #setNombreElements(long)
	 * @generated
	 */
	void unsetNombreElements();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeTypeObjectifASS#getNombreElements <em>Nombre Elements</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nombre Elements</em>' attribute is set.
	 * @see #unsetNombreElements()
	 * @see #getNombreElements()
	 * @see #setNombreElements(long)
	 * @generated
	 */
	boolean isSetNombreElements();

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
	 * @see mpia.schema.SchemaPackage#getTypeTypeObjectifASS_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTypeObjectifASS#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeTypeObjectifASS_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTypeObjectifASS#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

} // TypeTypeObjectifASS
