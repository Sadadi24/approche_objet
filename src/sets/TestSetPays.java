package sets;

import java.util.HashSet;
import java.util.Set;

public class TestSetPays {
    public static void main(String[] args) {
       
        Set<Pays> paysSet = new HashSet<>();
        
       
        paysSet.add(new Pays("USA", 331449281, 65112));
        paysSet.add(new Pays("France", 65273511, 45336));
        paysSet.add(new Pays("Allemagne", 83783942, 53143));
        paysSet.add(new Pays("UK", 67886011, 42943));
        paysSet.add(new Pays("Italie", 60461826, 40180));
        paysSet.add(new Pays("Japon", 125584838, 40298));
        paysSet.add(new Pays("Chine", 1444216107, 10261));
        paysSet.add(new Pays("Russie", 145912025, 10956));
        paysSet.add(new Pays("Inde", 1393409038, 2104));

       
        Pays paysPIBParHabitantMax = paysSet.stream()
                .max((p1, p2) -> Double.compare(p1.getPIBParHabitant(), p2.getPIBParHabitant()))
                .orElse(null);
        System.out.println("Pays avec le PIB/habitant le plus important : " + paysPIBParHabitantMax.getNom());

     
        Pays paysPIBTotalMax = paysSet.stream()
                .max((p1, p2) -> Double.compare(p1.getPIBTotal(), p2.getPIBTotal()))
                .orElse(null);
        System.out.println("Pays avec le PIB total le plus important : " + paysPIBTotalMax.getNom());

      
        Pays paysPIBTotalMin = paysSet.stream()
                .min((p1, p2) -> Double.compare(p1.getPIBTotal(), p2.getPIBTotal()))
                .orElse(null);

      
        if (paysPIBTotalMin != null) {
            paysPIBTotalMin.setNom(paysPIBTotalMin.getNom().toUpperCase());
        }

       
        paysSet.remove(paysPIBTotalMin);

       
        System.out.println("Contenu de la collection après modification :");
        for (Pays pays : paysSet) {
            System.out.println("Pays : " + pays.getNom() + ", Nombre d'habitants : " + pays.getNombreHabitants() + ", PIB total : " + pays.getPIBTotal());
        }
    }
}
