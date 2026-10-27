/**
 * EX13 - Encapsulation
 * Énoncé :
 *   Créer une classe Compte avec un solde privé.
 *   - deposer(montant) : refuse si montant <= 0
 *   - retirer(montant) : refuse si montant <= 0 ou si solde insuffisant
 *   - getSolde() : renvoie le solde
 *   Tester avec plusieurs opérations valides et invalides.
 */
public class Ex13_Encapsulation {
    public static void main(String[] args) {

        Compte c = new Compte("Alice");

        c.deposer(100);
        c.deposer(-50);
        c.retirer(30);
        c.retirer(500);
        c.retirer(-10);

        System.out.println("Solde final : " + c.getSolde());
    }
}

class Compte {
    private String titulaire;
    private double solde;

    Compte(String titulaire) {
        this.titulaire = titulaire;
        this.solde = 0;
    }

    void deposer(double montant) {
        if (montant <= 0) {
            System.out.println("Dépôt invalide.");
            return;
        }
        solde += montant;
        System.out.println("Dépot de " + montant + " ok.");
    }

    void retirer(double montant) {
        if (montant <= 0) {
            System.out.println("Retrait invalide.");
            return;
        }
        if (montant > solde) {
            System.out.println("Sold insuffisant.");
            return;
        }
        solde -= montant;
        System.out.println("Retrait de " + montant + " ok.");
    }

    double getSolde() {
        return solde;
    }

    String getTitulaire() {
        return titulaire;
    }
}