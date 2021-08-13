package modelo.umpraum;

import infra.DAO;

public class NovoClienteAssento2 {

	public static void main(String[] args) {
		
		Assento a = new Assento("1D");
		Cliente c = new Cliente("Kailany", a);
		
		DAO<Cliente> dao = new DAO<>(Cliente.class);
		
		dao.abrirT().incluirAtomico(c).fechar();;
		
	}

}
