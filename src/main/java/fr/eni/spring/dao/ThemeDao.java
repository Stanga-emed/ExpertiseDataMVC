package fr.eni.spring.dao;

import java.util.List;

import fr.eni.spring.business.Theme;

public interface ThemeDao {
	public void creer(Theme theme);
	public void modifier(Theme theme);
	public void supprimer(Theme theme);
	public List<Theme> lister();
	public List<Theme> chercherParLibelle(String libelle);
	public List<Theme> chercherParLibelleIncomplet(String libelle);
	public Theme chercherParNumero(int numero);
}
