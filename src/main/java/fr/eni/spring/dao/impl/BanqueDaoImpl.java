package fr.eni.spring.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import fr.eni.spring.business.Banque;
import fr.eni.spring.dao.BanqueDao;

@Repository
public class BanqueDaoImpl implements BanqueDao {
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	@SuppressWarnings("unchecked")
	public List<Banque> getAll() {
		Session session = sessionFactory.openSession();
		return session.createQuery("from Banque").list();
	}

	@Override
	public Banque get(int id) {
		Session session = sessionFactory.openSession();
		return (Banque)session.get(Banque.class, id);
	}

	@Override
	public void create(Banque banque) {
		Session session = sessionFactory.openSession();
		session.save(banque);
	}

	@Override
	public void delete(Banque banque) {
		Session session = sessionFactory.openSession();
		session.delete(banque);
		session.flush();
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<Banque> getByNom(String nom) {
		Session session = sessionFactory.openSession();
		return session.createQuery("from Banque where nom like ?")
				.setParameter(0, "%" + nom + "%")
				.list();
	}

}
