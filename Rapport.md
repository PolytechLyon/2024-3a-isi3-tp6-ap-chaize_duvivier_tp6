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

## Exercices 5

## Exercices 6

## Exercices 7

## Exercices 8

## Exercices 9
