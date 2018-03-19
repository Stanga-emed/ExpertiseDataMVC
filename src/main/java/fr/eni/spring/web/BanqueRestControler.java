package fr.eni.spring.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.eni.spring.business.Banque;
import fr.eni.spring.dao.BanqueDao;

@RestController
public class BanqueRestControler {
	@Autowired
	private BanqueDao banqueDAO;
	
	@RequestMapping("/rest/banques")
	public List<Banque> banques(){
		return banqueDAO.getAll();
	}
	
	@RequestMapping("/rest/banque/{numero}")
	public Banque banque(@PathVariable int numero){
		return banqueDAO.get(numero);
	}
}
