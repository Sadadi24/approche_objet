package fr.diginamic.testenumeration;

public class TestEnumeration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Saison[] saisons = Saison.values();
		// affichez toutes les saisons
		for (Saison saison : saisons) {
			System.out.println(saison.getLibelle());
		}
		Saison si = Saison.valueOf("ETE");
		System.out.println(si);
		
		// retourne une instance de Saison en fonction du libellé.
		Saison libelle = Saison.getSaisonByLibelle("Automne");
		System.out.println(libelle);
		
		
		
		

	}

}
