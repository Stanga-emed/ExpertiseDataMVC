package fr.eni.spring.test.dao;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import fr.eni.spring.business.Banque;
import fr.eni.spring.dao.BanqueDao;

public class BanqueDaoTestId {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		BanqueDao dao = context.getBean(BanqueDao.class);
		int id = 1;
		Banque banque = dao.get(id);
		System.out.println(banque);
		context.close();
	}

}
