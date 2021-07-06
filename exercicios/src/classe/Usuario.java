package classe;

public class Usuario {

	String nome;
	String email;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public boolean equals(Object objeto) {
		
		if(objeto instanceof Usuario) {
			Usuario outro = (Usuario) objeto;
			
			boolean nomeIgual = outro.nome == this.nome;
			boolean emailIgual = outro.email == this.email;
			
			return nomeIgual && emailIgual;
		} else {
			return false;
		}
		
	}
}
