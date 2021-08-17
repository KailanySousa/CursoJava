package br.com.ksg.exerciciossb.model.repositories;

import org.springframework.data.repository.CrudRepository;

import br.com.ksg.exerciciossb.model.entities.Produto;

public interface ProdutoRepository extends CrudRepository<Produto, Integer> {

	
}
