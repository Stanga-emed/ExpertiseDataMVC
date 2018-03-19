package fr.eni.spring.test.dao;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import fr.eni.spring.dao.ExpertDao;

public class ExpertDaoTestNom {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		ExpertDao dao = context.getBean(ExpertDao.class);
		System.out.println(dao.getByNom("Grimal"));;
		context.close();

	}

}
