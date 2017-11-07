# jee-association
Site d'une association avec gestion des utilisateurs et de produits.

# Procedure de creation de la base de donnees

- Lancer Derby avec le fichier  ```startNetworkServer.bat``` (ou .sh sous linux).


- Lancer l'utilitaire ```ij.bat``` (.sh sous Linux) dans le dossier *bin* de Derby.
- Taper les commandes suivantes pour creer la base ainsi qu'un utilisateur :
```
CONNECT 'jdbc:derby:jee-association;create=true';
CALL SYSCS_UTIL.SYSCS_SET_DATABASE_PROPERTY('derby.user.ADMIN', 'PASSWORD');
```
- Fermer l'utilitaire.


- Lancer Squirel et ajouter le driver de Derby avec la configuration suivante :
```
Name        : Derby driver
Exemple URL : jdbc:derby://localhost:1527/DBNAME
JAR         : derbyclient-10.11.1.1.jar (in folder "drivers-jdbc")
Class Name  : org.apache.derby.jdbc.ClientDriver
```
- Ajouter l'Alias suivant :
```
Name        : jee-association
Driver      : Derby driver
URL         : jdbc:derby://localhost:1527/jee-association
Username    : LOGIN
Password    : PASSWORD
```

Vous pouvez ensuite administrer la base depuis Squirel.


# Initialisation de la base

Executez les instructions SQL suivantes:
```
-- Création des tables
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

-- Jeux de données
INSERT INTO "ADMIN"."ARTICLE" (CODE,NOM,PRIX,QUANTITE, DESCRIPTION) 
     ('C1' ,'Casquette des Lakers', 20.00, 20, 'La casquette mytique du club de basketball des Lakers !'),
     ('C2' ,'Casquette des Bulls', 20.00, 30, 'La casquette mytique du club de basketball des Bulls !'),
     ('C3' ,'Casquette des Celtics', 20.00, 20, 'La casquette mytique du club de basketball des Celtics !'),
     ('M1' ,'Maillot Jordan', 99.99, 20, 'Maillot de l\'icone Micheal Jordan.'),
     ('M2' ,'Maillot Bird', 99.99, 20, 'Maillot de l\'icone Larry Bird.'),
     ('M3' ,'Maillot James', 99.99, 20, 'Maillot de la superstar des Cavs Lebron James.'),
     ('B1' ,'Ballon', 40.00, 50, 'Ballon Spalding en cuir authentique.'),
     ('B2' ,'Bracelet', 5.50, 100, 'Bracelet NBA.');
```
