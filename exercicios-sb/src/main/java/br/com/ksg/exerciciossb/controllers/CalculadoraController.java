package br.com.ksg.exerciciossb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("calculadora")
public class CalculadoraController {

	@GetMapping("/somar/{a}/{b}")
	public double somar(@PathVariable(required = true) double a, @PathVariable(required = true) double b) {
		return a + b;
	}

	@GetMapping("/subtrair")
	public double subtrair(@RequestParam(name = "a", required = true) double a,
			@RequestParam(name = "b", required = true) double b) {
		return a - b;
	}
}
