package diginamic.recensement;

import fichier.Ville;

public class Region  implements Comparable<Region>{
	private String nom;
	private int population;
	 private String codeRegion;
	
	
	public Region(String nom, int population) {
		super();
		this.nom = nom;
		this.population = population;
		this.codeRegion = codeRegion;
	}

	@Override
	public String toString() {
		return  nom + " " + population;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getPopulation() {
		return population;
	}
	public void setPopulation(int population) {
		this.population = population;
	}
	public String getCodeRegion() {
		return codeRegion;
	}
	public void setCodeRegion(String codeRegion) {
		this.codeRegion = codeRegion;
	}

	@Override
	public int compareTo(Region autre) {
		// TODO Auto-generated method stub
		if(this.population > autre.getPopulation()) {
			return -1;
		}else if(this.population < autre.getPopulation()) {
			return 1;
					
		}
		return 0;
	}
	

}
