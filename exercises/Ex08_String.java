/**
 * EX08 - String
 */
public class Ex08_String {
    public static void main(String[] args) {

        String texte = "Bonjour le monde";

        // longueur + caractères
        System.out.println("Longueur : " + texte.length());
        System.out.println("Premier : " + texte.charAt(0));
        System.out.println("Extrait : " + texte.substring(0, 7));

        // casse
        System.out.println("Maj : " + texte.toUpperCase());
        System.out.println("Min : " + texte.toLowerCase());

        // == vs equals
        String a = "Java";
        String b = new String("Java");
        System.out.println("a == b : " + (a == b));
        System.out.println("a.equals(b) : " + a.equals(b));

        // recherche
        System.out.println("Contient 'jour' : " + texte.contains("jour"));
        System.out.println("Commence par 'Bon' : " + texte.startsWith("Bon"));

        // remplacement
        System.out.println(texte.replace("monde", "Java"));

        // split
        String csv = "pomme,banane,kiwi";
        String[] mots = csv.split(",");
        for (String mot : mots) {
            System.out.println(mot);
        }

        // immutable
        String s = "hello";
        String sMaj = s.toUpperCase();
        System.out.println(s);
        System.out.println(sMaj);
    }
}