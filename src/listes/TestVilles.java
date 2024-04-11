package listes;

import java.util.ArrayList;
import java.util.List;

public class TestVilles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Ville> villes = new ArrayList<>(List.of(
	            new Ville("Nice", 343000),
	            new Ville("Carcassonne", 47800),
	            new Ville("Narbonne", 53400),
	            new Ville("Lyon", 484000),
	            new Ville("Foix", 9700),
	            new Ville("Pau", 77200),
	            new Ville("Marseille", 850700),
	            new Ville("Tarbes", 40600)
	        ));
		
		/// Recherchez et affichez la ville la plus peuplée
		System.out.println("la ville la plus peuplée :");
		int maxVal = 0;
		String val = "";
		for (Ville ville : villes) {
			if(maxVal<ville.getNbHabitants()) {
				maxVal = ville.getNbHabitants();
				val = ville.getNom();
				
			}
            
        }
		System.out.println(val);
		
		// Supprimez la ville la moins peuplée
		System.out.println("la ville la moins peuplée :");
		for (Ville ville : villes) {
			if(maxVal>ville.getNbHabitants()) {
				maxVal = ville.getNbHabitants();
				val = ville.getNom();
				
			}
            
        }
		
		System.out.println(val);
		
		//Modifiez les villes de plus de 100 000 habitants en mettant leur nom en majuscules
		System.out.println("les villes de plus de 100 000 habitants :");
		for (Ville ville : villes) {
			if(ville.getNbHabitants()>100000) {
				ville.setNom( ville.getNom().toUpperCase());
				System.out.print(ville.getNom() + ",");
			
				
			}
            
        }
	

	}
	
		
	
	
	
	

}
