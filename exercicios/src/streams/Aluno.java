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
	
	public String toString() {
		return this.nome + " tem nota " + this.nota;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		long temp;
		temp = Double.doubleToLongBits(nota);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + presenca;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (Double.doubleToLongBits(nota) != Double.doubleToLongBits(other.nota))
			return false;
		if (presenca != other.presenca)
			return false;
		return true;
	}
	
}
