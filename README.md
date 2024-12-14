Partie 1 :

J'ai effectué un petit test avec la méthode `.getAllByName` pour les noms "titan", "jupyter" et "cnn.com". Comme prévu, "cnn.com" a retourné tous les hôtes tandis que les deux autres ont généré des erreurs car ils ne réfèrent pas à un hôte valide. Cependant, "jupyter.com" a retourné un hôte car c'est un nom valide. De plus, vous pouvez utiliser "localhost" dans la commande pour obtenir l'hôte local.

Voici mes résultats :
- Nom d'hôte local : xxx-xxx (xxx pour anonymiser sur GitHub)
- Adresse IP locale : 192.168.1.6

En outre, si vous fournissez n'importe quel autre nom d'hôte que ces quatre, il retournera `getByName`.