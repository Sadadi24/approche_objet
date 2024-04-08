package model;

public class Main {
	

	public static void main(String[] args) {
		Personne personne = new Personne();
		Adresse adresse= new Adresse();
		adresse.codePostal = 34070;
		adresse.libelleRue = "chemin des traverses";
		adresse.numeroRue = 480;
		adresse.ville = "Montpelleir";
		personne.nom = "assani";
		personne.prenom = "sadadi";
		personne.age = 26;
		personne.sexe = "masculin";
		personne.adresse = adresse;
		System.out.println(personne.adresse.libelleRue);
		
		

	}

}
