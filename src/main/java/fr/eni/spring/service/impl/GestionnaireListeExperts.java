package fr.eni.spring.service.impl;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import fr.eni.spring.business.Expert;
import fr.eni.spring.service.IGererListeExpert;

@Component
public class GestionnaireListeExperts implements IGererListeExpert {
	@Autowired
	@Qualifier("chargeurExpertDB")
	private IChargerExpert chargeurExpert;
	
	/** La liste des experts */
	private List<Expert> listeExperts;
	

	/** 
	 * Chargement de la liste des experts 
	 */
	@Override
	public void charger() {
		List<Expert> _listTravail;

		_listTravail = chargeurExpert.chargerExperts();
		// Ebregistrement dans le gestionnaire
		listeExperts = _listTravail;
	} // charger

	@Override
	public void ajouter(final Expert pExpert) {
	} // ajouter

	@Override
	public List<Expert> chercherParNom(final String pNomExpert) {
		return null;
	} // chercherParNom

	@Override
	public Expert chercherParNumero(final int pNumeroExpert) {
		return null;
	} // chercherParNumero

	@Override
	public void modifier(final Expert pExpert) {
	} // modifier

	@Override
	public void supprimer(final int pNumeroExpert) {
	} // supprimer
	
	public void imprimer() {
		Iterator<Expert> _iteExperts;
		Expert _expertTemp;
		
		// Parcourir la liste pour edition sur console
		_iteExperts = listeExperts.iterator();
		System.out.println("*** Debut de liste des experts ***");
		while (true == _iteExperts.hasNext()) {
			_expertTemp = _iteExperts.next();
			System.out.println(_expertTemp);
		}
		System.out.println("*** Fin de liste des experts ***");
	} // imprimer
} // GestionnaireListeExperts
