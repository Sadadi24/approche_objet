package diginamic.recensement;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

import services.recensement.ServiceDepartement;
import services.recensement.ServiceRegion;
import services.recensement.ServiceVille;

public class ApplicationRecensement {

	public static void main(String[] args) throws IOException {
		List<Ville> villes = new Recensement().getVilles();

		Path path = Paths.get("/home/prtk527/Bureau/dev/recensement.csv");
		List<String> list = Files.readAllLines(path);
		list.remove(0);
		for (String value : list) {
			String[] tokens = value.split(";");
			String codeRegion = tokens[0];
			String nomRegion = tokens[1];
			String codeDep = tokens[2];
			String codeCommune = tokens[5];
			String nomCommune = tokens[6];
			String population = tokens[9].trim().replaceAll(" ", "");
			int popInt = Integer.parseInt(population);
			Ville ville = new Ville(codeRegion, nomRegion, codeDep, codeCommune, nomCommune, popInt);
			villes.add(ville);

		}
//			for (Ville ville : villes) {
//				System.out.println(ville.toString());
//			}
		Scanner scannerMenu = new Scanner(System.in);
		Scanner scanner = new Scanner(System.in);
		System.out.println("choisissez une option :");
		System.out.println(
				"option 1 : . Population d’une ville donnée \n" + "option 2 : .   Population d’une région donnée \n"
						+ "option 3: .  Population d’un département donné \n"
						+ "option 4: .  les 10 villes les plus peuplées d’un département\n"
						+ "option 5: .   les 10 régions les plus peuplées\n"
						+ "option 6: .   es 10 départements les plus peuplés\n"
						+ "option 7: .   les 10 villes les plus peuplées d’une region\n"
						+  "option 8:  les 10 villes les plus peuplées de France ");

		switch (scannerMenu.nextInt()) {

		case 1:

			ServiceVille serviceVille = new ServiceVille();
			serviceVille.traiter(villes, scanner);

			break;
		case 2:

			ServiceRegion serviceRegion = new ServiceRegion();
			serviceRegion.traiter(villes, scanner);
			break;
		case 3:

			ServiceDepartement serviceDepartement = new ServiceDepartement();
			serviceDepartement.traiter(villes, scanner);
			break;

		case 4:

			ServiceDepartement serviceDeptop10 = new ServiceDepartement();
			serviceDeptop10.top10VilleByDepartement(villes, scanner);
			break;

		case 5:

			ServiceRegion serviceRegionAff = new ServiceRegion();
			serviceRegionAff.afficher(villes);
			break;

		case 6:

			ServiceDepartement serviceDeptop10Aff = new ServiceDepartement();
			serviceDeptop10Aff.afficher(villes);
			break;
		case 7:

			ServiceRegion serviceRegionAffbyVille = new ServiceRegion();
			serviceRegionAffbyVille.top10VilleByRegion(villes, scanner);
			break;
			
		case 8:

			ServiceVille serviceVille2 = new ServiceVille();
			serviceVille2.afficher(villes);
			break;

		default:
			System.out.println("L'option choisit n'existe pas ");
			break;
		}
		scannerMenu.close();

//			ServiceVille serviceVille = new ServiceVille();
//			serviceVille.traiter(villes, scanner);
//			ServiceDepartement serviceDepartement = new ServiceDepartement();
//			serviceDepartement.traiter(villes, scanner);
//			ServiceRegion serviceRegion = new ServiceRegion();
//			serviceRegion.afficher(villes);
		// ServiceDepartement serviceDepartement = new ServiceDepartement();
		// serviceDepartement.afficher(villes);
		// serviceDepartement.top10VilleByDepartement(villes);

	}

}
