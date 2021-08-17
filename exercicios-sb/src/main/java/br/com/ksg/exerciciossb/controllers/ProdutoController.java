package br.com.ksg.exerciciossb.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.ksg.exerciciossb.model.entities.Produto;
import br.com.ksg.exerciciossb.model.repositories.ProdutoRepository;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {

	@Autowired
	private ProdutoRepository produtoRepository;

	@RequestMapping(method = { RequestMethod.POST, RequestMethod.PUT })
	// @PostMapping
	public @ResponseBody Produto salvarProduto(@Valid Produto produto) {
		produtoRepository.save(produto);
		return produto;
	}

	// @PutMapping
	// public Produto alterarProduto(@Valid Produto produto) {
	//	produtoRepository.save(produto);
	//	return produto;
	// }

	@GetMapping(path = "/pagina/{numPagina}")
	public Iterable<Produto> obterProdutos(@PathVariable int numPagina) {
		
		Pageable page = (Pageable) PageRequest.of(0, 3);
		return produtoRepository.findAll((Sort) page);
	}

	@GetMapping(path = "/pagina/{numeroPagina}/{qtdePagina}")
	public Iterable<Produto> obterProdutosPorPagina(@PathVariable int numeroPagina, @PathVariable int qtdePagina) {
		if (qtdePagina >= 5)
			qtdePagina = 5;
		Pageable page = PageRequest.of(numeroPagina, qtdePagina);
		return produtoRepository.findAll(page);
	}
	
	@DeleteMapping(path = "/{id}")
	public void excluirProduto(@PathVariable int id) {
		produtoRepository.deleteById(id);
	}

}
