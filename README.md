# GuessingGame – Jeu de Devinettes

Ce projet Java est un jeu console simple où l'utilisateur doit deviner un nombre aléatoire entre **1 et 100**. Il dispose de **10 essais maximum** pour trouver le bon nombre.


## Instructions de jeu

1. Lancer le fichier `Main.java` depuis votre IDE (IntelliJ, VS Code, etc.)
2. Le programme génère un nombre aléatoire entre 1 et 100
3. À chaque tentative, l'utilisateur entre un nombre :
    - Trop grand → si le nombre à trouver est petit
    - Trop petit → si le nombre à trouver est plus grand
    - Gagner → si le nombre entrer est correct.

4. Après 10 tentatives sans succès, le programme affiche le bon nombre.


## Objectifs 

- Utilisation des **boucles `while`**
- Génération de nombres aléatoires avec la classe `Random`
- Saisie utilisateur via la classe `Scanner`
- Conditions `if/else` pour orienter le jeu
- Organisation d’un petit projet Java de type console


## Exemple de sortie 

```text
Bienvenue dans le jeu de devinettes !
Devinez un nombre entre 1 et 100 :
> 50
Trop petit !
> 75
Trop grand !
> 68
Bravo ! Vous avez trouvé en 3 tentatives.
