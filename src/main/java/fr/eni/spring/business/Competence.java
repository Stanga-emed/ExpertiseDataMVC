package fr.eni.spring.business;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="competences")
public class Competence {
	@Id
	@GeneratedValue
	private int numero;
	private int numeroExpert;
	private int numeroTheme;
	private Date dateCreation;
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getNumeroExpert() {
		return numeroExpert;
	}
	public void setNumeroExpert(int numeroExpert) {
		this.numeroExpert = numeroExpert;
	}
	public int getNumeroTheme() {
		return numeroTheme;
	}
	public void setNumeroTheme(int numeroTheme) {
		this.numeroTheme = numeroTheme;
	}
	public Date getDateCreation() {
		return dateCreation;
	}
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}
	@Override
	public String toString() {
		return "Competence [numero=" + numero + ", numeroExpert=" + numeroExpert + ", numeroTheme=" + numeroTheme
				+ ", dateCreation=" + dateCreation + "]";
	}
}
