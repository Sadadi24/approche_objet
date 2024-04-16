package services.recensement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import diginamic.recensement.Departement;
import diginamic.recensement.Region;
import diginamic.recensement.Ville;

public class ServiceDepartement extends MenuService {
	private int population;
	private List<Departement> departements = new ArrayList<>();

	@Override
	public void traiter(List<Ville> villes, Scanner scanner) {
		// TODO Auto-generated method stub
		System.out.println("Entrez le code du département : ");
		String userInput = scanner.nextLine();
		boolean departementTrouvee = false;

		for (Ville ville : villes) {
			if (ville.getCodeDepartement().equalsIgnoreCase(userInput)) {
				population += ville.getPopulation();
				departementTrouvee = true;

			}

		}
		if (departementTrouvee) {
			System.out.println("La population de " + userInput + " est de : " + population);
		} else {
			System.out.println("Départeùment non trouvée.");
			scanner.close();
		}

	}

	@Override
	public void afficher(List<Ville> villes) {
		// TODO Auto-generated method stub
		Map<String, Integer> sommeValeurDepartement = new HashMap();
		for (Ville ville : villes) {

			String code = ville.getCodeDepartement();
			int population = ville.getPopulation();

			sommeValeurDepartement.put(code, sommeValeurDepartement.getOrDefault(code, 0) + population);

		}

		for (Map.Entry<String, Integer> dep : sommeValeurDepartement.entrySet()) {
			departements.add(new Departement(dep.getValue(), dep.getKey()));

		}
		Collections.sort(departements);
		List<Departement> top10Dep = departements.subList(0, Math.min(10, departements.size()));

		for (Departement dep : top10Dep) {
			System.out.println(
					"Le " + dep.getCodeDepartement() + " a " + "une population totale de :" + dep.getPopulation());

		}
	}

	public void top10VilleByDepartement(List<Ville> villes, Scanner scanner) {
		System.out.println("Entrez le code du département : ");
		Collections.sort(villes);
		Map<String, List<Ville>> sommeValeurDepartement = new HashMap();
		List<Ville> listVille = new ArrayList();
		
		// Map<String, int> Departlist = new HashMap();
		String userInput = scanner.nextLine();
		for (Ville ville : villes) {
//				String code = ville.getCodeDepartement();
//				int population = ville.getPopulation();
//                 listVille.add(ville);
			if (ville.getCodeDepartement().equalsIgnoreCase(userInput)) {
				listVille.add(ville);
				// sommeValeurDepartement.put(code,sommeValeurDepartement.getOrDefault(code,
				// listVille) );

			}

		}
		List<Ville> top10VillesByDep = listVille.subList(0, Math.min(10, villes.size()));
		scanner.close();
		for (Ville ville : top10VillesByDep) {
			System.out.println(ville.getNomCommune() + " : " + ville.getPopulation());
			
		}
		

	}
}
