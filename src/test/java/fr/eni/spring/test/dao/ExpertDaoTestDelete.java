package fr.eni.spring.test.dao;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import fr.eni.spring.business.Expert;
import fr.eni.spring.dao.ExpertDao;

public class ExpertDaoTestDelete {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Expert expert = new Expert();
		expert.setNumero(10);
		ExpertDao dao = context.getBean(ExpertDao.class);
		dao.delete(expert);
		context.close();

	}

}
