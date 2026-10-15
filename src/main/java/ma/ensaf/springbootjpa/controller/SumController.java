package ma.ensaf.springbootjpa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;

@Controller
public class SumController {
	
@GetMapping("/")
public String home() {
    return "index";
}

@GetMapping("/add")
public String add(@RequestParam("num1") int num1, @RequestParam("num2") int num2, Model model) {
    int somme = num1 + num2;
    model.addAttribute("somme", somme); // On met la somme dans la "boîte" Model
    return "result"; // Redirige vers result.jsp
}


}
