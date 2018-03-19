package fr.eni.spring.dao;

import java.util.List;

import fr.eni.spring.business.Banque;

public interface BanqueDao {
	public List<Banque> getAll();
	
	public Banque get(int id);
	
	public void create(Banque banque);
	
	public void delete(Banque banque);
	
	public List<Banque> getByNom(String nom);
}
