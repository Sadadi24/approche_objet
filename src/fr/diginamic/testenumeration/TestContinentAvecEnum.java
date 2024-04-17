package fr.diginamic.testenumeration;

import java.util.ArrayList;
import java.util.List;

public class TestContinentAvecEnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<Ville> villes = new ArrayList<>();
	        villes.add(new Ville("New York", 8175133, Continent.AMERIQUE_NORD));
	        villes.add(new Ville("Paris", 2148271, Continent.EUROPE));
	        villes.add(new Ville("Pékin", 21516000, Continent.ASIE));
	        villes.add(new Ville("Moscou", 12615279, Continent.EUROPE));
	        villes.add(new Ville("Berlin", 3769495, Continent.EUROPE));
	        villes.add(new Ville("Sydney", 5312163, Continent.OCEANIE));
	        villes.add(new Ville("Sao Paulo", 12325232, Continent.AMERIQUE_SUD));
	        villes.add(new Ville("Dakar", 1146053, Continent.AFRIQUE));
	        
	        System.out.println("Villes avec leur continent respectif :");
	        for (Ville ville : villes) {
	            System.out.println(ville.toString());
	        }
	}

}
