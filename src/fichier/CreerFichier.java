package fichier;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CreerFichier {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Path path = Paths.get("/home/prtk527/Bureau/dev/recensement.csv");
		Path newPath = Paths.get("/home/prtk527/Bureau/dev/recensement1.csv");
		List<String> list = Files.readAllLines(path);
		ArrayList<String>newList = new ArrayList<>();

		
			for (int i = 0; i < 100; i++) {
				newList.add(list.get(i));
				
			}
			Files.write(newPath, newList);
		}
		
	}


