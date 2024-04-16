package diginamic.recensement;

import java.util.Comparator;

public class Ville implements Comparable<Ville>{
	private String codeRegion;
	private String nomRegion ;
	private String codeDepartement;
	private String codeCommune;
	private String nomCommune;
	private int population ;
	public Ville(String codeRegion, String nomRegion, String codeDepartement,String codeCommune,String nomCommune, int population) {
		this.codeRegion = codeRegion;
		this.nomRegion = nomRegion;
		this.codeDepartement = codeDepartement;
		this.codeCommune = codeCommune;
		this.nomCommune = nomCommune;
		this.population = population;
	}
	@Override
	public int compareTo(Ville autre) {
		// TODO Auto-generated method stub
		if(this.population > autre.getPopulation()) {
			return -1;
		}else if(this.population < autre.getPopulation()) {
			return 1;
					
		}
		return 0;
	}
	
	@Override
	public String toString() {
		return  codeRegion + " " + nomRegion + ""  + codeDepartement+ " " +
				 codeCommune + " " + nomCommune + " " + population ;
	}
	public String getCodeRegion() {
		return codeRegion;
	}
	public void setCodeRegion(String codeRegion) {
		this.codeRegion = codeRegion;
	}
	public String getNomRegion() {
		return nomRegion;
	}
	public void setNomRegion(String nomRegion) {
		this.nomRegion = nomRegion;
	}
	public String getCodeDepartement() {
		return codeDepartement;
	}
	public void setCodeDepartement(String codeDepartement) {
		this.codeDepartement = codeDepartement;
	}
	public String getCodeCommune() {
		return codeCommune;
	}
	public void setCodeCommune(String codeCommune) {
		this.codeCommune = codeCommune;
	}
	public String getNomCommune() {
		return nomCommune;
	}
	public void setNomCommune(String nomCommune) {
		this.nomCommune = nomCommune;
	}
	public int getPopulation() {
		return population;
	}
	public void setPopulation(int population) {
		this.population = population;
	}


	
	
	
	

}