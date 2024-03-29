package br.com.ksg.exerciciossb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {
	
	@RequestMapping(method = RequestMethod.GET)
	public String ola() {
		return "Olá Spring Boot";
	}
	
	@GetMapping(path = "tudo_bem")
	public String tudoBem() {
		return "Tudo bem?";
	}
	
	@GetMapping(path = {"ola", "saudacao"})
	public String saudacao() {
		return "Olá, Tudo bem?";
	}
	
	@PostMapping(path = "saudacao")
	public String saudacaoPost() {
		return "Olá, Tudo bem?";
	}
}
