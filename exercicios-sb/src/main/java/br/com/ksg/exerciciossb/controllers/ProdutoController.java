package br.com.ksg.exerciciossb.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.ksg.exerciciossb.model.entities.Produto;
import br.com.ksg.exerciciossb.model.repositories.ProdutoRepository;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {

	@Autowired
	private ProdutoRepository produtoRepository;
	
	@PostMapping("/inserir")
	public @ResponseBody Produto novoProduto(@RequestParam String nome) {
		Produto p = new Produto(nome);
		
		produtoRepository.save(p);
		
		return p;
	}
}
