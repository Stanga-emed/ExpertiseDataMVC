package fr.eni.spring.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import fr.eni.spring.business.Banque;
import fr.eni.spring.dao.BanqueDao;

@Controller
public class BanqueControler {
	@Autowired
	private BanqueDao banqueDao;
	
	@RequestMapping("/banques")
	public ModelAndView banques(){
		ModelAndView mv = new ModelAndView("listeBanques");
		
		List<Banque> Listebanques = banqueDao.getAll();
		mv.addObject("laListeDesBanques", Listebanques);
		
		return mv;
	}
	
	@RequestMapping("/banque/{numero}")
	public ModelAndView banque(@PathVariable int numero){
		ModelAndView mv = new ModelAndView("banque");
		
		System.out.println("b4");
		Banque banque = banqueDao.get(numero);
		System.out.println("got " + banque);
		mv.addObject("banque", banque);
		
		return mv;
	}
	
	@ExceptionHandler(Exception.class)
	public String erreur(){
		return "erreur";
	}
}
