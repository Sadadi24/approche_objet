package diginamic.recensement;

public class Departement  implements Comparable<Departement>{
  private int population;
  private String codeDepartement;
public Departement( int population, String codeDepartement) {
	super();
	this.population = population;
	this.codeDepartement = codeDepartement;
}
@Override
public String toString() {
	return codeDepartement + " " + population;
}


public int getPopulation() {
	return population;
}
public void setPopulation(int population) {
	this.population = population;
}
public String getCodeDepartement() {
	return codeDepartement;
}
public void setCodeDepartement(String codeDepartement) {
	this.codeDepartement = codeDepartement;
}
@Override
public int compareTo(Departement autre ) {
	// TODO Auto-generated method stub
	if(this.population > autre.getPopulation()) {
		return -1;
	}else if(this.population < autre.getPopulation()) {
		return 1;
				
	}
	return 0;
}
  
  
  
}
