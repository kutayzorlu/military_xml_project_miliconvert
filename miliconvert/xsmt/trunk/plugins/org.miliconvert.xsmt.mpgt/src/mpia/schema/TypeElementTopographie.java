/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeAssociation;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Element Topographie</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeElementTopographie#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.TypeElementTopographie#getSousCategorie <em>Sous Categorie</em>}</li>
 *   <li>{@link mpia.schema.TypeElementTopographie#getTypeSurface <em>Type Surface</em>}</li>
 *   <li>{@link mpia.schema.TypeElementTopographie#getDureteSurface <em>Durete Surface</em>}</li>
 *   <li>{@link mpia.schema.TypeElementTopographie#getDistancePenetration <em>Distance Penetration</em>}</li>
 *   <li>{@link mpia.schema.TypeElementTopographie#getCompositionSurfaceSolide <em>Composition Surface Solide</em>}</li>
 *   <li>{@link mpia.schema.TypeElementTopographie#getTypeTerrain <em>Type Terrain</em>}</li>
 *   <li>{@link mpia.schema.TypeElementTopographie#getTypeVegetation <em>Type Vegetation</em>}</li>
 *   <li>{@link mpia.schema.TypeElementTopographie#getSousTypeVegetation <em>Sous Type Vegetation</em>}</li>
 *   <li>{@link mpia.schema.TypeElementTopographie#getAPourEtatEtatOperationnelElementTopographie <em>APour Etat Etat Operationnel Element Topographie</em>}</li>
 *   <li>{@link mpia.schema.TypeElementTopographie#getEstObjetAssociationEltCtrlEltTopo <em>Est Objet Association Elt Ctrl Elt Topo</em>}</li>
 *   <li>{@link mpia.schema.TypeElementTopographie#getEstSujetAssociationEltTopoSite <em>Est Sujet Association Elt Topo Site</em>}</li>
 *   <li>{@link mpia.schema.TypeElementTopographie#getEstObjetAssociationSiteEltTopo <em>Est Objet Association Site Elt Topo</em>}</li>
 *   <li>{@link mpia.schema.TypeElementTopographie#getEstObjetAssociationEntiteOrgEltTopo <em>Est Objet Association Entite Org Elt Topo</em>}</li>
 *   <li>{@link mpia.schema.TypeElementTopographie#getEstObjetAssociationPersonneEltTopo <em>Est Objet Association Personne Elt Topo</em>}</li>
 *   <li>{@link mpia.schema.TypeElementTopographie#getEstObjetAssociationMaterielEltTopo <em>Est Objet Association Materiel Elt Topo</em>}</li>
 *   <li>{@link mpia.schema.TypeElementTopographie#getEstSujetAssociationElementTopographieEvenement <em>Est Sujet Association Element Topographie Evenement</em>}</li>
 *   <li>{@link mpia.schema.TypeElementTopographie#getEstObjetAssociationObjetInconnuEltTopo <em>Est Objet Association Objet Inconnu Elt Topo</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeElementTopographie()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_ElementTopographie' kind='elementOnly'"
 * @generated
 */
public interface TypeElementTopographie extends TypeInstanceObjet {
	/**
	 * Returns the value of the '<em><b>Categorie</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoElementTopographieCategorie}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categorie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoElementTopographieCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #setCategorie(TypeDictionaryDicoElementTopographieCategorie)
	 * @see mpia.schema.SchemaPackage#getTypeElementTopographie_Categorie()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='Categorie'"
	 * @generated
	 */
	TypeDictionaryDicoElementTopographieCategorie getCategorie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeElementTopographie#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoElementTopographieCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @generated
	 */
	void setCategorie(TypeDictionaryDicoElementTopographieCategorie value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeElementTopographie#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoElementTopographieCategorie)
	 * @generated
	 */
	void unsetCategorie();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeElementTopographie#getCategorie <em>Categorie</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Categorie</em>' attribute is set.
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoElementTopographieCategorie)
	 * @generated
	 */
	boolean isSetCategorie();

	/**
	 * Returns the value of the '<em><b>Sous Categorie</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoElementTopographieSousCategorie}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sous Categorie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sous Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoElementTopographieSousCategorie
	 * @see #isSetSousCategorie()
	 * @see #unsetSousCategorie()
	 * @see #setSousCategorie(TypeDictionaryDicoElementTopographieSousCategorie)
	 * @see mpia.schema.SchemaPackage#getTypeElementTopographie_SousCategorie()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='SousCategorie'"
	 * @generated
	 */
	TypeDictionaryDicoElementTopographieSousCategorie getSousCategorie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeElementTopographie#getSousCategorie <em>Sous Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sous Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoElementTopographieSousCategorie
	 * @see #isSetSousCategorie()
	 * @see #unsetSousCategorie()
	 * @see #getSousCategorie()
	 * @generated
	 */
	void setSousCategorie(TypeDictionaryDicoElementTopographieSousCategorie value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeElementTopographie#getSousCategorie <em>Sous Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSousCategorie()
	 * @see #getSousCategorie()
	 * @see #setSousCategorie(TypeDictionaryDicoElementTopographieSousCategorie)
	 * @generated
	 */
	void unsetSousCategorie();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeElementTopographie#getSousCategorie <em>Sous Categorie</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Sous Categorie</em>' attribute is set.
	 * @see #unsetSousCategorie()
	 * @see #getSousCategorie()
	 * @see #setSousCategorie(TypeDictionaryDicoElementTopographieSousCategorie)
	 * @generated
	 */
	boolean isSetSousCategorie();

	/**
	 * Returns the value of the '<em><b>Type Surface</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoElementTopographieTypeSurface}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Surface</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Surface</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoElementTopographieTypeSurface
	 * @see #isSetTypeSurface()
	 * @see #unsetTypeSurface()
	 * @see #setTypeSurface(TypeDictionaryDicoElementTopographieTypeSurface)
	 * @see mpia.schema.SchemaPackage#getTypeElementTopographie_TypeSurface()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='TypeSurface'"
	 * @generated
	 */
	TypeDictionaryDicoElementTopographieTypeSurface getTypeSurface();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeElementTopographie#getTypeSurface <em>Type Surface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Surface</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoElementTopographieTypeSurface
	 * @see #isSetTypeSurface()
	 * @see #unsetTypeSurface()
	 * @see #getTypeSurface()
	 * @generated
	 */
	void setTypeSurface(TypeDictionaryDicoElementTopographieTypeSurface value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeElementTopographie#getTypeSurface <em>Type Surface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTypeSurface()
	 * @see #getTypeSurface()
	 * @see #setTypeSurface(TypeDictionaryDicoElementTopographieTypeSurface)
	 * @generated
	 */
	void unsetTypeSurface();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeElementTopographie#getTypeSurface <em>Type Surface</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type Surface</em>' attribute is set.
	 * @see #unsetTypeSurface()
	 * @see #getTypeSurface()
	 * @see #setTypeSurface(TypeDictionaryDicoElementTopographieTypeSurface)
	 * @generated
	 */
	boolean isSetTypeSurface();

	/**
	 * Returns the value of the '<em><b>Durete Surface</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoElementTopographieDureteSurface}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Durete Surface</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Durete Surface</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoElementTopographieDureteSurface
	 * @see #isSetDureteSurface()
	 * @see #unsetDureteSurface()
	 * @see #setDureteSurface(TypeDictionaryDicoElementTopographieDureteSurface)
	 * @see mpia.schema.SchemaPackage#getTypeElementTopographie_DureteSurface()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='DureteSurface'"
	 * @generated
	 */
	TypeDictionaryDicoElementTopographieDureteSurface getDureteSurface();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeElementTopographie#getDureteSurface <em>Durete Surface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Durete Surface</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoElementTopographieDureteSurface
	 * @see #isSetDureteSurface()
	 * @see #unsetDureteSurface()
	 * @see #getDureteSurface()
	 * @generated
	 */
	void setDureteSurface(TypeDictionaryDicoElementTopographieDureteSurface value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeElementTopographie#getDureteSurface <em>Durete Surface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDureteSurface()
	 * @see #getDureteSurface()
	 * @see #setDureteSurface(TypeDictionaryDicoElementTopographieDureteSurface)
	 * @generated
	 */
	void unsetDureteSurface();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeElementTopographie#getDureteSurface <em>Durete Surface</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Durete Surface</em>' attribute is set.
	 * @see #unsetDureteSurface()
	 * @see #getDureteSurface()
	 * @see #setDureteSurface(TypeDictionaryDicoElementTopographieDureteSurface)
	 * @generated
	 */
	boolean isSetDureteSurface();

	/**
	 * Returns the value of the '<em><b>Distance Penetration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Distance Penetration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distance Penetration</em>' attribute.
	 * @see #isSetDistancePenetration()
	 * @see #unsetDistancePenetration()
	 * @see #setDistancePenetration(long)
	 * @see mpia.schema.SchemaPackage#getTypeElementTopographie_DistancePenetration()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier3"
	 *        extendedMetaData="kind='element' name='DistancePenetration'"
	 * @generated
	 */
	long getDistancePenetration();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeElementTopographie#getDistancePenetration <em>Distance Penetration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distance Penetration</em>' attribute.
	 * @see #isSetDistancePenetration()
	 * @see #unsetDistancePenetration()
	 * @see #getDistancePenetration()
	 * @generated
	 */
	void setDistancePenetration(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeElementTopographie#getDistancePenetration <em>Distance Penetration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDistancePenetration()
	 * @see #getDistancePenetration()
	 * @see #setDistancePenetration(long)
	 * @generated
	 */
	void unsetDistancePenetration();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeElementTopographie#getDistancePenetration <em>Distance Penetration</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Distance Penetration</em>' attribute is set.
	 * @see #unsetDistancePenetration()
	 * @see #getDistancePenetration()
	 * @see #setDistancePenetration(long)
	 * @generated
	 */
	boolean isSetDistancePenetration();

	/**
	 * Returns the value of the '<em><b>Composition Surface Solide</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoElementTopographieCompositionSurfaceSolide}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Composition Surface Solide</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Composition Surface Solide</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoElementTopographieCompositionSurfaceSolide
	 * @see #isSetCompositionSurfaceSolide()
	 * @see #unsetCompositionSurfaceSolide()
	 * @see #setCompositionSurfaceSolide(TypeDictionaryDicoElementTopographieCompositionSurfaceSolide)
	 * @see mpia.schema.SchemaPackage#getTypeElementTopographie_CompositionSurfaceSolide()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='CompositionSurfaceSolide'"
	 * @generated
	 */
	TypeDictionaryDicoElementTopographieCompositionSurfaceSolide getCompositionSurfaceSolide();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeElementTopographie#getCompositionSurfaceSolide <em>Composition Surface Solide</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Composition Surface Solide</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoElementTopographieCompositionSurfaceSolide
	 * @see #isSetCompositionSurfaceSolide()
	 * @see #unsetCompositionSurfaceSolide()
	 * @see #getCompositionSurfaceSolide()
	 * @generated
	 */
	void setCompositionSurfaceSolide(TypeDictionaryDicoElementTopographieCompositionSurfaceSolide value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeElementTopographie#getCompositionSurfaceSolide <em>Composition Surface Solide</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCompositionSurfaceSolide()
	 * @see #getCompositionSurfaceSolide()
	 * @see #setCompositionSurfaceSolide(TypeDictionaryDicoElementTopographieCompositionSurfaceSolide)
	 * @generated
	 */
	void unsetCompositionSurfaceSolide();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeElementTopographie#getCompositionSurfaceSolide <em>Composition Surface Solide</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Composition Surface Solide</em>' attribute is set.
	 * @see #unsetCompositionSurfaceSolide()
	 * @see #getCompositionSurfaceSolide()
	 * @see #setCompositionSurfaceSolide(TypeDictionaryDicoElementTopographieCompositionSurfaceSolide)
	 * @generated
	 */
	boolean isSetCompositionSurfaceSolide();

	/**
	 * Returns the value of the '<em><b>Type Terrain</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoElementTopographieTypeTerrain}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Terrain</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Terrain</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoElementTopographieTypeTerrain
	 * @see #isSetTypeTerrain()
	 * @see #unsetTypeTerrain()
	 * @see #setTypeTerrain(TypeDictionaryDicoElementTopographieTypeTerrain)
	 * @see mpia.schema.SchemaPackage#getTypeElementTopographie_TypeTerrain()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='TypeTerrain'"
	 * @generated
	 */
	TypeDictionaryDicoElementTopographieTypeTerrain getTypeTerrain();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeElementTopographie#getTypeTerrain <em>Type Terrain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Terrain</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoElementTopographieTypeTerrain
	 * @see #isSetTypeTerrain()
	 * @see #unsetTypeTerrain()
	 * @see #getTypeTerrain()
	 * @generated
	 */
	void setTypeTerrain(TypeDictionaryDicoElementTopographieTypeTerrain value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeElementTopographie#getTypeTerrain <em>Type Terrain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTypeTerrain()
	 * @see #getTypeTerrain()
	 * @see #setTypeTerrain(TypeDictionaryDicoElementTopographieTypeTerrain)
	 * @generated
	 */
	void unsetTypeTerrain();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeElementTopographie#getTypeTerrain <em>Type Terrain</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type Terrain</em>' attribute is set.
	 * @see #unsetTypeTerrain()
	 * @see #getTypeTerrain()
	 * @see #setTypeTerrain(TypeDictionaryDicoElementTopographieTypeTerrain)
	 * @generated
	 */
	boolean isSetTypeTerrain();

	/**
	 * Returns the value of the '<em><b>Type Vegetation</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoVegetation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Vegetation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Vegetation</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoVegetation
	 * @see #isSetTypeVegetation()
	 * @see #unsetTypeVegetation()
	 * @see #setTypeVegetation(TypeDictionaryDicoVegetation)
	 * @see mpia.schema.SchemaPackage#getTypeElementTopographie_TypeVegetation()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='TypeVegetation'"
	 * @generated
	 */
	TypeDictionaryDicoVegetation getTypeVegetation();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeElementTopographie#getTypeVegetation <em>Type Vegetation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Vegetation</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoVegetation
	 * @see #isSetTypeVegetation()
	 * @see #unsetTypeVegetation()
	 * @see #getTypeVegetation()
	 * @generated
	 */
	void setTypeVegetation(TypeDictionaryDicoVegetation value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeElementTopographie#getTypeVegetation <em>Type Vegetation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTypeVegetation()
	 * @see #getTypeVegetation()
	 * @see #setTypeVegetation(TypeDictionaryDicoVegetation)
	 * @generated
	 */
	void unsetTypeVegetation();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeElementTopographie#getTypeVegetation <em>Type Vegetation</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type Vegetation</em>' attribute is set.
	 * @see #unsetTypeVegetation()
	 * @see #getTypeVegetation()
	 * @see #setTypeVegetation(TypeDictionaryDicoVegetation)
	 * @generated
	 */
	boolean isSetTypeVegetation();

	/**
	 * Returns the value of the '<em><b>Sous Type Vegetation</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoSousTypeVegetation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sous Type Vegetation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sous Type Vegetation</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoSousTypeVegetation
	 * @see #isSetSousTypeVegetation()
	 * @see #unsetSousTypeVegetation()
	 * @see #setSousTypeVegetation(TypeDictionaryDicoSousTypeVegetation)
	 * @see mpia.schema.SchemaPackage#getTypeElementTopographie_SousTypeVegetation()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='SousTypeVegetation'"
	 * @generated
	 */
	TypeDictionaryDicoSousTypeVegetation getSousTypeVegetation();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeElementTopographie#getSousTypeVegetation <em>Sous Type Vegetation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sous Type Vegetation</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoSousTypeVegetation
	 * @see #isSetSousTypeVegetation()
	 * @see #unsetSousTypeVegetation()
	 * @see #getSousTypeVegetation()
	 * @generated
	 */
	void setSousTypeVegetation(TypeDictionaryDicoSousTypeVegetation value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeElementTopographie#getSousTypeVegetation <em>Sous Type Vegetation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSousTypeVegetation()
	 * @see #getSousTypeVegetation()
	 * @see #setSousTypeVegetation(TypeDictionaryDicoSousTypeVegetation)
	 * @generated
	 */
	void unsetSousTypeVegetation();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeElementTopographie#getSousTypeVegetation <em>Sous Type Vegetation</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Sous Type Vegetation</em>' attribute is set.
	 * @see #unsetSousTypeVegetation()
	 * @see #getSousTypeVegetation()
	 * @see #setSousTypeVegetation(TypeDictionaryDicoSousTypeVegetation)
	 * @generated
	 */
	boolean isSetSousTypeVegetation();

	/**
	 * Returns the value of the '<em><b>APour Etat Etat Operationnel Element Topographie</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeEtatOperationnelElementTopographie}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Etat Etat Operationnel Element Topographie</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Etat Etat Operationnel Element Topographie</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeElementTopographie_APourEtatEtatOperationnelElementTopographie()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_EtatOperationnelElementTopographie'"
	 *        extendedMetaData="kind='element' name='APourEtat_EtatOperationnelElementTopographie'"
	 * @generated
	 */
	EList<TypeEtatOperationnelElementTopographie> getAPourEtatEtatOperationnelElementTopographie();

	/**
	 * Returns the value of the '<em><b>Est Objet Association Elt Ctrl Elt Topo</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Objet Association Elt Ctrl Elt Topo</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Objet Association Elt Ctrl Elt Topo</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeElementTopographie_EstObjetAssociationEltCtrlEltTopo()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='APourObjet_ElementTopographie' target_entity='type_AssociationEltCtrlEltTopo'"
	 *        extendedMetaData="kind='element' name='EstObjet_AssociationEltCtrlEltTopo'"
	 * @generated
	 */
	EList<TypeAssociation> getEstObjetAssociationEltCtrlEltTopo();

	/**
	 * Returns the value of the '<em><b>Est Sujet Association Elt Topo Site</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Sujet Association Elt Topo Site</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Sujet Association Elt Topo Site</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeElementTopographie_EstSujetAssociationEltTopoSite()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='APourSujet_ElementTopographie' target_entity='type_AssociationEltTopoSite'"
	 *        extendedMetaData="kind='element' name='EstSujet_AssociationEltTopoSite'"
	 * @generated
	 */
	EList<TypeAssociation> getEstSujetAssociationEltTopoSite();

	/**
	 * Returns the value of the '<em><b>Est Objet Association Site Elt Topo</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Objet Association Site Elt Topo</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Objet Association Site Elt Topo</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeElementTopographie_EstObjetAssociationSiteEltTopo()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='APourObjet_ElementTopographie' target_entity='type_AssociationSiteEltTopo'"
	 *        extendedMetaData="kind='element' name='EstObjet_AssociationSiteEltTopo'"
	 * @generated
	 */
	EList<TypeAssociation> getEstObjetAssociationSiteEltTopo();

	/**
	 * Returns the value of the '<em><b>Est Objet Association Entite Org Elt Topo</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Objet Association Entite Org Elt Topo</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Objet Association Entite Org Elt Topo</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeElementTopographie_EstObjetAssociationEntiteOrgEltTopo()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='APourObjet_ElementTopographie' target_entity='type_AssociationEntiteOrgEltTopo'"
	 *        extendedMetaData="kind='element' name='EstObjet_AssociationEntiteOrgEltTopo'"
	 * @generated
	 */
	EList<TypeAssociation> getEstObjetAssociationEntiteOrgEltTopo();

	/**
	 * Returns the value of the '<em><b>Est Objet Association Personne Elt Topo</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Objet Association Personne Elt Topo</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Objet Association Personne Elt Topo</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeElementTopographie_EstObjetAssociationPersonneEltTopo()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='APourObjet_ElementTopographie' target_entity='type_AssociationPersonneEltTopo'"
	 *        extendedMetaData="kind='element' name='EstObjet_AssociationPersonneEltTopo'"
	 * @generated
	 */
	EList<TypeAssociation> getEstObjetAssociationPersonneEltTopo();

	/**
	 * Returns the value of the '<em><b>Est Objet Association Materiel Elt Topo</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Objet Association Materiel Elt Topo</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Objet Association Materiel Elt Topo</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeElementTopographie_EstObjetAssociationMaterielEltTopo()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='APourObjet_ElementTopographie' target_entity='type_AssociationMaterielEltTopo'"
	 *        extendedMetaData="kind='element' name='EstObjet_AssociationMaterielEltTopo'"
	 * @generated
	 */
	EList<TypeAssociation> getEstObjetAssociationMaterielEltTopo();

	/**
	 * Returns the value of the '<em><b>Est Sujet Association Element Topographie Evenement</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Sujet Association Element Topographie Evenement</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Sujet Association Element Topographie Evenement</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeElementTopographie_EstSujetAssociationElementTopographieEvenement()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='APourSujet_ElementTopographie' target_entity='type_AssociationElementTopographieEvenement'"
	 *        extendedMetaData="kind='element' name='EstSujet_AssociationElementTopographieEvenement'"
	 * @generated
	 */
	EList<TypeAssociation> getEstSujetAssociationElementTopographieEvenement();

	/**
	 * Returns the value of the '<em><b>Est Objet Association Objet Inconnu Elt Topo</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Objet Association Objet Inconnu Elt Topo</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Objet Association Objet Inconnu Elt Topo</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeElementTopographie_EstObjetAssociationObjetInconnuEltTopo()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='APourObjet_ElementTopographie' target_entity='type_AssociationObjetInconnuEltTopo'"
	 *        extendedMetaData="kind='element' name='EstObjet_AssociationObjetInconnuEltTopo'"
	 * @generated
	 */
	EList<TypeAssociation> getEstObjetAssociationObjetInconnuEltTopo();

} // TypeElementTopographie
