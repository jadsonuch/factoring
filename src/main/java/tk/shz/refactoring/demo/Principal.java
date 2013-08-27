package tk.shz.refactoring.demo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import tk.shz.refactoring.model.Cliente;

public class Principal {

	public static void main(String[] args) {
		EntityManagerFactory emf;
		EntityManager em;

		emf = Persistence.createEntityManagerFactory("refactoringPU");
		em = emf.createEntityManager();

		Cliente c = new Cliente();
		c.setNome("Jadson");
		c.setTaxa(3.0);

		Cliente d = new Cliente();
		d.setNome("Jadson2");
		d.setTaxa(4.0);

		
		EntityTransaction tx = null;
		try {
			tx = em.getTransaction();
			tx.begin();
			em.persist(c);
			em.persist(d);
			
			tx.commit();
		} catch (RuntimeException e) {
			if (tx != null && tx.isActive()) {
				tx.rollback();
			}
			throw e;
		}

	}

}
