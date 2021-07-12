package oo.composicao;

import java.util.ArrayList;
import java.util.List;

public class Curso {
	String nome;
	List<Aluno> alunos = new ArrayList<>();
	
	public Curso(String nome) {
		this.nome = nome;
	}
	
	void setAluno(Aluno aluno) {
		this.alunos.add(aluno);
		aluno.cursos.add(this);
	}
	
	int getTotalAlunos() {
		return this.alunos.size();
	}
}
