package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter {

	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Ana", 7.8, 16);
		Aluno a2 = new Aluno("Rebeca", 6.8, 20);
		Aluno a3 = new Aluno("Daniel", 5.8, 10);
		Aluno a4 = new Aluno("Carlos", 9.0, 5);
		Aluno a5 = new Aluno("Gui", 7.0, 17);
		Aluno a6 = new Aluno("Pedro", 8.8, 15);

		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6);
		
		Predicate<Aluno> aprovacaoNota = a -> a.nota >= 6;
		Predicate<Aluno> aprovacaoPresenca = a -> a.presenca >= 16;
		Function<Aluno, String> saudacaoAprovado = a -> "Parabéns " + a.nome + "! Você foi aprovado(a)!";
		
		alunos.stream()
			.filter(aprovacaoNota)
			.filter(aprovacaoPresenca)
			.map(saudacaoAprovado)
			.forEach(System.out::println);
	}

}
