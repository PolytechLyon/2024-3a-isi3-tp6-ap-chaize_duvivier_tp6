# Compte Rendu du TP 1 : Patrons de Conceptions

Noms des étudiants du binôme : CHAIZE Alice, DUVIVIER Vincent

## Exercices 1
Le design pattern utilisé est le "Composite".  Le composant est MobileObject et le composite est le vehicle.

Comme la classe TagAlongBike extends de SimpleBike alors nous avons pas besoin de de réécrire la méthode getVelocity() et getMass(), car la façon de calculer n'a pas changée. 

## Exercices 2
La méthode getVelocity() utilise le patron de conception de "Iterateur". Il permet de parcourir une collection d'objet sans connaitre l'implementation de cette collection. Ainsi on peut replacer "Set" par "List" dans la classe vehicle sans avoir à modifier l'implémentation de la méthode "getVelocity()". 

## Exercices 3
Dans la classe Clock, on rajoute un attribut statique de type "Clock" qui représente l'instance de l'horloge "Clock". On ajoute une méthode statique getInstance(), qui permettra de récupérer la seule et unique instance possible de Clock. Ensuite, dans la classe "Wheel" on enleve l'attibrut "clock", on utilise à la place la méthode getInstance() de la classe Clock. Enfin à chaque fois qu'on utilise la Clock on la récupère via getInstance(). 

## Exercices 4
Les deux classes Bike et Wheel n'appartiennent pas au même paquetage. Il y a ainsi une interdépendance (dépendance cyclique) entre les deux classes. Cela n'adhère pas aux bonnes pratiques de conception.

La classe Wheel utilise la méthode getPush de la classe Bike. La classe Vehicule (package Transport) possède une abstraction de cette méthode.

## Exercices 5
Dans la classe de NamedLogger nous avons rajouté la méthode log() qui comporte les étapes communes des deux anciennes fonctions log(). Notre nouvelle méthode appelle une méthode "writeMessage()" qui se trouve dans les classes filles avec le traitement propre à chacune d'entre elle. 

## Exercices 6
Avec le singleton, une seule instance est créée et partagée. Alors qu'avec ce pattern, plusieurs instances de logger existent sans avoir à "réflechir" à créer la bonne classe, il suffit d'appeler "useLogger".

## Exercices 7
Nous avons créé la classe "TimestampedLoggerDecorator" qui possède un logger en temps que composant et qui réécrit une méthode log. Ainsi il suffit de créer un objet TimestampedLoggerDecorator et lui donner en attribut un logger souhaiter, la fonction log du décorateur ajoutera la date peu importe le logger utilisé.

## Exercices 8

## Exercices 9
