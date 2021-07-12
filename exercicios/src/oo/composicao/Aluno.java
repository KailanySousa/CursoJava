package oo.composicao;

import java.util.ArrayList;
import java.util.List;

public class Aluno {

	String nome;
	List<Curso> cursos = new ArrayList<>();
	
	public Aluno(String nome) {
		this.nome = nome;
	}

	void setCurso(Curso curso) {
		this.cursos.add(curso);
		curso.alunos.add(this);
	}
	
	int getTotalCursos() {
		return this.cursos.size();
	}
	
	Curso getCursoPorNome(String nome) {
		for(Curso curso: this.cursos) {
			if(curso.nome.equalsIgnoreCase(nome)) return curso;
		}
		
		return null;
	}
	
	public String toString() {
		return nome;
	}
}
