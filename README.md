# Design Pattern TD Réseau
## Partie 1

J'ai effectué un petit test avec la méthode `.getAllByName` pour les noms "titan", "jupyter" et "cnn.com". Comme prévu, "cnn.com" a retourné tous les hôtes tandis que les deux autres ont généré des erreurs car ils ne réfèrent pas à un hôte valide. Cependant, "jupyter.com" a retourné un hôte car c'est un nom valide. De plus, vous pouvez utiliser "localhost" dans la commande pour obtenir l'hôte local.

Voici mes résultats :
- Nom d'hôte local : xxx-xxx (xxx pour anonymiser sur GitHub)
- Adresse IP locale : 192.168.1.6

En outre, si vous fournissez n'importe quel autre nom d'hôte que ces quatre, il retournera `getByName`.


## Partie 2: Serveur et Client UDP Echo

### Serveur.java
Ce fichier contient l'implémentation d'un serveur UDP Echo qui écoute sur le port 9876 et renvoie tous les messages reçus.

### Client.java
Ce fichier contient l'implémentation d'un client UDP qui envoie des messages au serveur et affiche les réponses du serveur. Le client permet à l'utilisateur de saisir plusieurs messages depuis le clavier.

## Partie 3: Serveur et Client TCP

### TCPServer.java
Ce fichier contient l'implémentation d'un serveur TCP qui compte le nombre de mots dans le texte envoyé par le client. Le serveur écoute sur le port 9876 et s'attend à ce que le client envoie un texte ligne par ligne. Le serveur compte le nombre total de mots et renvoie le compte au client. La transmission se termine lorsque le serveur reçoit le fanion "xxxx".

### TCPClient.java
Ce fichier contient l'implémentation d'un client TCP qui envoie le contenu d'un fichier au serveur. Le client lit le fichier spécifié par l'utilisateur en ligne de commande et envoie son contenu ligne par ligne au serveur. Le client envoie également le fanion "xxxx" pour indiquer la fin de la transmission et affiche la réponse du serveur.
