package fichier;

public class Departement {
	private String code;
	private int nbPopulation;
	public Departement(String code, int nbPopulation) {
		super();
		this.code = code;
		this.nbPopulation = nbPopulation;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public int getNbPopulation() {
		return nbPopulation;
	}
	public void setNbPopulation(int nbPopulation) {
		this.nbPopulation = nbPopulation;
	}
	@Override
	public String toString() {
		return code + ";" +  nbPopulation;
	}

}
