package oo.encapsulamento;

public class PessoaMain {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa();
		
		p1.setNome("Kailany");
		p1.setSobrenome("Sousa");
		
		p1.setIdade(19);
		System.out.println(p1.getNomeCompleto());
		System.out.println(p1.getIdade());
	}

}
