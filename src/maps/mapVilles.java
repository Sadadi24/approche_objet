package maps;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import fichier.Ville;

public class mapVilles {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		HashMap<Integer, String> mapVilles = new HashMap<>();
		HashMap<String, Ville> mapVilles2 = new HashMap<>();
		mapVilles.put(13, "Marseille");
		mapVilles.put(34, "Montpellier");
		mapVilles.put(44, "Nantes");
		mapVilles.put(75, "Paris");
		mapVilles.put(31, "Toulouse");
		mapVilles.put(59, "Lille");
		mapVilles.put(69, "Lyon");
		mapVilles.put(33, "Bordeaux");
		
		
		Path path = Paths.get("/home/prtk527/Bureau/dev/recensement.csv");
		List<String> list = Files.readAllLines(path);
		ArrayList<Ville> villes = new ArrayList<>();
		ArrayList<Ville> villesMap = new ArrayList<>();
		list.remove(0);
		for (String val : list) {
			String[] tokens = val.split(";");
			String nom =tokens[6];
			String departement =tokens[2];
			String region =tokens[1];
			String population =tokens[9].trim().replaceAll(" ","");
			int popInt = Integer.parseInt(population);
			Ville ville = new Ville(nom,departement,region,popInt);
			villes.add(ville);
		}
		for (Ville ville : villes) {
			
			mapVilles2.put(ville.getNom(),ville);
		}
		System.out.println("affiche map des villes");
		for (String ville : mapVilles2.keySet()) {
			System.out.println(ville);
			
		}
		
		// afficher l'ensemble des clés contenues dans la map
		for (int map : mapVilles.keySet()) {
			System.out.println(map);
		}
		
		// Recherchez et supprimez la ville qui a le moins d’habitants
		Iterator<Map.Entry<String, Ville>> iterator = mapVilles2.entrySet().iterator();
		
		// Mettre en place une boucle pour afficher l'ensemble des valeurs contenues dans la map
		for (String  map : mapVilles.values()) {
			System.out.println(map);
			
		}
		// Afficher la taille de la map
		System.out.println(mapVilles.size());
	
	}

}
