package fr.eni.spring.test.dao;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import fr.eni.spring.business.Banque;
import fr.eni.spring.dao.BanqueDao;

public class BanqueDaoTestCreate {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		BanqueDao dao = context.getBean(BanqueDao.class);
		//
		Banque banque = new Banque();
		banque.setNom("ING Direct");
		banque.setAdresse("15 allée des acacias 59000 Lille");
		
		dao.create(banque);
		
		/*
		List<Banque> banques = dao.getAll();
		for(Banque _banque: banques)
			System.out.println(_banque);
		*/
		context.close();
	}

}
