import java.util.Scanner;

/**
 * EX10 - Gestionnaire de contacts
 * Menu interactif : ajouter, lister, rechercher, supprimer.
 * Stockage dans deux tableaux parallèles (noms / numeros).
 */
public class Ex10_Contacts {

    static final int MAX = 100;
    static String[] noms = new String[MAX];
    static String[] numeros = new String[MAX];
    static int nbContacts = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean continuer = true;

        while (continuer) {
            afficherMenu();
            int choix = sc.nextInt();
            sc.nextLine();

            switch (choix) {
                case 1:
                    ajouter(sc);
                    break;
                case 2:
                    lister();
                    break;
                case 3:
                    rechercher(sc);
                    break;
                case 4:
                    supprimer(sc);
                    break;
                case 5:
                    continuer = false;
                    break;
                default:
                    System.out.println("Choix invalide.");
            }
            System.out.println();
        }

        System.out.println("Au revoir.");
        sc.close();
    }

    static void afficherMenu() {
        System.out.println("--- Contacts ---");
        System.out.println("1. Ajouter");
        System.out.println("2. Lister");
        System.out.println("3. Rechercher");
        System.out.println("4. Supprimer");
        System.out.println("5. Quitter");
        System.out.print("Choix : ");
    }

    static void ajouter(Scanner sc) {
        if (nbContacts >= MAX) {
            System.out.println("Memoire pleine.");
            return;
        }
        System.out.print("Nom : ");
        String nom = sc.nextLine().trim();

        if (nom.isEmpty()) {
            System.out.println("Nom vide, annulé.");
            return;
        }

        System.out.print("Numero : ");
        String numero = sc.nextLine().trim();

        noms[nbContacts] = nom;
        numeros[nbContacts] = numero;
        nbContacts++;
        System.out.println("Ajouté : " + nom);
    }

    static void lister() {
        if (nbContacts == 0) {
            System.out.println("Aucun contact.");
            return;
        }
        for (int i = 0; i < nbContacts; i++) {
            System.out.println((i + 1) + ". " + noms[i] + " - " + numeros[i]);
        }
    }

    static void rechercher(Scanner sc) {
        System.out.print("Nom à rechercher : ");
        String recherche = sc.nextLine().trim().toLowerCase();

        boolean trouve = false;
        for (int i = 0; i < nbContacts; i++) {
            if (noms[i].toLowerCase().contains(recherche)) {
                System.out.println(noms[i] + " - " + numeros[i]);
                trouve = true;
            }
        }
        if (!trouve) {
            System.out.println("Aucun resultat.");
        }
    }

    static void supprimer(Scanner sc) {
        System.out.print("Nom à supprimer : ");
        String cible = sc.nextLine().trim();

        for (int i = 0; i < nbContacts; i++) {
            if (noms[i].equalsIgnoreCase(cible)) {
                for (int j = i; j < nbContacts - 1; j++) {
                    noms[j] = noms[j + 1];
                    numeros[j] = numeros[j + 1];
                }
                noms[nbContacts - 1] = null;
                numeros[nbContacts - 1] = null;
                nbContacts--;
                System.out.println("Supprimé : " + cible);
                return;
            }
        }
        System.out.println("Contact introuvable.");
    }
}