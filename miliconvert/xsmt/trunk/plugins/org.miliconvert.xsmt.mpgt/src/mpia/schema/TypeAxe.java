/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeAssociation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Axe</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeAxe#getCouleur <em>Couleur</em>}</li>
 *   <li>{@link mpia.schema.TypeAxe#getLongueurAxe <em>Longueur Axe</em>}</li>
 *   <li>{@link mpia.schema.TypeAxe#getSensTrajet <em>Sens Trajet</em>}</li>
 *   <li>{@link mpia.schema.TypeAxe#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.TypeAxe#getIdentifiant <em>Identifiant</em>}</li>
 *   <li>{@link mpia.schema.TypeAxe#getNombreVoies <em>Nombre Voies</em>}</li>
 *   <li>{@link mpia.schema.TypeAxe#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeAxe#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypeAxe#getACommePontAssociePont <em>AComme Pont Associe Pont</em>}</li>
 *   <li>{@link mpia.schema.TypeAxe#getACommeObstacleAssocieObstacle <em>AComme Obstacle Associe Obstacle</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeAxe()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_Axe' kind='elementOnly'"
 * @generated
 */
public interface TypeAxe extends EObject {
	/**
	 * Returns the value of the '<em><b>Couleur</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoChoixCouleur}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Couleur</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Couleur</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoChoixCouleur
	 * @see #isSetCouleur()
	 * @see #unsetCouleur()
	 * @see #setCouleur(TypeDictionaryDicoChoixCouleur)
	 * @see mpia.schema.SchemaPackage#getTypeAxe_Couleur()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='Couleur'"
	 * @generated
	 */
	TypeDictionaryDicoChoixCouleur getCouleur();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAxe#getCouleur <em>Couleur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Couleur</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoChoixCouleur
	 * @see #isSetCouleur()
	 * @see #unsetCouleur()
	 * @see #getCouleur()
	 * @generated
	 */
	void setCouleur(TypeDictionaryDicoChoixCouleur value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeAxe#getCouleur <em>Couleur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCouleur()
	 * @see #getCouleur()
	 * @see #setCouleur(TypeDictionaryDicoChoixCouleur)
	 * @generated
	 */
	void unsetCouleur();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeAxe#getCouleur <em>Couleur</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Couleur</em>' attribute is set.
	 * @see #unsetCouleur()
	 * @see #getCouleur()
	 * @see #setCouleur(TypeDictionaryDicoChoixCouleur)
	 * @generated
	 */
	boolean isSetCouleur();

	/**
	 * Returns the value of the '<em><b>Longueur Axe</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Longueur Axe</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Longueur Axe</em>' attribute.
	 * @see #isSetLongueurAxe()
	 * @see #unsetLongueurAxe()
	 * @see #setLongueurAxe(double)
	 * @see mpia.schema.SchemaPackage#getTypeAxe_LongueurAxe()
	 * @model unsettable="true" dataType="mpia.meta.TypeReal"
	 *        extendedMetaData="kind='element' name='LongueurAxe'"
	 * @generated
	 */
	double getLongueurAxe();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAxe#getLongueurAxe <em>Longueur Axe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Longueur Axe</em>' attribute.
	 * @see #isSetLongueurAxe()
	 * @see #unsetLongueurAxe()
	 * @see #getLongueurAxe()
	 * @generated
	 */
	void setLongueurAxe(double value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeAxe#getLongueurAxe <em>Longueur Axe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLongueurAxe()
	 * @see #getLongueurAxe()
	 * @see #setLongueurAxe(double)
	 * @generated
	 */
	void unsetLongueurAxe();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeAxe#getLongueurAxe <em>Longueur Axe</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Longueur Axe</em>' attribute is set.
	 * @see #unsetLongueurAxe()
	 * @see #getLongueurAxe()
	 * @see #setLongueurAxe(double)
	 * @generated
	 */
	boolean isSetLongueurAxe();

	/**
	 * Returns the value of the '<em><b>Sens Trajet</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoModaliteSens}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sens Trajet</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sens Trajet</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoModaliteSens
	 * @see #isSetSensTrajet()
	 * @see #unsetSensTrajet()
	 * @see #setSensTrajet(TypeDictionaryDicoModaliteSens)
	 * @see mpia.schema.SchemaPackage#getTypeAxe_SensTrajet()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='SensTrajet'"
	 * @generated
	 */
	TypeDictionaryDicoModaliteSens getSensTrajet();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAxe#getSensTrajet <em>Sens Trajet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sens Trajet</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoModaliteSens
	 * @see #isSetSensTrajet()
	 * @see #unsetSensTrajet()
	 * @see #getSensTrajet()
	 * @generated
	 */
	void setSensTrajet(TypeDictionaryDicoModaliteSens value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeAxe#getSensTrajet <em>Sens Trajet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSensTrajet()
	 * @see #getSensTrajet()
	 * @see #setSensTrajet(TypeDictionaryDicoModaliteSens)
	 * @generated
	 */
	void unsetSensTrajet();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeAxe#getSensTrajet <em>Sens Trajet</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Sens Trajet</em>' attribute is set.
	 * @see #unsetSensTrajet()
	 * @see #getSensTrajet()
	 * @see #setSensTrajet(TypeDictionaryDicoModaliteSens)
	 * @generated
	 */
	boolean isSetSensTrajet();

	/**
	 * Returns the value of the '<em><b>Categorie</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoAxeCategorie}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categorie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoAxeCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAxeCategorie)
	 * @see mpia.schema.SchemaPackage#getTypeAxe_Categorie()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='Categorie'"
	 * @generated
	 */
	TypeDictionaryDicoAxeCategorie getCategorie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAxe#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoAxeCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @generated
	 */
	void setCategorie(TypeDictionaryDicoAxeCategorie value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeAxe#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAxeCategorie)
	 * @generated
	 */
	void unsetCategorie();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeAxe#getCategorie <em>Categorie</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Categorie</em>' attribute is set.
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAxeCategorie)
	 * @generated
	 */
	boolean isSetCategorie();

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
	 * @see mpia.schema.SchemaPackage#getTypeAxe_Identifiant()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030"
	 *        extendedMetaData="kind='element' name='Identifiant'"
	 * @generated
	 */
	String getIdentifiant();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAxe#getIdentifiant <em>Identifiant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifiant</em>' attribute.
	 * @see #getIdentifiant()
	 * @generated
	 */
	void setIdentifiant(String value);

	/**
	 * Returns the value of the '<em><b>Nombre Voies</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre Voies</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre Voies</em>' attribute.
	 * @see #isSetNombreVoies()
	 * @see #unsetNombreVoies()
	 * @see #setNombreVoies(long)
	 * @see mpia.schema.SchemaPackage#getTypeAxe_NombreVoies()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier3"
	 *        extendedMetaData="kind='element' name='NombreVoies'"
	 * @generated
	 */
	long getNombreVoies();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAxe#getNombreVoies <em>Nombre Voies</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre Voies</em>' attribute.
	 * @see #isSetNombreVoies()
	 * @see #unsetNombreVoies()
	 * @see #getNombreVoies()
	 * @generated
	 */
	void setNombreVoies(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeAxe#getNombreVoies <em>Nombre Voies</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNombreVoies()
	 * @see #getNombreVoies()
	 * @see #setNombreVoies(long)
	 * @generated
	 */
	void unsetNombreVoies();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeAxe#getNombreVoies <em>Nombre Voies</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nombre Voies</em>' attribute is set.
	 * @see #unsetNombreVoies()
	 * @see #getNombreVoies()
	 * @see #setNombreVoies(long)
	 * @generated
	 */
	boolean isSetNombreVoies();

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
	 * @see mpia.schema.SchemaPackage#getTypeAxe_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAxe#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeAxe_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAxe#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

	/**
	 * Returns the value of the '<em><b>AComme Pont Associe Pont</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AComme Pont Associe Pont</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AComme Pont Associe Pont</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeAxe_ACommePontAssociePont()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_Pont'"
	 *        extendedMetaData="kind='element' name='ACommePontAssocie_Pont'"
	 * @generated
	 */
	EList<TypeAssociation> getACommePontAssociePont();

	/**
	 * Returns the value of the '<em><b>AComme Obstacle Associe Obstacle</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AComme Obstacle Associe Obstacle</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AComme Obstacle Associe Obstacle</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeAxe_ACommeObstacleAssocieObstacle()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_Obstacle'"
	 *        extendedMetaData="kind='element' name='ACommeObstacleAssocie_Obstacle'"
	 * @generated
	 */
	EList<TypeAssociation> getACommeObstacleAssocieObstacle();

} // TypeAxe
