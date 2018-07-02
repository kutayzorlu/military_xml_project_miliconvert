/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Serie Geostatistique</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeSerieGeostatistique#getNom <em>Nom</em>}</li>
 *   <li>{@link mpia.schema.TypeSerieGeostatistique#getGdhDateCreation <em>Gdh Date Creation</em>}</li>
 *   <li>{@link mpia.schema.TypeSerieGeostatistique#getDescription <em>Description</em>}</li>
 *   <li>{@link mpia.schema.TypeSerieGeostatistique#getValeur1 <em>Valeur1</em>}</li>
 *   <li>{@link mpia.schema.TypeSerieGeostatistique#getValeur2 <em>Valeur2</em>}</li>
 *   <li>{@link mpia.schema.TypeSerieGeostatistique#getValeur3 <em>Valeur3</em>}</li>
 *   <li>{@link mpia.schema.TypeSerieGeostatistique#getValeur4 <em>Valeur4</em>}</li>
 *   <li>{@link mpia.schema.TypeSerieGeostatistique#getValeur5 <em>Valeur5</em>}</li>
 *   <li>{@link mpia.schema.TypeSerieGeostatistique#getValeur6 <em>Valeur6</em>}</li>
 *   <li>{@link mpia.schema.TypeSerieGeostatistique#getValeur7 <em>Valeur7</em>}</li>
 *   <li>{@link mpia.schema.TypeSerieGeostatistique#getValeur8 <em>Valeur8</em>}</li>
 *   <li>{@link mpia.schema.TypeSerieGeostatistique#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeSerieGeostatistique#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypeSerieGeostatistique#getLocalisationLocalisation <em>Localisation Localisation</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeSerieGeostatistique()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_SerieGeostatistique' kind='elementOnly'"
 * @generated
 */
public interface TypeSerieGeostatistique extends EObject {
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
	 * @see mpia.schema.SchemaPackage#getTypeSerieGeostatistique_Nom()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030"
	 *        extendedMetaData="kind='element' name='Nom'"
	 * @generated
	 */
	String getNom();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeSerieGeostatistique#getNom <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom</em>' attribute.
	 * @see #getNom()
	 * @generated
	 */
	void setNom(String value);

	/**
	 * Returns the value of the '<em><b>Gdh Date Creation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gdh Date Creation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gdh Date Creation</em>' attribute.
	 * @see #setGdhDateCreation(XMLGregorianCalendar)
	 * @see mpia.schema.SchemaPackage#getTypeSerieGeostatistique_GdhDateCreation()
	 * @model dataType="mpia.meta.TypeDataTypeGDH"
	 *        extendedMetaData="kind='element' name='GdhDateCreation'"
	 * @generated
	 */
	XMLGregorianCalendar getGdhDateCreation();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeSerieGeostatistique#getGdhDateCreation <em>Gdh Date Creation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gdh Date Creation</em>' attribute.
	 * @see #getGdhDateCreation()
	 * @generated
	 */
	void setGdhDateCreation(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see mpia.schema.SchemaPackage#getTypeSerieGeostatistique_Description()
	 * @model dataType="mpia.meta.TypeDataTypeChaine02000"
	 *        extendedMetaData="kind='element' name='Description'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeSerieGeostatistique#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Valeur1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Valeur1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valeur1</em>' attribute.
	 * @see #isSetValeur1()
	 * @see #unsetValeur1()
	 * @see #setValeur1(double)
	 * @see mpia.schema.SchemaPackage#getTypeSerieGeostatistique_Valeur1()
	 * @model unsettable="true" dataType="mpia.meta.TypeReal"
	 *        extendedMetaData="kind='element' name='Valeur1'"
	 * @generated
	 */
	double getValeur1();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeSerieGeostatistique#getValeur1 <em>Valeur1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valeur1</em>' attribute.
	 * @see #isSetValeur1()
	 * @see #unsetValeur1()
	 * @see #getValeur1()
	 * @generated
	 */
	void setValeur1(double value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeSerieGeostatistique#getValeur1 <em>Valeur1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetValeur1()
	 * @see #getValeur1()
	 * @see #setValeur1(double)
	 * @generated
	 */
	void unsetValeur1();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeSerieGeostatistique#getValeur1 <em>Valeur1</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Valeur1</em>' attribute is set.
	 * @see #unsetValeur1()
	 * @see #getValeur1()
	 * @see #setValeur1(double)
	 * @generated
	 */
	boolean isSetValeur1();

	/**
	 * Returns the value of the '<em><b>Valeur2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Valeur2</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valeur2</em>' attribute.
	 * @see #isSetValeur2()
	 * @see #unsetValeur2()
	 * @see #setValeur2(double)
	 * @see mpia.schema.SchemaPackage#getTypeSerieGeostatistique_Valeur2()
	 * @model unsettable="true" dataType="mpia.meta.TypeReal"
	 *        extendedMetaData="kind='element' name='Valeur2'"
	 * @generated
	 */
	double getValeur2();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeSerieGeostatistique#getValeur2 <em>Valeur2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valeur2</em>' attribute.
	 * @see #isSetValeur2()
	 * @see #unsetValeur2()
	 * @see #getValeur2()
	 * @generated
	 */
	void setValeur2(double value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeSerieGeostatistique#getValeur2 <em>Valeur2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetValeur2()
	 * @see #getValeur2()
	 * @see #setValeur2(double)
	 * @generated
	 */
	void unsetValeur2();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeSerieGeostatistique#getValeur2 <em>Valeur2</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Valeur2</em>' attribute is set.
	 * @see #unsetValeur2()
	 * @see #getValeur2()
	 * @see #setValeur2(double)
	 * @generated
	 */
	boolean isSetValeur2();

	/**
	 * Returns the value of the '<em><b>Valeur3</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Valeur3</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valeur3</em>' attribute.
	 * @see #isSetValeur3()
	 * @see #unsetValeur3()
	 * @see #setValeur3(double)
	 * @see mpia.schema.SchemaPackage#getTypeSerieGeostatistique_Valeur3()
	 * @model unsettable="true" dataType="mpia.meta.TypeReal"
	 *        extendedMetaData="kind='element' name='Valeur3'"
	 * @generated
	 */
	double getValeur3();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeSerieGeostatistique#getValeur3 <em>Valeur3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valeur3</em>' attribute.
	 * @see #isSetValeur3()
	 * @see #unsetValeur3()
	 * @see #getValeur3()
	 * @generated
	 */
	void setValeur3(double value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeSerieGeostatistique#getValeur3 <em>Valeur3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetValeur3()
	 * @see #getValeur3()
	 * @see #setValeur3(double)
	 * @generated
	 */
	void unsetValeur3();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeSerieGeostatistique#getValeur3 <em>Valeur3</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Valeur3</em>' attribute is set.
	 * @see #unsetValeur3()
	 * @see #getValeur3()
	 * @see #setValeur3(double)
	 * @generated
	 */
	boolean isSetValeur3();

	/**
	 * Returns the value of the '<em><b>Valeur4</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Valeur4</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valeur4</em>' attribute.
	 * @see #isSetValeur4()
	 * @see #unsetValeur4()
	 * @see #setValeur4(double)
	 * @see mpia.schema.SchemaPackage#getTypeSerieGeostatistique_Valeur4()
	 * @model unsettable="true" dataType="mpia.meta.TypeReal"
	 *        extendedMetaData="kind='element' name='Valeur4'"
	 * @generated
	 */
	double getValeur4();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeSerieGeostatistique#getValeur4 <em>Valeur4</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valeur4</em>' attribute.
	 * @see #isSetValeur4()
	 * @see #unsetValeur4()
	 * @see #getValeur4()
	 * @generated
	 */
	void setValeur4(double value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeSerieGeostatistique#getValeur4 <em>Valeur4</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetValeur4()
	 * @see #getValeur4()
	 * @see #setValeur4(double)
	 * @generated
	 */
	void unsetValeur4();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeSerieGeostatistique#getValeur4 <em>Valeur4</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Valeur4</em>' attribute is set.
	 * @see #unsetValeur4()
	 * @see #getValeur4()
	 * @see #setValeur4(double)
	 * @generated
	 */
	boolean isSetValeur4();

	/**
	 * Returns the value of the '<em><b>Valeur5</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Valeur5</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valeur5</em>' attribute.
	 * @see #isSetValeur5()
	 * @see #unsetValeur5()
	 * @see #setValeur5(double)
	 * @see mpia.schema.SchemaPackage#getTypeSerieGeostatistique_Valeur5()
	 * @model unsettable="true" dataType="mpia.meta.TypeReal"
	 *        extendedMetaData="kind='element' name='Valeur5'"
	 * @generated
	 */
	double getValeur5();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeSerieGeostatistique#getValeur5 <em>Valeur5</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valeur5</em>' attribute.
	 * @see #isSetValeur5()
	 * @see #unsetValeur5()
	 * @see #getValeur5()
	 * @generated
	 */
	void setValeur5(double value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeSerieGeostatistique#getValeur5 <em>Valeur5</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetValeur5()
	 * @see #getValeur5()
	 * @see #setValeur5(double)
	 * @generated
	 */
	void unsetValeur5();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeSerieGeostatistique#getValeur5 <em>Valeur5</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Valeur5</em>' attribute is set.
	 * @see #unsetValeur5()
	 * @see #getValeur5()
	 * @see #setValeur5(double)
	 * @generated
	 */
	boolean isSetValeur5();

	/**
	 * Returns the value of the '<em><b>Valeur6</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Valeur6</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valeur6</em>' attribute.
	 * @see #isSetValeur6()
	 * @see #unsetValeur6()
	 * @see #setValeur6(double)
	 * @see mpia.schema.SchemaPackage#getTypeSerieGeostatistique_Valeur6()
	 * @model unsettable="true" dataType="mpia.meta.TypeReal"
	 *        extendedMetaData="kind='element' name='Valeur6'"
	 * @generated
	 */
	double getValeur6();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeSerieGeostatistique#getValeur6 <em>Valeur6</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valeur6</em>' attribute.
	 * @see #isSetValeur6()
	 * @see #unsetValeur6()
	 * @see #getValeur6()
	 * @generated
	 */
	void setValeur6(double value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeSerieGeostatistique#getValeur6 <em>Valeur6</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetValeur6()
	 * @see #getValeur6()
	 * @see #setValeur6(double)
	 * @generated
	 */
	void unsetValeur6();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeSerieGeostatistique#getValeur6 <em>Valeur6</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Valeur6</em>' attribute is set.
	 * @see #unsetValeur6()
	 * @see #getValeur6()
	 * @see #setValeur6(double)
	 * @generated
	 */
	boolean isSetValeur6();

	/**
	 * Returns the value of the '<em><b>Valeur7</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Valeur7</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valeur7</em>' attribute.
	 * @see #isSetValeur7()
	 * @see #unsetValeur7()
	 * @see #setValeur7(double)
	 * @see mpia.schema.SchemaPackage#getTypeSerieGeostatistique_Valeur7()
	 * @model unsettable="true" dataType="mpia.meta.TypeReal"
	 *        extendedMetaData="kind='element' name='Valeur7'"
	 * @generated
	 */
	double getValeur7();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeSerieGeostatistique#getValeur7 <em>Valeur7</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valeur7</em>' attribute.
	 * @see #isSetValeur7()
	 * @see #unsetValeur7()
	 * @see #getValeur7()
	 * @generated
	 */
	void setValeur7(double value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeSerieGeostatistique#getValeur7 <em>Valeur7</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetValeur7()
	 * @see #getValeur7()
	 * @see #setValeur7(double)
	 * @generated
	 */
	void unsetValeur7();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeSerieGeostatistique#getValeur7 <em>Valeur7</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Valeur7</em>' attribute is set.
	 * @see #unsetValeur7()
	 * @see #getValeur7()
	 * @see #setValeur7(double)
	 * @generated
	 */
	boolean isSetValeur7();

	/**
	 * Returns the value of the '<em><b>Valeur8</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Valeur8</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valeur8</em>' attribute.
	 * @see #isSetValeur8()
	 * @see #unsetValeur8()
	 * @see #setValeur8(double)
	 * @see mpia.schema.SchemaPackage#getTypeSerieGeostatistique_Valeur8()
	 * @model unsettable="true" dataType="mpia.meta.TypeReal"
	 *        extendedMetaData="kind='element' name='Valeur8'"
	 * @generated
	 */
	double getValeur8();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeSerieGeostatistique#getValeur8 <em>Valeur8</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valeur8</em>' attribute.
	 * @see #isSetValeur8()
	 * @see #unsetValeur8()
	 * @see #getValeur8()
	 * @generated
	 */
	void setValeur8(double value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeSerieGeostatistique#getValeur8 <em>Valeur8</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetValeur8()
	 * @see #getValeur8()
	 * @see #setValeur8(double)
	 * @generated
	 */
	void unsetValeur8();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeSerieGeostatistique#getValeur8 <em>Valeur8</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Valeur8</em>' attribute is set.
	 * @see #unsetValeur8()
	 * @see #getValeur8()
	 * @see #setValeur8(double)
	 * @generated
	 */
	boolean isSetValeur8();

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
	 * @see mpia.schema.SchemaPackage#getTypeSerieGeostatistique_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeSerieGeostatistique#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeSerieGeostatistique_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeSerieGeostatistique#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

	/**
	 * Returns the value of the '<em><b>Localisation Localisation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Localisation Localisation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Localisation Localisation</em>' containment reference.
	 * @see #setLocalisationLocalisation(TypeLocalisation)
	 * @see mpia.schema.SchemaPackage#getTypeSerieGeostatistique_LocalisationLocalisation()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_Localisation'"
	 *        extendedMetaData="kind='element' name='Localisation_Localisation'"
	 * @generated
	 */
	TypeLocalisation getLocalisationLocalisation();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeSerieGeostatistique#getLocalisationLocalisation <em>Localisation Localisation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Localisation Localisation</em>' containment reference.
	 * @see #getLocalisationLocalisation()
	 * @generated
	 */
	void setLocalisationLocalisation(TypeLocalisation value);

} // TypeSerieGeostatistique
