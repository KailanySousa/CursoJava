package oo.composicao;

public class CursoMain {

	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno("Kailany");
		Aluno aluno2 = new Aluno("Ayla");
		Aluno aluno3 = new Aluno("João");
		
		
		Curso curso1 = new Curso("Java Completo");
		Curso curso2 = new Curso("Flutter: CRUD Completo");
		Curso curso3 = new Curso("Web 2023");
		
		curso1.setAluno(aluno3);
		curso2.setAluno(aluno2);
		curso3.setAluno(aluno1);
		
		aluno1.setCurso(curso3);
		aluno2.setCurso(curso2);
		aluno3.setCurso(curso1);
		
		for(Aluno aluno: curso3.alunos) {
			System.out.println("Sou " + aluno.nome + 
					" e estou matriculado(a) no curso: " 
					+ curso3.nome + "/n");
			
		}
		
		System.out.println(aluno1.getCursoPorNome("Web 2023").nome);
		
		System.out.println(aluno1.cursos.get(0).alunos.toString());
	}

}
