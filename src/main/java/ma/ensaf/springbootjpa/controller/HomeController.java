package ma.ensaf.springbootjpa.controller;

import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;

@Controller
public class HomeController{
	
//   @RequestMapping(value = "/hello", method = RequestMethod.GET)
//   public String bonjour() {
//	   System.out.println("Bonjour tout le monde !");
//	   return "hello.jsp";
//   }
	
	
//	@GetMapping(value= {"/hello", "/"})
//	public String bonjour(){
//		return "hello";
//	}
	
	
//	@GetMapping(value= {"/hello"})
//	public String bonjour(Model model) {
//		
//		model.addAttribute("Prenom","Farah");
//		model.addAttribute("Nom","Hamlili");
//		
//		return "hello";
//	}
	
//	@GetMapping(value= {"/hello"})
//	public String bonjour(@RequestParam(value="nom") String nom, Model model) {
//		model.addAttribute("Nom", nom);
//		model.addAttribute("Prenom","Farah");
//		return "hello";
//	}
	
//	@GetMapping(value= {"/hello/{nom}"})
//	public String bonjour(@PathVariable String nom, Model model) {
//		model.addAttribute("Nom", nom);
//		model.addAttribute("Prenom","Farah");
//		return "hello";
//	}
}
	
	
