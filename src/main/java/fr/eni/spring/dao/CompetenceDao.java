package fr.eni.spring.dao;

import java.util.List;

import fr.eni.spring.business.Competence;

public interface CompetenceDao {
	public void creer(Competence competence);
	public void supprimer(Competence competence);
	public List<Competence> lister();
	public List<Competence> chercherParTheme(int numeroTheme);
	public List<Competence> chercherParExpert(int numeroExpert);
	public Competence chercherParNumero(int numero);
}
