package fr.eni.spring.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeControler {
	@RequestMapping("/")
	public String home(){
		return "index";
	}
}
