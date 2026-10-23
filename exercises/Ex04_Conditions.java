/**
 * EX04 - Conditions
 * Énoncé :
 *   1. Vérifier si un nombre est positif, négatif ou nul.
 *   2. Vérifier si un nombre est pair ou impair.
 *   3. Afficher la mention d'un étudiant selon sa note (switch).
 */
public class Ex04_Conditions {
    public static void main(String[] args) {

        // 1. Positif / négatif / nul
        int nombre = -7;

        if (nombre > 0) {
            System.out.println(nombre + " est positif");
        } else if (nombre < 0) {
            System.out.println(nombre + " est négatif");
        } else {
            System.out.println("Le nombre " + nombre + " est nul");
        }

        // 2. Pair / impair
        int n = 8;

        if (n % 2 == 0) {
            System.out.println(n + " pair");
        } else {
            System.out.println(n + " impair");
        }

        // 3. Mention selon la note (switch-case)
        int note = 15;

        switch (note / 2) {   // 15/2 = 7 -> "Bien"
            case 10:
            case 9:
                System.out.println("Mention : excellent");
                break;
            case 8:
            case 7:
                System.out.println("Mention : bien");
                break;
            case 6:
                System.out.println("Mention : assez bien");
                break;
            case 5:
                System.out.println("Mention : passable");
                break;
            default:
                System.out.println("Mention : insuffisant");
        }

        // 4. Opérateurs logiques
        int age = 20;
        boolean permis = true;

        if (age >= 18 && permis) {
            System.out.println("peut conduire");
        } else {
            System.out.println("ne peut pas conduire");
        }
    }
}