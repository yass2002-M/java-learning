# Java --- Bases

> Fiche de révision : syntaxe essentielle, conditions, boucles, tableaux
> et méthodes.

## Sommaire

1.  [Qu'est-ce que Java ?](#quest-ce-que-java-)
2.  [Structure d'un programme](#structure-dun-programme)
3.  [Variables et types](#variables-et-types)
4.  [Conventions de nommage](#conventions-de-nommage)
5.  [Primitifs et objets](#primitifs-et-objets)
6.  [Opérateurs](#opérateurs)
7.  [Conditions](#conditions)
8.  [Boucles](#boucles)
9.  [Tableaux](#tableaux)
10. [Méthodes](#méthodes)
11. [Pièges fréquents](#pièges-fréquents)

------------------------------------------------------------------------

## Qu'est-ce que Java ?

-   **Compilé** : `javac` transforme les fichiers `.java` en fichiers
    `.class` contenant du bytecode.
-   **Portable** : le bytecode `.class` peut s'exécuter sur toute
    machine disposant d'une JVM compatible.
-   **Orienté objet** : le code est organisé principalement autour de
    classes et d'objets.

## Structure d'un programme

``` java
public class MaClasse {
    public static void main(String[] args) {
        System.out.println("Hello");
    }
}
```

  ------------------------------------------------------------------------------
  Élément                                    Rôle
  ------------------------------------------ -----------------------------------
  `public class MaClasse`                    Déclare une classe. Le nom public
                                             de la classe doit correspondre au
                                             nom du fichier (`MaClasse.java`).

  `public static void main(String[] args)`   Point d'entrée habituel du
                                             programme.

  `System.out.println(...)`                  Affiche un texte ou une valeur,
                                             puis passe à la ligne.
  ------------------------------------------------------------------------------

## Variables et types

``` java
int age = 25;
double prix = 9.99;
boolean actif = true;
char initiale = 'Y';
String nom = "Yassi";
```

  Type        Utilisation              Exemple
  ----------- ------------------------ -------------------------
  `int`       Nombre entier            `int age = 25;`
  `double`    Nombre décimal           `double prix = 9.99;`
  `boolean`   Valeur vraie ou fausse   `boolean actif = true;`
  `char`      Un caractère             `char initiale = 'Y';`
  `String`    Chaîne de caractères     `String nom = "Yassi";`

## Conventions de nommage

-   **Classes** : `PascalCase` → `CompteBancaire`
-   **Variables et méthodes** : `camelCase` → `monAge`,
    `calculerTotal()`
-   **Constantes** : majuscules avec underscores → `MAX_SIZE`

## Primitifs et objets

Les types primitifs ont des classes enveloppes (*wrapper classes*)
correspondantes.

  Type primitif   Classe enveloppe
  --------------- ------------------
  `int`           `Integer`
  `double`        `Double`
  `boolean`       `Boolean`
  `char`          `Character`

## Opérateurs

### Arithmétiques

`+` `-` `*` `/` `%`

### Comparaison

`==` `!=` `<` `>` `<=` `>=`

### Logiques

  Opérateur   Sens
  ----------- -------------
  `&&`        ET logique
  `||`        OU logique
  `!`         NON logique

### Conversion de type (*cast*)

Pour obtenir une division décimale entre deux entiers, convertir au
moins l'un des opérandes :

``` java
double resultat = (double) a / b;
```

Sans conversion, une division entre deux `int` effectue une division
entière.

## Conditions

### `if` / `else if` / `else`

``` java
if (condition) {
    // Instructions si la condition est vraie
} else if (autreCondition) {
    // Instructions si la deuxième condition est vraie
} else {
    // Instructions si aucune condition précédente n’est vraie
}
```

### `switch`

``` java
switch (variable) {
    case valeur1:
        // Instructions
        break;
    default:
        // Cas par défaut
}
```

> **Attention :** dans la forme classique de `switch`, ne pas oublier
> `break` si l'on veut éviter de continuer dans le cas suivant
> (*fall-through*).

## Boucles

### `for`

``` java
for (int i = 0; i < 10; i++) {
    // Instructions répétées
}
```

À utiliser notamment lorsqu'on connaît le nombre d'itérations ou qu'on
parcourt une séquence avec un compteur.

### `while`

``` java
while (condition) {
    // Instructions répétées tant que la condition est vraie
}
```

À utiliser lorsque le nombre d'itérations n'est pas connu à l'avance.

### `do-while`

``` java
do {
    // Instructions exécutées au moins une fois
} while (condition);
```

La condition est vérifiée **après** l'exécution du bloc : la boucle
s'exécute donc au moins une fois.

### `break` et `continue`

  Mot-clé      Effet
  ------------ -------------------------------------------
  `break`      Sort immédiatement de la boucle.
  `continue`   Passe directement à l'itération suivante.

## Tableaux

### Déclaration et initialisation

``` java
int[] nombres = new int[5];       // Tableau de 5 entiers initialisés à 0
int[] valeurs = {1, 2, 3, 4, 5}; // Initialisation directe
String[] fruits = {"pomme", "kiwi"};
```

### Accès aux éléments

-   `nombres[0]` : premier élément (l'index commence à `0`).
-   `nombres.length` : nombre d'éléments du tableau --- `length` est un
    attribut, pas une méthode.
-   `nombres[nombres.length - 1]` : dernier élément, si le tableau n'est
    pas vide.

### Parcours d'un tableau

Avec un index :

``` java
for (int i = 0; i < t.length; i++) {
    System.out.println(t[i]);
}
```

Avec une boucle *for-each* :

``` java
for (int n : t) {
    System.out.println(n);
}
```

### À savoir

-   Un tableau de taille `5` possède les index `0` à `4`.
-   Accéder à `t[5]` dans un tableau de taille `5` déclenche une
    `ArrayIndexOutOfBoundsException`.
-   La taille d'un tableau est fixe après sa création.

## Méthodes

### Déclaration

``` java
static int additionner(int a, int b) {
    return a + b;
}
```

-   `static` : permet d'appeler la méthode depuis le contexte de la
    classe, sans créer d'instance de cette classe.
-   `int` : type de la valeur renvoyée.
-   `additionner` : nom de la méthode.
-   `int a, int b` : paramètres.
-   `return a + b;` : renvoie le résultat et termine l'exécution de la
    méthode.

### `void` et `return`

-   `void` : la méthode ne renvoie pas de valeur.
-   Avec un type de retour autre que `void`, la méthode doit renvoyer
    une valeur compatible avec ce type sur chaque chemin d'exécution qui
    se termine normalement.

### Surcharge (*overloading*)

Plusieurs méthodes peuvent porter le même nom si leurs listes de
paramètres diffèrent.

``` java
static void afficher(int n) {
    System.out.println(n);
}

static void afficher(String s) {
    System.out.println(s);
}
```

Le type de retour seul ne suffit pas à différencier deux méthodes
surchargées.

### Paramètres et arguments

-   **Paramètre** : variable déclarée dans la signature de la méthode,
    par exemple `a` dans `f(int a)`.
-   **Argument** : valeur transmise lors de l'appel, par exemple `3`
    dans `f(3)`.

## Pièges fréquents

-   `while (true)` sans condition de sortie ni `break` peut créer une
    boucle infinie.
-   Oublier de modifier le compteur d'une boucle peut créer une boucle
    infinie.
-   Oublier `break` dans un `switch` classique peut provoquer un
    *fall-through*.
-   Utiliser un index hors limites provoque une
    `ArrayIndexOutOfBoundsException`.
-   `nombres.length` est un attribut ; contrairement à une méthode, il
    ne s'écrit pas `nombres.length()`.
-   Une division entre deux entiers (`int`) tronque la partie décimale.

## Règles à retenir

1.  Les index d'un tableau commencent à `0`.
2.  Vérifier la condition d'arrêt et la progression du compteur dans
    chaque boucle.
3.  Choisir un type de retour adapté et renvoyer une valeur avec
    `return` si nécessaire.
4.  Utiliser des noms explicites et respecter les conventions de
    nommage.
5.  Distinguer les paramètres déclarés dans une méthode des arguments
    transmis lors de son appel.
