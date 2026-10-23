/**
 * EX05 - Boucles
 * 1. Afficher de 1 à 10
 * 2. Somme de 1 à 100
 * 3. Table de 7
 * 4. Descompte de 5 à 0
 * 5. do-while sur mot de passe
 * 6. Pairs avec continue
 * 7. Premier multiple de 7 > 50 avec break
 */
public class Ex05_Boucles {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        int somme = 0;
        for (int i = 1; i <= 100; i++) {
            somme += i;
        }
        System.out.println("Somme 1-100 = " + somme);

        for (int i = 1; i <= 10; i++) {
            System.out.println("7 x " + i + " = " + (7 * i));
        }

        int compteur = 5;
        while (compteur > 0) {
            System.out.println(compteur);
            compteur--;
        }
        System.out.println("Decollage !");

        String[] tentatives = {"1234", "admin", "secret"};
        int essais = 0;
        String motDePasse;
        do {
            motDePasse = tentatives[essais];
            essais++;
        } while (!motDePasse.equals("secret") && essais < tentatives.length);
        System.out.println("Trouvé apris " + essais + " essai(s)");

        for (int i = 1; i <= 20; i++) {
            if (i % 2 != 0) continue;
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 51; i < 1000; i++) {
            if (i % 7 == 0) {
                System.out.println("Premier multiple de 7 > 50 : " + i);
                break;
            }
        }
    }
}