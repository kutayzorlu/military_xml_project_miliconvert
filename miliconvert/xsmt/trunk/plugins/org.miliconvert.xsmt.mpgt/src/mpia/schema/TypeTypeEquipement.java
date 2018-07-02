/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeAssociation;
import mpia.meta.TypeDataTypeLongueur;
import mpia.meta.TypeDataTypeMasse;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Type Equipement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeTypeEquipement#getIndiceEfficienceRDF <em>Indice Efficience RDF</em>}</li>
 *   <li>{@link mpia.schema.TypeTypeEquipement#getCapaciteCarburant <em>Capacite Carburant</em>}</li>
 *   <li>{@link mpia.schema.TypeTypeEquipement#getSeuilCarburant <em>Seuil Carburant</em>}</li>
 *   <li>{@link mpia.schema.TypeTypeEquipement#getLongueur <em>Longueur</em>}</li>
 *   <li>{@link mpia.schema.TypeTypeEquipement#getLargeur <em>Largeur</em>}</li>
 *   <li>{@link mpia.schema.TypeTypeEquipement#getHauteur <em>Hauteur</em>}</li>
 *   <li>{@link mpia.schema.TypeTypeEquipement#getPoidsEnCharge <em>Poids En Charge</em>}</li>
 *   <li>{@link mpia.schema.TypeTypeEquipement#getPoidsAVide <em>Poids AVide</em>}</li>
 *   <li>{@link mpia.schema.TypeTypeEquipement#getEstEquipementMajeurAssociationEquipementlMajeur <em>Est Equipement Majeur Association Equipementl Majeur</em>}</li>
 *   <li>{@link mpia.schema.TypeTypeEquipement#getEstSujetAssociationConsommation <em>Est Sujet Association Consommation</em>}</li>
 *   <li>{@link mpia.schema.TypeTypeEquipement#getAPourGabaritPorteeGabaritPortee <em>APour Gabarit Portee Gabarit Portee</em>}</li>
 *   <li>{@link mpia.schema.TypeTypeEquipement#getCaracteristiquesMouvementCaracteristiquesMouvement <em>Caracteristiques Mouvement Caracteristiques Mouvement</em>}</li>
 *   <li>{@link mpia.schema.TypeTypeEquipement#getAPourCaracteristiqueTransportCaracteristiqueTransport <em>APour Caracteristique Transport Caracteristique Transport</em>}</li>
 *   <li>{@link mpia.schema.TypeTypeEquipement#getAPourCaracteristiqueASSTypeEquipementASS <em>APour Caracteristique ASS Type Equipement ASS</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeTypeEquipement()
 * @model abstract="true"
 *        extendedMetaData="name='type_TypeEquipement' kind='elementOnly'"
 * @generated
 */
public interface TypeTypeEquipement extends TypeTypeMateriel {
	/**
	 * Returns the value of the '<em><b>Indice Efficience RDF</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Indice Efficience RDF</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Indice Efficience RDF</em>' attribute.
	 * @see #isSetIndiceEfficienceRDF()
	 * @see #unsetIndiceEfficienceRDF()
	 * @see #setIndiceEfficienceRDF(double)
	 * @see mpia.schema.SchemaPackage#getTypeTypeEquipement_IndiceEfficienceRDF()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeFraction"
	 *        extendedMetaData="kind='element' name='IndiceEfficienceRDF'"
	 * @generated
	 */
	double getIndiceEfficienceRDF();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTypeEquipement#getIndiceEfficienceRDF <em>Indice Efficience RDF</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Indice Efficience RDF</em>' attribute.
	 * @see #isSetIndiceEfficienceRDF()
	 * @see #unsetIndiceEfficienceRDF()
	 * @see #getIndiceEfficienceRDF()
	 * @generated
	 */
	void setIndiceEfficienceRDF(double value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeTypeEquipement#getIndiceEfficienceRDF <em>Indice Efficience RDF</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIndiceEfficienceRDF()
	 * @see #getIndiceEfficienceRDF()
	 * @see #setIndiceEfficienceRDF(double)
	 * @generated
	 */
	void unsetIndiceEfficienceRDF();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeTypeEquipement#getIndiceEfficienceRDF <em>Indice Efficience RDF</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Indice Efficience RDF</em>' attribute is set.
	 * @see #unsetIndiceEfficienceRDF()
	 * @see #getIndiceEfficienceRDF()
	 * @see #setIndiceEfficienceRDF(double)
	 * @generated
	 */
	boolean isSetIndiceEfficienceRDF();

	/**
	 * Returns the value of the '<em><b>Capacite Carburant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Capacite Carburant</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capacite Carburant</em>' attribute.
	 * @see #isSetCapaciteCarburant()
	 * @see #unsetCapaciteCarburant()
	 * @see #setCapaciteCarburant(double)
	 * @see mpia.schema.SchemaPackage#getTypeTypeEquipement_CapaciteCarburant()
	 * @model unsettable="true" dataType="mpia.meta.TypeReal"
	 *        extendedMetaData="kind='element' name='CapaciteCarburant'"
	 * @generated
	 */
	double getCapaciteCarburant();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTypeEquipement#getCapaciteCarburant <em>Capacite Carburant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capacite Carburant</em>' attribute.
	 * @see #isSetCapaciteCarburant()
	 * @see #unsetCapaciteCarburant()
	 * @see #getCapaciteCarburant()
	 * @generated
	 */
	void setCapaciteCarburant(double value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeTypeEquipement#getCapaciteCarburant <em>Capacite Carburant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCapaciteCarburant()
	 * @see #getCapaciteCarburant()
	 * @see #setCapaciteCarburant(double)
	 * @generated
	 */
	void unsetCapaciteCarburant();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeTypeEquipement#getCapaciteCarburant <em>Capacite Carburant</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Capacite Carburant</em>' attribute is set.
	 * @see #unsetCapaciteCarburant()
	 * @see #getCapaciteCarburant()
	 * @see #setCapaciteCarburant(double)
	 * @generated
	 */
	boolean isSetCapaciteCarburant();

	/**
	 * Returns the value of the '<em><b>Seuil Carburant</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoTypeEquipementSeuilCarburant}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Seuil Carburant</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Seuil Carburant</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoTypeEquipementSeuilCarburant
	 * @see #isSetSeuilCarburant()
	 * @see #unsetSeuilCarburant()
	 * @see #setSeuilCarburant(TypeDictionaryDicoTypeEquipementSeuilCarburant)
	 * @see mpia.schema.SchemaPackage#getTypeTypeEquipement_SeuilCarburant()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='SeuilCarburant'"
	 * @generated
	 */
	TypeDictionaryDicoTypeEquipementSeuilCarburant getSeuilCarburant();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTypeEquipement#getSeuilCarburant <em>Seuil Carburant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Seuil Carburant</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoTypeEquipementSeuilCarburant
	 * @see #isSetSeuilCarburant()
	 * @see #unsetSeuilCarburant()
	 * @see #getSeuilCarburant()
	 * @generated
	 */
	void setSeuilCarburant(TypeDictionaryDicoTypeEquipementSeuilCarburant value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeTypeEquipement#getSeuilCarburant <em>Seuil Carburant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSeuilCarburant()
	 * @see #getSeuilCarburant()
	 * @see #setSeuilCarburant(TypeDictionaryDicoTypeEquipementSeuilCarburant)
	 * @generated
	 */
	void unsetSeuilCarburant();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeTypeEquipement#getSeuilCarburant <em>Seuil Carburant</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Seuil Carburant</em>' attribute is set.
	 * @see #unsetSeuilCarburant()
	 * @see #getSeuilCarburant()
	 * @see #setSeuilCarburant(TypeDictionaryDicoTypeEquipementSeuilCarburant)
	 * @generated
	 */
	boolean isSetSeuilCarburant();

	/**
	 * Returns the value of the '<em><b>Longueur</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Longueur</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Longueur</em>' containment reference.
	 * @see #setLongueur(TypeDataTypeLongueur)
	 * @see mpia.schema.SchemaPackage#getTypeTypeEquipement_Longueur()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Longueur'"
	 * @generated
	 */
	TypeDataTypeLongueur getLongueur();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTypeEquipement#getLongueur <em>Longueur</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Longueur</em>' containment reference.
	 * @see #getLongueur()
	 * @generated
	 */
	void setLongueur(TypeDataTypeLongueur value);

	/**
	 * Returns the value of the '<em><b>Largeur</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Largeur</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Largeur</em>' containment reference.
	 * @see #setLargeur(TypeDataTypeLongueur)
	 * @see mpia.schema.SchemaPackage#getTypeTypeEquipement_Largeur()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Largeur'"
	 * @generated
	 */
	TypeDataTypeLongueur getLargeur();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTypeEquipement#getLargeur <em>Largeur</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Largeur</em>' containment reference.
	 * @see #getLargeur()
	 * @generated
	 */
	void setLargeur(TypeDataTypeLongueur value);

	/**
	 * Returns the value of the '<em><b>Hauteur</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hauteur</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hauteur</em>' containment reference.
	 * @see #setHauteur(TypeDataTypeLongueur)
	 * @see mpia.schema.SchemaPackage#getTypeTypeEquipement_Hauteur()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Hauteur'"
	 * @generated
	 */
	TypeDataTypeLongueur getHauteur();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTypeEquipement#getHauteur <em>Hauteur</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hauteur</em>' containment reference.
	 * @see #getHauteur()
	 * @generated
	 */
	void setHauteur(TypeDataTypeLongueur value);

	/**
	 * Returns the value of the '<em><b>Poids En Charge</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Poids En Charge</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Poids En Charge</em>' containment reference.
	 * @see #setPoidsEnCharge(TypeDataTypeMasse)
	 * @see mpia.schema.SchemaPackage#getTypeTypeEquipement_PoidsEnCharge()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PoidsEnCharge'"
	 * @generated
	 */
	TypeDataTypeMasse getPoidsEnCharge();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTypeEquipement#getPoidsEnCharge <em>Poids En Charge</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Poids En Charge</em>' containment reference.
	 * @see #getPoidsEnCharge()
	 * @generated
	 */
	void setPoidsEnCharge(TypeDataTypeMasse value);

	/**
	 * Returns the value of the '<em><b>Poids AVide</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Poids AVide</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Poids AVide</em>' containment reference.
	 * @see #setPoidsAVide(TypeDataTypeMasse)
	 * @see mpia.schema.SchemaPackage#getTypeTypeEquipement_PoidsAVide()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PoidsAVide'"
	 * @generated
	 */
	TypeDataTypeMasse getPoidsAVide();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTypeEquipement#getPoidsAVide <em>Poids AVide</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Poids AVide</em>' containment reference.
	 * @see #getPoidsAVide()
	 * @generated
	 */
	void setPoidsAVide(TypeDataTypeMasse value);

	/**
	 * Returns the value of the '<em><b>Est Equipement Majeur Association Equipementl Majeur</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Equipement Majeur Association Equipementl Majeur</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Equipement Majeur Association Equipementl Majeur</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeTypeEquipement_EstEquipementMajeurAssociationEquipementlMajeur()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='AssocieCommeTypeEquipement_TypeEquipement' target_entity='type_AssociationEquipementlMajeur'"
	 *        extendedMetaData="kind='element' name='EstEquipementMajeur_AssociationEquipementlMajeur'"
	 * @generated
	 */
	EList<TypeAssociation> getEstEquipementMajeurAssociationEquipementlMajeur();

	/**
	 * Returns the value of the '<em><b>Est Sujet Association Consommation</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Sujet Association Consommation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Sujet Association Consommation</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeTypeEquipement_EstSujetAssociationConsommation()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='AssocieCommeSujet_TypeEquipement' target_entity='type_AssociationConsommation'"
	 *        extendedMetaData="kind='element' name='EstSujet_AssociationConsommation'"
	 * @generated
	 */
	EList<TypeAssociation> getEstSujetAssociationConsommation();

	/**
	 * Returns the value of the '<em><b>APour Gabarit Portee Gabarit Portee</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeGabaritPortee}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Gabarit Portee Gabarit Portee</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Gabarit Portee Gabarit Portee</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeTypeEquipement_APourGabaritPorteeGabaritPortee()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_GabaritPortee'"
	 *        extendedMetaData="kind='element' name='APourGabaritPortee_GabaritPortee'"
	 * @generated
	 */
	EList<TypeGabaritPortee> getAPourGabaritPorteeGabaritPortee();

	/**
	 * Returns the value of the '<em><b>Caracteristiques Mouvement Caracteristiques Mouvement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Caracteristiques Mouvement Caracteristiques Mouvement</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Caracteristiques Mouvement Caracteristiques Mouvement</em>' containment reference.
	 * @see #setCaracteristiquesMouvementCaracteristiquesMouvement(TypeCaracteristiquesMouvement)
	 * @see mpia.schema.SchemaPackage#getTypeTypeEquipement_CaracteristiquesMouvementCaracteristiquesMouvement()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_CaracteristiquesMouvement'"
	 *        extendedMetaData="kind='element' name='CaracteristiquesMouvement_CaracteristiquesMouvement'"
	 * @generated
	 */
	TypeCaracteristiquesMouvement getCaracteristiquesMouvementCaracteristiquesMouvement();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTypeEquipement#getCaracteristiquesMouvementCaracteristiquesMouvement <em>Caracteristiques Mouvement Caracteristiques Mouvement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Caracteristiques Mouvement Caracteristiques Mouvement</em>' containment reference.
	 * @see #getCaracteristiquesMouvementCaracteristiquesMouvement()
	 * @generated
	 */
	void setCaracteristiquesMouvementCaracteristiquesMouvement(TypeCaracteristiquesMouvement value);

	/**
	 * Returns the value of the '<em><b>APour Caracteristique Transport Caracteristique Transport</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Caracteristique Transport Caracteristique Transport</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Caracteristique Transport Caracteristique Transport</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeTypeEquipement_APourCaracteristiqueTransportCaracteristiqueTransport()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_CaracteristiqueTransport'"
	 *        extendedMetaData="kind='element' name='APourCaracteristiqueTransport_CaracteristiqueTransport'"
	 * @generated
	 */
	EList<TypeAssociation> getAPourCaracteristiqueTransportCaracteristiqueTransport();

	/**
	 * Returns the value of the '<em><b>APour Caracteristique ASS Type Equipement ASS</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Caracteristique ASS Type Equipement ASS</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Caracteristique ASS Type Equipement ASS</em>' containment reference.
	 * @see #setAPourCaracteristiqueASSTypeEquipementASS(TypeTypeEquipementASS)
	 * @see mpia.schema.SchemaPackage#getTypeTypeEquipement_APourCaracteristiqueASSTypeEquipementASS()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_TypeEquipementASS'"
	 *        extendedMetaData="kind='element' name='APourCaracteristiqueASS_TypeEquipementASS'"
	 * @generated
	 */
	TypeTypeEquipementASS getAPourCaracteristiqueASSTypeEquipementASS();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTypeEquipement#getAPourCaracteristiqueASSTypeEquipementASS <em>APour Caracteristique ASS Type Equipement ASS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Caracteristique ASS Type Equipement ASS</em>' containment reference.
	 * @see #getAPourCaracteristiqueASSTypeEquipementASS()
	 * @generated
	 */
	void setAPourCaracteristiqueASSTypeEquipementASS(TypeTypeEquipementASS value);

} // TypeTypeEquipement
