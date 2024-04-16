package maps;

import java.util.HashMap;

public class FusionMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> map1 = new HashMap<Integer, String>();
		map1.put(1, "Rouge");
		map1.put(2, "Vert");
		map1.put(3, "Orange");
		// Création map2
		HashMap<Integer, String> map2 = new HashMap<Integer, String>();
		map2.put(4, "Blanc");
		map2.put(5, "Bleu");
		map2.put(6, "Orange");
		//TODO Développements à réaliser ci-dessous
		HashMap<Integer, String> map3 = new HashMap<Integer, String>();
		
		map3.putAll(map1);
		map3.putAll(map2);
		//  contient l’ensemble des données des 2 maps 
		for (int string : map3.keySet()) {
			System.out.println(string);
			
		}
	}

}
