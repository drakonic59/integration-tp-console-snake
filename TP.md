
	#	TP Intégration
	
	## Membres du groupe :
	
		- HATTANE Ilias
	
	## Sommaire :
	
		1.	Projet sélectionné
		2.	Modifications
		3.	Jenkins
		4.	Création de l'objet
		5.	Les étapes
		
	## 1. Projet sélectionné :
	
		Pour réaliser le TP, nous avions le choix entre différents projets présents sur Git. L'objectif est de mettre
		en place les outils nécessaires à l'intégration continue. 
		
		Le projet sélectionné est : console-snake.
		
		Il sagit d'une application console permettant à l'utilisateur de jouer au fameux jeu << Snake >>.
		
	## 2. Modifications :
	
		Afin de mettre en place une intégration continue fiable, il est nécessaire de disposer de tests unitaires. Ainsi
		nous sommes capables de controler la non régression de notre code source. De plus, il est assez intéressant de 
		disposer d'un projet de type Maven afin de pouvoir controler les différents cycles de vie du projet.
		
		Tout d'abord j'ai créé un nouveau projet Maven. Ensuite, j'ai transféré les classes du projet récupéré, dans 
		mon nouveau projet Maven. Enfin, j'ai pris en main le code source afin de voir où des tests unitaires seraient 
		intéressants.
		
		Avant de passer à l'étape suivante, j'ai modifié le fichier pom.xml afin d'ajouter des dépendances, modifier
		des properties et configurer le build et les plugins en lien. En prévision de la dernière étape, j'ai également
		renseigné les informations nécessaires pour la publication de l'artefact sur Nexus.
		
	## 3. Jenkins :
	
		L'outil Jenkins a été utilisé afin de mettre en place l'intégration continue. L'outil regorge de possibilités 
		mais, dans le cadre de notre TP, nous nous en servirons de façon sommaire. Afin d'aller directement à 
		l'objectif.
		
	## 4. Création de l'objet :
	
		Sous Jenkins, je vais créer un objet de type << Pipeline >>.
		
		Afin de le configurer, je vais :
		
			1.	Dans << General >> : sélectionner GitHub Project et saisir l'url du projet Git.
			2.	Dabs << Build Triggers >> : sélectionner Scrutation de l'outil de gestion de version et saisir 'H/15 * * * *'.
			3.	Dans << Pipeline >> : Sélectionner Pipeline script  from SCM, puis Git, puis saisir les informations relatives au repository Git (url, branch et chemin du JenkinsFile).

	## 5. Les étapes : 
	
		Le JenkinsFile permet, pour une même configuration Jenkins, d'avoir un résultat spécifique à chaque projet.
		Les étapes de build sont contenues dans le JenkinsFile, qui est présent sur Git.
		
		Afin de réaliser ces étapes, j'ai au préalable configurer un espace sur Nexus afin de recevoir les différentes
		versions de mon artefact. Il faut bien penser à configurer notre .m2 afin de spécifier les accès à nos 
		repositories Nexus.
		
		Notre projet parcours les étapes suivantes :
		
			1.	Hello : Simple affichage d'un Hello World en console.
			2.	Package : Permet de vider le projet des éventuels fichiers compilés, et packaging du projet.
			3.	Analyse : Utilisation de différents outils d'analyse du code proposés par Maven par exemple.
			4.	Publish : Création d'une archive qui gardera en mémoire notre artefact dans sa version.
			5.	Push into Maven Nexus : Permet de pousser notre artefact sur notre Nexus Maven.
			
		Une fois ces étapes terminées, nous enregistrons nos rapports de tests.