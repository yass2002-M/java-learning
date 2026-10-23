/**
 * EX07 - Méthodes
 * 1. Méthode qui additionne deux entiers
 * 2. Méthode qui calcule la moyenne d'un tableau
 * 3. Méthode qui renvoie le plus grand de deux nombres
 * 4. Méthode qui dit si un nombre est pair
 * 5. Surcharge : afficher(int) et afficher(String)
 * 6. Méthode qui inverse une chaîne
 */
public class Ex07_Methodes {

    static int additionner(int a, int b) {
        return a + b;
    }

    static double moyenne(int[] tab) {
        int somme = 0;
        for (int n : tab) somme += n;
        return (double) somme / tab.length;
    }

    static int plusGrand(int a, int b) {
        return a > b ? a : b;
    }

    static boolean estPair(int n) {
        return n % 2 == 0;
    }

    static void afficher(int n) {
        System.out.println("Entier : " + n);
    }

    static void afficher(String s) {
        System.out.println("Chaine : " + s);
    }

    static String inverser(String s) {
        String resultat = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            resultat += s.charAt(i);
        }
        return resultat;
    }

    public static void main(String[] args) {
        System.out.println(additionner(3, 5));

        int[] notes = {12, 15, 9, 18, 14};
        System.out.println(moyenne(notes));

        System.out.println(plusGrand(7, 12));
        System.out.println(plusGrand(20, 4));

        System.out.println(estPair(4));
        System.out.println(estPair(7));

        afficher(42);
        afficher("bonjour");

        System.out.println(inverser("Java"));
    }
}