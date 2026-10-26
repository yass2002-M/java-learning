import java.util.Scanner;

/**
 * EX12 - Lampe
 * Énoncé :
 *   Gérer 5 lampes dans un tableau. Chaque lampe a une pièce,
 *   un état allumée/éteinte et une intensité (1-3).
 *   Menu console :
 *     1. Allumer une lampe
 *     2. Éteindre une lampe
 *     3. Changer l'intensité d'une lampe
 *     4. Afficher toutes les lampes
 *     5. Quitter
 *   On choisit la lampe par son numéro (1 à 5).
 *   L'intensité ne peut être changée que si la lampe est allumée.
 */
public class Ex12_Lampe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Lampe[] lampes = new Lampe[5];
        lampes[0] = new Lampe("Salon");
        lampes[1] = new Lampe("Cuisine");
        lampes[2] = new Lampe("Chambre");
        lampes[3] = new Lampe("Couloir");
        lampes[4] = new Lampe("Salle de bain");

        boolean continuer = true;

        while (continuer) {
            System.out.println("\n1. Allumer une lampe");
            System.out.println("2. Éteindre une lampe");
            System.out.println("3. Changer l'intensité");
            System.out.println("4. Afficher toutes");
            System.out.println("5. Quitter");
            System.out.print("Choix : ");
            int choix = sc.nextInt();

            switch (choix) {
                case 1:
                    System.out.print("Numéro (1-5) : ");
                    int a = sc.nextInt() - 1;
                    if (valide(a)) lampes[a].allumer();
                    break;
                case 2:
                    System.out.print("Numéro (1-5) : ");
                    int e = sc.nextInt() - 1;
                    if (valide(e)) lampes[e].eteindre();
                    break;
                case 3:
                    System.out.print("Numéro (1-5) : ");
                    int i = sc.nextInt() - 1;
                    if (valide(i)) {
                        System.out.print("Intensité (1-3) : ");
                        int val = sc.nextInt();
                        lampes[i].changerIntensite(val);
                    }
                    break;
                case 4:
                    for (int k = 0; k < lampes.length; k++) {
                        System.out.print((k + 1) + ". ");
                        lampes[k].afficher();
                    }
                    break;
                case 5:
                    continuer = false;
                    break;
                default:
                    System.out.println("Choix invalide.");
            }
        }

        sc.close();
    }

    static boolean valide(int i) {
        if (i < 0 || i > 4) {
            System.out.println("Numéro invalide.");
            return false;
        }
        return true;
    }
}

class Lampe {
    String piece;
    boolean allumee;
    int intensite;

    Lampe(String piece) {
        this.piece = piece;
        this.allumee = false;
        this.intensite = 1;
    }

    void allumer() {
        allumee = true;
        System.out.println(piece + " allumée.");
    }

    void eteindre() {
        allumee = false;
        System.out.println(piece + " éteinte.");
    }

    void changerIntensite(int valeur) {
        if (!allumee) {
            System.out.println("La lampe est éteinte.");
            return;
        }
        if (valeur < 1 || valeur > 3) {
            System.out.println("Intensité invalide (1-3).");
            return;
        }
        intensite = valeur;
        System.out.println(piece + " : intensité " + intensite + ".");
    }

    void afficher() {
        if (allumee) {
            System.out.println(piece + " : allumée (intensité " + intensite + "/3)");
        } else {
            System.out.println(piece + " : éteinte");
        }
    }
}