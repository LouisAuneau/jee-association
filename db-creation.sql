CREATE TABLE Utilisateur (
    id INTEGER NOT NULL 
		PRIMARY KEY GENERATED ALWAYS AS IDENTITY 
     	(START WITH 1, INCREMENT BY 1),
    nom varchar(255) NOT NULL,
    motdepasse varchar(255) NOT NULL
);


CREATE TABLE Article (
    id INTEGER NOT NULL 
		PRIMARY KEY GENERATED ALWAYS AS IDENTITY 
     	(START WITH 1, INCREMENT BY 1),
    nom varchar(255) NOT NULL,
   	description LONG VARCHAR NOT NULL,
   	quantite INTEGER NOT NULL DEFAULT 0
);

CREATE TABLE Achat (
	id INTEGER NOT NULL 
		PRIMARY KEY GENERATED ALWAYS AS IDENTITY 
     	(START WITH 1, INCREMENT BY 1),
    articleid INTEGER NOT NULL,
    utilisateurid INTEGER NOT NULL,
	CONSTRAINT UTILISATEUR_FK
		FOREIGN KEY (utilisateurid)
		REFERENCES Utilisateur (id),
	CONSTRAINT ARTICLE_FK
		FOREIGN KEY (articleid)
		REFERENCES Article (id)
);