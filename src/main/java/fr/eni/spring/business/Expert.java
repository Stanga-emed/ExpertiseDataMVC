package fr.eni.spring.business;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="experts")
public class Expert {

	/** Numero d'identification */
	@Id
	@GeneratedValue
	private int numero;
	
	/** Nom expert */
	private String nom;
	
	/** Prenom expert */
	private String prenom;

	public Expert() {
		nom = null;
		prenom = null;
		numero = -1;
	}
	
	public Expert(final String pNom,
	              final String pPrenom,
	              final int pNumero) {
		nom = pNom;
		prenom = pPrenom;
		numero = pNumero;
	}
	
	public int getNumero() {
		return numero;
	} // getNumero

	public void setNumero(final int pNumero) {
		numero = pNumero;
	} // setNumero

	public String getNom() {
		return nom;
	} // getNom

	public void setNom(final String pNom) {
		nom = pNom;
	} // setNom

	public String getPrenom() {
		return prenom;
	} // getPrenom

	public void setPrenom(final String pPrenom) {
		prenom = pPrenom;
	} // setPrenom
	
	@Override
	public String toString() {
		return "Nom : " + nom + " - Prenom : " + prenom + " - Numero : " + numero;
	} // toString
} // Expert
