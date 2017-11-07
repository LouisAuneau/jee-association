/*
 * Created on 3 Nov 2017 ( Time 09:39:00 )
 * Generated by Telosys Tools Generator ( version 2.1.1 )
 */
// This Bean has a basic Primary Key (not composite) 

package imta.modele.bean.jpa;

import java.io.Serializable;

//import javax.validation.constraints.* ;
//import org.hibernate.validator.constraints.* ;



import javax.persistence.*;

/**
 * Persistent class for entity stored in table "ACHAT"
 *
 * @author Telosys Tools Generator
 *
 */

@Entity
@Table(name="ACHAT", schema="ADMIN" )
// Define named queries here
@NamedQueries ( {
  @NamedQuery ( name="AchatEntity.countAll", query="SELECT COUNT(x) FROM AchatEntity x" ),
  @NamedQuery ( name="AchatEntity.deleteAll", query="DELETE FROM AchatEntity CASCADE" )
} )
public class AchatEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    //----------------------------------------------------------------------
    // ENTITY PRIMARY KEY ( BASED ON A SINGLE FIELD )
    //----------------------------------------------------------------------
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="ID", nullable=false)
    private Integer    id           ;


    //----------------------------------------------------------------------
    // ENTITY DATA FIELDS 
    //----------------------------------------------------------------------    
    @Column(name="QUANTITE", nullable=false)
    private Integer    quantite     ;

	// "article" (column "ARTICLE") is not defined by itself because used as FK in a link 
	// "utilisateur" (column "UTILISATEUR") is not defined by itself because used as FK in a link 


    //----------------------------------------------------------------------
    // ENTITY LINKS ( RELATIONSHIP )
    //----------------------------------------------------------------------
    @ManyToOne
    @JoinColumn(name="ARTICLE", referencedColumnName="CODE")
    private ArticleEntity article2    ;

    @ManyToOne
    @JoinColumn(name="UTILISATEUR", referencedColumnName="IDENTIFIANT")
    private UtilisateurEntity utilisateur2;


    //----------------------------------------------------------------------
    // CONSTRUCTOR(S)
    //----------------------------------------------------------------------
    public AchatEntity() {
		super();
    }
    
    //----------------------------------------------------------------------
    // GETTER & SETTER FOR THE KEY FIELD
    //----------------------------------------------------------------------
    public void setId( Integer id ) {
        this.id = id ;
    }
    public Integer getId() {
        return this.id;
    }

    //----------------------------------------------------------------------
    // GETTERS & SETTERS FOR FIELDS
    //----------------------------------------------------------------------
    //--- DATABASE MAPPING : QUANTITE ( INTEGER ) 
    public void setQuantite( Integer quantite ) {
        this.quantite = quantite;
    }
    public Integer getQuantite() {
        return this.quantite;
    }


    //----------------------------------------------------------------------
    // GETTERS & SETTERS FOR LINKS
    //----------------------------------------------------------------------
    public void setArticle2( ArticleEntity article2 ) {
        this.article2 = article2;
    }
    public ArticleEntity getArticle2() {
        return this.article2;
    }

    public void setUtilisateur2( UtilisateurEntity utilisateur2 ) {
        this.utilisateur2 = utilisateur2;
    }
    public UtilisateurEntity getUtilisateur2() {
        return this.utilisateur2;
    }


    //----------------------------------------------------------------------
    // toString METHOD
    //----------------------------------------------------------------------
    public String toString() { 
        StringBuffer sb = new StringBuffer(); 
        sb.append("["); 
        sb.append(id);
        sb.append("]:"); 
        sb.append(quantite);
        return sb.toString(); 
    } 

}
