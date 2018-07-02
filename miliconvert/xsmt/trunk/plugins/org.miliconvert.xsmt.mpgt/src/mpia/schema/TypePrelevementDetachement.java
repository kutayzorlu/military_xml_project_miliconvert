/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import javax.xml.datatype.XMLGregorianCalendar;

import mpia.meta.TypeAssociation;
import mpia.meta.TypeAssociationEXT;
import mpia.meta.TypeDataTypeDuree;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Prelevement Detachement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypePrelevementDetachement#getDisponibilitePrelevement <em>Disponibilite Prelevement</em>}</li>
 *   <li>{@link mpia.schema.TypePrelevementDetachement#getHoraireRendezVous <em>Horaire Rendez Vous</em>}</li>
 *   <li>{@link mpia.schema.TypePrelevementDetachement#getPreavis <em>Preavis</em>}</li>
 *   <li>{@link mpia.schema.TypePrelevementDetachement#getCommentaire <em>Commentaire</em>}</li>
 *   <li>{@link mpia.schema.TypePrelevementDetachement#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypePrelevementDetachement#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypePrelevementDetachement#getPorteSurArticulationTerre <em>Porte Sur Articulation Terre</em>}</li>
 *   <li>{@link mpia.schema.TypePrelevementDetachement#getAPourLieuRendezVousAutreElementControle <em>APour Lieu Rendez Vous Autre Element Controle</em>}</li>
 *   <li>{@link mpia.schema.TypePrelevementDetachement#getAPourCoordonneesRadioAdresseRadio <em>APour Coordonnees Radio Adresse Radio</em>}</li>
 *   <li>{@link mpia.schema.TypePrelevementDetachement#getACommeModaliteTransfertModaliteTransfertAutoriteASS <em>AComme Modalite Transfert Modalite Transfert Autorite ASS</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypePrelevementDetachement()
 * @model abstract="true"
 *        extendedMetaData="name='type_PrelevementDetachement' kind='elementOnly'"
 * @generated
 */
public interface TypePrelevementDetachement extends EObject {
	/**
	 * Returns the value of the '<em><b>Disponibilite Prelevement</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoPrelevementDetachementDisponibilitePrelevement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Disponibilite Prelevement</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Disponibilite Prelevement</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoPrelevementDetachementDisponibilitePrelevement
	 * @see #isSetDisponibilitePrelevement()
	 * @see #unsetDisponibilitePrelevement()
	 * @see #setDisponibilitePrelevement(TypeDictionaryDicoPrelevementDetachementDisponibilitePrelevement)
	 * @see mpia.schema.SchemaPackage#getTypePrelevementDetachement_DisponibilitePrelevement()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='DisponibilitePrelevement'"
	 * @generated
	 */
	TypeDictionaryDicoPrelevementDetachementDisponibilitePrelevement getDisponibilitePrelevement();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePrelevementDetachement#getDisponibilitePrelevement <em>Disponibilite Prelevement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disponibilite Prelevement</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoPrelevementDetachementDisponibilitePrelevement
	 * @see #isSetDisponibilitePrelevement()
	 * @see #unsetDisponibilitePrelevement()
	 * @see #getDisponibilitePrelevement()
	 * @generated
	 */
	void setDisponibilitePrelevement(TypeDictionaryDicoPrelevementDetachementDisponibilitePrelevement value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypePrelevementDetachement#getDisponibilitePrelevement <em>Disponibilite Prelevement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDisponibilitePrelevement()
	 * @see #getDisponibilitePrelevement()
	 * @see #setDisponibilitePrelevement(TypeDictionaryDicoPrelevementDetachementDisponibilitePrelevement)
	 * @generated
	 */
	void unsetDisponibilitePrelevement();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypePrelevementDetachement#getDisponibilitePrelevement <em>Disponibilite Prelevement</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Disponibilite Prelevement</em>' attribute is set.
	 * @see #unsetDisponibilitePrelevement()
	 * @see #getDisponibilitePrelevement()
	 * @see #setDisponibilitePrelevement(TypeDictionaryDicoPrelevementDetachementDisponibilitePrelevement)
	 * @generated
	 */
	boolean isSetDisponibilitePrelevement();

	/**
	 * Returns the value of the '<em><b>Horaire Rendez Vous</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Horaire Rendez Vous</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Horaire Rendez Vous</em>' attribute.
	 * @see #setHoraireRendezVous(XMLGregorianCalendar)
	 * @see mpia.schema.SchemaPackage#getTypePrelevementDetachement_HoraireRendezVous()
	 * @model dataType="mpia.meta.TypeDataTypeGDH"
	 *        extendedMetaData="kind='element' name='HoraireRendezVous'"
	 * @generated
	 */
	XMLGregorianCalendar getHoraireRendezVous();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePrelevementDetachement#getHoraireRendezVous <em>Horaire Rendez Vous</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Horaire Rendez Vous</em>' attribute.
	 * @see #getHoraireRendezVous()
	 * @generated
	 */
	void setHoraireRendezVous(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Preavis</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Preavis</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Preavis</em>' containment reference.
	 * @see #setPreavis(TypeDataTypeDuree)
	 * @see mpia.schema.SchemaPackage#getTypePrelevementDetachement_Preavis()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Preavis'"
	 * @generated
	 */
	TypeDataTypeDuree getPreavis();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePrelevementDetachement#getPreavis <em>Preavis</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Preavis</em>' containment reference.
	 * @see #getPreavis()
	 * @generated
	 */
	void setPreavis(TypeDataTypeDuree value);

	/**
	 * Returns the value of the '<em><b>Commentaire</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Commentaire</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Commentaire</em>' attribute.
	 * @see #setCommentaire(String)
	 * @see mpia.schema.SchemaPackage#getTypePrelevementDetachement_Commentaire()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0255"
	 *        extendedMetaData="kind='element' name='Commentaire'"
	 * @generated
	 */
	String getCommentaire();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePrelevementDetachement#getCommentaire <em>Commentaire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Commentaire</em>' attribute.
	 * @see #getCommentaire()
	 * @generated
	 */
	void setCommentaire(String value);

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
	 * @see mpia.schema.SchemaPackage#getTypePrelevementDetachement_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePrelevementDetachement#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypePrelevementDetachement_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePrelevementDetachement#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

	/**
	 * Returns the value of the '<em><b>Porte Sur Articulation Terre</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Porte Sur Articulation Terre</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Porte Sur Articulation Terre</em>' containment reference.
	 * @see #setPorteSurArticulationTerre(TypeAssociationEXT)
	 * @see mpia.schema.SchemaPackage#getTypePrelevementDetachement_PorteSurArticulationTerre()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='ACommePrelevement_PrelevementDetachement' target_entity='type_ArticulationTerre'"
	 *        extendedMetaData="kind='element' name='PorteSur_ArticulationTerre'"
	 * @generated
	 */
	TypeAssociationEXT getPorteSurArticulationTerre();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePrelevementDetachement#getPorteSurArticulationTerre <em>Porte Sur Articulation Terre</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Porte Sur Articulation Terre</em>' containment reference.
	 * @see #getPorteSurArticulationTerre()
	 * @generated
	 */
	void setPorteSurArticulationTerre(TypeAssociationEXT value);

	/**
	 * Returns the value of the '<em><b>APour Lieu Rendez Vous Autre Element Controle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Lieu Rendez Vous Autre Element Controle</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Lieu Rendez Vous Autre Element Controle</em>' containment reference.
	 * @see #setAPourLieuRendezVousAutreElementControle(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypePrelevementDetachement_APourLieuRendezVousAutreElementControle()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_AutreElementControle'"
	 *        extendedMetaData="kind='element' name='APourLieuRendezVous_AutreElementControle'"
	 * @generated
	 */
	TypeAssociation getAPourLieuRendezVousAutreElementControle();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePrelevementDetachement#getAPourLieuRendezVousAutreElementControle <em>APour Lieu Rendez Vous Autre Element Controle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Lieu Rendez Vous Autre Element Controle</em>' containment reference.
	 * @see #getAPourLieuRendezVousAutreElementControle()
	 * @generated
	 */
	void setAPourLieuRendezVousAutreElementControle(TypeAssociation value);

	/**
	 * Returns the value of the '<em><b>APour Coordonnees Radio Adresse Radio</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Coordonnees Radio Adresse Radio</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Coordonnees Radio Adresse Radio</em>' containment reference.
	 * @see #setAPourCoordonneesRadioAdresseRadio(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypePrelevementDetachement_APourCoordonneesRadioAdresseRadio()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_AdresseRadio'"
	 *        extendedMetaData="kind='element' name='APourCoordonneesRadio_AdresseRadio'"
	 * @generated
	 */
	TypeAssociation getAPourCoordonneesRadioAdresseRadio();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePrelevementDetachement#getAPourCoordonneesRadioAdresseRadio <em>APour Coordonnees Radio Adresse Radio</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Coordonnees Radio Adresse Radio</em>' containment reference.
	 * @see #getAPourCoordonneesRadioAdresseRadio()
	 * @generated
	 */
	void setAPourCoordonneesRadioAdresseRadio(TypeAssociation value);

	/**
	 * Returns the value of the '<em><b>AComme Modalite Transfert Modalite Transfert Autorite ASS</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AComme Modalite Transfert Modalite Transfert Autorite ASS</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AComme Modalite Transfert Modalite Transfert Autorite ASS</em>' containment reference.
	 * @see #setACommeModaliteTransfertModaliteTransfertAutoriteASS(TypeModaliteTransfertAutoriteASS)
	 * @see mpia.schema.SchemaPackage#getTypePrelevementDetachement_ACommeModaliteTransfertModaliteTransfertAutoriteASS()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_ModaliteTransfertAutoriteASS'"
	 *        extendedMetaData="kind='element' name='ACommeModaliteTransfert_ModaliteTransfertAutoriteASS'"
	 * @generated
	 */
	TypeModaliteTransfertAutoriteASS getACommeModaliteTransfertModaliteTransfertAutoriteASS();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePrelevementDetachement#getACommeModaliteTransfertModaliteTransfertAutoriteASS <em>AComme Modalite Transfert Modalite Transfert Autorite ASS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AComme Modalite Transfert Modalite Transfert Autorite ASS</em>' containment reference.
	 * @see #getACommeModaliteTransfertModaliteTransfertAutoriteASS()
	 * @generated
	 */
	void setACommeModaliteTransfertModaliteTransfertAutoriteASS(TypeModaliteTransfertAutoriteASS value);

} // TypePrelevementDetachement
