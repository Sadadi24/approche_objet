package listes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class TestListeInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> listInt = new ArrayList<>(Arrays.asList(-1, 5, 7, 3, -2, 4, 8, 5));
		
		// Affichez tous les éléments de la liste
	 for(  Integer value : listInt) {
		 System.out.print(value + ",");
		 
	 }
	 // Affichez la taille de la liste
	 System.out.print(listInt.size());
	 
	 
	 
	 //Recherchez et affichez le plus grand élément de la liste
	 
	 int max = 0;
	for(Integer maxValue : listInt)
		
		 if(maxValue> max) {
			 max = maxValue;
		 }
	System.out.println("valeur Max :");
	 System.out.println(max);
	 
	 // Supprimez le plus petit élément de la liste et affichez le résultat
	 
	 int min =Collections.min(listInt);
	 System.out.println("le plus petite valeur de la liste :");
	 System.out.println(min);
	 
	 
	 // Recherchez tous les éléments négatifs et modifiez-les de manière à ce qu’ils deviennent positifs.

	 for( int i = 0; i< listInt.size() ; i++) {
		 int currentValue = listInt.get(i);
		 int newValue = Math.abs(currentValue);
		 if(currentValue<0) {
			 listInt.set(i, newValue);
			 
			 
		 }
	 }
	 
	 // Affichez enfin la liste résultante
	 System.out.println("\n"+ "Transforme  à une valeur postive");
	 for( Integer val : listInt) {
		 System.out.print(val + ",");
	 }
	 
	}

}
