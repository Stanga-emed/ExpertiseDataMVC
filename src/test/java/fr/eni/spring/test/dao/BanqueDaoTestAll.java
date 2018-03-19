package fr.eni.spring.test.dao;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import fr.eni.spring.business.Banque;
import fr.eni.spring.dao.BanqueDao;

public class BanqueDaoTestAll {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		BanqueDao dao = context.getBean(BanqueDao.class);
		List<Banque> banques = dao.getAll();
		for(Banque banque: banques)
			System.out.println(banque);
		context.close();
	}

}
