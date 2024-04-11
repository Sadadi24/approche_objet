package fr.diginamic.banque.entites;

public class CompteTaux  extends Compte {
	private double taux; 
	
	public CompteTaux (String  numCompte, double solde, double taux) {
	
		super(numCompte, solde);
		this.taux = taux;
	}
	
	@Override
	public String toString() {
		return "Compte numero " + this.getNumCompte() + ", solde=" + this.getSolde() + "taux" + "" + taux ;
	}

	public double getTaux() {
		return taux;
	}

	public void setTaux(double taux) {
		this.taux = taux;
	}
	
}
