/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Indicateur Geostatistique</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeIndicateurGeostatistique#getIdentifiant <em>Identifiant</em>}</li>
 *   <li>{@link mpia.schema.TypeIndicateurGeostatistique#getTypeGraphique <em>Type Graphique</em>}</li>
 *   <li>{@link mpia.schema.TypeIndicateurGeostatistique#getCouleurValeur1 <em>Couleur Valeur1</em>}</li>
 *   <li>{@link mpia.schema.TypeIndicateurGeostatistique#getCouleurValeur2 <em>Couleur Valeur2</em>}</li>
 *   <li>{@link mpia.schema.TypeIndicateurGeostatistique#getCouleurValeur3 <em>Couleur Valeur3</em>}</li>
 *   <li>{@link mpia.schema.TypeIndicateurGeostatistique#getCouleurValeur4 <em>Couleur Valeur4</em>}</li>
 *   <li>{@link mpia.schema.TypeIndicateurGeostatistique#getCouleurValeur5 <em>Couleur Valeur5</em>}</li>
 *   <li>{@link mpia.schema.TypeIndicateurGeostatistique#getCouleurValeur6 <em>Couleur Valeur6</em>}</li>
 *   <li>{@link mpia.schema.TypeIndicateurGeostatistique#getCouleurValeur7 <em>Couleur Valeur7</em>}</li>
 *   <li>{@link mpia.schema.TypeIndicateurGeostatistique#getCouleurValeur8 <em>Couleur Valeur8</em>}</li>
 *   <li>{@link mpia.schema.TypeIndicateurGeostatistique#getLibelleValeur1 <em>Libelle Valeur1</em>}</li>
 *   <li>{@link mpia.schema.TypeIndicateurGeostatistique#getLibelleValeur2 <em>Libelle Valeur2</em>}</li>
 *   <li>{@link mpia.schema.TypeIndicateurGeostatistique#getLibelleValeur3 <em>Libelle Valeur3</em>}</li>
 *   <li>{@link mpia.schema.TypeIndicateurGeostatistique#getLibelleValeur4 <em>Libelle Valeur4</em>}</li>
 *   <li>{@link mpia.schema.TypeIndicateurGeostatistique#getLibelleValeur5 <em>Libelle Valeur5</em>}</li>
 *   <li>{@link mpia.schema.TypeIndicateurGeostatistique#getLibelleValeur6 <em>Libelle Valeur6</em>}</li>
 *   <li>{@link mpia.schema.TypeIndicateurGeostatistique#getLibelleValeur7 <em>Libelle Valeur7</em>}</li>
 *   <li>{@link mpia.schema.TypeIndicateurGeostatistique#getLibelleValeur8 <em>Libelle Valeur8</em>}</li>
 *   <li>{@link mpia.schema.TypeIndicateurGeostatistique#getEpaisseurBarre <em>Epaisseur Barre</em>}</li>
 *   <li>{@link mpia.schema.TypeIndicateurGeostatistique#getFacteurNormalisation <em>Facteur Normalisation</em>}</li>
 *   <li>{@link mpia.schema.TypeIndicateurGeostatistique#getHauteurDiametre <em>Hauteur Diametre</em>}</li>
 *   <li>{@link mpia.schema.TypeIndicateurGeostatistique#getProfondeur3D <em>Profondeur3 D</em>}</li>
 *   <li>{@link mpia.schema.TypeIndicateurGeostatistique#getTailleCaseTableau <em>Taille Case Tableau</em>}</li>
 *   <li>{@link mpia.schema.TypeIndicateurGeostatistique#getCouleurRGB <em>Couleur RGB</em>}</li>
 *   <li>{@link mpia.schema.TypeIndicateurGeostatistique#getListeSeriesSerieGeostatistique <em>Liste Series Serie Geostatistique</em>}</li>
 *   <li>{@link mpia.schema.TypeIndicateurGeostatistique#getEstLocaliseEnLocalisation <em>Est Localise En Localisation</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeIndicateurGeostatistique()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_IndicateurGeostatistique' kind='elementOnly'"
 * @generated
 */
public interface TypeIndicateurGeostatistique extends TypeRacineOperationnelle {
	/**
	 * Returns the value of the '<em><b>Identifiant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identifiant</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifiant</em>' attribute.
	 * @see #setIdentifiant(String)
	 * @see mpia.schema.SchemaPackage#getTypeIndicateurGeostatistique_Identifiant()
	 * @model dataType="mpia.meta.TypeDataTypeChaine012"
	 *        extendedMetaData="kind='element' name='Identifiant'"
	 * @generated
	 */
	String getIdentifiant();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeIndicateurGeostatistique#getIdentifiant <em>Identifiant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifiant</em>' attribute.
	 * @see #getIdentifiant()
	 * @generated
	 */
	void setIdentifiant(String value);

	/**
	 * Returns the value of the '<em><b>Type Graphique</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoIndicateurGeostatistiqueTypeGraphique}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Graphique</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Graphique</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoIndicateurGeostatistiqueTypeGraphique
	 * @see #isSetTypeGraphique()
	 * @see #unsetTypeGraphique()
	 * @see #setTypeGraphique(TypeDictionaryDicoIndicateurGeostatistiqueTypeGraphique)
	 * @see mpia.schema.SchemaPackage#getTypeIndicateurGeostatistique_TypeGraphique()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='TypeGraphique'"
	 * @generated
	 */
	TypeDictionaryDicoIndicateurGeostatistiqueTypeGraphique getTypeGraphique();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeIndicateurGeostatistique#getTypeGraphique <em>Type Graphique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Graphique</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoIndicateurGeostatistiqueTypeGraphique
	 * @see #isSetTypeGraphique()
	 * @see #unsetTypeGraphique()
	 * @see #getTypeGraphique()
	 * @generated
	 */
	void setTypeGraphique(TypeDictionaryDicoIndicateurGeostatistiqueTypeGraphique value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeIndicateurGeostatistique#getTypeGraphique <em>Type Graphique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTypeGraphique()
	 * @see #getTypeGraphique()
	 * @see #setTypeGraphique(TypeDictionaryDicoIndicateurGeostatistiqueTypeGraphique)
	 * @generated
	 */
	void unsetTypeGraphique();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeIndicateurGeostatistique#getTypeGraphique <em>Type Graphique</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type Graphique</em>' attribute is set.
	 * @see #unsetTypeGraphique()
	 * @see #getTypeGraphique()
	 * @see #setTypeGraphique(TypeDictionaryDicoIndicateurGeostatistiqueTypeGraphique)
	 * @generated
	 */
	boolean isSetTypeGraphique();

	/**
	 * Returns the value of the '<em><b>Couleur Valeur1</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoChoixCouleur}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Couleur Valeur1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Couleur Valeur1</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoChoixCouleur
	 * @see #isSetCouleurValeur1()
	 * @see #unsetCouleurValeur1()
	 * @see #setCouleurValeur1(TypeDictionaryDicoChoixCouleur)
	 * @see mpia.schema.SchemaPackage#getTypeIndicateurGeostatistique_CouleurValeur1()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='CouleurValeur1'"
	 * @generated
	 */
	TypeDictionaryDicoChoixCouleur getCouleurValeur1();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeIndicateurGeostatistique#getCouleurValeur1 <em>Couleur Valeur1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Couleur Valeur1</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoChoixCouleur
	 * @see #isSetCouleurValeur1()
	 * @see #unsetCouleurValeur1()
	 * @see #getCouleurValeur1()
	 * @generated
	 */
	void setCouleurValeur1(TypeDictionaryDicoChoixCouleur value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeIndicateurGeostatistique#getCouleurValeur1 <em>Couleur Valeur1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCouleurValeur1()
	 * @see #getCouleurValeur1()
	 * @see #setCouleurValeur1(TypeDictionaryDicoChoixCouleur)
	 * @generated
	 */
	void unsetCouleurValeur1();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeIndicateurGeostatistique#getCouleurValeur1 <em>Couleur Valeur1</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Couleur Valeur1</em>' attribute is set.
	 * @see #unsetCouleurValeur1()
	 * @see #getCouleurValeur1()
	 * @see #setCouleurValeur1(TypeDictionaryDicoChoixCouleur)
	 * @generated
	 */
	boolean isSetCouleurValeur1();

	/**
	 * Returns the value of the '<em><b>Couleur Valeur2</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoChoixCouleur}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Couleur Valeur2</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Couleur Valeur2</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoChoixCouleur
	 * @see #isSetCouleurValeur2()
	 * @see #unsetCouleurValeur2()
	 * @see #setCouleurValeur2(TypeDictionaryDicoChoixCouleur)
	 * @see mpia.schema.SchemaPackage#getTypeIndicateurGeostatistique_CouleurValeur2()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='CouleurValeur2'"
	 * @generated
	 */
	TypeDictionaryDicoChoixCouleur getCouleurValeur2();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeIndicateurGeostatistique#getCouleurValeur2 <em>Couleur Valeur2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Couleur Valeur2</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoChoixCouleur
	 * @see #isSetCouleurValeur2()
	 * @see #unsetCouleurValeur2()
	 * @see #getCouleurValeur2()
	 * @generated
	 */
	void setCouleurValeur2(TypeDictionaryDicoChoixCouleur value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeIndicateurGeostatistique#getCouleurValeur2 <em>Couleur Valeur2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCouleurValeur2()
	 * @see #getCouleurValeur2()
	 * @see #setCouleurValeur2(TypeDictionaryDicoChoixCouleur)
	 * @generated
	 */
	void unsetCouleurValeur2();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeIndicateurGeostatistique#getCouleurValeur2 <em>Couleur Valeur2</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Couleur Valeur2</em>' attribute is set.
	 * @see #unsetCouleurValeur2()
	 * @see #getCouleurValeur2()
	 * @see #setCouleurValeur2(TypeDictionaryDicoChoixCouleur)
	 * @generated
	 */
	boolean isSetCouleurValeur2();

	/**
	 * Returns the value of the '<em><b>Couleur Valeur3</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoChoixCouleur}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Couleur Valeur3</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Couleur Valeur3</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoChoixCouleur
	 * @see #isSetCouleurValeur3()
	 * @see #unsetCouleurValeur3()
	 * @see #setCouleurValeur3(TypeDictionaryDicoChoixCouleur)
	 * @see mpia.schema.SchemaPackage#getTypeIndicateurGeostatistique_CouleurValeur3()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='CouleurValeur3'"
	 * @generated
	 */
	TypeDictionaryDicoChoixCouleur getCouleurValeur3();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeIndicateurGeostatistique#getCouleurValeur3 <em>Couleur Valeur3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Couleur Valeur3</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoChoixCouleur
	 * @see #isSetCouleurValeur3()
	 * @see #unsetCouleurValeur3()
	 * @see #getCouleurValeur3()
	 * @generated
	 */
	void setCouleurValeur3(TypeDictionaryDicoChoixCouleur value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeIndicateurGeostatistique#getCouleurValeur3 <em>Couleur Valeur3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCouleurValeur3()
	 * @see #getCouleurValeur3()
	 * @see #setCouleurValeur3(TypeDictionaryDicoChoixCouleur)
	 * @generated
	 */
	void unsetCouleurValeur3();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeIndicateurGeostatistique#getCouleurValeur3 <em>Couleur Valeur3</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Couleur Valeur3</em>' attribute is set.
	 * @see #unsetCouleurValeur3()
	 * @see #getCouleurValeur3()
	 * @see #setCouleurValeur3(TypeDictionaryDicoChoixCouleur)
	 * @generated
	 */
	boolean isSetCouleurValeur3();

	/**
	 * Returns the value of the '<em><b>Couleur Valeur4</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoChoixCouleur}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Couleur Valeur4</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Couleur Valeur4</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoChoixCouleur
	 * @see #isSetCouleurValeur4()
	 * @see #unsetCouleurValeur4()
	 * @see #setCouleurValeur4(TypeDictionaryDicoChoixCouleur)
	 * @see mpia.schema.SchemaPackage#getTypeIndicateurGeostatistique_CouleurValeur4()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='CouleurValeur4'"
	 * @generated
	 */
	TypeDictionaryDicoChoixCouleur getCouleurValeur4();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeIndicateurGeostatistique#getCouleurValeur4 <em>Couleur Valeur4</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Couleur Valeur4</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoChoixCouleur
	 * @see #isSetCouleurValeur4()
	 * @see #unsetCouleurValeur4()
	 * @see #getCouleurValeur4()
	 * @generated
	 */
	void setCouleurValeur4(TypeDictionaryDicoChoixCouleur value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeIndicateurGeostatistique#getCouleurValeur4 <em>Couleur Valeur4</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCouleurValeur4()
	 * @see #getCouleurValeur4()
	 * @see #setCouleurValeur4(TypeDictionaryDicoChoixCouleur)
	 * @generated
	 */
	void unsetCouleurValeur4();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeIndicateurGeostatistique#getCouleurValeur4 <em>Couleur Valeur4</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Couleur Valeur4</em>' attribute is set.
	 * @see #unsetCouleurValeur4()
	 * @see #getCouleurValeur4()
	 * @see #setCouleurValeur4(TypeDictionaryDicoChoixCouleur)
	 * @generated
	 */
	boolean isSetCouleurValeur4();

	/**
	 * Returns the value of the '<em><b>Couleur Valeur5</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoChoixCouleur}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Couleur Valeur5</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Couleur Valeur5</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoChoixCouleur
	 * @see #isSetCouleurValeur5()
	 * @see #unsetCouleurValeur5()
	 * @see #setCouleurValeur5(TypeDictionaryDicoChoixCouleur)
	 * @see mpia.schema.SchemaPackage#getTypeIndicateurGeostatistique_CouleurValeur5()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='CouleurValeur5'"
	 * @generated
	 */
	TypeDictionaryDicoChoixCouleur getCouleurValeur5();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeIndicateurGeostatistique#getCouleurValeur5 <em>Couleur Valeur5</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Couleur Valeur5</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoChoixCouleur
	 * @see #isSetCouleurValeur5()
	 * @see #unsetCouleurValeur5()
	 * @see #getCouleurValeur5()
	 * @generated
	 */
	void setCouleurValeur5(TypeDictionaryDicoChoixCouleur value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeIndicateurGeostatistique#getCouleurValeur5 <em>Couleur Valeur5</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCouleurValeur5()
	 * @see #getCouleurValeur5()
	 * @see #setCouleurValeur5(TypeDictionaryDicoChoixCouleur)
	 * @generated
	 */
	void unsetCouleurValeur5();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeIndicateurGeostatistique#getCouleurValeur5 <em>Couleur Valeur5</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Couleur Valeur5</em>' attribute is set.
	 * @see #unsetCouleurValeur5()
	 * @see #getCouleurValeur5()
	 * @see #setCouleurValeur5(TypeDictionaryDicoChoixCouleur)
	 * @generated
	 */
	boolean isSetCouleurValeur5();

	/**
	 * Returns the value of the '<em><b>Couleur Valeur6</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoChoixCouleur}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Couleur Valeur6</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Couleur Valeur6</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoChoixCouleur
	 * @see #isSetCouleurValeur6()
	 * @see #unsetCouleurValeur6()
	 * @see #setCouleurValeur6(TypeDictionaryDicoChoixCouleur)
	 * @see mpia.schema.SchemaPackage#getTypeIndicateurGeostatistique_CouleurValeur6()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='CouleurValeur6'"
	 * @generated
	 */
	TypeDictionaryDicoChoixCouleur getCouleurValeur6();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeIndicateurGeostatistique#getCouleurValeur6 <em>Couleur Valeur6</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Couleur Valeur6</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoChoixCouleur
	 * @see #isSetCouleurValeur6()
	 * @see #unsetCouleurValeur6()
	 * @see #getCouleurValeur6()
	 * @generated
	 */
	void setCouleurValeur6(TypeDictionaryDicoChoixCouleur value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeIndicateurGeostatistique#getCouleurValeur6 <em>Couleur Valeur6</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCouleurValeur6()
	 * @see #getCouleurValeur6()
	 * @see #setCouleurValeur6(TypeDictionaryDicoChoixCouleur)
	 * @generated
	 */
	void unsetCouleurValeur6();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeIndicateurGeostatistique#getCouleurValeur6 <em>Couleur Valeur6</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Couleur Valeur6</em>' attribute is set.
	 * @see #unsetCouleurValeur6()
	 * @see #getCouleurValeur6()
	 * @see #setCouleurValeur6(TypeDictionaryDicoChoixCouleur)
	 * @generated
	 */
	boolean isSetCouleurValeur6();

	/**
	 * Returns the value of the '<em><b>Couleur Valeur7</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoChoixCouleur}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Couleur Valeur7</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Couleur Valeur7</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoChoixCouleur
	 * @see #isSetCouleurValeur7()
	 * @see #unsetCouleurValeur7()
	 * @see #setCouleurValeur7(TypeDictionaryDicoChoixCouleur)
	 * @see mpia.schema.SchemaPackage#getTypeIndicateurGeostatistique_CouleurValeur7()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='CouleurValeur7'"
	 * @generated
	 */
	TypeDictionaryDicoChoixCouleur getCouleurValeur7();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeIndicateurGeostatistique#getCouleurValeur7 <em>Couleur Valeur7</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Couleur Valeur7</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoChoixCouleur
	 * @see #isSetCouleurValeur7()
	 * @see #unsetCouleurValeur7()
	 * @see #getCouleurValeur7()
	 * @generated
	 */
	void setCouleurValeur7(TypeDictionaryDicoChoixCouleur value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeIndicateurGeostatistique#getCouleurValeur7 <em>Couleur Valeur7</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCouleurValeur7()
	 * @see #getCouleurValeur7()
	 * @see #setCouleurValeur7(TypeDictionaryDicoChoixCouleur)
	 * @generated
	 */
	void unsetCouleurValeur7();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeIndicateurGeostatistique#getCouleurValeur7 <em>Couleur Valeur7</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Couleur Valeur7</em>' attribute is set.
	 * @see #unsetCouleurValeur7()
	 * @see #getCouleurValeur7()
	 * @see #setCouleurValeur7(TypeDictionaryDicoChoixCouleur)
	 * @generated
	 */
	boolean isSetCouleurValeur7();

	/**
	 * Returns the value of the '<em><b>Couleur Valeur8</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoChoixCouleur}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Couleur Valeur8</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Couleur Valeur8</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoChoixCouleur
	 * @see #isSetCouleurValeur8()
	 * @see #unsetCouleurValeur8()
	 * @see #setCouleurValeur8(TypeDictionaryDicoChoixCouleur)
	 * @see mpia.schema.SchemaPackage#getTypeIndicateurGeostatistique_CouleurValeur8()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='CouleurValeur8'"
	 * @generated
	 */
	TypeDictionaryDicoChoixCouleur getCouleurValeur8();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeIndicateurGeostatistique#getCouleurValeur8 <em>Couleur Valeur8</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Couleur Valeur8</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoChoixCouleur
	 * @see #isSetCouleurValeur8()
	 * @see #unsetCouleurValeur8()
	 * @see #getCouleurValeur8()
	 * @generated
	 */
	void setCouleurValeur8(TypeDictionaryDicoChoixCouleur value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeIndicateurGeostatistique#getCouleurValeur8 <em>Couleur Valeur8</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCouleurValeur8()
	 * @see #getCouleurValeur8()
	 * @see #setCouleurValeur8(TypeDictionaryDicoChoixCouleur)
	 * @generated
	 */
	void unsetCouleurValeur8();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeIndicateurGeostatistique#getCouleurValeur8 <em>Couleur Valeur8</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Couleur Valeur8</em>' attribute is set.
	 * @see #unsetCouleurValeur8()
	 * @see #getCouleurValeur8()
	 * @see #setCouleurValeur8(TypeDictionaryDicoChoixCouleur)
	 * @generated
	 */
	boolean isSetCouleurValeur8();

	/**
	 * Returns the value of the '<em><b>Libelle Valeur1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Libelle Valeur1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Libelle Valeur1</em>' attribute.
	 * @see #setLibelleValeur1(String)
	 * @see mpia.schema.SchemaPackage#getTypeIndicateurGeostatistique_LibelleValeur1()
	 * @model dataType="mpia.meta.TypeDataTypeChaine012"
	 *        extendedMetaData="kind='element' name='LibelleValeur1'"
	 * @generated
	 */
	String getLibelleValeur1();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeIndicateurGeostatistique#getLibelleValeur1 <em>Libelle Valeur1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Libelle Valeur1</em>' attribute.
	 * @see #getLibelleValeur1()
	 * @generated
	 */
	void setLibelleValeur1(String value);

	/**
	 * Returns the value of the '<em><b>Libelle Valeur2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Libelle Valeur2</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Libelle Valeur2</em>' attribute.
	 * @see #setLibelleValeur2(String)
	 * @see mpia.schema.SchemaPackage#getTypeIndicateurGeostatistique_LibelleValeur2()
	 * @model dataType="mpia.meta.TypeDataTypeChaine012"
	 *        extendedMetaData="kind='element' name='LibelleValeur2'"
	 * @generated
	 */
	String getLibelleValeur2();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeIndicateurGeostatistique#getLibelleValeur2 <em>Libelle Valeur2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Libelle Valeur2</em>' attribute.
	 * @see #getLibelleValeur2()
	 * @generated
	 */
	void setLibelleValeur2(String value);

	/**
	 * Returns the value of the '<em><b>Libelle Valeur3</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Libelle Valeur3</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Libelle Valeur3</em>' attribute.
	 * @see #setLibelleValeur3(String)
	 * @see mpia.schema.SchemaPackage#getTypeIndicateurGeostatistique_LibelleValeur3()
	 * @model dataType="mpia.meta.TypeDataTypeChaine012"
	 *        extendedMetaData="kind='element' name='LibelleValeur3'"
	 * @generated
	 */
	String getLibelleValeur3();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeIndicateurGeostatistique#getLibelleValeur3 <em>Libelle Valeur3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Libelle Valeur3</em>' attribute.
	 * @see #getLibelleValeur3()
	 * @generated
	 */
	void setLibelleValeur3(String value);

	/**
	 * Returns the value of the '<em><b>Libelle Valeur4</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Libelle Valeur4</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Libelle Valeur4</em>' attribute.
	 * @see #setLibelleValeur4(String)
	 * @see mpia.schema.SchemaPackage#getTypeIndicateurGeostatistique_LibelleValeur4()
	 * @model dataType="mpia.meta.TypeDataTypeChaine012"
	 *        extendedMetaData="kind='element' name='LibelleValeur4'"
	 * @generated
	 */
	String getLibelleValeur4();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeIndicateurGeostatistique#getLibelleValeur4 <em>Libelle Valeur4</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Libelle Valeur4</em>' attribute.
	 * @see #getLibelleValeur4()
	 * @generated
	 */
	void setLibelleValeur4(String value);

	/**
	 * Returns the value of the '<em><b>Libelle Valeur5</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Libelle Valeur5</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Libelle Valeur5</em>' attribute.
	 * @see #setLibelleValeur5(String)
	 * @see mpia.schema.SchemaPackage#getTypeIndicateurGeostatistique_LibelleValeur5()
	 * @model dataType="mpia.meta.TypeDataTypeChaine012"
	 *        extendedMetaData="kind='element' name='LibelleValeur5'"
	 * @generated
	 */
	String getLibelleValeur5();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeIndicateurGeostatistique#getLibelleValeur5 <em>Libelle Valeur5</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Libelle Valeur5</em>' attribute.
	 * @see #getLibelleValeur5()
	 * @generated
	 */
	void setLibelleValeur5(String value);

	/**
	 * Returns the value of the '<em><b>Libelle Valeur6</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Libelle Valeur6</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Libelle Valeur6</em>' attribute.
	 * @see #setLibelleValeur6(String)
	 * @see mpia.schema.SchemaPackage#getTypeIndicateurGeostatistique_LibelleValeur6()
	 * @model dataType="mpia.meta.TypeDataTypeChaine012"
	 *        extendedMetaData="kind='element' name='LibelleValeur6'"
	 * @generated
	 */
	String getLibelleValeur6();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeIndicateurGeostatistique#getLibelleValeur6 <em>Libelle Valeur6</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Libelle Valeur6</em>' attribute.
	 * @see #getLibelleValeur6()
	 * @generated
	 */
	void setLibelleValeur6(String value);

	/**
	 * Returns the value of the '<em><b>Libelle Valeur7</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Libelle Valeur7</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Libelle Valeur7</em>' attribute.
	 * @see #setLibelleValeur7(String)
	 * @see mpia.schema.SchemaPackage#getTypeIndicateurGeostatistique_LibelleValeur7()
	 * @model dataType="mpia.meta.TypeDataTypeChaine012"
	 *        extendedMetaData="kind='element' name='LibelleValeur7'"
	 * @generated
	 */
	String getLibelleValeur7();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeIndicateurGeostatistique#getLibelleValeur7 <em>Libelle Valeur7</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Libelle Valeur7</em>' attribute.
	 * @see #getLibelleValeur7()
	 * @generated
	 */
	void setLibelleValeur7(String value);

	/**
	 * Returns the value of the '<em><b>Libelle Valeur8</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Libelle Valeur8</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Libelle Valeur8</em>' attribute.
	 * @see #setLibelleValeur8(String)
	 * @see mpia.schema.SchemaPackage#getTypeIndicateurGeostatistique_LibelleValeur8()
	 * @model dataType="mpia.meta.TypeDataTypeChaine012"
	 *        extendedMetaData="kind='element' name='LibelleValeur8'"
	 * @generated
	 */
	String getLibelleValeur8();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeIndicateurGeostatistique#getLibelleValeur8 <em>Libelle Valeur8</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Libelle Valeur8</em>' attribute.
	 * @see #getLibelleValeur8()
	 * @generated
	 */
	void setLibelleValeur8(String value);

	/**
	 * Returns the value of the '<em><b>Epaisseur Barre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Epaisseur Barre</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Epaisseur Barre</em>' attribute.
	 * @see #isSetEpaisseurBarre()
	 * @see #unsetEpaisseurBarre()
	 * @see #setEpaisseurBarre(long)
	 * @see mpia.schema.SchemaPackage#getTypeIndicateurGeostatistique_EpaisseurBarre()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier3"
	 *        extendedMetaData="kind='element' name='EpaisseurBarre'"
	 * @generated
	 */
	long getEpaisseurBarre();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeIndicateurGeostatistique#getEpaisseurBarre <em>Epaisseur Barre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Epaisseur Barre</em>' attribute.
	 * @see #isSetEpaisseurBarre()
	 * @see #unsetEpaisseurBarre()
	 * @see #getEpaisseurBarre()
	 * @generated
	 */
	void setEpaisseurBarre(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeIndicateurGeostatistique#getEpaisseurBarre <em>Epaisseur Barre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEpaisseurBarre()
	 * @see #getEpaisseurBarre()
	 * @see #setEpaisseurBarre(long)
	 * @generated
	 */
	void unsetEpaisseurBarre();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeIndicateurGeostatistique#getEpaisseurBarre <em>Epaisseur Barre</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Epaisseur Barre</em>' attribute is set.
	 * @see #unsetEpaisseurBarre()
	 * @see #getEpaisseurBarre()
	 * @see #setEpaisseurBarre(long)
	 * @generated
	 */
	boolean isSetEpaisseurBarre();

	/**
	 * Returns the value of the '<em><b>Facteur Normalisation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Facteur Normalisation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Facteur Normalisation</em>' attribute.
	 * @see #isSetFacteurNormalisation()
	 * @see #unsetFacteurNormalisation()
	 * @see #setFacteurNormalisation(long)
	 * @see mpia.schema.SchemaPackage#getTypeIndicateurGeostatistique_FacteurNormalisation()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier15"
	 *        extendedMetaData="kind='element' name='FacteurNormalisation'"
	 * @generated
	 */
	long getFacteurNormalisation();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeIndicateurGeostatistique#getFacteurNormalisation <em>Facteur Normalisation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Facteur Normalisation</em>' attribute.
	 * @see #isSetFacteurNormalisation()
	 * @see #unsetFacteurNormalisation()
	 * @see #getFacteurNormalisation()
	 * @generated
	 */
	void setFacteurNormalisation(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeIndicateurGeostatistique#getFacteurNormalisation <em>Facteur Normalisation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFacteurNormalisation()
	 * @see #getFacteurNormalisation()
	 * @see #setFacteurNormalisation(long)
	 * @generated
	 */
	void unsetFacteurNormalisation();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeIndicateurGeostatistique#getFacteurNormalisation <em>Facteur Normalisation</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Facteur Normalisation</em>' attribute is set.
	 * @see #unsetFacteurNormalisation()
	 * @see #getFacteurNormalisation()
	 * @see #setFacteurNormalisation(long)
	 * @generated
	 */
	boolean isSetFacteurNormalisation();

	/**
	 * Returns the value of the '<em><b>Hauteur Diametre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hauteur Diametre</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hauteur Diametre</em>' attribute.
	 * @see #isSetHauteurDiametre()
	 * @see #unsetHauteurDiametre()
	 * @see #setHauteurDiametre(long)
	 * @see mpia.schema.SchemaPackage#getTypeIndicateurGeostatistique_HauteurDiametre()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier3"
	 *        extendedMetaData="kind='element' name='HauteurDiametre'"
	 * @generated
	 */
	long getHauteurDiametre();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeIndicateurGeostatistique#getHauteurDiametre <em>Hauteur Diametre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hauteur Diametre</em>' attribute.
	 * @see #isSetHauteurDiametre()
	 * @see #unsetHauteurDiametre()
	 * @see #getHauteurDiametre()
	 * @generated
	 */
	void setHauteurDiametre(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeIndicateurGeostatistique#getHauteurDiametre <em>Hauteur Diametre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetHauteurDiametre()
	 * @see #getHauteurDiametre()
	 * @see #setHauteurDiametre(long)
	 * @generated
	 */
	void unsetHauteurDiametre();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeIndicateurGeostatistique#getHauteurDiametre <em>Hauteur Diametre</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Hauteur Diametre</em>' attribute is set.
	 * @see #unsetHauteurDiametre()
	 * @see #getHauteurDiametre()
	 * @see #setHauteurDiametre(long)
	 * @generated
	 */
	boolean isSetHauteurDiametre();

	/**
	 * Returns the value of the '<em><b>Profondeur3 D</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Profondeur3 D</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Profondeur3 D</em>' attribute.
	 * @see #isSetProfondeur3D()
	 * @see #unsetProfondeur3D()
	 * @see #setProfondeur3D(long)
	 * @see mpia.schema.SchemaPackage#getTypeIndicateurGeostatistique_Profondeur3D()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier3"
	 *        extendedMetaData="kind='element' name='Profondeur3D'"
	 * @generated
	 */
	long getProfondeur3D();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeIndicateurGeostatistique#getProfondeur3D <em>Profondeur3 D</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Profondeur3 D</em>' attribute.
	 * @see #isSetProfondeur3D()
	 * @see #unsetProfondeur3D()
	 * @see #getProfondeur3D()
	 * @generated
	 */
	void setProfondeur3D(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeIndicateurGeostatistique#getProfondeur3D <em>Profondeur3 D</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetProfondeur3D()
	 * @see #getProfondeur3D()
	 * @see #setProfondeur3D(long)
	 * @generated
	 */
	void unsetProfondeur3D();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeIndicateurGeostatistique#getProfondeur3D <em>Profondeur3 D</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Profondeur3 D</em>' attribute is set.
	 * @see #unsetProfondeur3D()
	 * @see #getProfondeur3D()
	 * @see #setProfondeur3D(long)
	 * @generated
	 */
	boolean isSetProfondeur3D();

	/**
	 * Returns the value of the '<em><b>Taille Case Tableau</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Taille Case Tableau</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Taille Case Tableau</em>' attribute.
	 * @see #isSetTailleCaseTableau()
	 * @see #unsetTailleCaseTableau()
	 * @see #setTailleCaseTableau(long)
	 * @see mpia.schema.SchemaPackage#getTypeIndicateurGeostatistique_TailleCaseTableau()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier3"
	 *        extendedMetaData="kind='element' name='TailleCaseTableau'"
	 * @generated
	 */
	long getTailleCaseTableau();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeIndicateurGeostatistique#getTailleCaseTableau <em>Taille Case Tableau</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Taille Case Tableau</em>' attribute.
	 * @see #isSetTailleCaseTableau()
	 * @see #unsetTailleCaseTableau()
	 * @see #getTailleCaseTableau()
	 * @generated
	 */
	void setTailleCaseTableau(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeIndicateurGeostatistique#getTailleCaseTableau <em>Taille Case Tableau</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTailleCaseTableau()
	 * @see #getTailleCaseTableau()
	 * @see #setTailleCaseTableau(long)
	 * @generated
	 */
	void unsetTailleCaseTableau();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeIndicateurGeostatistique#getTailleCaseTableau <em>Taille Case Tableau</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Taille Case Tableau</em>' attribute is set.
	 * @see #unsetTailleCaseTableau()
	 * @see #getTailleCaseTableau()
	 * @see #setTailleCaseTableau(long)
	 * @generated
	 */
	boolean isSetTailleCaseTableau();

	/**
	 * Returns the value of the '<em><b>Couleur RGB</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Couleur RGB</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Couleur RGB</em>' attribute.
	 * @see #setCouleurRGB(String)
	 * @see mpia.schema.SchemaPackage#getTypeIndicateurGeostatistique_CouleurRGB()
	 * @model dataType="mpia.meta.TypeDataTypeChaine020"
	 *        extendedMetaData="kind='element' name='CouleurRGB'"
	 * @generated
	 */
	String getCouleurRGB();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeIndicateurGeostatistique#getCouleurRGB <em>Couleur RGB</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Couleur RGB</em>' attribute.
	 * @see #getCouleurRGB()
	 * @generated
	 */
	void setCouleurRGB(String value);

	/**
	 * Returns the value of the '<em><b>Liste Series Serie Geostatistique</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeSerieGeostatistique}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Liste Series Serie Geostatistique</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Liste Series Serie Geostatistique</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeIndicateurGeostatistique_ListeSeriesSerieGeostatistique()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_SerieGeostatistique'"
	 *        extendedMetaData="kind='element' name='ListeSeries_SerieGeostatistique'"
	 * @generated
	 */
	EList<TypeSerieGeostatistique> getListeSeriesSerieGeostatistique();

	/**
	 * Returns the value of the '<em><b>Est Localise En Localisation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Localise En Localisation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Localise En Localisation</em>' containment reference.
	 * @see #setEstLocaliseEnLocalisation(TypeLocalisation)
	 * @see mpia.schema.SchemaPackage#getTypeIndicateurGeostatistique_EstLocaliseEnLocalisation()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_Localisation'"
	 *        extendedMetaData="kind='element' name='EstLocaliseEn_Localisation'"
	 * @generated
	 */
	TypeLocalisation getEstLocaliseEnLocalisation();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeIndicateurGeostatistique#getEstLocaliseEnLocalisation <em>Est Localise En Localisation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Est Localise En Localisation</em>' containment reference.
	 * @see #getEstLocaliseEnLocalisation()
	 * @generated
	 */
	void setEstLocaliseEnLocalisation(TypeLocalisation value);

} // TypeIndicateurGeostatistique
