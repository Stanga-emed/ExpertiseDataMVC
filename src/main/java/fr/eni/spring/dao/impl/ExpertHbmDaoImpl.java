package fr.eni.spring.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import fr.eni.spring.business.Expert;
import fr.eni.spring.dao.ExpertDao;

@Repository
public class ExpertHbmDaoImpl implements ExpertDao {
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	@SuppressWarnings("unchecked")
	public List<Expert> getAll() {
		Session session = sessionFactory.openSession();
		return session.createQuery("from Expert").list();
		//return null;
	}
	
	@Override
	@SuppressWarnings("unchecked")
	public List<Expert> getByNom(String nom) {
		Session session = sessionFactory.openSession();
		return session.createQuery("from Expert where nom like ?").setParameter(0, nom).list();
	}



	@Override
	public Expert get(int id) {
		Session session = sessionFactory.openSession();
		return (Expert) session.get(Expert.class, id);
	}

	@Override
	//@Transactional
	public void delete(Expert expert) {
		Session session = sessionFactory.openSession();
		expert = get(expert.getNumero());
		//session.getTransaction().begin();
		session.delete(expert);
		session.flush();
		//session.getTransaction().commit();
	}

	@Override
	public void creer(Expert expert) {
		Session session = sessionFactory.openSession();
		session.save(expert);		
	}

	@Override
	public void modifier(Expert expert) {
		Session session = sessionFactory.openSession();
		session.merge(expert);
		session.flush();
	}
	
	
	
}
