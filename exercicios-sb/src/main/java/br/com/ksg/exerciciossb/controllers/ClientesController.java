package br.com.ksg.exerciciossb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.ksg.exerciciossb.model.entities.Cliente;

@RestController
@RequestMapping("/clientes")
public class ClientesController {

	@GetMapping("/qualquer")
	public Cliente obterCliente() {
		return new Cliente(1, "Kailany", "123.456.789-00");
	}
	
	@GetMapping("/{id}")
	public Cliente obterClientePorId1(@PathVariable int id) {
		return new Cliente(id, "Maria", "987.654.321-00");
	}
	
	@GetMapping
	public Cliente obterClientePorId2(@RequestParam(name = "id", defaultValue = "1") int id) {
		return new Cliente(id, "Ayla", "111.222.333-44");
	}
}
