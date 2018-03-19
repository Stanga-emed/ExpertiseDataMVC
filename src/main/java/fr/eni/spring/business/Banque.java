package fr.eni.spring.business;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Banque {
	@Id
	@GeneratedValue
	private int id;
	private String nom;
	private String adresse;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	@Override
	public String toString() {
		return "Banque [id=" + id + ", nom=" + nom + ", adresse=" + adresse + "]";
	}
}
