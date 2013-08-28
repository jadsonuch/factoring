package tk.shz.refactoring.ejbs;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import tk.shz.refactoring.model.Cliente;

@Stateless
public class ClienteService extends EJBImpl<Cliente, Integer>{
	
	@PersistenceContext(unitName = "refactoringPU")
	EntityManager entityManager;

	public ClienteService() {
		super(Cliente.class);
	}

}

