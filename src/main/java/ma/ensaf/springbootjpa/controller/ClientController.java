package ma.ensaf.springbootjpa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import ma.ensaf.springbootjpa.model.Client;

@Controller
public class ClientController {

	//Afficher la page du form
	@GetMapping("/client")
	public String formClient() {
		return "client";
	}
	
	//Ajouter les infos du form
	@PostMapping("/addClient")
	public String addClient(@ModelAttribute("c1") Client c) {
		return "resultClient";
	}
}
