package model;

public class Personne {
	String nom;
	String prenom;
	Adresse adresse;

	public Personne(String nom, String prenom, Adresse adresse) {
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;

	}

	void getUperPersonne() {
		String identite = nom + " " + prenom;
		System.out.println(identite.toUpperCase());
	}
	String getNom() {
		return this.nom;
	

	}
	String getPrenom() {
		return this.nom;
	

	}
	
	String  getAdresse() {
		
		String adresse = this.adresse.numeroRue + " " + this.adresse.libelleRue + " " + this.adresse.codePostal + " " + this.adresse.ville;
		return  adresse;
	

	}

	void setNom(String nom) {
		this.nom = nom;

	}
	
	void setPrenom(String prenom) {
		this.nom = prenom;

	}
    
	void setAdresse(Adresse adresse) {
		this.adresse = adresse;

	}
}
