
/*
 * Created on 3 Nov 2017 ( Time 09:39:00 )
 * Generated by Telosys Tools Generator ( version 2.1.1 )
 */
package imta.modele.mock;

import java.util.LinkedList;
import java.util.List;

import imta.modele.bean.jpa.ArticleEntity;
import imta.modele.mock.tool.MockValues;

public class ArticleEntityMock {

	private MockValues mockValues = new MockValues();
	
	/**
	 * Creates an instance with random Primary Key
	 * @return
	 */
	public ArticleEntity createInstance() {
		// Primary Key values

		return createInstance( mockValues.nextString(2) );
	}
	
	/**
	 * Creates an instance with a specific Primary Key
	 * @param id1
	 * @return
	 */
	public ArticleEntity createInstance( String code ) {
		ArticleEntity entity = new ArticleEntity();
		// Init Primary Key fields
		entity.setCode( code) ;
		// Init Data fields
		entity.setNom( mockValues.nextString(255) ) ; // java.lang.String 
		entity.setPrix( mockValues.nextFloat() ) ; // java.lang.Float 
		entity.setDescription( mockValues.nextString(32700) ) ; // java.lang.String 
		entity.setQuantite( mockValues.nextInteger() ) ; // java.lang.Integer 
		// Init Link fields (if any)
		// setListOfAchat( TODO ) ; // List<Achat> 
		return entity ;
	}
	
	/**
	 * Creates a list of instances
	 * @param count number of instances to be created
	 * @return
	 */
	public List<ArticleEntity> createList(int count) {
		List<ArticleEntity> list = new LinkedList<ArticleEntity>();		
		for ( int i = 1 ; i <= count ; i++ ) {
			list.add( createInstance() );
		}
		return list;
	}
}
