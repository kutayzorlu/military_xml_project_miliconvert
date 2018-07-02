/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import javax.xml.datatype.XMLGregorianCalendar;

import mpia.meta.TypeAssociation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Objectif3 D</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeObjectif3D#getNom <em>Nom</em>}</li>
 *   <li>{@link mpia.schema.TypeObjectif3D#getTypeSynthetiqueObjectif <em>Type Synthetique Objectif</em>}</li>
 *   <li>{@link mpia.schema.TypeObjectif3D#getCaracteristique <em>Caracteristique</em>}</li>
 *   <li>{@link mpia.schema.TypeObjectif3D#getDateZULU <em>Date ZULU</em>}</li>
 *   <li>{@link mpia.schema.TypeObjectif3D#getIdentifiantPositionnel <em>Identifiant Positionnel</em>}</li>
 *   <li>{@link mpia.schema.TypeObjectif3D#getNumeroABCA <em>Numero ABCA</em>}</li>
 *   <li>{@link mpia.schema.TypeObjectif3D#getNumeroEncyclopedique <em>Numero Encyclopedique</em>}</li>
 *   <li>{@link mpia.schema.TypeObjectif3D#getIdentifiantImpact <em>Identifiant Impact</em>}</li>
 *   <li>{@link mpia.schema.TypeObjectif3D#getDescriptionImpact <em>Description Impact</em>}</li>
 *   <li>{@link mpia.schema.TypeObjectif3D#getIdentifiantComposante <em>Identifiant Composante</em>}</li>
 *   <li>{@link mpia.schema.TypeObjectif3D#getButAssocieAObjectif <em>But Associe AObjectif</em>}</li>
 *   <li>{@link mpia.schema.TypeObjectif3D#getIdentifiantComplementaire <em>Identifiant Complementaire</em>}</li>
 *   <li>{@link mpia.schema.TypeObjectif3D#getTypeZone <em>Type Zone</em>}</li>
 *   <li>{@link mpia.schema.TypeObjectif3D#getIndexPhase <em>Index Phase</em>}</li>
 *   <li>{@link mpia.schema.TypeObjectif3D#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeObjectif3D#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypeObjectif3D#getAPourNationaliteEntitePolitique <em>APour Nationalite Entite Politique</em>}</li>
 *   <li>{@link mpia.schema.TypeObjectif3D#getAPourResultatsTraitementResultatTraitementObjectif <em>APour Resultats Traitement Resultat Traitement Objectif</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeObjectif3D()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_Objectif3D' kind='elementOnly'"
 * @generated
 */
public interface TypeObjectif3D extends EObject {
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
	 * @see mpia.schema.SchemaPackage#getTypeObjectif3D_Nom()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030"
	 *        extendedMetaData="kind='element' name='Nom'"
	 * @generated
	 */
	String getNom();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeObjectif3D#getNom <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom</em>' attribute.
	 * @see #getNom()
	 * @generated
	 */
	void setNom(String value);

	/**
	 * Returns the value of the '<em><b>Type Synthetique Objectif</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoTypeSynthetiqueObjectif}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Synthetique Objectif</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Synthetique Objectif</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoTypeSynthetiqueObjectif
	 * @see #isSetTypeSynthetiqueObjectif()
	 * @see #unsetTypeSynthetiqueObjectif()
	 * @see #setTypeSynthetiqueObjectif(TypeDictionaryDicoTypeSynthetiqueObjectif)
	 * @see mpia.schema.SchemaPackage#getTypeObjectif3D_TypeSynthetiqueObjectif()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='TypeSynthetiqueObjectif'"
	 * @generated
	 */
	TypeDictionaryDicoTypeSynthetiqueObjectif getTypeSynthetiqueObjectif();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeObjectif3D#getTypeSynthetiqueObjectif <em>Type Synthetique Objectif</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Synthetique Objectif</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoTypeSynthetiqueObjectif
	 * @see #isSetTypeSynthetiqueObjectif()
	 * @see #unsetTypeSynthetiqueObjectif()
	 * @see #getTypeSynthetiqueObjectif()
	 * @generated
	 */
	void setTypeSynthetiqueObjectif(TypeDictionaryDicoTypeSynthetiqueObjectif value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeObjectif3D#getTypeSynthetiqueObjectif <em>Type Synthetique Objectif</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTypeSynthetiqueObjectif()
	 * @see #getTypeSynthetiqueObjectif()
	 * @see #setTypeSynthetiqueObjectif(TypeDictionaryDicoTypeSynthetiqueObjectif)
	 * @generated
	 */
	void unsetTypeSynthetiqueObjectif();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeObjectif3D#getTypeSynthetiqueObjectif <em>Type Synthetique Objectif</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type Synthetique Objectif</em>' attribute is set.
	 * @see #unsetTypeSynthetiqueObjectif()
	 * @see #getTypeSynthetiqueObjectif()
	 * @see #setTypeSynthetiqueObjectif(TypeDictionaryDicoTypeSynthetiqueObjectif)
	 * @generated
	 */
	boolean isSetTypeSynthetiqueObjectif();

	/**
	 * Returns the value of the '<em><b>Caracteristique</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoObjectif3DCaracteristique}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Caracteristique</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Caracteristique</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoObjectif3DCaracteristique
	 * @see #isSetCaracteristique()
	 * @see #unsetCaracteristique()
	 * @see #setCaracteristique(TypeDictionaryDicoObjectif3DCaracteristique)
	 * @see mpia.schema.SchemaPackage#getTypeObjectif3D_Caracteristique()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='Caracteristique'"
	 * @generated
	 */
	TypeDictionaryDicoObjectif3DCaracteristique getCaracteristique();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeObjectif3D#getCaracteristique <em>Caracteristique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Caracteristique</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoObjectif3DCaracteristique
	 * @see #isSetCaracteristique()
	 * @see #unsetCaracteristique()
	 * @see #getCaracteristique()
	 * @generated
	 */
	void setCaracteristique(TypeDictionaryDicoObjectif3DCaracteristique value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeObjectif3D#getCaracteristique <em>Caracteristique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCaracteristique()
	 * @see #getCaracteristique()
	 * @see #setCaracteristique(TypeDictionaryDicoObjectif3DCaracteristique)
	 * @generated
	 */
	void unsetCaracteristique();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeObjectif3D#getCaracteristique <em>Caracteristique</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Caracteristique</em>' attribute is set.
	 * @see #unsetCaracteristique()
	 * @see #getCaracteristique()
	 * @see #setCaracteristique(TypeDictionaryDicoObjectif3DCaracteristique)
	 * @generated
	 */
	boolean isSetCaracteristique();

	/**
	 * Returns the value of the '<em><b>Date ZULU</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date ZULU</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date ZULU</em>' attribute.
	 * @see #setDateZULU(XMLGregorianCalendar)
	 * @see mpia.schema.SchemaPackage#getTypeObjectif3D_DateZULU()
	 * @model dataType="mpia.meta.TypeDataTypeGDH"
	 *        extendedMetaData="kind='element' name='DateZULU'"
	 * @generated
	 */
	XMLGregorianCalendar getDateZULU();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeObjectif3D#getDateZULU <em>Date ZULU</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date ZULU</em>' attribute.
	 * @see #getDateZULU()
	 * @generated
	 */
	void setDateZULU(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Identifiant Positionnel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identifiant Positionnel</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifiant Positionnel</em>' attribute.
	 * @see #setIdentifiantPositionnel(String)
	 * @see mpia.schema.SchemaPackage#getTypeObjectif3D_IdentifiantPositionnel()
	 * @model dataType="mpia.meta.TypeDataTypeChaine020"
	 *        extendedMetaData="kind='element' name='IdentifiantPositionnel'"
	 * @generated
	 */
	String getIdentifiantPositionnel();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeObjectif3D#getIdentifiantPositionnel <em>Identifiant Positionnel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifiant Positionnel</em>' attribute.
	 * @see #getIdentifiantPositionnel()
	 * @generated
	 */
	void setIdentifiantPositionnel(String value);

	/**
	 * Returns the value of the '<em><b>Numero ABCA</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Numero ABCA</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Numero ABCA</em>' attribute.
	 * @see #setNumeroABCA(String)
	 * @see mpia.schema.SchemaPackage#getTypeObjectif3D_NumeroABCA()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030"
	 *        extendedMetaData="kind='element' name='NumeroABCA'"
	 * @generated
	 */
	String getNumeroABCA();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeObjectif3D#getNumeroABCA <em>Numero ABCA</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Numero ABCA</em>' attribute.
	 * @see #getNumeroABCA()
	 * @generated
	 */
	void setNumeroABCA(String value);

	/**
	 * Returns the value of the '<em><b>Numero Encyclopedique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Numero Encyclopedique</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Numero Encyclopedique</em>' attribute.
	 * @see #setNumeroEncyclopedique(String)
	 * @see mpia.schema.SchemaPackage#getTypeObjectif3D_NumeroEncyclopedique()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030"
	 *        extendedMetaData="kind='element' name='NumeroEncyclopedique'"
	 * @generated
	 */
	String getNumeroEncyclopedique();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeObjectif3D#getNumeroEncyclopedique <em>Numero Encyclopedique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Numero Encyclopedique</em>' attribute.
	 * @see #getNumeroEncyclopedique()
	 * @generated
	 */
	void setNumeroEncyclopedique(String value);

	/**
	 * Returns the value of the '<em><b>Identifiant Impact</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identifiant Impact</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifiant Impact</em>' attribute.
	 * @see #setIdentifiantImpact(String)
	 * @see mpia.schema.SchemaPackage#getTypeObjectif3D_IdentifiantImpact()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030"
	 *        extendedMetaData="kind='element' name='IdentifiantImpact'"
	 * @generated
	 */
	String getIdentifiantImpact();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeObjectif3D#getIdentifiantImpact <em>Identifiant Impact</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifiant Impact</em>' attribute.
	 * @see #getIdentifiantImpact()
	 * @generated
	 */
	void setIdentifiantImpact(String value);

	/**
	 * Returns the value of the '<em><b>Description Impact</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description Impact</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description Impact</em>' attribute.
	 * @see #setDescriptionImpact(String)
	 * @see mpia.schema.SchemaPackage#getTypeObjectif3D_DescriptionImpact()
	 * @model dataType="mpia.meta.TypeDataTypeChaine050"
	 *        extendedMetaData="kind='element' name='DescriptionImpact'"
	 * @generated
	 */
	String getDescriptionImpact();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeObjectif3D#getDescriptionImpact <em>Description Impact</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description Impact</em>' attribute.
	 * @see #getDescriptionImpact()
	 * @generated
	 */
	void setDescriptionImpact(String value);

	/**
	 * Returns the value of the '<em><b>Identifiant Composante</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identifiant Composante</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifiant Composante</em>' attribute.
	 * @see #setIdentifiantComposante(String)
	 * @see mpia.schema.SchemaPackage#getTypeObjectif3D_IdentifiantComposante()
	 * @model dataType="mpia.meta.TypeDataTypeChaine012"
	 *        extendedMetaData="kind='element' name='IdentifiantComposante'"
	 * @generated
	 */
	String getIdentifiantComposante();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeObjectif3D#getIdentifiantComposante <em>Identifiant Composante</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifiant Composante</em>' attribute.
	 * @see #getIdentifiantComposante()
	 * @generated
	 */
	void setIdentifiantComposante(String value);

	/**
	 * Returns the value of the '<em><b>But Associe AObjectif</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>But Associe AObjectif</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>But Associe AObjectif</em>' attribute.
	 * @see #setButAssocieAObjectif(String)
	 * @see mpia.schema.SchemaPackage#getTypeObjectif3D_ButAssocieAObjectif()
	 * @model dataType="mpia.meta.TypeDataTypeChaine015"
	 *        extendedMetaData="kind='element' name='ButAssocieAObjectif'"
	 * @generated
	 */
	String getButAssocieAObjectif();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeObjectif3D#getButAssocieAObjectif <em>But Associe AObjectif</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>But Associe AObjectif</em>' attribute.
	 * @see #getButAssocieAObjectif()
	 * @generated
	 */
	void setButAssocieAObjectif(String value);

	/**
	 * Returns the value of the '<em><b>Identifiant Complementaire</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identifiant Complementaire</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifiant Complementaire</em>' attribute.
	 * @see #setIdentifiantComplementaire(String)
	 * @see mpia.schema.SchemaPackage#getTypeObjectif3D_IdentifiantComplementaire()
	 * @model dataType="mpia.meta.TypeDataTypeChaine020"
	 *        extendedMetaData="kind='element' name='IdentifiantComplementaire'"
	 * @generated
	 */
	String getIdentifiantComplementaire();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeObjectif3D#getIdentifiantComplementaire <em>Identifiant Complementaire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifiant Complementaire</em>' attribute.
	 * @see #getIdentifiantComplementaire()
	 * @generated
	 */
	void setIdentifiantComplementaire(String value);

	/**
	 * Returns the value of the '<em><b>Type Zone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Zone</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Zone</em>' attribute.
	 * @see #setTypeZone(String)
	 * @see mpia.schema.SchemaPackage#getTypeObjectif3D_TypeZone()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030"
	 *        extendedMetaData="kind='element' name='TypeZone'"
	 * @generated
	 */
	String getTypeZone();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeObjectif3D#getTypeZone <em>Type Zone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Zone</em>' attribute.
	 * @see #getTypeZone()
	 * @generated
	 */
	void setTypeZone(String value);

	/**
	 * Returns the value of the '<em><b>Index Phase</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Index Phase</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Index Phase</em>' attribute.
	 * @see #setIndexPhase(String)
	 * @see mpia.schema.SchemaPackage#getTypeObjectif3D_IndexPhase()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030"
	 *        extendedMetaData="kind='element' name='IndexPhase'"
	 * @generated
	 */
	String getIndexPhase();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeObjectif3D#getIndexPhase <em>Index Phase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Index Phase</em>' attribute.
	 * @see #getIndexPhase()
	 * @generated
	 */
	void setIndexPhase(String value);

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
	 * @see mpia.schema.SchemaPackage#getTypeObjectif3D_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeObjectif3D#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeObjectif3D_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeObjectif3D#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

	/**
	 * Returns the value of the '<em><b>APour Nationalite Entite Politique</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Nationalite Entite Politique</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Nationalite Entite Politique</em>' containment reference.
	 * @see #setAPourNationaliteEntitePolitique(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeObjectif3D_APourNationaliteEntitePolitique()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_EntitePolitique'"
	 *        extendedMetaData="kind='element' name='APourNationalite_EntitePolitique'"
	 * @generated
	 */
	TypeAssociation getAPourNationaliteEntitePolitique();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeObjectif3D#getAPourNationaliteEntitePolitique <em>APour Nationalite Entite Politique</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Nationalite Entite Politique</em>' containment reference.
	 * @see #getAPourNationaliteEntitePolitique()
	 * @generated
	 */
	void setAPourNationaliteEntitePolitique(TypeAssociation value);

	/**
	 * Returns the value of the '<em><b>APour Resultats Traitement Resultat Traitement Objectif</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeResultatTraitementObjectif}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Resultats Traitement Resultat Traitement Objectif</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Resultats Traitement Resultat Traitement Objectif</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeObjectif3D_APourResultatsTraitementResultatTraitementObjectif()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_ResultatTraitementObjectif'"
	 *        extendedMetaData="kind='element' name='APourResultatsTraitement_ResultatTraitementObjectif'"
	 * @generated
	 */
	EList<TypeResultatTraitementObjectif> getAPourResultatsTraitementResultatTraitementObjectif();

} // TypeObjectif3D
