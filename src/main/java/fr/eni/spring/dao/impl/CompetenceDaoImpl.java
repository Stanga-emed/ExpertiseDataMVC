package fr.eni.spring.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import fr.eni.spring.business.Competence;
import fr.eni.spring.dao.CompetenceDao;

@Repository
public class CompetenceDaoImpl implements CompetenceDao {
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void creer(Competence competence) {
		Session session = sessionFactory.openSession();
		session.save(competence);
	}

	@Override
	public void supprimer(Competence competence) {
		Session session = sessionFactory.openSession();
		session.delete(competence);
		session.flush();
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<Competence> lister() {
		Session session = sessionFactory.openSession();
		return session.createQuery("from Competence").list();
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<Competence> chercherParTheme(int numeroTheme) {
		Session session = sessionFactory.openSession();
		return session.createQuery("from Competence where numeroTheme=?")
				.setParameter(0, numeroTheme).list();
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<Competence> chercherParExpert(int numeroExpert) {
		Session session = sessionFactory.openSession();
		return session.createQuery("from Competence where numeroExpert=?")
				.setParameter(0, numeroExpert).list();
	}

	@Override
	public Competence chercherParNumero(int numero) {
		Session session = sessionFactory.openSession();
		return (Competence)session.get(Competence.class, numero);
	}

}
