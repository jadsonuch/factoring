package tk.shz.refactoring.ejbs;

import java.io.Serializable;
import java.util.List;

public interface IEJB<E, K extends Serializable> {

	E find(K primaryKey);
	
	List<E> findAll(); 	
	
	void persist(E entity);

	void remove(E entity);
	
	E merge(E entity);	
	
}
