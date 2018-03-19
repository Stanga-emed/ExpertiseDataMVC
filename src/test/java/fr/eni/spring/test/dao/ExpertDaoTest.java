package fr.eni.spring.test.dao;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import fr.eni.spring.business.Expert;
import fr.eni.spring.dao.ExpertDao;

public class ExpertDaoTest {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		ExpertDao dao = context.getBean(ExpertDao.class);
		List<Expert> experts = dao.getAll();
		for(Expert expert: experts)
		System.out.println(expert);
		context.close();

	}

}
