/*
 * Created on 3 Nov 2017 ( Time 09:39:00 )
 * Generated by Telosys Tools Generator ( version 2.1.1 )
 */

package imta.modele.persistence.services.jpa;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

import imta.modele.bean.jpa.AchatEntity;
import imta.modele.persistence.commons.jpa.GenericJpaService;
import imta.modele.persistence.commons.jpa.JpaOperation;
import imta.modele.persistence.services.AchatPersistence;

/**
 * JPA implementation for basic persistence operations ( entity "Achat" )
 * 
 * @author Telosys Tools Generator
 *
 */
public class AchatPersistenceJPA extends GenericJpaService<AchatEntity, Integer> implements AchatPersistence {

	/**
	 * Constructor
	 */
	public AchatPersistenceJPA() {
		super(AchatEntity.class);
	}

	@Override
	public AchatEntity load( Integer id ) {
		return super.load( id );
	}

	@Override
	public boolean delete( Integer id ) {
		return super.delete( id );
	}

	@Override
	public boolean delete(AchatEntity entity) {
		if ( entity != null ) {
			return super.delete( entity.getId() );
		}
		return false ;
	}

	@Override
	public long countAll() {
		// JPA operation definition 
		JpaOperation operation = new JpaOperation() {
			@Override
			public Object exectue(EntityManager em) throws PersistenceException {
				Query query = em.createNamedQuery("AchatEntity.countAll");
				return query.getSingleResult() ;
			}
		} ;
		// JPA operation execution 
		return (Long) execute(operation);
	}

	@Override
	public void deleteAll() {
		// JPA operation definition 
		JpaOperation operation = new JpaOperation() {
			@Override
			public Object exectue(EntityManager em) throws PersistenceException {
				Query query = em.createNamedQuery("AchatEntity.deleteAll");
				return query.executeUpdate() ;
			}
		};
		
		execute(operation, true);
	}
		
		
	@Override
	public List<AchatEntity> loadByUser(final String username) {
		
		// JPA operation definition 
		JpaOperation operation = new JpaOperation() {
			@Override
			public Object exectue(EntityManager em) throws PersistenceException {
				Query query = em.createNamedQuery("AchatEntity.loadByUser");
				query.setParameter("username", username);
				return query.getResultList();
			}
		};
		
		// JPA operation execution 
		return (List<AchatEntity>) execute(operation);
	}
	
	@Override
	public void deleteByUser(final String username) {
		// JPA operation definition 
		JpaOperation operation = new JpaOperation() {
			@Override
			public Object exectue(EntityManager em) throws PersistenceException {
				Query query = em.createNamedQuery("AchatEntity.deleteByUser");
				query.setParameter("username", username);
				return query.executeUpdate();
			}
		};
		
		// JPA operation execution 
		execute(operation, true);
	}

	@Override
	public AchatEntity loadByUserAndArticle(final String username, final String codeArticle) {
		// JPA operation definition 
		JpaOperation operation = new JpaOperation() {
			@Override
			public Object exectue(EntityManager em) throws PersistenceException {
				Query query = em.createNamedQuery("AchatEntity.loadByUserAndArticle");
				query.setParameter("username", username);
				query.setParameter("codeArticle", codeArticle);
				return query.getResultList();
			}
		};
				
		// JPA operation execution 
		List<AchatEntity> result = (List<AchatEntity>) execute(operation);
		
		if (result == null || result.isEmpty()) {
			return null;
		}
		return result.get(0);
	}
}
