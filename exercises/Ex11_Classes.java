/**
 * EX11 - Classes et objets
 */
public class Ex11_Classes {
    public static void main(String[] args) {

        Personne alice = new Personne("Alice", 24);
        Personne bob = new Personne("Bob", 20);

        alice.sePresenter();
        bob.sePresenter();

        alice.anniversaire();
        alice.sePresenter();
    }
}

class Personne {
    String nom;
    int age;

    Personne(String nom, int age) {
        this.nom = nom;
        this.age = age;
    }

    void sePresenter() {
        System.out.println("Je suis " + nom + ", " + age + " ans.");
    }

    void anniversaire() {
        age++;
    }
}