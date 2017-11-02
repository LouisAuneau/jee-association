
/*
 * Created on 2 Nov 2017 ( Time 21:21:30 )
 * Generated by Telosys Tools Generator ( version 2.1.1 )
 */
package imta.modele.mock;

import java.util.LinkedList;
import java.util.List;

import imta.modele.bean.jpa.AchatEntity;
import imta.modele.mock.tool.MockValues;

public class AchatEntityMock {

	private MockValues mockValues = new MockValues();
	
	/**
	 * Creates an instance with random Primary Key
	 * @return
	 */
	public AchatEntity createInstance() {
		// Primary Key values

		return createInstance( mockValues.nextInteger() );
	}
	
	/**
	 * Creates an instance with a specific Primary Key
	 * @param id1
	 * @return
	 */
	public AchatEntity createInstance( Integer id ) {
		AchatEntity entity = new AchatEntity();
		// Init Primary Key fields
		entity.setId( id) ;
		// Init Data fields
		// Init Link fields (if any)
		// setArticle( TODO ) ; // Article 
		// setUtilisateur( TODO ) ; // Utilisateur 
		return entity ;
	}
	
	/**
	 * Creates a list of instances
	 * @param count number of instances to be created
	 * @return
	 */
	public List<AchatEntity> createList(int count) {
		List<AchatEntity> list = new LinkedList<AchatEntity>();		
		for ( int i = 1 ; i <= count ; i++ ) {
			list.add( createInstance() );
		}
		return list;
	}
}