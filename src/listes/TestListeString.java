package listes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class TestListeString {

	public static void main(String[] args) {
		// Recherchez la ville dans cette liste qui a le plus grand nombre de lettres
		
		ArrayList<String> villes = new ArrayList<>(Arrays.asList("Nice", "Carcassonne", "Narbonne", "Lyon", "Foix", "Pau"," Marseille", "Tarbes"));
		String villeLong= villes.get(0);
		for(String ville : villes) {
			
			if( villeLong.length() <ville.length()) {
				villeLong = ville;
			}
		}
		System.out.println(villeLong);
		
		
		// Modifiez le contenu de la liste de manière à mettre tous les noms de villes en
		//majuscules
 for (int i =0;i< villes.size();i++) {
	 String currentValue = villes.get(i);
	 String newValue = villes.get(i).toUpperCase();
	 villes.set(i, newValue);
	 
	 
 }
 for(String value : villes) {
	 System.out.println(value);
 }
		// Supprimez de la liste les villes dont le nom commence par la lettre N
 
 Iterator<String> supValue = villes.iterator();
 
 while(supValue.hasNext()) {
	 String ville = supValue.next();
	 if(ville.startsWith("N")) {
		 supValue.remove();
		 
		 
	 }
 }
 System.out.println("\n" + "sans ville qui commence par la letter N");
 for(String value : villes)
 System.out.println(value);
 
 
 //Affichez la liste résultante
	}

}
