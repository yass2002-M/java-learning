/**
 * EX14 - Héritage
 * Énoncé :
 *   Créer une classe Vehicule avec une marque, une vitesseMax et une méthode afficher().
 *   Créer deux sous-classes Voiture et Moto.
 *   La Voiture a un nombre de portes, la Moto a un type (sportive, roadster).
 *   Chacune redéfinit afficher() avec @Override pour ajouter sa spécificité.
 *   Créer un véhicule de chaque type et les afficher.
 */
public class Ex14_Heritage {
    public static void main(String[] args) {

        Vehicule v1 = new Voiture("Renault", 180, 5);
        Vehicule v2 = new Moto("Yamaha", 220, "sportive");

        v1.afficher();
        v2.afficher();
    }
}

class Vehicule {
    protected String marque;
    protected int vitesseMax;

    Vehicule(String marque, int vitesseMax) {
        this.marque = marque;
        this.vitesseMax = vitesseMax;
    }

    void afficher() {
        System.out.println(marque + " — vitesse max " + vitesseMax + " km/h");
    }
}

class Voiture extends Vehicule {
    private int portes;

    Voiture(String marque, int vitesseMax, int portes) {
        super(marque, vitesseMax);
        this.portes = portes;
    }

    @Override
    void afficher() {
        System.out.println(marque + " (voiture " + portes + " portes) — " + vitesseMax + " km/h");
    }
}

class Moto extends Vehicule {
    private String type;

    Moto(String marque, int vitesseMax, String type) {
        super(marque, vitesseMax);
        this.type = type;
    }

    @Override
    void afficher() {
        System.out.println(marque + " (moto " + type + ") — " + vitesseMax + " km/h");
    }
}