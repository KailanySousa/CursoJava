package streams;

public class Aluno {

	final String nome;
	final double nota;
	final int presenca;
	
	public Aluno(String nome, double nota) {
		this.nome = nome;
		this.nota = nota;
		this.presenca = 0;
	}
	
	public Aluno(String nome, double nota, int presenca) {
		this.nome = nome;
		this.nota = nota;
		this.presenca = presenca;
	}
}
