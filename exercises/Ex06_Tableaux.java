/**
 * EX06 - Tableaux
 * 1. Afficher un tableau
 * 2. Somme et moyenne
 * 3. Min et max
 * 4. Compter les nombres pairs
 * 5. Inverser
 * 6. for-each sur String[]
 */
public class Ex06_Tableaux {
    public static void main(String[] args) {

        int[] nombres = {12, 5, 8, 21, 3, 17, 9, 30, 4, 15};

        for (int i = 0; i < nombres.length; i++) {
            System.out.print(nombres[i] + " ");
        }
        System.out.println();

        int somme = 0;
        for (int n : nombres) somme += n;
        double moyenne = (double) somme / nombres.length;
        System.out.println("Somme = " + somme);
        System.out.println("Moyenne = " + moyenne);

        int min = nombres[0], max = nombres[0];
        for (int n : nombres) {
            if (n < min) min = n;
            if (n > max) max = n;
        }
        System.out.println("Min = " + min);
        System.out.println("Max = " + max);

        int pairs = 0;
        for (int n : nombres) {
            if (n % 2 == 0) pairs++;
        }
        System.out.println("Pairs = " + pairs);

        int[] inverse = new int[nombres.length];
        for (int i = 0; i < nombres.length; i++) {
            inverse[i] = nombres[nombres.length - 1 - i];
        }
        for (int n : inverse) System.out.print(n + " ");
        System.out.println();

        String[] fruits = {"pomme", "banane", "orange", "kaki"};
        for (String fruit : fruits) {
            System.out.println(fruit + " (" + fruit.length() + ")");
        }
    }
}