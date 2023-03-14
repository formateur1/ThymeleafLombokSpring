package com.inti.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.inti.model.Voiture;

@Controller
public class MainController {
	
	@GetMapping("hel")
	public String hello(Model m)
	{
		List<Voiture> listeV = new ArrayList<>();
		listeV.add(new Voiture(1, "123-aez-12", "Renault", "Clio", 220));
		listeV.add(new Voiture(2, "456sdf", "Peugeot", "5008", 240));
		listeV.add(new Voiture(3, "987sdf", "Mercedes", "Classe B", 230));
		listeV.add(new Voiture(4, "456xcv", "BMW", "X5", 250));
		
		m.addAttribute("listeV", listeV);
		
		return "hello";
	}

}
