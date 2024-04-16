package services.recensement;

import java.util.List;
import java.util.Scanner;

import diginamic.recensement.Recensement;
import diginamic.recensement.Region;
import diginamic.recensement.Ville;

abstract public class MenuService {
	 
	  abstract  public void traiter(List<Ville> villes ,Scanner scanner);
	  abstract  public void afficher(List<Ville> villes );
	  
	  

}
