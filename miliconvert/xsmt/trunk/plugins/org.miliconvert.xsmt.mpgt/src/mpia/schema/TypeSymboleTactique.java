/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeAssociation;
import mpia.meta.TypeAssociationEXT;
import mpia.meta.TypeDataTypeAngle;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Symbole Tactique</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeSymboleTactique#getIdentifiant <em>Identifiant</em>}</li>
 *   <li>{@link mpia.schema.TypeSymboleTactique#getNumeroSymbole <em>Numero Symbole</em>}</li>
 *   <li>{@link mpia.schema.TypeSymboleTactique#getEchelleMaximale <em>Echelle Maximale</em>}</li>
 *   <li>{@link mpia.schema.TypeSymboleTactique#getEchelleMinimale <em>Echelle Minimale</em>}</li>
 *   <li>{@link mpia.schema.TypeSymboleTactique#getCouleur <em>Couleur</em>}</li>
 *   <li>{@link mpia.schema.TypeSymboleTactique#isIndicateurPC <em>Indicateur PC</em>}</li>
 *   <li>{@link mpia.schema.TypeSymboleTactique#getNiveauHierarchique <em>Niveau Hierarchique</em>}</li>
 *   <li>{@link mpia.schema.TypeSymboleTactique#isTypeRemplissage <em>Type Remplissage</em>}</li>
 *   <li>{@link mpia.schema.TypeSymboleTactique#getTypeTrait <em>Type Trait</em>}</li>
 *   <li>{@link mpia.schema.TypeSymboleTactique#getAngle <em>Angle</em>}</li>
 *   <li>{@link mpia.schema.TypeSymboleTactique#getIndicateurPolygone <em>Indicateur Polygone</em>}</li>
 *   <li>{@link mpia.schema.TypeSymboleTactique#getNomBapteme <em>Nom Bapteme</em>}</li>
 *   <li>{@link mpia.schema.TypeSymboleTactique#getNbrPointPassage <em>Nbr Point Passage</em>}</li>
 *   <li>{@link mpia.schema.TypeSymboleTactique#getNomBaptemeSecondaire <em>Nom Bapteme Secondaire</em>}</li>
 *   <li>{@link mpia.schema.TypeSymboleTactique#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeSymboleTactique#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypeSymboleTactique#getEstLocaliseEnLocalisation <em>Est Localise En Localisation</em>}</li>
 *   <li>{@link mpia.schema.TypeSymboleTactique#getCorrespondType <em>Correspond Type</em>}</li>
 *   <li>{@link mpia.schema.TypeSymboleTactique#getEstSujetAssocSymboleTactique <em>Est Sujet Assoc Symbole Tactique</em>}</li>
 *   <li>{@link mpia.schema.TypeSymboleTactique#getEstComposeBrancheEurogrid <em>Est Compose Branche Eurogrid</em>}</li>
 *   <li>{@link mpia.schema.TypeSymboleTactique#getEstObjetAssocSymboleTactique <em>Est Objet Assoc Symbole Tactique</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeSymboleTactique()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_SymboleTactique' kind='elementOnly'"
 * @generated
 */
public interface TypeSymboleTactique extends EObject {
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
	 * @see mpia.schema.SchemaPackage#getTypeSymboleTactique_Identifiant()
	 * @model dataType="mpia.meta.TypeDataTypeChaine03" required="true"
	 *        extendedMetaData="kind='element' name='Identifiant'"
	 * @generated
	 */
	String getIdentifiant();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeSymboleTactique#getIdentifiant <em>Identifiant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifiant</em>' attribute.
	 * @see #getIdentifiant()
	 * @generated
	 */
	void setIdentifiant(String value);

	/**
	 * Returns the value of the '<em><b>Numero Symbole</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Numero Symbole</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Numero Symbole</em>' attribute.
	 * @see #setNumeroSymbole(String)
	 * @see mpia.schema.SchemaPackage#getTypeSymboleTactique_NumeroSymbole()
	 * @model dataType="mpia.meta.TypeDataTypeChaine03" required="true"
	 *        extendedMetaData="kind='element' name='NumeroSymbole'"
	 * @generated
	 */
	String getNumeroSymbole();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeSymboleTactique#getNumeroSymbole <em>Numero Symbole</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Numero Symbole</em>' attribute.
	 * @see #getNumeroSymbole()
	 * @generated
	 */
	void setNumeroSymbole(String value);

	/**
	 * Returns the value of the '<em><b>Echelle Maximale</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoSymboleTactiqueEchelle}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Echelle Maximale</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Echelle Maximale</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoSymboleTactiqueEchelle
	 * @see #isSetEchelleMaximale()
	 * @see #unsetEchelleMaximale()
	 * @see #setEchelleMaximale(TypeDictionaryDicoSymboleTactiqueEchelle)
	 * @see mpia.schema.SchemaPackage#getTypeSymboleTactique_EchelleMaximale()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='EchelleMaximale'"
	 * @generated
	 */
	TypeDictionaryDicoSymboleTactiqueEchelle getEchelleMaximale();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeSymboleTactique#getEchelleMaximale <em>Echelle Maximale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Echelle Maximale</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoSymboleTactiqueEchelle
	 * @see #isSetEchelleMaximale()
	 * @see #unsetEchelleMaximale()
	 * @see #getEchelleMaximale()
	 * @generated
	 */
	void setEchelleMaximale(TypeDictionaryDicoSymboleTactiqueEchelle value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeSymboleTactique#getEchelleMaximale <em>Echelle Maximale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEchelleMaximale()
	 * @see #getEchelleMaximale()
	 * @see #setEchelleMaximale(TypeDictionaryDicoSymboleTactiqueEchelle)
	 * @generated
	 */
	void unsetEchelleMaximale();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeSymboleTactique#getEchelleMaximale <em>Echelle Maximale</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Echelle Maximale</em>' attribute is set.
	 * @see #unsetEchelleMaximale()
	 * @see #getEchelleMaximale()
	 * @see #setEchelleMaximale(TypeDictionaryDicoSymboleTactiqueEchelle)
	 * @generated
	 */
	boolean isSetEchelleMaximale();

	/**
	 * Returns the value of the '<em><b>Echelle Minimale</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoSymboleTactiqueEchelle}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Echelle Minimale</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Echelle Minimale</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoSymboleTactiqueEchelle
	 * @see #isSetEchelleMinimale()
	 * @see #unsetEchelleMinimale()
	 * @see #setEchelleMinimale(TypeDictionaryDicoSymboleTactiqueEchelle)
	 * @see mpia.schema.SchemaPackage#getTypeSymboleTactique_EchelleMinimale()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='EchelleMinimale'"
	 * @generated
	 */
	TypeDictionaryDicoSymboleTactiqueEchelle getEchelleMinimale();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeSymboleTactique#getEchelleMinimale <em>Echelle Minimale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Echelle Minimale</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoSymboleTactiqueEchelle
	 * @see #isSetEchelleMinimale()
	 * @see #unsetEchelleMinimale()
	 * @see #getEchelleMinimale()
	 * @generated
	 */
	void setEchelleMinimale(TypeDictionaryDicoSymboleTactiqueEchelle value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeSymboleTactique#getEchelleMinimale <em>Echelle Minimale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEchelleMinimale()
	 * @see #getEchelleMinimale()
	 * @see #setEchelleMinimale(TypeDictionaryDicoSymboleTactiqueEchelle)
	 * @generated
	 */
	void unsetEchelleMinimale();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeSymboleTactique#getEchelleMinimale <em>Echelle Minimale</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Echelle Minimale</em>' attribute is set.
	 * @see #unsetEchelleMinimale()
	 * @see #getEchelleMinimale()
	 * @see #setEchelleMinimale(TypeDictionaryDicoSymboleTactiqueEchelle)
	 * @generated
	 */
	boolean isSetEchelleMinimale();

	/**
	 * Returns the value of the '<em><b>Couleur</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoCouleur}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Couleur</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Couleur</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoCouleur
	 * @see #isSetCouleur()
	 * @see #unsetCouleur()
	 * @see #setCouleur(TypeDictionaryDicoCouleur)
	 * @see mpia.schema.SchemaPackage#getTypeSymboleTactique_Couleur()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='Couleur'"
	 * @generated
	 */
	TypeDictionaryDicoCouleur getCouleur();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeSymboleTactique#getCouleur <em>Couleur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Couleur</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoCouleur
	 * @see #isSetCouleur()
	 * @see #unsetCouleur()
	 * @see #getCouleur()
	 * @generated
	 */
	void setCouleur(TypeDictionaryDicoCouleur value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeSymboleTactique#getCouleur <em>Couleur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCouleur()
	 * @see #getCouleur()
	 * @see #setCouleur(TypeDictionaryDicoCouleur)
	 * @generated
	 */
	void unsetCouleur();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeSymboleTactique#getCouleur <em>Couleur</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Couleur</em>' attribute is set.
	 * @see #unsetCouleur()
	 * @see #getCouleur()
	 * @see #setCouleur(TypeDictionaryDicoCouleur)
	 * @generated
	 */
	boolean isSetCouleur();

	/**
	 * Returns the value of the '<em><b>Indicateur PC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Indicateur PC</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Indicateur PC</em>' attribute.
	 * @see #isSetIndicateurPC()
	 * @see #unsetIndicateurPC()
	 * @see #setIndicateurPC(boolean)
	 * @see mpia.schema.SchemaPackage#getTypeSymboleTactique_IndicateurPC()
	 * @model unsettable="true" dataType="mpia.meta.TypeBoolean"
	 *        extendedMetaData="kind='element' name='IndicateurPC'"
	 * @generated
	 */
	boolean isIndicateurPC();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeSymboleTactique#isIndicateurPC <em>Indicateur PC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Indicateur PC</em>' attribute.
	 * @see #isSetIndicateurPC()
	 * @see #unsetIndicateurPC()
	 * @see #isIndicateurPC()
	 * @generated
	 */
	void setIndicateurPC(boolean value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeSymboleTactique#isIndicateurPC <em>Indicateur PC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIndicateurPC()
	 * @see #isIndicateurPC()
	 * @see #setIndicateurPC(boolean)
	 * @generated
	 */
	void unsetIndicateurPC();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeSymboleTactique#isIndicateurPC <em>Indicateur PC</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Indicateur PC</em>' attribute is set.
	 * @see #unsetIndicateurPC()
	 * @see #isIndicateurPC()
	 * @see #setIndicateurPC(boolean)
	 * @generated
	 */
	boolean isSetIndicateurPC();

	/**
	 * Returns the value of the '<em><b>Niveau Hierarchique</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoNiveau}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Niveau Hierarchique</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Niveau Hierarchique</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoNiveau
	 * @see #isSetNiveauHierarchique()
	 * @see #unsetNiveauHierarchique()
	 * @see #setNiveauHierarchique(TypeDictionaryDicoNiveau)
	 * @see mpia.schema.SchemaPackage#getTypeSymboleTactique_NiveauHierarchique()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='NiveauHierarchique'"
	 * @generated
	 */
	TypeDictionaryDicoNiveau getNiveauHierarchique();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeSymboleTactique#getNiveauHierarchique <em>Niveau Hierarchique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Niveau Hierarchique</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoNiveau
	 * @see #isSetNiveauHierarchique()
	 * @see #unsetNiveauHierarchique()
	 * @see #getNiveauHierarchique()
	 * @generated
	 */
	void setNiveauHierarchique(TypeDictionaryDicoNiveau value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeSymboleTactique#getNiveauHierarchique <em>Niveau Hierarchique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNiveauHierarchique()
	 * @see #getNiveauHierarchique()
	 * @see #setNiveauHierarchique(TypeDictionaryDicoNiveau)
	 * @generated
	 */
	void unsetNiveauHierarchique();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeSymboleTactique#getNiveauHierarchique <em>Niveau Hierarchique</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Niveau Hierarchique</em>' attribute is set.
	 * @see #unsetNiveauHierarchique()
	 * @see #getNiveauHierarchique()
	 * @see #setNiveauHierarchique(TypeDictionaryDicoNiveau)
	 * @generated
	 */
	boolean isSetNiveauHierarchique();

	/**
	 * Returns the value of the '<em><b>Type Remplissage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Remplissage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Remplissage</em>' attribute.
	 * @see #isSetTypeRemplissage()
	 * @see #unsetTypeRemplissage()
	 * @see #setTypeRemplissage(boolean)
	 * @see mpia.schema.SchemaPackage#getTypeSymboleTactique_TypeRemplissage()
	 * @model unsettable="true" dataType="mpia.meta.TypeBoolean"
	 *        extendedMetaData="kind='element' name='TypeRemplissage'"
	 * @generated
	 */
	boolean isTypeRemplissage();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeSymboleTactique#isTypeRemplissage <em>Type Remplissage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Remplissage</em>' attribute.
	 * @see #isSetTypeRemplissage()
	 * @see #unsetTypeRemplissage()
	 * @see #isTypeRemplissage()
	 * @generated
	 */
	void setTypeRemplissage(boolean value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeSymboleTactique#isTypeRemplissage <em>Type Remplissage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTypeRemplissage()
	 * @see #isTypeRemplissage()
	 * @see #setTypeRemplissage(boolean)
	 * @generated
	 */
	void unsetTypeRemplissage();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeSymboleTactique#isTypeRemplissage <em>Type Remplissage</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type Remplissage</em>' attribute is set.
	 * @see #unsetTypeRemplissage()
	 * @see #isTypeRemplissage()
	 * @see #setTypeRemplissage(boolean)
	 * @generated
	 */
	boolean isSetTypeRemplissage();

	/**
	 * Returns the value of the '<em><b>Type Trait</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoSymboleTactiqueTypeTrait}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Trait</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Trait</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoSymboleTactiqueTypeTrait
	 * @see #isSetTypeTrait()
	 * @see #unsetTypeTrait()
	 * @see #setTypeTrait(TypeDictionaryDicoSymboleTactiqueTypeTrait)
	 * @see mpia.schema.SchemaPackage#getTypeSymboleTactique_TypeTrait()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='TypeTrait'"
	 * @generated
	 */
	TypeDictionaryDicoSymboleTactiqueTypeTrait getTypeTrait();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeSymboleTactique#getTypeTrait <em>Type Trait</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Trait</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoSymboleTactiqueTypeTrait
	 * @see #isSetTypeTrait()
	 * @see #unsetTypeTrait()
	 * @see #getTypeTrait()
	 * @generated
	 */
	void setTypeTrait(TypeDictionaryDicoSymboleTactiqueTypeTrait value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeSymboleTactique#getTypeTrait <em>Type Trait</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTypeTrait()
	 * @see #getTypeTrait()
	 * @see #setTypeTrait(TypeDictionaryDicoSymboleTactiqueTypeTrait)
	 * @generated
	 */
	void unsetTypeTrait();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeSymboleTactique#getTypeTrait <em>Type Trait</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type Trait</em>' attribute is set.
	 * @see #unsetTypeTrait()
	 * @see #getTypeTrait()
	 * @see #setTypeTrait(TypeDictionaryDicoSymboleTactiqueTypeTrait)
	 * @generated
	 */
	boolean isSetTypeTrait();

	/**
	 * Returns the value of the '<em><b>Angle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Angle</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Angle</em>' containment reference.
	 * @see #setAngle(TypeDataTypeAngle)
	 * @see mpia.schema.SchemaPackage#getTypeSymboleTactique_Angle()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Angle'"
	 * @generated
	 */
	TypeDataTypeAngle getAngle();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeSymboleTactique#getAngle <em>Angle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Angle</em>' containment reference.
	 * @see #getAngle()
	 * @generated
	 */
	void setAngle(TypeDataTypeAngle value);

	/**
	 * Returns the value of the '<em><b>Indicateur Polygone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Indicateur Polygone</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Indicateur Polygone</em>' attribute.
	 * @see #isSetIndicateurPolygone()
	 * @see #unsetIndicateurPolygone()
	 * @see #setIndicateurPolygone(long)
	 * @see mpia.schema.SchemaPackage#getTypeSymboleTactique_IndicateurPolygone()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier3"
	 *        extendedMetaData="kind='element' name='IndicateurPolygone'"
	 * @generated
	 */
	long getIndicateurPolygone();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeSymboleTactique#getIndicateurPolygone <em>Indicateur Polygone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Indicateur Polygone</em>' attribute.
	 * @see #isSetIndicateurPolygone()
	 * @see #unsetIndicateurPolygone()
	 * @see #getIndicateurPolygone()
	 * @generated
	 */
	void setIndicateurPolygone(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeSymboleTactique#getIndicateurPolygone <em>Indicateur Polygone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIndicateurPolygone()
	 * @see #getIndicateurPolygone()
	 * @see #setIndicateurPolygone(long)
	 * @generated
	 */
	void unsetIndicateurPolygone();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeSymboleTactique#getIndicateurPolygone <em>Indicateur Polygone</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Indicateur Polygone</em>' attribute is set.
	 * @see #unsetIndicateurPolygone()
	 * @see #getIndicateurPolygone()
	 * @see #setIndicateurPolygone(long)
	 * @generated
	 */
	boolean isSetIndicateurPolygone();

	/**
	 * Returns the value of the '<em><b>Nom Bapteme</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nom Bapteme</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom Bapteme</em>' attribute.
	 * @see #setNomBapteme(String)
	 * @see mpia.schema.SchemaPackage#getTypeSymboleTactique_NomBapteme()
	 * @model dataType="mpia.meta.TypeDataTypeChaine012"
	 *        extendedMetaData="kind='element' name='NomBapteme'"
	 * @generated
	 */
	String getNomBapteme();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeSymboleTactique#getNomBapteme <em>Nom Bapteme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom Bapteme</em>' attribute.
	 * @see #getNomBapteme()
	 * @generated
	 */
	void setNomBapteme(String value);

	/**
	 * Returns the value of the '<em><b>Nbr Point Passage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nbr Point Passage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nbr Point Passage</em>' attribute.
	 * @see #isSetNbrPointPassage()
	 * @see #unsetNbrPointPassage()
	 * @see #setNbrPointPassage(long)
	 * @see mpia.schema.SchemaPackage#getTypeSymboleTactique_NbrPointPassage()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier3"
	 *        extendedMetaData="kind='element' name='NbrPointPassage'"
	 * @generated
	 */
	long getNbrPointPassage();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeSymboleTactique#getNbrPointPassage <em>Nbr Point Passage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nbr Point Passage</em>' attribute.
	 * @see #isSetNbrPointPassage()
	 * @see #unsetNbrPointPassage()
	 * @see #getNbrPointPassage()
	 * @generated
	 */
	void setNbrPointPassage(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeSymboleTactique#getNbrPointPassage <em>Nbr Point Passage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNbrPointPassage()
	 * @see #getNbrPointPassage()
	 * @see #setNbrPointPassage(long)
	 * @generated
	 */
	void unsetNbrPointPassage();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeSymboleTactique#getNbrPointPassage <em>Nbr Point Passage</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nbr Point Passage</em>' attribute is set.
	 * @see #unsetNbrPointPassage()
	 * @see #getNbrPointPassage()
	 * @see #setNbrPointPassage(long)
	 * @generated
	 */
	boolean isSetNbrPointPassage();

	/**
	 * Returns the value of the '<em><b>Nom Bapteme Secondaire</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nom Bapteme Secondaire</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom Bapteme Secondaire</em>' attribute.
	 * @see #setNomBaptemeSecondaire(String)
	 * @see mpia.schema.SchemaPackage#getTypeSymboleTactique_NomBaptemeSecondaire()
	 * @model dataType="mpia.meta.TypeDataTypeChaine06"
	 *        extendedMetaData="kind='element' name='NomBaptemeSecondaire'"
	 * @generated
	 */
	String getNomBaptemeSecondaire();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeSymboleTactique#getNomBaptemeSecondaire <em>Nom Bapteme Secondaire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom Bapteme Secondaire</em>' attribute.
	 * @see #getNomBaptemeSecondaire()
	 * @generated
	 */
	void setNomBaptemeSecondaire(String value);

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
	 * @see mpia.schema.SchemaPackage#getTypeSymboleTactique_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeSymboleTactique#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeSymboleTactique_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeSymboleTactique#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

	/**
	 * Returns the value of the '<em><b>Est Localise En Localisation</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeLocalisation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Localise En Localisation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Localise En Localisation</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeSymboleTactique_EstLocaliseEnLocalisation()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_Localisation'"
	 *        extendedMetaData="kind='element' name='EstLocaliseEn_Localisation'"
	 * @generated
	 */
	EList<TypeLocalisation> getEstLocaliseEnLocalisation();

	/**
	 * Returns the value of the '<em><b>Correspond Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Correspond Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Correspond Type</em>' containment reference.
	 * @see #setCorrespondType(TypeAssociationEXT)
	 * @see mpia.schema.SchemaPackage#getTypeSymboleTactique_CorrespondType()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_Type'"
	 *        extendedMetaData="kind='element' name='Correspond_Type'"
	 * @generated
	 */
	TypeAssociationEXT getCorrespondType();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeSymboleTactique#getCorrespondType <em>Correspond Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Correspond Type</em>' containment reference.
	 * @see #getCorrespondType()
	 * @generated
	 */
	void setCorrespondType(TypeAssociationEXT value);

	/**
	 * Returns the value of the '<em><b>Est Sujet Assoc Symbole Tactique</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Sujet Assoc Symbole Tactique</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Sujet Assoc Symbole Tactique</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeSymboleTactique_EstSujetAssocSymboleTactique()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='AssocieCommeSujet_SymboleTactique' target_entity='type_AssocSymboleTactique'"
	 *        extendedMetaData="kind='element' name='EstSujet_AssocSymboleTactique'"
	 * @generated
	 */
	EList<TypeAssociation> getEstSujetAssocSymboleTactique();

	/**
	 * Returns the value of the '<em><b>Est Compose Branche Eurogrid</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeBrancheEurogrid}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Compose Branche Eurogrid</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Compose Branche Eurogrid</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeSymboleTactique_EstComposeBrancheEurogrid()
	 * @model containment="true" upper="14"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_BrancheEurogrid'"
	 *        extendedMetaData="kind='element' name='EstCompose_BrancheEurogrid'"
	 * @generated
	 */
	EList<TypeBrancheEurogrid> getEstComposeBrancheEurogrid();

	/**
	 * Returns the value of the '<em><b>Est Objet Assoc Symbole Tactique</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Objet Assoc Symbole Tactique</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Objet Assoc Symbole Tactique</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeSymboleTactique_EstObjetAssocSymboleTactique()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='AssocieCommeObjet_SymboleTactique' target_entity='type_AssocSymboleTactique'"
	 *        extendedMetaData="kind='element' name='EstObjet_AssocSymboleTactique'"
	 * @generated
	 */
	EList<TypeAssociation> getEstObjetAssocSymboleTactique();

} // TypeSymboleTactique
