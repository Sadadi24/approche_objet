package services.recensement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import diginamic.recensement.Recensement;
import diginamic.recensement.Region;
import diginamic.recensement.Ville;

public class ServiceVille  extends MenuService{
	private int population;

	

	public int getPopulation() {
		return population;
	}



	@Override
	public void traiter(List<Ville> villes, Scanner scanner) {
	    System.out.println("Entrez le nom de la ville : ");
	    String userInput = scanner.nextLine();
	    boolean villeTrouvee = false;

	    for (Ville ville : villes) {
	        if (ville.getNomCommune().equalsIgnoreCase(userInput)) {
	            population = ville.getPopulation();
	            villeTrouvee = true;
	            scanner.close();
	            break; // Pas besoin de continuer la recherche une fois que la ville est trouvée
	        }
	    }

	    if (villeTrouvee) {
	        System.out.println("La population de " + userInput + " est de : " + population);
	    } else {
	        System.out.println("Ville non trouvée.");
	        scanner.close();
	    }
	}



	@Override
	public void  afficher(List<Ville> villes) {
		// TODO Auto-generated method stub
		Collections.sort(villes);
		List<Ville> listVille = new ArrayList();
		for (Ville ville : villes) {
			listVille.add(ville);
		}
		
		List<Ville> top10VillesFrance = listVille.subList(0, Math.min(10, villes.size()));
		
		for (Ville ville : top10VillesFrance) {
			System.out.println(ville.getNomCommune() + ": " + ville.getPopulation());
			
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
	

	
	
	


