package br.com.ksg.exerciciossb.model.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;

import br.com.ksg.exerciciossb.model.entities.Produto;

public interface ProdutoRepository extends PagingAndSortingRepository<Produto, Integer> {

	
}
