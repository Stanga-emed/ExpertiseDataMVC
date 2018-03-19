package fr.eni.spring.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import fr.eni.spring.business.Theme;
import fr.eni.spring.dao.ThemeDao;

@Repository
public class ThemeDaoImpl implements ThemeDao {
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void creer(Theme theme) {
		Session session = sessionFactory.openSession();
		session.save(theme);
	}

	@Override
	public void modifier(Theme theme) {
		Session session = sessionFactory.openSession();
		session.merge(theme);
		session.flush();
	}

	@Override
	public void supprimer(Theme theme) {
		Session session = sessionFactory.openSession();
		session.delete(theme);
		session.flush();
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<Theme> lister() {
		Session session = sessionFactory.openSession();
		return session.createQuery("from Theme").list();
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<Theme> chercherParLibelle(String libelle) {
		Session session = sessionFactory.openSession();
		return session.createQuery("from Theme where libelle=?")
				.setParameter(0, libelle).list();
	}

	@Override
	public List<Theme> chercherParLibelleIncomplet(String libelle) {
		return chercherParLibelle("%" + libelle + "%");
	}

	@Override
	public Theme chercherParNumero(int numero) {
		Session session = sessionFactory.openSession();
		return (Theme)session.get(Theme.class, numero);
	}

}
