import java.util.Scanner;

/**
 * EX09 - Scanner
 * Lire des entrées utilisateur.
 */
public class Ex09_Scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Lire un entier
        System.out.print("Ton âge : ");
        int age = sc.nextInt();
        sc.nextLine(); // vide le buffer

        // string
        System.out.print("Ton nom : ");
        String nom = sc.nextLine();

        // decimal
        System.out.print("Ta taille (m) : ");
        double taille = sc.nextDouble();

        System.out.println("---");
        System.out.println("Nom : " + nom);
        System.out.println("Âge : " + age);
        System.out.println("Taille : " + taille);

        sc.close();
    }
}