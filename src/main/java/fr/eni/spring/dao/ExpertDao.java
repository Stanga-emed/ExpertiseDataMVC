package fr.eni.spring.dao;

import java.util.List;

import fr.eni.spring.business.Expert;

public interface ExpertDao {
	public List<Expert> getAll();
	
	public Expert get(int id);
	
	public void delete(Expert expert);
	
	public List<Expert> getByNom(String nom);
	
	public void creer(Expert expert);
	
	public void modifier(Expert expert);
}
