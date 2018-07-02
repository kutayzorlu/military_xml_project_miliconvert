/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeAssociation;
import mpia.meta.TypeDataTypeDuree;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Dotation Effective</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeDotationEffective#getQuantiteOperationnelle <em>Quantite Operationnelle</em>}</li>
 *   <li>{@link mpia.schema.TypeDotationEffective#getQuantiteDisponible <em>Quantite Disponible</em>}</li>
 *   <li>{@link mpia.schema.TypeDotationEffective#getQuantiteTotale <em>Quantite Totale</em>}</li>
 *   <li>{@link mpia.schema.TypeDotationEffective#getQuantiteDisponibleDemande <em>Quantite Disponible Demande</em>}</li>
 *   <li>{@link mpia.schema.TypeDotationEffective#getQuantiteTotaleDemande <em>Quantite Totale Demande</em>}</li>
 *   <li>{@link mpia.schema.TypeDotationEffective#getQuantitePourDestructionCible <em>Quantite Pour Destruction Cible</em>}</li>
 *   <li>{@link mpia.schema.TypeDotationEffective#getNombreUtilisations <em>Nombre Utilisations</em>}</li>
 *   <li>{@link mpia.schema.TypeDotationEffective#getDureeFonctionnement <em>Duree Fonctionnement</em>}</li>
 *   <li>{@link mpia.schema.TypeDotationEffective#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeDotationEffective#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypeDotationEffective#getMethodeCalculStock <em>Methode Calcul Stock</em>}</li>
 *   <li>{@link mpia.schema.TypeDotationEffective#getEstChangeParTransfertDotation <em>Est Change Par Transfert Dotation</em>}</li>
 *   <li>{@link mpia.schema.TypeDotationEffective#getAPourInformationsDurplusOuDeficitSurplusOuDeficit <em>APour Informations Durplus Ou Deficit Surplus Ou Deficit</em>}</li>
 *   <li>{@link mpia.schema.TypeDotationEffective#getEstRapporteeParRapport <em>Est Rapportee Par Rapport</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeDotationEffective()
 * @model abstract="true"
 *        annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_DotationEffective' kind='elementOnly'"
 * @generated
 */
public interface TypeDotationEffective extends EObject {
	/**
	 * Returns the value of the '<em><b>Quantite Operationnelle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quantite Operationnelle</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantite Operationnelle</em>' attribute.
	 * @see #isSetQuantiteOperationnelle()
	 * @see #unsetQuantiteOperationnelle()
	 * @see #setQuantiteOperationnelle(long)
	 * @see mpia.schema.SchemaPackage#getTypeDotationEffective_QuantiteOperationnelle()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier9"
	 *        extendedMetaData="kind='element' name='QuantiteOperationnelle'"
	 * @generated
	 */
	long getQuantiteOperationnelle();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDotationEffective#getQuantiteOperationnelle <em>Quantite Operationnelle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantite Operationnelle</em>' attribute.
	 * @see #isSetQuantiteOperationnelle()
	 * @see #unsetQuantiteOperationnelle()
	 * @see #getQuantiteOperationnelle()
	 * @generated
	 */
	void setQuantiteOperationnelle(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeDotationEffective#getQuantiteOperationnelle <em>Quantite Operationnelle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetQuantiteOperationnelle()
	 * @see #getQuantiteOperationnelle()
	 * @see #setQuantiteOperationnelle(long)
	 * @generated
	 */
	void unsetQuantiteOperationnelle();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeDotationEffective#getQuantiteOperationnelle <em>Quantite Operationnelle</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Quantite Operationnelle</em>' attribute is set.
	 * @see #unsetQuantiteOperationnelle()
	 * @see #getQuantiteOperationnelle()
	 * @see #setQuantiteOperationnelle(long)
	 * @generated
	 */
	boolean isSetQuantiteOperationnelle();

	/**
	 * Returns the value of the '<em><b>Quantite Disponible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quantite Disponible</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantite Disponible</em>' attribute.
	 * @see #isSetQuantiteDisponible()
	 * @see #unsetQuantiteDisponible()
	 * @see #setQuantiteDisponible(long)
	 * @see mpia.schema.SchemaPackage#getTypeDotationEffective_QuantiteDisponible()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier9"
	 *        extendedMetaData="kind='element' name='QuantiteDisponible'"
	 * @generated
	 */
	long getQuantiteDisponible();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDotationEffective#getQuantiteDisponible <em>Quantite Disponible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantite Disponible</em>' attribute.
	 * @see #isSetQuantiteDisponible()
	 * @see #unsetQuantiteDisponible()
	 * @see #getQuantiteDisponible()
	 * @generated
	 */
	void setQuantiteDisponible(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeDotationEffective#getQuantiteDisponible <em>Quantite Disponible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetQuantiteDisponible()
	 * @see #getQuantiteDisponible()
	 * @see #setQuantiteDisponible(long)
	 * @generated
	 */
	void unsetQuantiteDisponible();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeDotationEffective#getQuantiteDisponible <em>Quantite Disponible</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Quantite Disponible</em>' attribute is set.
	 * @see #unsetQuantiteDisponible()
	 * @see #getQuantiteDisponible()
	 * @see #setQuantiteDisponible(long)
	 * @generated
	 */
	boolean isSetQuantiteDisponible();

	/**
	 * Returns the value of the '<em><b>Quantite Totale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quantite Totale</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantite Totale</em>' attribute.
	 * @see #isSetQuantiteTotale()
	 * @see #unsetQuantiteTotale()
	 * @see #setQuantiteTotale(long)
	 * @see mpia.schema.SchemaPackage#getTypeDotationEffective_QuantiteTotale()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier9"
	 *        extendedMetaData="kind='element' name='QuantiteTotale'"
	 * @generated
	 */
	long getQuantiteTotale();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDotationEffective#getQuantiteTotale <em>Quantite Totale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantite Totale</em>' attribute.
	 * @see #isSetQuantiteTotale()
	 * @see #unsetQuantiteTotale()
	 * @see #getQuantiteTotale()
	 * @generated
	 */
	void setQuantiteTotale(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeDotationEffective#getQuantiteTotale <em>Quantite Totale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetQuantiteTotale()
	 * @see #getQuantiteTotale()
	 * @see #setQuantiteTotale(long)
	 * @generated
	 */
	void unsetQuantiteTotale();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeDotationEffective#getQuantiteTotale <em>Quantite Totale</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Quantite Totale</em>' attribute is set.
	 * @see #unsetQuantiteTotale()
	 * @see #getQuantiteTotale()
	 * @see #setQuantiteTotale(long)
	 * @generated
	 */
	boolean isSetQuantiteTotale();

	/**
	 * Returns the value of the '<em><b>Quantite Disponible Demande</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quantite Disponible Demande</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantite Disponible Demande</em>' attribute.
	 * @see #isSetQuantiteDisponibleDemande()
	 * @see #unsetQuantiteDisponibleDemande()
	 * @see #setQuantiteDisponibleDemande(long)
	 * @see mpia.schema.SchemaPackage#getTypeDotationEffective_QuantiteDisponibleDemande()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier9"
	 *        extendedMetaData="kind='element' name='QuantiteDisponibleDemande'"
	 * @generated
	 */
	long getQuantiteDisponibleDemande();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDotationEffective#getQuantiteDisponibleDemande <em>Quantite Disponible Demande</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantite Disponible Demande</em>' attribute.
	 * @see #isSetQuantiteDisponibleDemande()
	 * @see #unsetQuantiteDisponibleDemande()
	 * @see #getQuantiteDisponibleDemande()
	 * @generated
	 */
	void setQuantiteDisponibleDemande(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeDotationEffective#getQuantiteDisponibleDemande <em>Quantite Disponible Demande</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetQuantiteDisponibleDemande()
	 * @see #getQuantiteDisponibleDemande()
	 * @see #setQuantiteDisponibleDemande(long)
	 * @generated
	 */
	void unsetQuantiteDisponibleDemande();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeDotationEffective#getQuantiteDisponibleDemande <em>Quantite Disponible Demande</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Quantite Disponible Demande</em>' attribute is set.
	 * @see #unsetQuantiteDisponibleDemande()
	 * @see #getQuantiteDisponibleDemande()
	 * @see #setQuantiteDisponibleDemande(long)
	 * @generated
	 */
	boolean isSetQuantiteDisponibleDemande();

	/**
	 * Returns the value of the '<em><b>Quantite Totale Demande</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quantite Totale Demande</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantite Totale Demande</em>' attribute.
	 * @see #isSetQuantiteTotaleDemande()
	 * @see #unsetQuantiteTotaleDemande()
	 * @see #setQuantiteTotaleDemande(long)
	 * @see mpia.schema.SchemaPackage#getTypeDotationEffective_QuantiteTotaleDemande()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier9"
	 *        extendedMetaData="kind='element' name='QuantiteTotaleDemande'"
	 * @generated
	 */
	long getQuantiteTotaleDemande();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDotationEffective#getQuantiteTotaleDemande <em>Quantite Totale Demande</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantite Totale Demande</em>' attribute.
	 * @see #isSetQuantiteTotaleDemande()
	 * @see #unsetQuantiteTotaleDemande()
	 * @see #getQuantiteTotaleDemande()
	 * @generated
	 */
	void setQuantiteTotaleDemande(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeDotationEffective#getQuantiteTotaleDemande <em>Quantite Totale Demande</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetQuantiteTotaleDemande()
	 * @see #getQuantiteTotaleDemande()
	 * @see #setQuantiteTotaleDemande(long)
	 * @generated
	 */
	void unsetQuantiteTotaleDemande();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeDotationEffective#getQuantiteTotaleDemande <em>Quantite Totale Demande</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Quantite Totale Demande</em>' attribute is set.
	 * @see #unsetQuantiteTotaleDemande()
	 * @see #getQuantiteTotaleDemande()
	 * @see #setQuantiteTotaleDemande(long)
	 * @generated
	 */
	boolean isSetQuantiteTotaleDemande();

	/**
	 * Returns the value of the '<em><b>Quantite Pour Destruction Cible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quantite Pour Destruction Cible</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantite Pour Destruction Cible</em>' attribute.
	 * @see #isSetQuantitePourDestructionCible()
	 * @see #unsetQuantitePourDestructionCible()
	 * @see #setQuantitePourDestructionCible(long)
	 * @see mpia.schema.SchemaPackage#getTypeDotationEffective_QuantitePourDestructionCible()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier6"
	 *        extendedMetaData="kind='element' name='QuantitePourDestructionCible'"
	 * @generated
	 */
	long getQuantitePourDestructionCible();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDotationEffective#getQuantitePourDestructionCible <em>Quantite Pour Destruction Cible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantite Pour Destruction Cible</em>' attribute.
	 * @see #isSetQuantitePourDestructionCible()
	 * @see #unsetQuantitePourDestructionCible()
	 * @see #getQuantitePourDestructionCible()
	 * @generated
	 */
	void setQuantitePourDestructionCible(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeDotationEffective#getQuantitePourDestructionCible <em>Quantite Pour Destruction Cible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetQuantitePourDestructionCible()
	 * @see #getQuantitePourDestructionCible()
	 * @see #setQuantitePourDestructionCible(long)
	 * @generated
	 */
	void unsetQuantitePourDestructionCible();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeDotationEffective#getQuantitePourDestructionCible <em>Quantite Pour Destruction Cible</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Quantite Pour Destruction Cible</em>' attribute is set.
	 * @see #unsetQuantitePourDestructionCible()
	 * @see #getQuantitePourDestructionCible()
	 * @see #setQuantitePourDestructionCible(long)
	 * @generated
	 */
	boolean isSetQuantitePourDestructionCible();

	/**
	 * Returns the value of the '<em><b>Nombre Utilisations</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre Utilisations</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre Utilisations</em>' attribute.
	 * @see #isSetNombreUtilisations()
	 * @see #unsetNombreUtilisations()
	 * @see #setNombreUtilisations(long)
	 * @see mpia.schema.SchemaPackage#getTypeDotationEffective_NombreUtilisations()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier6"
	 *        extendedMetaData="kind='element' name='NombreUtilisations'"
	 * @generated
	 */
	long getNombreUtilisations();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDotationEffective#getNombreUtilisations <em>Nombre Utilisations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre Utilisations</em>' attribute.
	 * @see #isSetNombreUtilisations()
	 * @see #unsetNombreUtilisations()
	 * @see #getNombreUtilisations()
	 * @generated
	 */
	void setNombreUtilisations(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeDotationEffective#getNombreUtilisations <em>Nombre Utilisations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNombreUtilisations()
	 * @see #getNombreUtilisations()
	 * @see #setNombreUtilisations(long)
	 * @generated
	 */
	void unsetNombreUtilisations();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeDotationEffective#getNombreUtilisations <em>Nombre Utilisations</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nombre Utilisations</em>' attribute is set.
	 * @see #unsetNombreUtilisations()
	 * @see #getNombreUtilisations()
	 * @see #setNombreUtilisations(long)
	 * @generated
	 */
	boolean isSetNombreUtilisations();

	/**
	 * Returns the value of the '<em><b>Duree Fonctionnement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Duree Fonctionnement</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duree Fonctionnement</em>' containment reference.
	 * @see #setDureeFonctionnement(TypeDataTypeDuree)
	 * @see mpia.schema.SchemaPackage#getTypeDotationEffective_DureeFonctionnement()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DureeFonctionnement'"
	 * @generated
	 */
	TypeDataTypeDuree getDureeFonctionnement();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDotationEffective#getDureeFonctionnement <em>Duree Fonctionnement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duree Fonctionnement</em>' containment reference.
	 * @see #getDureeFonctionnement()
	 * @generated
	 */
	void setDureeFonctionnement(TypeDataTypeDuree value);

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
	 * @see mpia.schema.SchemaPackage#getTypeDotationEffective_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDotationEffective#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeDotationEffective_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDotationEffective#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

	/**
	 * Returns the value of the '<em><b>Methode Calcul Stock</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoDotationEffectiveMethodeCalculStock}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Methode Calcul Stock</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Methode Calcul Stock</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoDotationEffectiveMethodeCalculStock
	 * @see #isSetMethodeCalculStock()
	 * @see #unsetMethodeCalculStock()
	 * @see #setMethodeCalculStock(TypeDictionaryDicoDotationEffectiveMethodeCalculStock)
	 * @see mpia.schema.SchemaPackage#getTypeDotationEffective_MethodeCalculStock()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='MethodeCalculStock'"
	 * @generated
	 */
	TypeDictionaryDicoDotationEffectiveMethodeCalculStock getMethodeCalculStock();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDotationEffective#getMethodeCalculStock <em>Methode Calcul Stock</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Methode Calcul Stock</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoDotationEffectiveMethodeCalculStock
	 * @see #isSetMethodeCalculStock()
	 * @see #unsetMethodeCalculStock()
	 * @see #getMethodeCalculStock()
	 * @generated
	 */
	void setMethodeCalculStock(TypeDictionaryDicoDotationEffectiveMethodeCalculStock value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeDotationEffective#getMethodeCalculStock <em>Methode Calcul Stock</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMethodeCalculStock()
	 * @see #getMethodeCalculStock()
	 * @see #setMethodeCalculStock(TypeDictionaryDicoDotationEffectiveMethodeCalculStock)
	 * @generated
	 */
	void unsetMethodeCalculStock();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeDotationEffective#getMethodeCalculStock <em>Methode Calcul Stock</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Methode Calcul Stock</em>' attribute is set.
	 * @see #unsetMethodeCalculStock()
	 * @see #getMethodeCalculStock()
	 * @see #setMethodeCalculStock(TypeDictionaryDicoDotationEffectiveMethodeCalculStock)
	 * @generated
	 */
	boolean isSetMethodeCalculStock();

	/**
	 * Returns the value of the '<em><b>Est Change Par Transfert Dotation</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeTransfertDotation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Change Par Transfert Dotation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Change Par Transfert Dotation</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeDotationEffective_EstChangeParTransfertDotation()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_TransfertDotation'"
	 *        extendedMetaData="kind='element' name='EstChangePar_TransfertDotation'"
	 * @generated
	 */
	EList<TypeTransfertDotation> getEstChangeParTransfertDotation();

	/**
	 * Returns the value of the '<em><b>APour Informations Durplus Ou Deficit Surplus Ou Deficit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Informations Durplus Ou Deficit Surplus Ou Deficit</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Informations Durplus Ou Deficit Surplus Ou Deficit</em>' containment reference.
	 * @see #setAPourInformationsDurplusOuDeficitSurplusOuDeficit(TypeSurplusOuDeficit)
	 * @see mpia.schema.SchemaPackage#getTypeDotationEffective_APourInformationsDurplusOuDeficitSurplusOuDeficit()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_SurplusOuDeficit'"
	 *        extendedMetaData="kind='element' name='APourInformationsDurplusOuDeficit_SurplusOuDeficit'"
	 * @generated
	 */
	TypeSurplusOuDeficit getAPourInformationsDurplusOuDeficitSurplusOuDeficit();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDotationEffective#getAPourInformationsDurplusOuDeficitSurplusOuDeficit <em>APour Informations Durplus Ou Deficit Surplus Ou Deficit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Informations Durplus Ou Deficit Surplus Ou Deficit</em>' containment reference.
	 * @see #getAPourInformationsDurplusOuDeficitSurplusOuDeficit()
	 * @generated
	 */
	void setAPourInformationsDurplusOuDeficitSurplusOuDeficit(TypeSurplusOuDeficit value);

	/**
	 * Returns the value of the '<em><b>Est Rapportee Par Rapport</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Rapportee Par Rapport</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Rapportee Par Rapport</em>' containment reference.
	 * @see #setEstRapporteeParRapport(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeDotationEffective_EstRapporteeParRapport()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_Rapport'"
	 *        extendedMetaData="kind='element' name='EstRapporteePar_Rapport'"
	 * @generated
	 */
	TypeAssociation getEstRapporteeParRapport();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDotationEffective#getEstRapporteeParRapport <em>Est Rapportee Par Rapport</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Est Rapportee Par Rapport</em>' containment reference.
	 * @see #getEstRapporteeParRapport()
	 * @generated
	 */
	void setEstRapporteeParRapport(TypeAssociation value);

} // TypeDotationEffective
