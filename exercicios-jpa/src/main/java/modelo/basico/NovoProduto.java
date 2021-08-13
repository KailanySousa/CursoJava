package modelo.basico;

import infra.DAO;

public class NovoProduto {

	public static void main(String[] args) {
		
		Produto p = new Produto("caneta", 12.20);
		
		DAO<Produto> dao = new DAO<>(Produto.class);
		dao.incluirAtomico(p).fechar();

	}

}
