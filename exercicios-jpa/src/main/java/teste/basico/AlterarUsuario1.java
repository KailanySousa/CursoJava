package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class AlterarUsuario1 {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();
		
		Usuario u = em.find(Usuario.class, 2L);
		u.setNome("Kailany Sousa");
		u.setEmail("kailany@gmail.com");
		
		em.merge(u);
		
		em.getTransaction().commit();
		
		Usuario usuario = em.find(Usuario.class, 2L);
		System.out.println(usuario.getNome());

		em.close();
		emf.close();
	}

}
