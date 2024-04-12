package fichier;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LectureFichier {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Path path = Paths.get("/home/prtk527/Bureau/dev/recensement.csv");
		List<String> list = Files.readAllLines(path);
		ArrayList<Ville> villes = new ArrayList<>();
		list.remove(0);
		for( String value : list) {
			String[] tokens = value.split(";");
			String nom =tokens[6];
			String departement =tokens[2];
			String region =tokens[1];
			String population =tokens[9].trim().replaceAll(" ","");
			int popInt = Integer.parseInt(population);
			Ville ville = new Ville(nom,departement,region,popInt);
			villes.add(ville);
			
			
		}
		Path path2 = Paths.get("/home/prtk527/Bureau/dev/newrecensement1.csv");
		ArrayList<String> villes2 = new ArrayList<>();
		for(int i = 1; i <villes.size(); i++) {
			
			if( villes.get(i).getPopulation() > 25000) {
				villes2.add(villes.get(i).toString());
			}
		}
		
	    Files.write(path2, villes2);
		
        System.out.println(list.size());
        System.out.println(villes2.size());
	}

}
