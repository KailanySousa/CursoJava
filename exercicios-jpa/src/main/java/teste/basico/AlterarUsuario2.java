package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class AlterarUsuario2 {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();
		
		Usuario u = em.find(Usuario.class, 2L);
		u.setNome("Kailany Sousa Alterado");
		u.setEmail("kailany@gmail.com");
		
		// quando o objeto est� em um estado gerenciado
		// ele ser� alterado mesmo sem a chamada do comando de altera��o
		
		// em.merge(u);
		
		em.getTransaction().commit();
		
		Usuario usuario = em.find(Usuario.class, 2L);
		System.out.println(usuario.getNome());

		em.close();
		emf.close();

	}

}
