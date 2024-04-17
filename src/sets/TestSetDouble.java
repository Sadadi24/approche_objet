package sets;

import java.util.HashSet;
import java.util.Set;

public class TestSetDouble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Set<Double> setDouble = new HashSet<>();
		  setDouble.add(1.5);
	        setDouble.add(8.25);
	        setDouble.add(-7.32);
	        setDouble.add(13.3);
	        setDouble.add(-12.45);
	        setDouble.add(48.5);
	        setDouble.add(0.01);
	        
	        System.out.println("Contenu de la collection :");
	        for (Double num : setDouble) {
	            System.out.println(num);
	        }

	        // Recherche du plus grand élément de la collection
	        double max = Double.MIN_VALUE;
	        for (double num : setDouble) {
	            if (num > max) {
	                max = num;
	            }
	        }
	        System.out.println("Le plus grand élément de la collection : " + max);

	        // Recherche du plus petit élément de la collection
	        double min = Double.MAX_VALUE;
	        for (double num : setDouble) {
	            if (num < min) {
	                min = num;
	            }
	        }

	        // Suppression du plus petit élément de la collection
	        setDouble.remove(min);

	        // Affichage du contenu de la collection modifiée
	        System.out.println("Contenu de la collection après suppression du plus petit élément :");
	        for (Double num : setDouble) {
	            System.out.println(num);
	        }
	}

}
