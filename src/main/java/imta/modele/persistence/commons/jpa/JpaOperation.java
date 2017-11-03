/*
 * Created on 3 Nov 2017 ( Date ISO 2017-11-03 - Time 09:39:01 )
 * Generated by Telosys Tools Generator ( version 2.1.1 )
 */
package imta.modele.persistence.commons.jpa;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceException;

/**
 * JPA operation interface
 * Provided by Telosys Tools for JPA testing
 *
 */
public interface JpaOperation {

	/**
	 * Executes a JPA operation using the given EntityManager
	 * @param em the EntityManager to be used
	 * @return
	 * @throws PersistenceException
	 */
	public Object exectue(EntityManager em) throws PersistenceException;
	
}
