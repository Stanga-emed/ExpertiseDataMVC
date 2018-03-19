package fr.eni.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import fr.eni.spring.service.IGererListeExpert;

/**
 * Classe de test du gestionnaire de liste des experts
 *
 */
public class ExpertiseCore001 {

	public static void main(final String[] pParams) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		IGererListeExpert _gestionExperts = context.getBean(IGererListeExpert.class);
		_gestionExperts.charger();
		_gestionExperts.imprimer();
		
		context.close();
	} // main
} // ExpertiseCore001
