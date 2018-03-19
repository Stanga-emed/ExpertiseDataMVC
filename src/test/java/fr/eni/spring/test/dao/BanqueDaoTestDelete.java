package fr.eni.spring.test.dao;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import fr.eni.spring.business.Banque;
import fr.eni.spring.dao.BanqueDao;

public class BanqueDaoTestDelete {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		BanqueDao dao = context.getBean(BanqueDao.class);
		//
		Banque banque = new Banque();
		banque.setId(6);
		dao.delete(banque);
		
		List<Banque> banques = dao.getAll();
		for(Banque _banque: banques)
			System.out.println(_banque);
		
		context.close();
	}

}
