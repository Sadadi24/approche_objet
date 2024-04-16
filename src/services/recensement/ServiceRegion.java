package services.recensement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import diginamic.recensement.Region;
import diginamic.recensement.Ville;

public class ServiceRegion extends MenuService {
	private int population;
	private List<Region> regions = new ArrayList<>();

	@Override
	public void traiter(List<Ville> villes, Scanner scanner) {
		System.out.println("Entrez le nom de la region : ");
		String userInput = scanner.nextLine();
		boolean villeTrouvee = false;

		for (Ville ville : villes) {
			if (ville.getNomRegion().equalsIgnoreCase(userInput)) {
				population += ville.getPopulation();
				villeTrouvee = true;

			}
		}

		if (villeTrouvee) {
			scanner.close();
			System.out.println("La population de " + userInput + " est de : " + population);
		} else {
			System.out.println("Region non trouvée.");
			scanner.close();

		}
	}

	@Override
	public void afficher(List<Ville> villes) {
		// TODO Auto-generated method stub

		Map<String, Integer> sommeValeurparREgion = new HashMap();
		for (Ville ville : villes) {
			// regions.add(new Region(ville.getNomRegion(), pop));

			String nom = ville.getNomRegion();
			int population = ville.getPopulation();

			sommeValeurparREgion.put(nom, sommeValeurparREgion.getOrDefault(nom, 0) + population);

		}

		for (Map.Entry<String, Integer> region : sommeValeurparREgion.entrySet()) {
			regions.add(new Region(region.getKey(), region.getValue()));

		}
		Collections.sort(regions);
		List<Region> top10Region = regions.subList(0, Math.min(10, regions.size()));

		for (Region region : top10Region) {
			System.out.println(region.toString());

		}

	}
	
	public void top10VilleByRegion(List<Ville> villes, Scanner scanner) {
		System.out.println("Entrez le nom de la region : ");
		Collections.sort(villes);
		Map<String, List<Ville>> sommeValeurDepartement = new HashMap();
		List<Ville> listVille = new ArrayList();
		
		// Map<String, int> Departlist = new HashMap();
		String userInput = scanner.nextLine();
		for (Ville ville : villes) {
//				String code = ville.getCodeDepartement();
//				int population = ville.getPopulation();
//                 listVille.add(ville);
			if (ville.getNomRegion().equalsIgnoreCase(userInput)) {
				listVille.add(ville);
				
			}

		}
		List<Ville> top10VillesByRegion = listVille.subList(0, Math.min(10, villes.size()));
		scanner.close();
		for (Ville ville : top10VillesByRegion) {
			System.out.println(ville.getNomCommune() + " : " + ville.getPopulation());
		}

	}

}
