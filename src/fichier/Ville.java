package fichier;

public class Ville implements Comparable<Ville> {
	private String nom ;
	private String departement;
	private String region ;
	private int population ;
	public Ville(String nom, String departement, String region, int population) {
		this.nom = nom;
		this.departement = departement;
		this.region = region;
		this.population = population;
	}
	@Override
	public int compareTo(Ville autre) {
		// trie par nom de ville
		//return this.nom.compareTo(autre.getPopulation());
		
		// tie par le nombres de population
		if(this.population > autre.getPopulation()) {
			return 1;
		}else if(this.population < autre.getPopulation()) {
			return -1;
					
		}
		return 0;
	}
	@Override
	public String toString() {
		return nom + ";" + departement + ";" + region + ";" + population;
	}
	
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getDepartement() {
		return departement;
	}
	public void setDepartement(String departement) {
		this.departement = departement;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public int getPopulation() {
		return population;
	}
	
	
	public void setPopulation(int population) {
		this.population = population;
	}
	

}
