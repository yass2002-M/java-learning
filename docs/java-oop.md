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