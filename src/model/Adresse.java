package model;

public class Adresse {
	public String libelleRue;
	public int numeroRue;
	public int codePostal;
	public String ville;
public Adresse() {
	System.out.println("hello contruct");
}
public Adresse(String libelleRue,int numeroRue,int codePostal,String ville) {
	this.libelleRue = libelleRue;
	this.codePostal = codePostal;
	this.numeroRue = numeroRue;
	this.ville = ville;
	
		
	}

@Override
public String toString() {
	return "Adresse [libelleRue=" + libelleRue + ", numeroRue=" + numeroRue + ", codePostal=" + codePostal + ", ville="
			+ ville + "]";
}
public String getLibelleRue() {
	return libelleRue;
}
public void setLibelleRue(String libelleRue) {
	this.libelleRue = libelleRue;
}
public int getNumeroRue() {
	return numeroRue;
}
public void setNumeroRue(int numeroRue) {
	this.numeroRue = numeroRue;
}
public int getCodePostal() {
	return codePostal;
}
public void setCodePostal(int codePostal) {
	this.codePostal = codePostal;
}
public String getVille() {
	return ville;
}
public void setVille(String ville) {
	this.ville = ville;
}

}
