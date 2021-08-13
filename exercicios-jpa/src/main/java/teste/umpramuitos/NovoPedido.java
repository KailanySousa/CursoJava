package teste.umpramuitos;

import infra.DAO;
import modelo.basico.Produto;
import modelo.umpramuitos.ItemPedido;
import modelo.umpramuitos.Pedido;

public class NovoPedido {

	public static void main(String[] args) {
		
		DAO<Object> dao = new DAO<>();
		
		Pedido pe = new Pedido();
		Produto pr = new Produto("faca", 5.80);
		ItemPedido i = new ItemPedido(pe, pr, 10);
		
		dao.abrirT().incluir(pr).incluir(pe).incluir(i).fecharT().fechar();
		

	}

}
