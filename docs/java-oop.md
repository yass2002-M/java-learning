# Java — POO

## Concepts clés
- **Classe** : modèle (le plan).
- **Objet** : instance concrète d'une classe.
- **Attribut** : donnée de l'objet.
- **Méthode** : action de l'objet.
- **Constructeur** : méthode spéciale appelée lors de la création avec `new`.

## Créer un objet

```java
Personne p = new Personne("Alice", 25);

p.nom;
p.sePresenter();
```

## Créer une classe

```java
public class Personne {
    String nom;
    int age;

    Personne(String nom, int age) {
        this.nom = nom;
        this.age = age;
    }

    void sePresenter() {
        System.out.println("Je suis " + nom + ", " + age + " ans.");
    }
}
```

## À retenir
- **`this`** : désigne l'objet courant. `this.nom` correspond à l'attribut, tandis que `nom` correspond au paramètre du constructeur.
- **Chaque objet possède ses propres valeurs** : `alice.age` et `bob.age` sont indépendants.
- **Fichier `.java`** : il peut contenir plusieurs classes, mais une seule classe de premier niveau peut être `public`. Son nom doit correspondre au nom du fichier.

## Encapsulation

Les attributs sont `private` pour empêcher l'accès direct de l'extérieur.
On les lit ou modifie via des **getters** et **setters**.

```java
class Compte {
    private double solde;

    double getSolde() {
        return solde;
    }

    void deposer(double m) {
        if (m <= 0) return;
        solde += m;
    }
}

``` 

## Héritage


Une classe peut hériter d'une autre avec `extends`. Elle récupère ses attributs et méthodes.
- `super(nom)` appelle le constructeur du parent
- `@Override` pour redéfinir une méthode du parent
- `protected` = accessible dans les sous-classes



```java

class Animal {
protected String nom;
Animal(String nom) { this.nom = nom; }
void manger() { System.out.println(nom + " mange."); }
void parler() { System.out.println(nom + " fait un bruit."); }
}

class Chien extends Animal {
Chien(String nom) { super(nom); }
@Override
void parler() { System.out.println(nom + " aboie."); }
}
```


## Polymorphisme

Un objet de type parent peut contenir un objet d'une sous-classe :


```java
Animal a = new Chien("Rex");
a.parler();   
```