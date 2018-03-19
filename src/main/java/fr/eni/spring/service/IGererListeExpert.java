package fr.eni.spring.service;

import java.util.List;

import fr.eni.spring.business.Expert;

public interface IGererListeExpert {

	/** Chargement de la liste des experts */
	public void charger();
	
	/** Ajout d'un expert dans la liste */
	public void ajouter(final Expert pExpert);
	
	/** Suppression d'un expert de la liste */
	public void supprimer(final int pNumeroExpert);
	
	/** Modification des informations pour un expert */
	public void modifier(final Expert pExpert);
	
	/** Recherche d'un expert par son numero unique */
	public Expert chercherParNumero(final int pNumeroExpert);
	
	/** Recherce par nom : plusieurs reponses possibles */
	public List<Expert> chercherParNom(final String pNomExpert);
	
	/** Edition de la liste */
	public void imprimer();
} // IGestionListeExpert
