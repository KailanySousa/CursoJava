package classe;

public class Comida {
	
	String nome;
	double peso;
	
	Comida(){}
	
	Comida(String nome){
		this.nome = nome;
	}
	
	Comida(String nome, double peso){
		this.nome = nome;
		this.peso = peso;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getPeso() {
		return peso;
	}
	
	public void setPeso(double peso) {
		this.peso = peso;
	}
}
