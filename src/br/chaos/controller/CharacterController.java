package br.chaos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CharacterController {

	@RequestMapping("/create")
	public String create() {
		return "character/create";
	}
	
	
	@RequestMapping(value = "/add", method=RequestMethod.POST)
	public String add(String name, String nmJogador) {
		System.out.println("att:" + name + " / " +  nmJogador);
		return null;
	}
	
}
