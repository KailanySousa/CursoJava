package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class RemoverUsuario {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
		EntityManager em = emf.createEntityManager();

		Usuario u = em.find(Usuario.class, 3L);
		
		if(u != null) {
			em.getTransaction().begin();
			
			em.remove(u);
			
			em.getTransaction().commit();
		} else {
			System.out.println("usuário não encontrado na base de dados");
		}

		em.close();
		emf.close();
	}

}
