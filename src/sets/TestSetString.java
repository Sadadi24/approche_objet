package sets;

import java.util.HashSet;
import java.util.Set;

public class TestSetString {
    public static void main(String[] args) {
        // Instanciation d'un HashSet de String avec les pays donnés
        Set<String> pays = new HashSet<>();
        pays.add("USA");
        pays.add("France");
        pays.add("Allemagne");
        pays.add("UK");
        pays.add("Italie");
        pays.add("Japon");
        pays.add("Chine");
        pays.add("Russie");
        pays.add("Inde");

        // Recherche du pays ayant le plus grand nombre de lettres
        String paysLePlusLong = "";
        for (String paysActuel : pays) {
            if (paysActuel.length() > paysLePlusLong.length()) {
                paysLePlusLong = paysActuel;
            }
        }

        // Suppression du pays ayant le plus grand nombre de lettres
        pays.remove(paysLePlusLong);

        // Affichage du contenu de la collection modifiée
        System.out.println("Contenu de la collection après suppression du pays le plus long :");
        for (String paysActuel : pays) {
            System.out.println(paysActuel);
        }
    }
}
