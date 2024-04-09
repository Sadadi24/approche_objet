package model;

public class TestPersonne {

	public static void main(String[] args) {

		 int codePostal = 34070;
		String libelleRue = "chemin des traverses";
		int numeroRue = 480;
		String ville = "Montpellier";
		Adresse adresse= new Adresse(libelleRue,numeroRue,codePostal,ville);
		Personne personne1 = new Personne("Assani","Sadadi",adresse);
		Personne personne2 = new Personne("Salim","Fred",adresse) ;
		
		
		

		System.out.println(personne1.nom +"\n"+ personne1.prenom +"\n"+ "habite à " + personne1.adresse.ville);
		personne1.setNom("mohamed");
		personne1.setAdresse( new Adresse("rue des chasseurs",112,34070, "Montpellier"));
		System.out.println(personne1.getAdresse());
		personne1.getUperPersonne();
		

}
}