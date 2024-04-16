package fichier;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CreerFichier {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Path path = Paths.get("/home/prtk527/Bureau/dev/recensement.csv");
		Path newPath = Paths.get("/home/prtk527/Bureau/dev/recensement1.csv");
		Path pathDep = Paths.get("/home/prtk527/Bureau/dev/recensementDep.csv");
		List<String> list = Files.readAllLines(path);
		ArrayList<String>newList = new ArrayList<>();
		ArrayList<String> listDept = new ArrayList<>();

		/*
			for (int i = 0; i < 100; i++) {
				newList.add(list.get(i));
				
			}
			Files.write(newPath, newList);
			*/
		String[] tokenstr = list.get(0).split(";");
		String  codeDep = tokenstr[0];
		String pop = tokenstr[9];
		String valueEntete = codeDep + ";"+ pop;
		listDept.add(valueEntete);
		//list.remove(0);
		for (String dep : list) {
//			String[] tokens = dep.split(";");
//			String code =tokens[0];
//			String population = tokens[tokens.length-1].trim().replaceAll(" ", "");
//			Departement departement =  new Departement(code,Integer.parseInt(population));
//			listDept.add(departement.toString());
			System.out.println(dep);
			
			
			
		}
		System.out.println(listDept.get(0).toString());
		Files.write(pathDep, listDept);
		}
		
	}


