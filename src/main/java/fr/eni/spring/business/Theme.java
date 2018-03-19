package fr.eni.spring.business;

import java.util.Date;

public class Theme {
	private int numero;
	private String libelle;
	private String description;
	private Date dateCreation;
	private Date dateModification;
	
	public Theme(int numero, String libelle) {
		super();
		this.numero = numero;
		this.libelle = libelle;
	}
	
	public Theme(){
		this(0, null);
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}

	public Date getDateModification() {
		return dateModification;
	}

	public void setDateModification(Date dateModification) {
		this.dateModification = dateModification;
	}

	@Override
	public String toString() {
		return "Theme [numero=" + numero + ", libelle=" + libelle + ", description=" + description + ", dateCreation="
				+ dateCreation + ", dateModification=" + dateModification + "]";
	}
}
